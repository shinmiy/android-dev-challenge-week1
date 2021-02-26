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
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.util.UUID

@Composable
fun DetailsPage(id: String) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Puppies for Adoption") }) },
        content = {
            val puppy = puppyList.find { it.id == id }
            if (puppy == null) {
                Text("Oops! Something went wrong!")
            } else {
                PuppyDetails(puppy = puppy)
            }
        }
    )
}

@Composable
fun PuppyDetails(puppy: Puppy) {
    val typography = MaterialTheme.typography
    Column(
        Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = puppy.imageRes),
            contentDescription = "Photo of ${puppy.name}",
            modifier = Modifier
                .height(180.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(puppy.name, style = typography.h4)
        Spacer(modifier = Modifier.height(16.dp))
        Text("Age: ${puppy.age} months", style = typography.body1)
        Spacer(modifier = Modifier.height(8.dp))
        Text("Breed: ${puppy.breed}", style = typography.body1)
    }
}

@Preview
@Composable
fun PuppyDetailsPreview() {
    val puppy = Puppy(id = UUID.randomUUID().toString(), name = "Alto", age = 10, breed = "Bulldog", imageRes = R.drawable.puppy0)
    PuppyDetails(puppy)
}
