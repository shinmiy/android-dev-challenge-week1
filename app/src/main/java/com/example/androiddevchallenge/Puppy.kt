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

import androidx.annotation.DrawableRes
import java.util.UUID

data class Puppy(
    val id: String,
    val name: String,
    val age: Int,
    val breed: String,
    @DrawableRes val imageRes: Int,
)

val puppyList = listOf(
    Puppy(id = UUID.randomUUID().toString(), name = "Alto", age = 10, breed = "Bulldog", imageRes = R.drawable.puppy0),
    Puppy(id = UUID.randomUUID().toString(), name = "Basil", age = 8, breed = "Shepard", imageRes = R.drawable.puppy1),
    Puppy(id = UUID.randomUUID().toString(), name = "Chewy", age = 12, breed = "Beagle", imageRes = R.drawable.puppy2),
    Puppy(id = UUID.randomUUID().toString(), name = "Dakota", age = 14, breed = "Doberman", imageRes = R.drawable.puppy3),
    Puppy(id = UUID.randomUUID().toString(), name = "Elton", age = 9, breed = "Sheepdog", imageRes = R.drawable.puppy4),
    Puppy(id = UUID.randomUUID().toString(), name = "Alto", age = 11, breed = "Saint Bernard", imageRes = R.drawable.puppy5),
    Puppy(id = UUID.randomUUID().toString(), name = "Basil", age = 13, breed = "Shih Tzu", imageRes = R.drawable.puppy6),
    Puppy(id = UUID.randomUUID().toString(), name = "Chewy", age = 10, breed = "Shiba Inu", imageRes = R.drawable.puppy7),
    Puppy(id = UUID.randomUUID().toString(), name = "Dakota", age = 8, breed = "Akita", imageRes = R.drawable.puppy8),
    Puppy(id = UUID.randomUUID().toString(), name = "Elton", age = 12, breed = "Pug", imageRes = R.drawable.puppy9),
)
