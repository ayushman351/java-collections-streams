package university_course_management.course_types;
import university_course_management.evaluation_types.ExamBased;

public class ExamCourse extends CourseType<ExamBased> {
    private ExamBased evaluationType;

    public ExamCourse(ExamBased evaluationType) {
        super(evaluationType);
    }
}