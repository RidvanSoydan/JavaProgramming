package day20_Arrays.Tasks;

public class Initials {

    public static void main(String[] args) {

        String[] classmates = {"Ali Can", "Veli Can", "Berk Can", "Michael Jordan", "Ronaldo Jr",
                "Kobe Bryant", "Karim Abdulcabbar", "Master Muhtar"};


        for (int i = 0; i < classmates.length; i++) {

            String initial = classmates[i].charAt(0) + "." + classmates[i].charAt(classmates[i].indexOf(" ") + 1);
            System.out.println(initial);
        }


    }
}