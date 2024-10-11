package CadastroUsuarioAPI;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class FormularioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtendo os parâmetros do formulário
        String name = request.getParameter("name");
        String cpf = request.getParameter("cpf");
        String nameCar = request.getParameter("nameCar");
        String marca = request.getParameter("marca");
        String cor = request.getParameter("cor");
        String placa = request.getParameter("placa");
        String chassi = request.getParameter("chassi");

        StringBuilder dadosRecebidos = new StringBuilder();
        dadosRecebidos.append("Dados recebidos com sucesso:\n");
        dadosRecebidos.append("Nome: ").append(name).append("\n");
        dadosRecebidos.append("CPF: ").append(cpf).append("\n");
        dadosRecebidos.append("Modelo do Carro: ").append(nameCar).append("\n");
        dadosRecebidos.append("Marca: ").append(marca).append("\n");
        dadosRecebidos.append("Cor: ").append(cor).append("\n");
        dadosRecebidos.append("Placa: ").append(placa).append("\n");
        dadosRecebidos.append("Chassi: ").append(chassi).append("\n");

        String respostaForm = dadosRecebidos.toString();


        response.setContentType("text/plain");
        response.getWriter().write(respostaForm);


        System.out.println(respostaForm);

        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("cadastroConcluido.jsp");
        rd.forward(request, response);
    }
}