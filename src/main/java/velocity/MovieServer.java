package velocity;

import org.apache.velocity.app.VelocityEngine;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class MovieServer {
    public static final int PORT = 6500;

    public static void main(String[] args) {
        Server server = new Server(PORT);
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        handler.addServlet(MovieServlet.class, "/movies");

        // initialize Velocity
        VelocityEngine velocity = new VelocityEngine();
        velocity.init();

        // Set velocity as an attribute of the context so that we can access it
        // from servlets
        handler.setAttribute("templateEngine", velocity);
        server.setHandler(handler);

        try {
            server.start();
            server.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
