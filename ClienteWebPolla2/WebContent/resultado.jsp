<%@ page language="java" contentType="text/html" import="java.util.*"%>
<%@ page language="java" contentType="text/html"  import="com.polla.service.Pais"%>
<%@ page language="java" contentType="text/html"  import="com.polla.service.Pronostico"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="resultado"  method="get" >
<table>
<tr>
<td>
<select   name="cboPais" >
<%
Pais[] pais = null;
pais =(Pais[] ) request.getAttribute("paises");
if(pais!=null){ 
	for (Pais p : pais) {
		out.print("<option value="+p.getIdPais()+" >"+p.getNombre()+"</option>");
	}
}
%>
</select>
<input type="submit"  value="Consultar" />
</td>
</tr> 
</table>
</form>
<table>
<tr>
<td>Pronosticos acumulados</td><td>Ganados</td><td>Perdidos</td><td>Empatados</td>
<% Pronostico pronostico = null; 
pronostico = (Pronostico) request.getAttribute("pronostico"); 

if(pronostico!=null){
%>
</tr>
<tr>
<td><%=pronostico.getPartido().getPais1().getNombre()%><img src="<%=pronostico.getPartido().getPais1().getRuta()%>" /></td>
<td><%=pronostico.getEstadoGano()%></td><td><%=pronostico.getEstadoPerdio()%></td><td><%=pronostico.getEstadoEmpate()%></td>
</tr>

<%} %>
</table>

</body>
</html>