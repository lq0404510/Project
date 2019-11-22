
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>修改资料</title>

</head>
<body>
<form action="${pageContext.request.contextPath}/user/update" method="post">
    <input type="hidden" name="id" value="${user.id}">
    <table width="600px" align="center" border="1px">
        <%--<tr>
            <td>ID</td>
            <td>
                <input type="text" name="id" value="${user.id}" readonly>
            </td>
        </tr>--%>

        <tr>
            <td>文档名称</td>
            <td>
                <input type="text" name="designation" value="${user.designation}" required>
            </td>
        </tr>
        <tr>
            <td>文档摘要</td>
            <td>
                <input type="text" name="detail" value="${user.detail}" required>
            </td>
        </tr>
        <tr>
            <td>上传人</td>
            <td>
                <input type="text" name="name" value="${user.name}" required>
            </td>
        </tr>
        <tr>
            <td>上传时间</td>
            <td>
                <input type="date" name="time" value="${user.time}" required>
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
