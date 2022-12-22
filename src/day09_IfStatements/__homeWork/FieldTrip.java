package day09_IfStatements.__homeWork;

public class FieldTrip {

    public static void main(String[] args) {

        int grade = 6;
        String fieldtrip;

        if (grade == 1) {
            fieldtrip = "Grade 1 \n\tlocation -  Apple orchard \n\tnumber of groups - 3 \n\tteacher in charge - Ms. Smith";

        } else if (grade == 2) {
            fieldtrip = "Grade 2 \n\tlocation -  Zoo \n\tnumber of groups - 7 \n\tteacher in charge - Mr. Lee";

        } else if (grade == 3) {
                fieldtrip = "Grade 3 \n\tlocation -  Aquarium \n\tnumber of groups - 5 \n\tteacher in charge - Ms. Wilson";

        } else if (grade == 4) {
            fieldtrip = "Grade 4 \n\tlocation -  Movie theater \n\tnumber of groups - 2 \n\tteacher in charge - Ms. Reyes";

        } else if (grade == 5) {
            fieldtrip = "Grade 5 \n\tlocation -  Museum \n\tnumber of groups - 5 \n\tteacher in charge - Ms. Lela";

        } else if (grade == 6) {
                fieldtrip = "Grade 6 \n\tlocation -  Six Flags \n\tnumber of groups - 8 \n\tteacher in charge - Mr. Wattgrade";

        } else {
            fieldtrip = "You Must enter grade number between 1 to 6";
        }

        System.out.println(fieldtrip);

    }
}

        /*Create a class called FieldTrip. Your school goes on a Field trip each year. The place you go will be based on
        your grade. Given a variable gradeNumber (1-6) figure out the details of your field trip. Print the information
        at the end.
        Data based on grade:
        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Wattgrade
         */
