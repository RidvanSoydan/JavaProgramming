package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

    // hourly rate, weekly hours

    int hourlyRate = 65;
    int weeklyHours = 45;
    int numberofWeeks = 52;

    int salary = hourlyRate * weeklyHours * numberofWeeks;

    System.out.println(salary);

        // Println double quote ("") içinde yazılırsa string of text olur ama double quote içinde yazılmazsa Variable olur
        // o nedenle double quote için de YAZILMAZ

    //Kısayol soutv

        System.out.println("weeklyHours = $" + weeklyHours);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("numberofWeeks = " + numberofWeeks);
        System.out.println("salary = $" + salary);

    // System.out.println(salary)
        // soutv kısayol sonradan weekly hours, hourly rate, salary seçilir
        //Double Quote den önce $ işareti konabilir.


    }
    }