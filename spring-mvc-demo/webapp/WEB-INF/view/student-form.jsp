<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head> <title>Student Registration Form</title></head>

<body>

<form:form action="processForm" modelAttribute="student">
First name: <form:input path="firstName"/>
<br><br>
Last name: <form:input path="lastName"/>
<br><br>
Country:

<form:select path="country">
<form:options items="${student.countryoptions }" />

</form:select>
<br><br>
Favorite Language:
Java <form:radiobutton path="favoriteLanguage" value="Java"/>
CPP <form:radiobutton path="favoriteLanguage" value="C++"/>
Python <form:radiobutton path="favoriteLanguage" value="Python"/>
Excel <form:radiobutton path="favoriteLanguage" value="Excel"/>


<br><br>
Operation System:
Windows <form:checkbox path="operationSystems" value="Windows"/>
Linux <form:checkbox path="operationSystems" value="Linux"/>
MACOS <form:checkbox path="operationSystems" value="MACOS"/>


<br><br>
<input type="submit" value="Submit"/>


</form:form>


</body>
</html>