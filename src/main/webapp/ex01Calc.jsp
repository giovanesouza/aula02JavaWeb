<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RESULTADO</title>
</head>
<body>


<% 
    float n1 = Float.parseFloat(request.getParameter("n1"));
    float n2 = Float.parseFloat(request.getParameter("n2"));
    String opcao = request.getParameter("operacao");
    
    float resultado = 0;
    
    switch (opcao) {
    
    case "adicao": resultado = n1 + n2;	break;
    	
    case "subtracao": resultado = n1 - n2; 	break;
    	
    case "multiplicacao": resultado = n1 * n2; 	break;
    	
    case "divisao":	resultado = n1 / n2;  	break;
    
    }
   
    %>

   <h1>Resultadado:</h1>

   <p>Operação selecionada <%=opcao%></p>

	Valor 1: <%=n1%> <br>
    Valor 2: <%=n2%> <br>

       
    Resultado: <%=resultado%> <br>




</body>
</html>