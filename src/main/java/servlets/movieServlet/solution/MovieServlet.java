package servlets.movieServlet.solution;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MovieServlet extends HttpServlet {
    private List<Movie> movies = new ArrayList<>();

    public MovieServlet() {
        Movie m1 = new Movie("Inception", "Christopher Nolan", 2010);
        Movie m2 = new Movie("Titanic", "James Cameron", 1997);
        Movie m3 = new Movie("The Godfather", "Francis Ford Coppola", 1972);
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
    }

    public void addMovie(Movie m) {
        movies.add(m);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Form</title></head>");
        out.println("<body>");

        // Displays movies
        out.println("<h1>Movies:</h1>" );
        for (Movie movie: movies) {
            out.println("<p>" + movie + "</p><br>");
        }
        out.println("</body>");
        out.println("</html>");

        response.setStatus(HttpServletResponse.SC_OK);
    }

   /* public JsonObject serialize(String searchParameter) {
        JsonObject obj = new JsonObject();
        JsonArray jsonArr = new JsonArray();
        int count = 0;
        for (Movie movie: movies) {
            if (movie.getName().contains(searchParameter)) {
                JsonObject movieObj = movie.serializeMovie();
                jsonArr.add(movieObj);
                count++;
            }
        }
        if (count > 0)
            obj.add("movies", jsonArr);
        return obj;
    }

    */
}
