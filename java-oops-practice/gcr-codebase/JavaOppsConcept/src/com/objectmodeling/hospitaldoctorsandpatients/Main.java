package com.objectmodeling.hospitaldoctorsandpatients;

public class Main {
	public static void main(String[] args) {

        Hospital hospital = new Hospital("City Care Hospital");

        // Doctors
        Doctor d1 = new Doctor("Arvind", "Cardiologist");
        Doctor d2 = new Doctor("Meena", "Dermatologist");

        // Patients
        Patient p1 = new Patient("Riya");
        Patient p2 = new Patient("Kabir");
        Patient p3 = new Patient("Aman");

        // Adding to hospital
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);
        hospital.addPatient(p3);

        hospital.showHospitalDetails();

        // Consultations (Association Communication)
        d1.consult(p1);
        d1.consult(p2);

        d2.consult(p1);
        d2.consult(p3);
        d1.viewPatients();
        d2.viewPatients();

        p1.viewConsultedDoctors();
        p2.viewConsultedDoctors();
        p3.viewConsultedDoctors();
    }
}
