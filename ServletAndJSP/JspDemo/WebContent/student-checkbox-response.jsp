<html>
<head><title>Student Confirmation Title</title></head>
<body>

The student is confirmed : ${param.firstname} ${param.lastname}
<br/><br/>

<!-- display list of favorite programming languages. -->
Favorite Programming Languages :
<ul>
<%
  String langs[]=request.getParameterValues("favoritelanguage");
for(String s :langs)
{
	out.println("<li>"+s+"<li/>");
}

%>

</ul>

</body>
</html>