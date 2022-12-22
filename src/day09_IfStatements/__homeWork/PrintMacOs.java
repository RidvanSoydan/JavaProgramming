package day09_IfStatements.__homeWork;

public class PrintMacOs {

        public static void main(String[] args) {

            String input = "Mac", result;

            if (input == "Mac") {
                result = "MacOS";

            }else if (input == "Lenova"){
                result = "Windows";

            }else if (input == "Iphone"){
                result = "IOS";

            }else {
                result = "Android";
            }
            System.out.println("output = " + result);

        }
    }


                    /*Write a java program in order to learn to OS
                    Mac     ->     MacOS
                    Lenova  ->     Windows
                    Iphone  ->     IOS
                    Samsung ->     Android

                    input : Mac
                    output: MacOS
                     */

