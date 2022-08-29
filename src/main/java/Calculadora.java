

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculadora
 */

//ROTA QUE DEVE SER INSERIDA NA URL
@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html");

	        /*
	         * CRIAR UM SERVLET QUE RECEBA DOIS VALORES COMO PARÂMETROS E FAZER O PROCESSO DAS 4 OPERAÇÕES => + - / *
			APRESENTAR OS RESUTLADOS EM UMA TABELA HTM.
			PEGAR VIA GET (method=”get”).

	         */
	   
	        // ADICIONAR/INSERIR OS PARÂMETROS NA URL => ?v1=VALOR1&v2=VALOR2
	        float v1 = Float.parseFloat(request.getParameter("v1"));
	        float v2 = Float.parseFloat(request.getParameter("v2"));        
	       
	        
	        float adicao = v1 + v2;
	        float subtracao = v1 - v2;
	        float multiplicacao = v1 * v2;
	        float divisao = v1 / v2;     

	        
	       PrintWriter out = response.getWriter();
	        try {
	            out.println("<html>");
	            out.println(" <head>");
	            out.println(" <title>CALCULADORA COM SERVELET</title>");
	            
	            out.println(" <style>" + "tr, th, td {border: 0.1rem solid #000; text-align: center; padding: 0.2rem;}" +"</style>");
	            	            
	            out.println(" </head>");
	            out.println(" <body>");
	            
	            out.println(" <h1>Resultados - OPERAÇÕES MATEMÁTICAS:</h1>");
	            out.println("<table>");
	            
	            // CABEÇALHO
	            out.println("<tr>");
	            out.println("<th> VALOR 1 " + "</th>");
	            out.println("<th> VALOR 2 " + "</th>");
	            out.println("<th> OPERAÇÃO " + "</th>");
	            out.println("<th> RESULTADO " + "</th>");
	            out.println("</tr>");
	            
	            // ADIÇÃO
	            out.println("<tr>");
	            out.println("<td>" + v1 + "</td>");
	            out.println("<td>" + v2 + "</td>");
	            out.println("<td>" + "Adição" + "</td>");
	            out.println("<td>" + adicao + "</td>");
	            out.println("</tr>");
	            
	            // SUBTRAÇÃO
	            out.println("<tr>");
	            out.println("<td>" + v1 + "</td>");
	            out.println("<td>" + v2 + "</td>");
	            out.println("<td>" + "Subtração" + "</td>");
	            out.println("<td>" + subtracao + "</td>");
	            out.println("</tr>");
	            
	            
	            // MULTIPLICAÇÃO
	            out.println("<tr>");
	            out.println("<td>" + v1 + "</td>");
	            out.println("<td>" + v2 + "</td>");
	            out.println("<td>" + "Multiplicação" + "</td>");
	            out.println("<td>" + multiplicacao + "</td>");
	            out.println("</tr>");
	            
	            // DIVISÃO
	            out.println("<tr>");
	            out.println("<td>" + v1 + "</td>");
	            out.println("<td>" + v2 + "</td>");
	            out.println("<td>" + "Divisão" + "</td>");
	            out.println("<td>" + divisao + "</td>");
	            out.println("</tr>");
	            
	            out.println(" </table>");

	            out.println(" </body>");
	            out.println("</html>");
	        } finally {
	            out.close();
	        }
		 
	}

}
