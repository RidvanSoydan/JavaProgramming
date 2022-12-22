package day11_Switch_Scanner;

public class NumberOfDays_SwitchAndIf {

    public static void main(String[] args) {

        int year = 2000;
        int number = 11;
        String result = "";

        if (number >= 1 && number <=12) { //number 1 ~ 12

            switch (number) {

                case 2 :

                    if (year % 4 == 0){             //Special situation... if statement in the switch, switch in the if...
                        result ="29 Days";          // another way ==> result = (year % 4==0)? "29 Days": "28 Days";
                    }else {
                        result = "28 days";
                    }
                    break;

                case 4: case 6: case 9: case 11:
                    result = "30 Days";
                    break;

                default: // means number can be one of those : 1, 3, 5, 7, 8, 10, 12
                    result = "31 Days";
                    System.out.println("result = " + result);
            }


        } else {
            result ="Invalid";
            System.out.println("result = " + result);
        }


          /*NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

            If(1~12){


			}else{
				Invalid
			}


           */

    }
}



