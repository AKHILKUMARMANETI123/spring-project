<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1> USER REGISTRATION PAGE</h1>
<html>
<body>
<form:form modelAttribute="user" action="/register">
NAME<form:input path="name"/>
PASSWORD<form:password path="psw"/>
EMAIL<form:input path="email"/>
GENDER<form:input path="gender"/>
Address<form:input path="addr"/>
<input type="submit" name="Register"/>

</form:form>
</body>

</html>
