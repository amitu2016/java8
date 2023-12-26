package Java8.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieTest {

    public static void populate(ArrayList<Movie> movies) {
        movies.add(new Movie("Bahubali", "Prabhas", "Anushka"));
        movies.add(new Movie("Rayees", "Shahrukh", "Sunny"));
        movies.add(new Movie("Dangal", "Aamir", "Ritu"));
        movies.add(new Movie("Sultan", "Salman", "Anushka"));
    }

    public static void main(String[] args) {

        Consumer<Movie> c = m -> {
            System.out.println("Movie name : "+m.getName());
            System.out.println("Hero Name : "+m.getHero());
            System.out.println("Heroine Name : "+m.getHeroine());
            System.out.println("**********************************************");
        };

        ArrayList<Movie> movies = new ArrayList<>();
        populate(movies);

        for(Movie movie : movies){
            c.accept(movie);
        }

        
    }
    
}
