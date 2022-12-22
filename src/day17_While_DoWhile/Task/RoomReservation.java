package day17_While_DoWhile.Task;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Do you want to reserve a room? Yes/No ");
        String reservation = scan.nextLine().toLowerCase();

        while (!(reservation.equals("yes") || reservation.equals("no"))) {
            System.out.println("Invalid Entry, Please Re-Enter");
            reservation = scan.nextLine().toLowerCase();
        }

        if (reservation.equals("no")){
            System.out.println("Have a nice day");

        } else {

            System.out.println("Which room would you like to select? King Bed/Queen Bed/Single Bed");

            String room = scan.nextLine().toLowerCase();

            while (!(room.equals("king bed") || room.equals("queen bed") || room.equals("single bed"))) {
                System.out.println("Invalid Entry, Please Re-Enter");
                room = scan.nextLine().toLowerCase();

            } // to make sure user selected either the king bed, or queen bed or single bed

            int Price = 0;

            Price += (room.equals("king bed")) ? 120 : (room.equals("queen bed")) ? 100 : 80;

            System.out.println("Your total price is: $" + Price);
        }



        scan.close();



        /*Create a class called RommReservation, write a program for the room reservation,
        your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve.
    	if user entered no, print "have a nice day"
    	(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)


         */
    }
}
