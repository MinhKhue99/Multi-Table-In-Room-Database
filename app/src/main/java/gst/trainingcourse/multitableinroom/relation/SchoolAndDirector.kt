package gst.trainingcourse.multitableinroom.relation

import androidx.room.Embedded
import androidx.room.Relation
import gst.trainingcourse.multitableinroom.model.Director
import gst.trainingcourse.multitableinroom.model.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "idSchool",
        entityColumn = "idSchool"
    )

    val director: Director
)