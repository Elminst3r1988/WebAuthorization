package main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlet.RequestsServlet;

public class Main {
    public static void main(String[] args) throws Exception {
        RequestsServlet requestsServlet = new RequestsServlet();

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(requestsServlet), "/mirror");

        Server server = new Server(8080);
        server.setHandler(context);

        server.start();
        server.join();
    }
}
