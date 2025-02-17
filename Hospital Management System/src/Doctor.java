public class Doctor {
    private String doctorID;
    private String name;
    private String specialization;
    private int patientsTreated;

    public Doctor(String doctorID, String name, String specialization) {
        this.doctorID = doctorID;
        this.name = name;
        this.specialization = specialization;
    }
    public String getDoctorID() {
        return doctorID;
    }
    public String getName (){
        return name;
    }
    public String getSpecialization(){
        return specialization;
    }
    public void treatPatient (int patientsTreated) {
        this.patientsTreated = patientsTreated;
        patientsTreated = patientsTreated + 1;
        System.out.println("Patient treated successfully. Total patients treated: " +patientsTreated);
    }



}
