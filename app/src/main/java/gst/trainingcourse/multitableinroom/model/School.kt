package gst.trainingcourse.multitableinroom.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class School(
    @PrimaryKey(autoGenerate = true)
    val idSchool: Int,
    val schoolName: String
)
