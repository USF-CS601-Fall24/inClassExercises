package velocity;

import com.google.gson.JsonObject;

public class Movie {
    private String name;
    private String director;
    private int year;

    public Movie(String name, String director, int year) {
        this.name = name;
        this.director = director;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return name + " " + director + " " + year;
    }

    public JsonObject serializeMovie() {
        JsonObject movieObj = new JsonObject();
        movieObj.addProperty("name", name);
        movieObj.addProperty("director", director);
        movieObj.addProperty("year", year);
        return movieObj;
    }

}
