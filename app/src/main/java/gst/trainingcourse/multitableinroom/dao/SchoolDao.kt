package gst.trainingcourse.multitableinroom.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import gst.trainingcourse.multitableinroom.model.Director
import gst.trainingcourse.multitableinroom.model.School
import gst.trainingcourse.multitableinroom.relation.SchoolAndDirector

@Dao
interface SchoolDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Transaction
    @Query("SELECT * FROM school WHERE idSchool = :idSchool")
    fun getSchoolAndDirectorWithSchoolId(idSchool: Int): LiveData<List<SchoolAndDirector>>
}