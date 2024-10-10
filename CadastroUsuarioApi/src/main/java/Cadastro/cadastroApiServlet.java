package Cadastro;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class cadastroApiServlet extends HttpServlet {
    List<Usuario> usuarios = new ArrayList<>();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        usuarios.add(new Usuario("Joao", "joaozin@gmail.com"));
        usuarios.add(new Usuario("Lucas", "lucas22@gmail.com"));
        usuarios.add(new Usuario("gab", "gabbga99@gmail.com"));
        usuarios.add(new Usuario("Eduarda", "duada13@gmail.com"));

        Gson gson = new Gson();
        String usuariosConvertidos = gson.toJson(usuarios);

        response.getWriter().append(usuariosConvertidos);

    }



    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String line = "";
        StringBuilder sb = new StringBuilder();
      while((line = br.readLine()) != null) {
            sb.append(line);
        }

            Gson gson = new Gson();
            var usuario = gson.fromJson(sb.toString(), Usuario.class);

        System.out.println(usuario);

        usuarios.add(usuario);



    }


    record Usuario(String name, String email){

    }
}
