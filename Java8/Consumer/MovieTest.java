package Java8.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieTest {

    public static void populate(ArrayList<Movie> movies) {
        movies.add(new Movie("Bahubali", "Prabhas", "Anushka", "Hit"));
        movies.add(new Movie("Rayees", "Shahrukh", "Sunny", "Super Hit"));
        movies.add(new Movie("Dangal", "Aamir", "Ritu", "Flop"));
        movies.add(new Movie("Sultan", "Salman", "Anushka", "Super Flop"));
    }

    public static void main(String[] args) {

       

        Consumer<Movie> c1 = m -> System.out.println("Movie "+m.getName()+" is relaesed");
        Consumer<Movie> c2 = m -> System.out.println("Movie "+m.getName()+ " is "+m.getResult());
        Consumer<Movie> c3 = m -> {
            System.out.println("Movie "+m.getName()+ " is Having Following Cast ");
            System.out.println("Hero Name : "+m.getHero());
            System.out.println("Heroine Name : "+m.getHeroine());
            //System.out.println("Movie Result : "+m.getResult());
            System.out.println("**********************************************");
        };

        Consumer<Movie> chainedConsumer = c1.andThen(c2).andThen(c3);

        ArrayList<Movie> movies = new ArrayList<>();
        populate(movies);

        for(Movie movie : movies){
            chainedConsumer.accept(movie);
        }

        

        
    }
    
}
