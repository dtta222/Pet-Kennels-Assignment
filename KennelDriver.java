//*************************************************************************
 //KennelDriver.java
 //Date: 03/10/2023
 //Author: David Taylor
 //Class: CIT 149–19Z1–78178
 //Instructor: Krishna Nandanoor
 //Purpose: Develop a Java application where you will help accommodate and place three dogs in a large
//Kennel in their own big crate. A program is needed which can take in the data of the dogs and assign
//them to an available crate in the Kennel in a specific order and print the details of the Kennel and the dogs assigned to
//the crate once all the crates have been filled.

// The large dog kennel has four crates used to transport pet animals across small distances in an animal shelter. Each crate
//can accommodate one dog. The fourth crate cannot be used because it needs to be used for storage purposes. So only
//THREE dogs can be accommodated per Kennel
//*************************************************************************

import java.util.Scanner;
 public class KennelDriver {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ////variables
        //pet name, pet iD tag #
        String name, tag;
        //age of pet, kennel iD #
        int age, kennelID, crateNum;

        //get kennel iD
        System.out.print("Input kennel iD: ");
        kennelID = scan.nextInt();
        scan.nextLine();

        //create objects for kennel/dog information
        Kennel kennel = new Kennel(kennelID);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        ////loop program while the 3 crates are not full
        while (kennel.getFilledCrateCnt() != 3) {
            //show current crate being filled
            crateNum = kennel.getFilledCrateCnt()+1;
            System.out.println("\nCrate#: " + crateNum);

            //retrieve current "filled" crate count from kennel class to decide what crate to fill
            switch (kennel.getFilledCrateCnt()) {
                //crate #1 // 0 "filled" crates
                case (0) -> {
                    //get inputs for name, age, license tag # for pet #1
                    System.out.print("Input name: ");
                    name = scan.nextLine();
                    dog1.setName(name);

                    System.out.print("Input age: ");
                    age = scan.nextInt();
                    dog1.setAge(age);

                    //clear input
                    tag = scan.nextLine();
                    System.out.print("Input license tag: ");
                    tag = scan.nextLine();
                    dog1.setLicenseTagNumber(tag);

                    kennel.addDog(dog1);
                }
                //crate #2 // 1 "filled" crates
                case (1) -> {
                    //get inputs for name, age, license tag # for pet #2
                    System.out.print("Input name: ");
                    name = scan.nextLine();
                    dog2.setName(name);

                    System.out.print("Input age: ");
                    age = scan.nextInt();
                    dog2.setAge(age);

                    //clear input
                    tag = scan.nextLine();
                    System.out.print("Input license tag: ");
                    tag = scan.nextLine();
                    dog2.setLicenseTagNumber(tag);

                    //check if dog info has already been used
                    if (!dog2.equals(dog1)) {
                        kennel.addDog(dog2);
                    } else {
                        System.out.println("Dog has already been assigned to crate!");
                    }
                }
                //crate #3 // 2 "filled" crates
                case (2) -> {
                    //get inputs for name, age, license tag # for pet #3
                    System.out.print("Input name: ");
                    name = scan.nextLine();
                    dog3.setName(name);

                    System.out.print("Input age: ");
                    age = scan.nextInt();
                    dog3.setAge(age);

                    //clear input
                    tag = scan.nextLine();
                    System.out.print("Input license tag: ");
                    tag = scan.nextLine();
                    dog3.setLicenseTagNumber(tag);

                    //check if dog info has already been used
                    if (!dog3.equals(dog1) && !dog3.equals(dog2)) {
                        kennel.addDog(dog3);
                    } else {
                        System.out.println("Dog has already been assigned to crate!");
                    }
                }
            }
        }
        //print kennel info
        System.out.println("\n-------------------------------");
        System.out.println(kennel.getID());
        System.out.println("Number of Crates: 03");
        kennel.toString();
    }
}