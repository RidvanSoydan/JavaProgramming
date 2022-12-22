package day24_CustomMethods_Return;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class BreakfastTasks {

        public static void main(String[] args) {

            initialsOfPerson("Ali", "Can");

            System.out.println("------------------------------");

            domain("ali.can@gmail.com");

            System.out.println("------------------------------");

            String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

            for (String email : emails) {
                domain(email);
            }

            System.out.println("---------------------------------------------");

            nameOfMonth(5);

            System.out.println("------------------------------");

            nameOfDay(3);

            System.out.println("------------------------------");

            daysInMonth(3,2020);
    }



    // Create a method that can display the initials of the person

        public static void initialsOfPerson (String firstname, String lastName) {

            System.out.println("Initials of person : " + firstname.charAt(0) + "." + lastName.charAt(0)+ ".");

    }


    // Create a method that can display the domain of the email

        public static void domain (String email) {

            System.out.println("Domain : " + email.substring(email.indexOf('@') + 1, email.lastIndexOf('.')));

    }


    // Create a method that can display the name of the month based on the given number to the method

        public static void nameOfMonth (int numberOfMonth){

            String nameOfMonth = "";

            if(numberOfMonth >= 1 && numberOfMonth <= 12){

                nameOfMonth = (numberOfMonth==1)?"January" :(numberOfMonth==2)?"February" :(numberOfMonth==3)?"March"
                        :(numberOfMonth==4)?"April" :(numberOfMonth==5)?"May" :(numberOfMonth==6)?"June"
                        :(numberOfMonth ==7)?"July" :(numberOfMonth==8)?"August" :(numberOfMonth==9)?"September"
                        :(numberOfMonth==10)?"October" :(numberOfMonth==11)?"November" : "December";

            } else {
                nameOfMonth = "Invalid";
            }

            System.out.println("Name of month : " + nameOfMonth);

        }


    // Create a method that can print the name of the day based on the given number to the method

        public static void nameOfDay (int numberOfDay){

            String nameOfDay = "";

            if(numberOfDay >= 1 && numberOfDay <= 7){

            nameOfDay = (numberOfDay==1)?"Monday" :(numberOfDay==2)?"Tuesday" :(numberOfDay==3)?"Wednesday"
                    :(numberOfDay==4)?"Thursday" :(numberOfDay==5)?"Friday" :(numberOfDay==6)?"Saturday"
                    :"Sunday";

            } else {
            nameOfDay = "Invalid";
            }

            System.out.println("Name of day : " + nameOfDay);
    }


    //Create a method that can print how many days a month has

        public static void daysInMonth (int numberOfMonth, int year){

            String daysInMonth ="";

            if (numberOfMonth >= 1 && numberOfMonth <= 12) {

                daysInMonth = (numberOfMonth == 1 || numberOfMonth==3 || numberOfMonth == 5 ||
                        numberOfMonth == 7 || numberOfMonth == 8 || numberOfMonth == 10 || numberOfMonth == 12)? "31 days"
                        :(numberOfMonth == 4 || numberOfMonth==6 || numberOfMonth == 9 ||
                        numberOfMonth == 11)? "30 days" : (year%4 == 0)? "29 days"
                        :"28 Days";

            }System.out.println(daysInMonth);

    }


}



/*
    1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

    6. 6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)



 */