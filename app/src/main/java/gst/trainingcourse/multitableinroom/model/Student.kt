package gst.trainingcourse.multitableinroom.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Student(
    @PrimaryKey(autoGenerate = true)
    val idStudent:Int,
    val studentName:String,
    val semester:Int,
    val idSchool: Int
)
