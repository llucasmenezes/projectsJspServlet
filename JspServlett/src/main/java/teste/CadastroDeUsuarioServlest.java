package teste;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cadastroDeUsuario")
public class CadastroDeUsuarioServlest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var name = request.getParameter(name);
        System.out.println("salvar o usuario");
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("sucesso.jsp");
        rd.forward(request, response);
    }


}
