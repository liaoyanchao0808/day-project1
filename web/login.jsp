<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/7/15
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <script type="text/javascript">
            function onCheck() {
                var flag = true;
                flag = flag && onUsername();
                flag = flag && onPassword();
                flag = flag && onAgainPassword();
                flag = flag && onAge();
                flag = flag && onHobby();
                flag = flag && onPhone();
                flag = flag && onEmail();
                flag = flag && onCity();
                if(flag){
                    alert("注册成功！");
                }
            }
            //验证用户名
            function onUsername() {
                var username = document.getElementById("name");
                if(username.value){
                    return true;
                }else {
                    alert("用户名不能为空");
                    return false;
                }
                //验证密码
                function onPassword() {
                    var pwd1 = document.getElementById("pwd1");
                    if(pwd1.value){
                        if(pwd1.value.length<6){
                            alert("密码长度必须大于6")；
                            return false;
                        }
                        return true
                    }else {
                        alert("密码不能为空");
                        return false
                    }
                }
                //再次验证密码
                function onAgainPassword() {
                    var pwd1 = document.getElementById("pwd1");
                    var pwd2 = document.getElementById("pwd2");
                    if (pwd1.value == pwd2.value) {
                        return true
                    } else {
                        alert("密码和确认密码必须一致")；
                        return false;
                    }
                }
                    //验证年龄
                    function onAge() {
                        var age = document.getElementById("age");
                        if(age.value){
                            return true
                        }else {
                            alert("年龄不能为空")；
                            return false;
                        }
                    }
                    //验证爱好
                    function onHobby() {
                        var hobby = document.getElementById("hobby");
                        if(hobby.value){
                            return true;
                        }else {
                            alert("爱好不能为空");
                            return false;
                        }
                    }
                    //验证电话号码
                function onPhone() {
                    var phone = document.getElementById("phone");
                    if(phone.value){
                        if(phone.value.length != 11){
                            alert("电话号码为11位");
                            return false;
                        }
                        return true;
                    }else {
                        alert("电话号码不能为空");
                        return false;
                    }
                }
                //验证地址
                function onCity() {
                   var city = document.getElementById("city");
                   if(city.value){
                       return true;
                   }else {
                       alert("地址不能为空");
                       return true;
                   }
                }
                // 验证邮箱格式是否合法
                function onEmail() {
                    var email = document.getElementById("email");
                    if (email.value) {
                        // 判断是否包含@和.符号
                        var index1 = email.value.indexOf("@");
                        var index2 = email.value.indexOf(".");
                        if (index1 == -1 || index2 == -1) {
                            alert("邮箱格式非法：必须包含@和.符号");
                            return false;
                        }
                        // @和.符号都不能在首尾字符
                        if (index1 == 0 || index2 == 0
                            || index1 == email.value.length - 1
                            || index2 == email.value.length - 1) {
                            alert("邮箱格式非法：@和.符号都不能在首尾字符");
                            return false;
                        }
                        // @不能在.符号之后
                        if (index1 > index2) {
                            alert("邮箱格式非法：@不能在.符号之后");
                            return false;
                        }
                        // @和.符号不能相邻
                        if (index1 == index2 - 1) {
                            alert("邮箱格式非法：@和.符号不能相邻");
                            return false;
                        }

                        return true;
                    } else {
                        alert("邮箱不能为空");
                        return false;
                    }
                }
            }
    </script>
</head>
<body>
    <form action="loginServlet" method="post">
        <table border="1" cellspacing="0">
            <caption>新用户注册</caption>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username" id="name"/></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password" id="pwd1"/></td>
            </tr>
            <tr>
                <td>确认密码</td>
                <td><input type="password" name="password" id="pwd2"/></td>
            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text"  id="age"/></td>
            </tr>
            <tr>
                <td>性别</td>
                <td style="text-align: center">
                    <input type="radio" name="sex"/>男&nbsp;
                    <input type="radio" name="sex" checked="checked"/>女
                </td>
            </tr>
            <tr>
                <td>爱好</td>
                <td><input type="text" name="hobbys" id="hobby"/></td>
            </tr>
            <tr>
                <td>电话号码</td>
                <td><input type="text"  id="phone"/></td>
            </tr>
            <tr>
                <td>电子邮件</td>
                <td><input type="text"  id="email"/></td>
            </tr>
            <tr>
                <td>地址</td>
                <td><select id="city">
                    <option>--请选择--</option>
                    <option>深圳</option>
                    <option>广州</option>
                    <option>珠海</option>
                </select>
                </td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center">
                    <input type="submit" value="注册" onclick="onCheck()" />
                    <input type="reset" value="重置"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
