package edu.tomerbu.lec16.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Person(
    val firstName: String,
    val lastName: String,

    @PrimaryKey
    val id: Int = 0
)

