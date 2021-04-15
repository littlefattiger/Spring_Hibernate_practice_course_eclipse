<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="cpp" %>

<!DOCTYPE html>
<html>
<head> <title>Student Confirmation</title></head>

<body>

The student is confirmed: ${student.firstName } ${student.lastName } 
<br><br>

Country: ${student.country }
<br><br>
Favorite Language: ${student.favoriteLanguage }
<br><br>
Operation Systems:

<ul>
<cpp:forEach var="temp" items="${student.operationSystems}">

<li>${temp}</li>
</cpp:forEach>
</ul>

</body>
</html>