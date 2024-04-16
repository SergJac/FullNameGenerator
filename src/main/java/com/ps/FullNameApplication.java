package com.ps;
import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the following information: ");

        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim() + " ";

        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();

        String displayedmiddleName = "";
        if(!middleName.equals("")){
            displayedmiddleName = middleName.substring(0, 1) + ". ";
        }

        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();
        String displayedSuffix = "";
        if(!suffix.equals("")){
            displayedSuffix = ", " + suffix;
        }

        System.out.printf("Full name: %s%s%s%s", firstName, displayedmiddleName, lastName, displayedSuffix);

    }
}
