package gst.trainingcourse.multitableinroom.relation

import androidx.room.Embedded
import androidx.room.Relation
import gst.trainingcourse.multitableinroom.model.School
import gst.trainingcourse.multitableinroom.model.Student

data class SchoolWithStudent(
    @Embedded
    val school: School,
    @Relation(
        parentColumn = "idSchool",
        entityColumn = "idSchool"
    )
    val students:List<Student>
)
