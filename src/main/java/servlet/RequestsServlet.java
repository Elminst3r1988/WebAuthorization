package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestsServlet extends HttpServlet {

    private final String assASCII = "<pre>" + "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n" +
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
            "⠄⠄⠄⠄⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡷⠄" + "</pre>";



    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {

        String govnoHeader = request.getHeader("Govno");
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        if (govnoHeader != null && govnoHeader.equals("jopa")) {
            response.getWriter().println(assASCII);
            response.setHeader("hui", "zalupa");
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
    }
}
