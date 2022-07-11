package test;

public class UseHospitalEmployee {

    public static void main(String[] args) {
        HospitalEmlpoyee employee1 = new HospitalEmlpoyee("Joseph","Chris Hani");
        employee1.setEmployee_name("Joseph Clark");
        employee1.setProject_name("Voice of cancer");
        employee1.setJob_title("Doctor");
        //employee1.setHospital_name();

        HospitalEmlpoyee empl2 = new HospitalEmlpoyee("Mary Hoppins","GMC");
        empl2.setJob_title("Nurse");
        empl2.setProject_name("AIDS foundation");

        HospitalEmlpoyee[] employees = {employee1, empl2};
        for(HospitalEmlpoyee e: employees){
            System.out.println("Employye name:"+e.getEmployee_name());
            System.out.println(e.getHospital_name());
            System.out.println(e.getJob_title());
            System.out.println(e.getProject_name());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
        }

    }

}
