class PatientRunner {
    public static void main(String[] args) {
        Patient patient = new Patient();
        System.out.println("The default value for name is: " + patient.name);
        System.out.println("The default value for age is: " + patient.age);
        System.out.println("The default value for isAdmitted is: " + patient.isAdmitted);
        System.out.println("The default value for disease is: " + patient.disease);

        // Assigning values
        patient.name = "John Doe";
        patient.age = 45;
        patient.isAdmitted = true;
        patient.disease = "Flu";

        System.out.println("The values after initializing:");
        System.out.println("The patient name is: " + patient.name);
        System.out.println("The patient age is: " + patient.age);
        System.out.println("Is the patient admitted? " + patient.isAdmitted);
        System.out.println("The patient is diagnosed with: " + patient.disease);
    }
}