public class Main {
    public static void main(String[] args) {
        try {
            Patient patient1 = new Patient("P001", "John Smith", 45, "Fever");
            Doctor doctor1 = new Doctor("D101", "Dr. Alice", "General Medicine");

            patient1.updateDiagnosis("Flu");
            doctor1.treatPatient(1);
        } catch (Exception e) {
            System.out.println("Invalid!");
        }

    }

}