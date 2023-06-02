<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Example</title>
</head>
<body>
<form method="post" action="login.jsp">
<center>
<h1>EDUBRIDGE: A LEARNING PLATFORM</h1>
<img src="D:\logo html.jpg" alt="LOGO" width="128" height="128" >
<p style="text-align:left">
<hr>
ABout us: <br>
EduBridge is India's leading Workforce Development
<br> Platform that helps learners in building careers
<br> with leading corporates through training and other
<br> career building services.
</p>
<table border="1" width="30%" cellpadding="3">
<thead>
<tr>
<th colspan="2">Login Here</th>
</tr>
</thead>
<tbody>
<tr>
<td>User Name</td>
<td><input type="text" name="uname" value="" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="pass" value="" /></td>
</tr>
<tr>
<td><input type="submit" value="Login" /></td>
<td><input type="reset" value="Reset" /></td>
</tr>
<tr>
<td colspan="2">Yet Not Registered!! <a href="reg.jsp">Register Here</a></td>
</tr>
</tbody>
</table>
</center>
</form>
<footer>
<p>Copyright JAyanth @2023</p>
<p><a href="https://www.edubridgeindia.com/">EDUBRIDGE PVT. LTD.</a></p>
</footer>
</body>
</html>