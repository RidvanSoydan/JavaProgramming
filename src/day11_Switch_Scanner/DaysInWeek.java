package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main (String [] args) {

            // float, double, boolean and long cannot be used.

        int number = 5;
        String nameOfTheDay = "";

 /*
        if(number == 1){
            System.out.println("Monday");
        }
        ....
         */
                                        //
        switch (number) {//==equal or not       //Expression of the switch has to be data like int, byte, short, String, char
                                                // 1, 2, 3, 4, 5, 6, 7
                                               //Expression type in the cases must be same data type with switch
                                              //You cannot compare int (number) to String ("1")
                                             // ONE SWITCH AND ONE DEFAULT BLOCK, LOTS OF CASE BLOCK
                                            //You dont need to use paranthesis in case blocks
            case 1:             //long way is (number == 1)
                System.out.println("Monday");
                break;          //***BREAK : EXITS THE SWITCH AFTER EXECUTING THE CASE BLOCK
                                        //if we don't give the break statement, switch statement continue
      //                                  to execute the next block(s) until the break statement or } of the switch
      //                                    exp: if I dont give break here and if the number is 1,
      //                                    Monday and Tuesday will be printed regardless of the value in the case 2.
            //                              So this will be bug.
      //***BREAK STATEMENTS NOT MANDATORY but if you dont give break you wont reach the print statements
            // that you look for. So there will be bugs
            case 2:             //if you give the same values to the cases it will give compile error, in if's won't give
                System.out.println("Tuesday");
                break;           //***EXITS THE SWITCH AFTER EXECUTING THE CASE BLOCK

            case 3:
                System.out.println("Wednesday");
                break;
                                    //if the number is 5, in if statement compiler looks by starting 1, 2, ...
            //                          in switch it will directly goes to the case block 5 and executes
                                    //so switch faster than if stattements sometimes.
            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");       // If we dont write any break statement, java will run from the case block
                break;                              // matching the value given on the top, then the next blocks
                                                    // since coming to the curly braces on the bottom

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;


            default:
                System.out.println("Invalıd Number"); //**Default block only get executed if none of the case blocks are matching
                                                       //**Default block does not need to have any value (like Invalid Value)
                break;                                //**If you have default block at th end you dont need to write BREAK
                                                      // statement because there will be } after default block
                                                      //**Also DEFAULT is NOT MANDATORY but if you dont write default block and
                                                      // none of the values matching in the case block there wont be anything
                                                      // printed in the console
                                                      //**Default block does not need to be at the end of the case blocks,
                                                      //it can be any where and if you write it between case blocks, you need to
            //                                         write BREAK if not and if the number on the top not matching any case block
            //                                         it will be printed Invalid and Next case block statements since coming BREAK.
        }                                           //THE BEST IS IT NEED TO BE AT THE END THEN THERE WONT BE BUGS


    }
}
