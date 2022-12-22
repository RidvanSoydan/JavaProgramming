package day31_Constructors.PracticeTasks;

public class MovieTest {

    public static void main(String[] args) {

        String title = "Journey to SDET: EU Batch 10";
        String genre = "Adventure, Comedy, Thriller";
        String [] casts =  {"Asiya", "Adam", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};

        Movie film = new Movie("USA", title, genre,"05/01/2022", "Rıdvan Soydan");
        film.addCasts(casts);

        System.out.println(film); //Movie{country='USA', title='Journey to SDET: EU Batch 10',
                                        // releaseDate='05/01/2022', numberOfCast='9'}


    }


}
/*
Movie Task:

    3.2 create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie
 */