package edu.tomerbu.lec16.data.dao

import androidx.annotation.RequiresPermission
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import edu.tomerbu.lec16.data.entity.Person
@Dao
interface PersonDao {

    @Insert
    suspend fun add(person: Person)

    @Insert
    suspend fun addAll(people: List<Person>)

    @Update
    suspend fun update(person: Person)

    @Delete
    suspend fun delete(person: Person)

    @Query("DELETE FROM Person")
    suspend fun clearPeople()

    @Query("SELECT * FROM Person ORDER BY firstName")
    suspend fun getPeople():List<Person>
}