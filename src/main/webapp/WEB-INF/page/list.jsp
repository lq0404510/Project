<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>全体员工信息</title>

    <style type="text/css">
        th{
            text-align:center;/** 设置水平方向居中 */
        }
    </style>

    <script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.js"></script>

</head>

<body>
<td>电子文档列表</td> </br>
<table width="1000px" align="center" border="1px">

    <th>文档编号</th>
    <th>文档名称</th>
    <th>文档摘要</th>
    <th>上传人</th>
    <th>上传时间</th>
    <th colspan="4">操作</th>

    <c:forEach begin="0" end="${list.size() - 1}" var="i">
        <tr>
            <td>${list[i].id}</td>
            <td>${list[i].designation}</td>
            <td>${list[i].detail}</td>
            <td>${list[i].name}</td>
            <td>${list[i].time}</td>

            <td><a href="javascript:del(${list[i].id})">删除</a></td>
            <td><a href="${pageContext.request.contextPath}/user/find?id=${list[i].id}">修改</a></td>
            <td><a href="${pageContext.request.contextPath}/find?id=${list[i].id}">查询</a></td>
            <td><a href="${pageContext.request.contextPath}/add">添加</a></td>
        </tr>
    </c:forEach>
</table><h4 align='center'><a href="index">返回主页</a></h4>


<script type="text/javascript">
    function del(id) {
         if (confirm('确定删除吗') == true){
            $.ajax({
                type:"get",
                url:"${pageContext.request.contextPath}/user/del?id="+id,
                success:function (msg) {
                    if(msg=='1'){
                        location.href="${pageContext.request.contextPath}/user/list";
                    } else {
                        alert("删除失败，请重试！！！")
                    }
                }
            });
         }
    }
</script>
</body>
</html>

