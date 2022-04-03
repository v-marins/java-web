package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;

/**
 * Servlet implementation class ShowUserServlet
 */
@WebServlet("/ShowUserServlet")
public class ShowUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	response.sendRedirect("Ok.jsp"); // Redirecionando para o index, quando url solicitar através do GET
	
	//Usamos o RequestDispatcher para redirecionar para uma pag sem mostrar ela na barra de endereço do usuário.
	  
	 /* RequestDispatcher dispatcher;
		dispatcher = getServletContext().getRequestDispatcher("/Ok.jsp"); // Enviando diretamente a página.
		dispatcher.forward(request, response);*/
		
		
		//Recuperar parametros passados na url
		// Considere essa url: http://localhost:8080/PrimeiroMVC/ShowUserServlet?user=vinicius&senha=1234&modo=html
		
				String pUser = request.getParameter("user");
				String pSenha = request.getParameter("senha");
				String pModo = request.getParameter("modo");
				
				// podemos usar esses parametros para validar qual página o Dispatcher vai retornar.
				
				String pagina = "/Erro.jsp";
				
				if(pUser.equals("vinicius") && pSenha.equals("1234")) {
				
				// É possível enviar informações de um usuário, por exmeplo, via request	
					Usuario u = new Usuario();
					u.setId(1010);
					u.setUsername("vinicius");
					u.setFullName("Vinicius Marins");
					u.setEmail("vinicius@email.com.br");
					request.setAttribute("Usuario", u); // método seta atributos no request (classe,objeto)
					pagina = "/Ok.jsp";
				}
				
		//Podemos enviar a variável pagina com o direcionamento validado.
		RequestDispatcher dispatcher;
		dispatcher = getServletContext().getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
	
		
		
	}

	

}
