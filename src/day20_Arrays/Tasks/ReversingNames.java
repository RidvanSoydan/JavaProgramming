package day20_Arrays.Tasks;

public class ReversingNames {

    public static void main(String[] args) {

        String [] classMates = {"Ali", "Ayşe", "Veli", "Osman", "Cengiz", "Zeynep", "Müge", "Bekir", "Can", "Orhan"};

            for (int i = 0; i < classMates.length; i++) {
                String eachFriend = classMates[i];
                String reverseName = "";

                for (int j = eachFriend.length()-1; j >= 0; j--) {
                    reverseName += eachFriend.charAt(j);

                }System.out.println(reverseName);
            }



    }
}
/*create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c

 */