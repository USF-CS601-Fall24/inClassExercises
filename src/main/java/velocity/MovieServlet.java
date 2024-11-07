package velocity;

import org.apache.commons.text.StringEscapeUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
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
        // This method will be invoked when the user goes to localhost:6500/movies
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter out = response.getWriter();

        // TODO:
        // Get the VelocityEngine from the servlet context
        // get the formTemplate so that we display the form that allows the user to enter the movie title
        // the templates are in the templates/ folder, you can look at them in the browser
        // Create a velocity context and a StringWriter
        // Merge the template and the velocity context (the context is empty in this case)
        // Write the contents of the writer to the response's print writer: out.println(writer);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        // This method will be invoked when the user submits the form
        // (the form is processed by the POST request
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);

        String keyword = request.getParameter("search");
        keyword =  StringEscapeUtils.escapeHtml4(keyword);
        PrintWriter out = response.getWriter();

        // TODO:
        // Get the VelocityEngine from the servlet context
        // Get the template from templates/movieTemplate.html
        // Create a VelocityContext
        // Create a list of movies with the given keyword in the title
        // Put the list in the velocity context (for the attribute "movies").
        // Create a StringWriter and merge the context and template
        // Write to the response

    }
}
