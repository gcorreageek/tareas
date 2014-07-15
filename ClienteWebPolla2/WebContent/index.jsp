<%@ page language="java" contentType="text/html" import="java.util.*"%>
<%@ page language="java" contentType="text/html"  import="com.polla.service.Partido"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>

<tr>
<td>Ingrese Fecha:</td>
<td><form action="servletCliente"  method="get" ><input type="text"  name="fecha"   /><input  type="submit"  value="Consultar" /></form></td>
</tr> 

<%
Partido[] part = null;
part =(Partido[] ) request.getAttribute("partidos");
if(part!=null){
 
for (Partido p : part) {
	out.print("<tr>");
	out.print("<td>"+p.getPais1().getNombre()+"<img  src="+p.getPais1().getRuta()+" /></td>");
	out.print("<td>VS</td>");
	out.print("<td>"+p.getPais2().getNombre()+"<img  src="+p.getPais2().getRuta()+" /></td>");
	out.print("<td><a href=apostar.jsp?partido="+p.getIdPartido()+"&p1="+p.getPais1().getNombre()+"&p1r="+p.getPais1().getRuta()+"&p2="+p.getPais2().getNombre()+"&p2r="+p.getPais2().getRuta()+" >Apostar</a></td>");
	out.print("</tr>");
}
}
%>

</table>


</body>
</html>