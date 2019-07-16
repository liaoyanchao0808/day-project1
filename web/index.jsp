<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/7/15
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录页面</title>
    <script type="text/javascript">
      function onCheck() {
        var username = document.getElementById("name");
        var password = document.getElementById("pwd");
        if(!username.value || !password.value){
          alert("用户名或密码不能为空");
          return false;
        }
        return true;
      }
      function onlogin() {
        location.href = "login.jsp"
      }
    </script>
  </head>
  <body>
  <form action="userServlet" method="post" onsubmit="return onCheck()">
    <table border="1" cellspacing="0">
      <caption>用户登录界面</caption>
      <tr>
        <td>用户名</td>
        <td><input type="text" name="username" id="name"/></td>
      </tr>
      <tr>
        <td>密码</td>
        <td><input type="password" name="password" id="pwd"/></td>
      </tr>
      <tr>
        <td colspan="2">
          <input type="submit" value="登录"/>
          <input type="button" value="注册" onclick="onlogin()"/>
        </td>
      </tr>
    </table>
  </form>
  </body>
</html>
