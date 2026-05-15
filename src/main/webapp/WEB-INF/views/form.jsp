<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Registration</title>
</head>
<body>

<h1>Course Registration</h1><br>
<form:form action="/student-course/submitCourse" method="post" modelAttribute="course">
Name:  <form:input path="name"/><br><br>
Email: <form:input path="email"/><br><br>
Course: <form:select path="domain"><br>
<form:option value="Java"/><br>
<form:option value="Python"/><br>
<form:option value="C++"/><br>
<form:option value="Front-End"/>
</form:select><br><br>
<input type="submit" value="Register"/><br><br>
<form:form action="/student-course/deleteStudent"  modelAttribute="display">
<input type="submit" value="Show All" />
</form:form>
</form:form>
</body>
</html>