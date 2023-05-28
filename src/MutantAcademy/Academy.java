package MutantAcademy;

import java.util.Scanner;

public class Academy {
    //Fields
    static int availableRooms = 20;
    //Scanner
    static Scanner sc = new Scanner(System.in);


    //Method that welcomes the user
    public static void welcomeUser(){
        System.out.println("Welcome to MutantAcademy. You have taken the role as the headmaster. Please type inn your name:");
        String userName = sc.nextLine();
        System.out.println("Hello " + userName + ". The first student will arrive soon. You have " + availableRooms +" available rooms.");
        System.out.println("* The bus arrives at the academy and the first student is: *");
        studentArrives();
    }

    //The student arrives
    public static void studentArrives(){
        Students studOne = new Students();
        String firstname = studOne.firstNameGen();
        String lastname = studOne.lastNameGen();
        String power = studOne.powerGen();
        int powerlvl = studOne.powerLvl();

        System.out.println("Studentname: " + firstname + " " + lastname
                + "\nAbility: " + power + "\nPowerlvl: " + powerlvl);
        System.out.println("-------------------------");
        System.out.println("1. Accept student \n2. Decline student and review a new student \n3. Expell all students \n4. Exit");
        int userAnswer = sc.nextInt();
        switch (userAnswer){
            case 1:
                Database.addStudents(firstname +" "+ lastname,power,powerlvl);
                availableRooms = availableRooms - 1;
                System.out.println("The student was added to the database. You have " + availableRooms + " available rooms left.");
                System.out.println("Here is the other student: ");
                System.out.println("");
                studentArrives();
                break;
            case 2:
                System.out.println("*You decline the student and check out another student*");
                studentArrives();
                break;
            case 3:
                Database.expellStudents();
                System.out.println("You expelled the students and have " + availableRooms + " available rooms");
                break;
            case 4:
                System.out.println("You have left the school. Thank you for your service. These are the students at the school:");
                Database.showStudents();
        }
       /*
        if (userAnswer.equals("Y")){
            Database.addStudents(firstname +" "+ lastname,power,powerlvl);
            availableRooms = availableRooms - 1;
            System.out.println("The student was added to the database. You have " + availableRooms + " available rooms left.");
            System.out.println("Would you like to greet another possible student? Y/N");
            String possStud = sc.next();
            if(possStud.equals("Y")){
                studentArrives();
            }
        } else {
            System.out.println("It was not added");
            System.out.println("Would you like to greet another possible student? Y/N");
            String possStud = sc.next();
            if(possStud.equals("Y")){
                studentArrives();
            } */
        }
}