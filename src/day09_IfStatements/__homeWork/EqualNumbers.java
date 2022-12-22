package day09_IfStatements.__homeWork;

public class EqualNumbers {

    public static void main(String[] args) {

        /* Create a class called EqualNumbers, and write a program that can check
                the equality of the three given numberrs
                declare 3 numbers n1, n2, n3

                if all are equal ==> print "all equal"

                if only n1 and n2 are equal =>print  "n1&n2 are equal"

                if only n2 and n3 are equal ==>print "n2&n3 are equal"

                if only n3 and n1 are qual ==>print "n3&n1 are equal"

                if none of them are euqal ==> none of them are equal
                */

                int n1, n2, n3;
                n1 = 15;
                n2 = 16;
                n3 = 17;
                String equality;

                if (n1 == n2 && n1 == n3 && n2==n3){
                    equality ="All Equal";

                } else if (n1 == n2 && n1 != n3 && n2 != n3){
                    equality = n1 + " and " + n2 + " are equal";

                } else if (n1 == n3 && n1 != n2 && n2 != n3) {
                    equality = n1 + " and " + n3 + " are equal";

                } else if (n2 == n3 && n2 != n1 && n3 != n1) {
                    equality = n1 + " and " + n3 + " are equal";
                } else {
                    equality = "None of them are equal";
                }

                System.out.println(equality);
    }
}

