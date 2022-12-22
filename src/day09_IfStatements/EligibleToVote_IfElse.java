package day09_IfStatements;

public class EligibleToVote_IfElse {

    public static void main(String[] args) {

    // Task : Write a progrm that can check if the person is eligible to vote

    int age = 27;
    String citizenship = "TR";
    String name = "Ahmet";

    boolean isEligibleToVote = age >=18 && citizenship == "TR";

    if (isEligibleToVote) {
        System.out.println(name + " is eligible to vote in Turkey");
    } else {
        System.out.println(name + " is NOT eligible to vote in Turkey");

    }
    }
}
