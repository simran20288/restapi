<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Welcome to Login Page</title>
</head>
<body>
welcome to login page
<form method=POST action="/loginValid">
User Name: <br>
<input type="text" name="uname" class="form-control">
Password: <br>
<input type="password" name="pwd" class="form-control">
<input type="submit" value="Submit" class="btn btn-success">

</form>
</body>
</html>