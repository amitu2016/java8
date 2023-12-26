package Java8.Consumer;

public class Movie {
    private String name;
    private String hero;
    private String heroine;
    private String result;

    public Movie(String name, String hero, String heroine, String result) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getHeroine() {
        return heroine;
    }

    public void setHeroine(String heroine) {
        this.heroine = heroine;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Movie [name=" + name + ", hero=" + hero + ", heroine=" + heroine + ", result=" + result + "]";
    }

   
}
