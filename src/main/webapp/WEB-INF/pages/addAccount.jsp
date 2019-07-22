<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>add</title>
</head>
<body>
<form action="/account/insert" method="post">
    <table border="0.5">
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>金额：</td>
            <td><input type="text" name="money"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
