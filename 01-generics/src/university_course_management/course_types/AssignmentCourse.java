package university_course_management.course_types;

import university_course_management.evaluation_types.AssignmentBased;
import university_course_management.evaluation_types.EvaluationType;

public class AssignmentCourse extends CourseType<AssignmentBased> {
    protected EvaluationType evaluationType;

    public AssignmentCourse(AssignmentBased evaluationType) {
        super(evaluationType);
    }
}