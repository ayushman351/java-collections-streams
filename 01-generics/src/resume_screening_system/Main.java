package resume_screening_system;

import resume_screening_system.job_roles.*;
import resume_screening_system.resume.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SoftwareEngineer se1 = new SoftwareEngineer("Sam", 1);
        SoftwareEngineer se2 = new SoftwareEngineer("Sara", 6);
        DataScientist ds1 = new DataScientist("Max", 10);
        ProductManager pm1 = new ProductManager("Bruce", 15);

        Resume<SoftwareEngineer> resumeSE1 = new Resume<>(se1);
        Resume<SoftwareEngineer> resumeSE2 = new Resume<>(se2);
        Resume<DataScientist> resumeDS1 = new Resume<>(ds1);
        Resume<ProductManager> resumePM1 = new Resume<>(pm1);

        List<Resume<? extends JobRole>> candidates = Arrays.asList(resumeDS1, resumePM1, resumeSE1, resumeSE2);
        ResumeUtil.startScreening(candidates);
    }
}