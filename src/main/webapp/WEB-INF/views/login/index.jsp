<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
  <div class="container mt-5">
    <div class="row">
      <div class="col-4 m-auto">
        <h2 class="text-center">ĐĂNG NHẬP</h2>
        <p class="text-center">${message}
        <form action="<c:url value="/login" />" method= "POST">
          <div class="form-group">
            <label>Email</label>
            <input type="email" name="email" class="form-control" />
          </div>
          <div class="form-group">
            <label>Password</label>
            <input type="password" name="password" class="form-control" />
          </div>
          <button class="btn btn-primary">LOGIN</button>
        </form>
      </div>
    </div>
  </div>
</body>
</html>