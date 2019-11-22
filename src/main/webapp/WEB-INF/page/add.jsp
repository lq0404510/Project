
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加员工</title>

</head>
<body>
<form action="${pageContext.request.contextPath}/user/add" method="post">
    <table width="600px" align="center" border="1px">
        <tr>
            <td>文档名称</td>
            <td>
                <input type="text" name="designation" required>
            </td>
        </tr>
        <tr>
            <td>文档摘要</td>
            <td>
                <input type="text" name="detail" required>
            </td>
        </tr>
        <tr>
            <td>上传人</td>
            <td>
                <input type="text" name="name" required>
            </td>
        </tr>
        <tr>
            <td>上传时间</td>
            <td>
                <input type="date" name="time" required>
            </td>
        </tr>
        <td><input type="submit" value="提交"></td>
        <td><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>
<h4 align='center'><a href="index.jsp">返回主页</a></h4>

</body>
</html>
