<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
 <style>
    body {
      margin: 0;
      padding: 0;
      font-family: sans-serif;

      background-size: cover;
      background-repeat: no-repeat;
    }

    body::before {
      content: "";
      position: absolute;
      top: 0;
      left: 0;
      width: 37.8%;
      height: 100%;
      background-color: rgba(0, 0, 0, 0.2);
      opacity: 0.8;
    }

    .form {
      position: absolute;
      top: 50%;
      left: 38%;
      transform: translate(-50%, -50%);
      width: 400px;
      min-height: 450px;
      background-color: #fff;
      box-shadow: 0 15px 50px rgba(0, 0, 0, 0.5);
      padding: 50px;
      box-sizing: border-box;
    }

    .form h2 {
      color: rgb(0, 0, 0);
      margin: 0 0 40px;
      padding: 0;
    }

    .form .input-box {
      position: relative;
      margin: 20px 0;
    }

    .form .input-box input {
      width: 100%;
      font-size: 16px;
      border: none;
      border-bottom: 2px solid #777;
      outline: none;
      padding: 10px;
      padding-left: 30px;
      margin-bottom: 25px;
      box-sizing: border-box;
      font-weight: bold;
      color: #777;
    }

    .form .input-box input:focus,
    .form .input-box input:valid {
      border-bottom-color: #03a9f4;
    }

    .form .input-box .fa {
      position: absolute;
      top: 8px;
      left: 5px;
      font-size: 18px;
      color: #777;
    }

    .form .input-box input[type="submit"] {
      border: none;
      margin-top: -20px;
      cursor: pointer;
      background-color: #03a9f4;
      color: #fff;
      font-weight: bold;

    }

    .form .input-box input[type="submit"]:hover {
      background-color: #39c544;
    }

    .form a {
      text-decoration: none;
      color: #777;
      margin-top: 20px;
      font-weight: bold;
      display: inline-block;
      transition: 0.5s;
    }
  </style>
</head>
<body>
<c:if test="${fail }">
	<h2>Wrong!!!!</h2></c:if>
<div class="form" >
    <form action="login">
      <h2>Login</h2>
      <div class="input-box">
        <i class="fa fa-user" aria-hidden="true"></i>
        <input type="text" name="username" placeholder="Username" required>
      </div>
      <div class="input-box">
        <i class="fa fa-unlock-alt" aria-hidden="true"></i>
        <input type="password" name="password" placeholder="Password" required>
      </div><br>
      <div class="input-box">
        <input type="submit" name="sign-in" value="Login">
      </div>
    </form>
  </div>
</body>
</html>