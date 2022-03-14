<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Controller" method="GET">
<span> empId</span><input type="text" name="empId"><br/>
<span> name</span><input type="text" name="name"><br/>
<span> city</span><input type="text" name="city"><br/>
<span> salary</span><input type="text" name="salary"><br/>
<span>Type 1 for createEmployee</span>
<span>Type 2 for updateEmployee</span>
<span>Type 3 for deleteEmployee</span>

<input type="text" name="data"><br/>
<input type="submit" name="send"><br/>

</form>
</body>
</html>