package day11_Switch_Scanner.Task;

public class Elevator {

    public static void main(String[] args) {

    int floorNumber = 3;
    boolean valid = floorNumber == 1 || floorNumber == 2 || floorNumber ==  3;
    String result = "";


    if (valid) {

        switch (floorNumber){

            case 1 :
                result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2 :
                result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;
            default:
                result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";

        }   System.out.println(result);

    }else {

        System.out.println("Invalid floor - " + floorNumber);
    }



        /*
        2. Create a class called Elevator. A variable named floorNumber is given,
        write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
         */
    }
}
