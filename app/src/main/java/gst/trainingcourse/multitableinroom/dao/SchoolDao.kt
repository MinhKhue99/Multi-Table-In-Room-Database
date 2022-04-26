package gst.trainingcourse.multitableinroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import gst.trainingcourse.multitableinroom.model.Director
import gst.trainingcourse.multitableinroom.model.School
import gst.trainingcourse.multitableinroom.model.Student
import gst.trainingcourse.multitableinroom.relation.SchoolAndDirector
import gst.trainingcourse.multitableinroom.relation.SchoolWithStudent

@Dao
interface SchoolDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    fun getSchoolAndDirectorWithSchoolId(schoolName: String): LiveData<List<SchoolAndDirector>>


    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    fun getSchoolWithStudents(schoolName: String): LiveData<List<SchoolWithStudent>>
}