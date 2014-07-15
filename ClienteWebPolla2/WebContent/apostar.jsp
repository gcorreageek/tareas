<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String id = request.getParameter("partido");
String p1 = request.getParameter("p1");
String p1r = request.getParameter("p1r");
String p2 = request.getParameter("p2");
String p2r = request.getParameter("p2r"); 
%>
<form action="apostar"  method="get" >
<table>
<tr> <td>
<img src="<%out.print(p1r);%>" />
<%out.print(p1);%>
<input type="text"  name="scort1" />
<img src="<%out.print(p2r);%>" />
<%out.print(p2);%>
<input type="text"  name="scort2" />
<input type="hidden"  name="id"  value="<%out.print(id);%>" />
</td> </tr>
</table>
<input type="submit" value="Registrar Pronostico"  />
</form>

</body>
</html>