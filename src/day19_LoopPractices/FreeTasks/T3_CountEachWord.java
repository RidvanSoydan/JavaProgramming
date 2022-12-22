package day19_LoopPractices.FreeTasks;

public class T3_CountEachWord {

    public static void main(String[] args) {

    /*
    Interview Question:
    --  Task 3: Count each name in sentence.
    input :
  String names = "Adam Adam Barry Aysun Aysun";
    output:
    Adam-2 Barry-1 Aysun-2
     */

        String names = "Adam Adam Adam Barry Aysun Aysun";

        String each ="";
        int count =0;

        while(names.contains(" ")){
            each = names.substring(0,names.indexOf(" "));

            while(names.contains(each)){

                names=names.replaceFirst(each,"");
                names=names.replaceFirst(" ","");
                count++;
            }

            System.out.println(each+ " "+ count);
            count = 0;
            each = "";
        }


        System.out.println("-------------------------------------------------------");


        String names1 = "Adam Adam Barry Aysun Aysun";
        String temp="";
        String result1="";

        for (int i = 0; i < names1.length(); i++) {
            char ch=names1.charAt(i);

            //we need to find the word one by one
            if (ch != ' '){
                temp += ch;
                continue; // we need to find word in order to continue to next statement
            }

            String search = temp;

            //in order to count word
            int counter = 0;

            String dumy=names1;

            while (dumy.contains(search)) {
                counter++;
                dumy = dumy.replaceFirst(search, "");
            }
            if (!result1.contains(search))
                result1 +=search + "-"+ counter +" ";

            temp="";
        }

        System.out.println("result = " + result1);

    }

    }

