/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController

@Composable
fun ListPage(navController: NavController) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Puppies for Adoption") }) },
        content = { PuppyList(navController) }
    )
}

@Composable
fun PuppyList(navController: NavController) {
    LazyColumn {
        items(puppyList.size) {
            val puppy = puppyList[it]
            PuppyListItem(
                puppy = puppy,
                onClick = { navController.navigate("details/${puppy.id}") }
            )
        }
    }
}

@Composable
fun PuppyListItem(puppy: Puppy, onClick: () -> Unit) {
    val typography = MaterialTheme.typography
    Row(
        modifier = Modifier
            .clickable(onClick = onClick)
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = puppy.imageRes),
            contentDescription = "Photo of ${puppy.name}",
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(puppy.name, style = typography.h6)
            Spacer(modifier = Modifier.height(4.dp))
            Text("Age: ${puppy.age} months", style = typography.body1)
        }
    }
}

@Preview
@Composable
fun ListPagePreview() {
    val navController = rememberNavController()
    ListPage(navController = navController)
}
