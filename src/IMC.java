
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/imc")
public class IMC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public IMC() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String massa = request.getParameter("massa");
		String altura = request.getParameter("altura");

		Double massaD = Double.parseDouble(massa);
		Double alturaD = Double.parseDouble(altura);

		Double resultado = massaD / Math.pow(alturaD, 2);
		
		String classificacao = "";

		if (resultado < 16) {
			classificacao = "Magreza grave";
		} else if (resultado < 17) {
			classificacao = "Magreza moderada";
		} else if (resultado < 18.5) {
			classificacao = "Magreza leve";
		} else if (resultado < 25) {
			classificacao = "Saudável";
		} else if (resultado < 30) {
			classificacao = "Sobrepeso";
		} else if (resultado < 35) {
			classificacao = "Obesidade Grau I";
		} else if (resultado < 40) {
			classificacao = "Obesidade Grau II (severa)";
		} else {
			classificacao = "Obesidade Grau III (mórbida)";
		}

		request.setAttribute("imc", resultado);
		request.setAttribute("classificacao", classificacao);

		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
