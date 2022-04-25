package gst.trainingcourse.multitableinroom.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Director(
    @PrimaryKey(autoGenerate = true)
    val idDirector: Int,
    val directorName: String,
    val idSchool: Int
)
