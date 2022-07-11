package test;

public class HospitalEmlpoyee {



    private String employee_name;
    private String job_title;
    private String hospital_name;
    private String project_name;

    public HospitalEmlpoyee() {
    }

    public HospitalEmlpoyee(String e_name, String h_name) {
        this.employee_name = e_name;
        this.hospital_name = h_name;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String e_name) {
        this.employee_name = e_name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String j_title) {
        this.job_title = j_title;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String h_name) {
        this.hospital_name = h_name;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String p_name) {
        this.project_name = p_name;
    }


}
