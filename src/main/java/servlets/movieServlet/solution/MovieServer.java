package servlets.movieServlet.solution;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class MovieServer {
    public static final int PORT = 6500;

    public static void main(String[] args) {
        Server server = new Server(PORT);
        ServletHandler handler = new ServletHandler();

        // when the user goes to http://localhost:6500/movies, the get request is
        // going to go to MovieServlet
        handler.addServletWithMapping(new ServletHolder(new MovieServlet()), "/movies");

        server.setHandler(handler);
        try {
            server.start();
            server.join();
        } catch (Exception e) {
            System.out.println("Could not start the server");
        }
    }
}
