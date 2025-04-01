package university_course_management.course_types;
import university_course_management.evaluation_types.EvaluationType;

public abstract class CourseType<T extends EvaluationType> {
    protected T evaluationType;

    public CourseType(T evaluationType) {
        this.evaluationType = evaluationType;
    }

    @Override
    public String toString() {
        return "CourseType: " + getClass().getSimpleName() + ", Evaluation: " + evaluationType.toString();
}



}