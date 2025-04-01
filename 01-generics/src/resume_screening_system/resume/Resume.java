package resume_screening_system.resume;

import resume_screening_system.job_roles.JobRole;

public class Resume <T extends JobRole>{
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }
    public void setJobRole(T jobRole) {
        this.jobRole = jobRole;
    }

    public void screen(){
        System.out.println(jobRole);
    }
}