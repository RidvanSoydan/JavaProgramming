package day11_Switch_Scanner.Task;

public class CydeoBatches {

    public static void main(String[] args) {

        String cydeoBathces = "US morning";
        boolean validBatch = cydeoBathces == "US morning" || cydeoBathces == "US evening" || cydeoBathces == "EU";
        String result = "";

            if (validBatch) {

                switch (cydeoBathces){

                    case "US morning":
                        result = "Class times are 10-5 EST. M, T, Th, F.";
                        break;

                    case "US evening":
                        result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                        break;

                    default :
                        result = "Class times are  10-5 EST. M, T, W, Th, F.";

                }   System.out.println(cydeoBathces + " ==> " + result);

            }else {

                result = "Invalid Batch";
                System.out.println(result);
            }


        /*4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
                Depending on a batch type (String) print information about the batch.

        If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        If batch type is invalid, print "Invalid Btach"

        Note:
        Solution 1: use if statement
        Solution 2: use switch statement
        Solution 2: use if & switch statements mixed*/
    }
}
