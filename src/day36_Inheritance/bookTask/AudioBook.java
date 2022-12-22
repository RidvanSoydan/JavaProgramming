package day36_Inheritance.bookTask;

public class AudioBook extends Book {

    private String length, narrator;

    public void setInfo(String title, String type, String author, double price, String length, String narrator){
        setInfo(title, type, author, price);
        setLength(length);
        setNarrator(narrator);
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }


    public void listen(){
        System.out.println("Listening to " + getTitle());
    }

}
/*
3. Book Task:
	3.1. create a class named Book:
			variables:
				title, type, author, price

			Methods:
				setInfo()
				toString()

	3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()

	3.3 Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()

 */