<%@ page import="java.util.*" %>
<html>
<body>
<!-- Step 1: Create HTML form -->
<form action="todo-demo.jsp">
Add new item : <input type="text" name="theItem"/>
<br/><br/>
<input type="submit" value="submit"/>

</form>

<br/>
Items entered : <%=request.getParameter("theItem") %>

<!-- Step 2: Add new iten to "To Do " list -->
<%
 List<String> items= (List<String>)session.getAttribute("myToDoList");

if(items==null)
{
	items= new ArrayList<>();
	session.setAttribute("myToDoList", "items");
}
String theItems = request.getParameter("theItem");
if(theItems!=null)
{
	items.add(theItems);
}
%>

<!-- Step 3: Display all the "TO do " list from session. -->
<hr>
<b>To List items : </b><br/>
<ol>

<%
for(String temp:items)
{
	out.println("<li>"+temp+"</li>");
}

%></ol>
</body>
</html>