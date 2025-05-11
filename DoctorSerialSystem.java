import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
// Base class for common attributes
class Person {
    protected String name;
    protected int id;
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
}
// Doctor class
class Doctor extends Person {
    private String specialization;
    public Doctor(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }
    public String getDoctorInfo() {
        return "Dr. " + name + " (ID: " + id + ", Specialization: " + specialization + ")";
    }
}
// Patient class
class Patient extends Person {
    public Patient(String name, int id) {
        super(name, id);
    }
    public String getPatientInfo() {
        return name + " (ID: " + id + ")";
    }
}
// Appointment class
class Appointment {
    Doctor doctor;
    Patient patient;
    public Appointment(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }
    public void showAppointment() {
        System.out.println("Appointment: " + patient.getPatientInfo() + " with " + doctor.getDoctorInfo());
    }
}
// Main system class
public class DoctorSerialSystem {
    static ArrayList<Doctor> doctors = new ArrayList<>();
    static ArrayList<Appointment> appointments = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Sample doctors
        doctors.add(new Doctor("Ariful Kabir", 1, "Cardiology"));
        doctors.add(new Doctor("Sadia Rahman", 2, "Dermatology"));
        int choice;
        do {
            displayMenu();
            choice = getUserInput("Enter choice: ");
            handleUserChoice(choice);
        } while (choice != 0);
    }
    public static void displayMenu() {
        System.out.println("\n--- Doctor Serial Management ---");
        System.out.println("1. View Doctors");
        System.out.println("2. Book Appointment");
        System.out.println("3. View Appointments");
        System.out.println("4. Cancel Appointment");
        System.out.println("5. View Patient History");
        System.out.println("0. Exit");
    }
    public static int getUserInput(String prompt) {
        int choice = -1;
        while (true) {
            try {
                System.out.print(prompt);
                choice = input.nextInt();
                input.nextLine(); // consume the newline
                break; // exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // clear invalid input
            }
        }
        return choice;
    }
    public static void handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                showDoctors();
                break;
            case 2:
                bookAppointment();
                break;
            case 3:
                showAppointments();
                break;
            case 4:
                cancelAppointment();
                break;
            case 5:
                viewPatientHistory();
                break;
            case 0:
                System.out.println("Exiting... Thank you!");
                break;
            default:
                System.out.println("Invalid input. Try again.");
        }
    }
    public static void showDoctors() {
        System.out.println("\nAvailable Doctors:");
        for (Doctor doc : doctors) {
            System.out.println(doc.getDoctorInfo());
        }
    }
    public static void bookAppointment() {
        System.out.println("\nEnter Patient Name: ");
        String pname = input.nextLine();
        int pid = getUserInput("Enter Patient ID: ");
        Patient patient = new Patient(pname, pid);
        System.out.println("Choose Doctor ID from the list:");
        showDoctors();
        int did = getUserInput("Enter Doctor ID: ");
        Doctor selectedDoctor = findDoctorById(did);
        if (selectedDoctor != null) {
            appointments.add(new Appointment(selectedDoctor, patient));
            System.out.println("Appointment booked successfully!");
        } else {
            System.out.println("Doctor not found.");
        }
    }
    public static Doctor findDoctorById(int id) {
        for (Doctor d : doctors) {
            if (d.getId() == id) {
                return d;
            }
        }
        return null;
    }
    public static void showAppointments() {
        System.out.println("\nAppointments List:");
        if (appointments.isEmpty()) {
            System.out.println("No appointments yet.");
        } else {
            for (Appointment app : appointments) {
                app.showAppointment();
            }
        }
    }
    public static void cancelAppointment() {
        int pid = getUserInput("\nEnter Patient ID to cancel appointment: ");
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).patient.getId() == pid) {
                appointments.remove(i);
                System.out.println("Appointment canceled successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found with the given Patient ID.");
        }
    }
    public static void viewPatientHistory() {
        int pid = getUserInput("\nEnter Patient ID to view history: ");
        boolean found = false;
        System.out.println("Appointment History for Patient ID: " + pid);
        for (Appointment app : appointments) {
            if (app.patient.getId() == pid) {
                app.showAppointment();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No appointment history found for this patient.");
        }
    }
}