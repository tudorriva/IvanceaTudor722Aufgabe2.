package View;

import java.util.List;
import java.util.Scanner;
import Controller.Controller;
import Entities.Medikamente;
import Entities.Patienten;


public class View {

    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void display() {
        printMenu();
    }

    public void printMenu() {
        while (true) {
            System.out.println("Welcome to Main Menu");
            System.out.println("Choose: ");
            System.out.println("1. Add Medikament");
            System.out.println("2. Delete Medikament");
            System.out.println("3. Update Medikament");
            System.out.println("4. Show Medikament");
            System.out.println("5. Add Patienten");
            System.out.println("6. Delete Patienten");
            System.out.println("7. Update Patienten");
            System.out.println("8. Show Patienten");
            System.out.println("9. Filter Diagnose");
            System.out.println("10. Medikamente fur Krankheit");
            System.out.println("11. Get Medikamente by Patienten");
            System.out.println("12. Exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addMedikament();
                    break;
                case 2:
                    deleteMedikament();
                    break;
                case 3:
                    updateMedikament();
                    break;
                case 4:
                    showMedikament();
                    break;
                case 5:
                    addPatienten();
                    break;
                case 6:
                    deletePatienten();
                    break;
                case 7:
                    updatePatienten();
                    break;
                case 8:
                    showPatienten();
                    break;
                case 9:
                    filterDiagnose();
                    break;
                case 10:
                    medikamenteFurKrankheit();
                    break;
                case 11:
                    getMedikamenteByPatient();
                    break;
                case 12:
                    return;
            }
        }
    }

    public void addMedikament() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.nextLine();
        String Krankheit = scanner.nextLine();
        controller.createMedikamente(new Medikamente(name, price, Krankheit));
    }

    public void deleteMedikament() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        controller.deleteMedikamente(id);
    }

    public void updateMedikament() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.nextLine();
        String Krankheit = scanner.nextLine();
        controller.updateMedikamente(id, new Medikamente(name, price, Krankheit));
    }

    public void showMedikament() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.println(controller.getMedikament(id));
    }

    public void addPatienten() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int alter = scanner.nextInt();
        scanner.nextLine();
        String Diagnose = scanner.nextLine();
        scanner.nextLine();
        int id = scanner.nextInt();
        List<Medikamente> medikamenteList = List.of(controller.getMedikament(id));
        controller.createPatienten(new Patienten(name, alter, Diagnose, medikamenteList));
    }

    public void deletePatienten() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        controller.deletePatienten(id);
    }

    public void updatePatienten() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        int alter = scanner.nextInt();
        scanner.nextLine();
        String Diagnose = scanner.nextLine();
        scanner.nextLine();
        int idMed = scanner.nextInt();
        List<Medikamente> medikamenteList = List.of(controller.getMedikament(idMed));
        controller.updatePatienten(id, new Patienten(name, alter, Diagnose, medikamenteList));
    }

    public void showPatienten() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.println(controller.getPatienten(id));
    }

    public void filterDiagnose() {
        Scanner scanner = new Scanner(System.in);
        String diagnose = scanner.nextLine();
        System.out.println(controller.filterDiagnose(diagnose));
    }

    public void medikamenteFurKrankheit() {
        Scanner scanner = new Scanner(System.in);
        String krankheit = scanner.nextLine();
        System.out.println(controller.getPatientenByMedikamentKrankheit(krankheit));
    }

    public void getMedikamenteByPatient() {
        Scanner scanner = new Scanner(System.in);
        int patientId = scanner.nextInt();
        System.out.println(controller.getSortedMedikamenteByPatient(patientId, true));
    }



}
