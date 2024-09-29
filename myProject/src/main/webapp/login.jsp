<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style type="text/css">
*{
text-align:center;
background-color:#AAAAFF;
}
#ent{
border: 1px solid black;
max-width: fit-content;
 margin-left: auto;
  margin-right: auto;
  padding:3px;
}

#sub{
background-color:Blue;
border-color:white;
color:white;
}
input{
background-color:white;
border-color:blue;
color:Black;
}
#msg{
color:red;
}

</style>
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