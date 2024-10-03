<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Failed</title>

<link rel="stylesheet" type="text/css" href="design.css" />

</head>
<body>

<h3>This is Home page</h3>
		<p id="msg">Login Failed!!<br>Wrong Username or Password</p><br>
		<p>Please Login in to continue</p><br>
		<div id="ent">
		<form action="dashboard" method="post">
		
			User Name: <input type="text" name="uname"><br>
			Password: <input type="password" name="pw"><br>
			<input type="submit" value="submit" id="sub">
		
			
		</form>
	</div>


</body>
</html>