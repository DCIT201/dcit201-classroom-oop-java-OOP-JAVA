public class Patient{
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient (String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getpatientId (){
        return patientId;
    }
    public String getName (){
        return name;
    }
    public String getDiagnosis () {
        return diagnosis;
    }
    public void setAge (int age) throws IllegalArgumentException {
        String e = "Invalid Age";
        if (age < 0) {
            throw new IllegalArgumentException (e);
        }
        else{
        this.age = age;}

    }
    public String setDiagnosis (String diagnosis) {
        String a = "Diagnosis cannot be empty";
        if (diagnosis == null) {
            throw new IllegalArgumentException (a);
        }
        else {
            this.diagnosis = diagnosis;
        }
        return diagnosis;
    }

    public void updateDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
        String a = setDiagnosis(diagnosis);
        System.out.println("Diagnosis updated successfully to: " + a);

    }


}
