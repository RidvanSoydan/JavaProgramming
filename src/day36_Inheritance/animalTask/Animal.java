package day36_Inheritance.animalTask;

public class Animal {

    public String name;                         // import vs extends:
    public String breed;                        // import: borrowing
    public char gender;                         // extends: owning
	public String size;
    public int age;
    public String color;
                                        // inherit -> pass it through
                                        //	import -> let using

    public void setInfo (String name, String breed, char gender, String size, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.age = age;
        this.color = color;
    }


    public void eat (){
        System.out.println(name + " is eating");
    }

    public void drink (){
        System.out.println(name + " is drinking");
    }

    public void sleep (){
        System.out.println(name + " is sleeping");
    }

    public void move (){
        System.out.println(name + " is moving");
    }


    public String toString() {

        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }



}


/*
Animal:
		name, breed, gender, size, age, color
		setInfo(), eat(), drink(), move(), sleep(), toString()

	Dog extends Animal:
			bark()

	Cat extends Animal:
			scratch() (tırmalamak)

	Tiger extends Animal:
			roar()

	Fish extends Animal:
			swim()
 */