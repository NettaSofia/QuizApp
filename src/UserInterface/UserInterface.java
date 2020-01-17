package UserInterface;

import Person.Person;

import java.util.Scanner;

public class UserInterface {

    public UserInterface() {

    }

    Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        System.out.println("Please enter your name:");
        Person quizUser = new Person();
        quizUser.setName(scanner.nextLine());
    }
}
