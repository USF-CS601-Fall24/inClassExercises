package servlets.movieServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import org.apache.commons.text.StringEscapeUtils;
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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter out = response.getWriter();
        // FILL IN CODE to create a response (html with movies)

        // Once the first step is complete, check if the request contains a search parameter
        // so that you only show movies whose title contains the keyword



    }

}
