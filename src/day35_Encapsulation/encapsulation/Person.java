package day35_Encapsulation.encapsulation;

public class Person {

    private String name;

    private int age;


    public String getName() { // reaching the name
        return name;
    }

    public void setName(String name) { // modifying the name

        if (name.isEmpty()) { //Adding conditions to be able to control datas

            System.err.println("Invalid name !!! " + name);
        //    System.exit(0);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age <= 0 || age > 150){ //Adding conditions to be able to control datas
            System.err.println("Invalid Age: " + age);
            System.exit(0);
        }
        this.age = age;
    }

}