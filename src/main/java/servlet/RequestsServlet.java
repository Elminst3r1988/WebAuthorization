package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestsServlet extends HttpServlet {

    private final String assASCII =
            "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
            "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⣶⣶⣶⣶⣤⣀⠄⠄⠄⠄⠄⠄⠄\n" +
            "⠄⠄⠄⠄⠄⣠⣶⣿⣿⣶⣦⣄⠄⠄⠄⢠⣿⣿⣿⣿⣿⣿⣿⣆⠄⠄⠄⠄⠄⠄\n" +
            "⠄⠄⠄⠄⢰⣿⣿⣿⣿⣿⣿⣿⣧⠄⠄⣾⣿⣿⣏⠉⠉⣿⣿⣿⡆⠄⠄⠄⠄⠄\n" +
            "⠄⠄⠄⢰⣿⣿⣿⣏⠄⢘⣿⣿⣿⡄⢘⣿⣿⣿⣿⣆⣀⣼⣿⣿⣷⠄⠄⠄⠄⠄\n" +
            "⠄⠄⠄⢸⣿⣿⣿⣿⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄\n" +
            "⠄⠄⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⠄⠄⠄\n" +
            "⠄⠄⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠛⠛⠻⢿⣿⣿⣿⣿⣿⣧⠄⠄\n" +
            "⠄⠄⣿⣿⣿⣿⣿⣿⣿⡿⠋⠁⠈⠙⠛⠋⠄⠄⠄⠄⠄⠄⠉⣿⣿⣿⣿⣿⡆⠄\n" +
            "⠄⠄⣿⣿⣿⣿⣿⣿⡟⠄⠄⠄⠄⠄⢀⣀⣀⣠⣴⡾⠟⠛⠛⣿⣿⣿⣿⣿⡇⠄\n" +
            "⠄⠄⢿⣿⣿⣿⣿⣿⠶⠶⠶⠶⠾⠛⠋⠉⠉⠁⠄⢀⣀⣤⣶⣿⣿⣿⣿⣿⠁⠄\n" +
            "⠄⠄⢸⣿⣿⣿⣿⣿⣷⣤⣤⣤⣤⣤⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠄⠄\n" +
            "⠄⠄⠄⢿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠿⠛⠛⣛⣛⣛⣛⣛⣛⣛⡛⠛⠃⠄⠄\n" +
            "⠄⠄⠄⠄⠛⢛⣋⣉⣁⣤⣤⣤⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠄⠄\n" +
            "⠄⠄⠄⠄⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡷⠄";



    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {

        response.setStatus(HttpServletResponse.SC_OK);


        if (request.getHeader("Govno") != null && request.getHeader("Govno").equals("jopa")) {
            response.getWriter().println(assASCII);
            response.setHeader("hui", "zalupa");
        }
    }
}
