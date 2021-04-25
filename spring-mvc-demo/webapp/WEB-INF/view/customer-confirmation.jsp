<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="cpp" %>

<!DOCTYPE html>
<html>
<head> <title>Customer Confirmation</title></head>

<body>

The customer is confirmed: ${customer.firstName } ${customer.lastName } 

<br><br>
Free passes: ${customer.freePasses }

<br><br>
Post Code: ${customer.postalCode }

<br><br>
Post Code: ${customer.courseCode }


</body>
</html>