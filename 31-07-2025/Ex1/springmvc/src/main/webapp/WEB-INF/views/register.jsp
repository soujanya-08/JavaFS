<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>

	<form action="userSubmit" method="post" modelAttribute="registerdata">

		<div>
			Username : <input type="text" name="name" />
		</div>
		<div>
		Email : <input type="text" name="email" />
		</div>
		<div>
		Phone Number : <input type="text" name="number" />
		</div>
			<div>
		<button type="submit">Register</button>
</div>


	</form>

</body>
</html>