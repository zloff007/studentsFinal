
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="ru">

<head>
    <meta charset="UTF-8">
    <title>Список всех студентов</title>
    <link rel="stylesheet" href="CSS\students_style.css">
</head>

<body>
<div class="logo_wrap">
    <div class="logo">Система управления студентами и их успеваемостью</div>
    <a href="">Logout</a>
</div>
<div class="back">
    <a href="http://localhost:8080">На главную</a>
</div>
<form class="btn_form1">
    <input type="button" class="btn1" value="Просмотреть успеваемость выбранных студентов" onclick="javascript:window.location='student_progress.html'">
    <input type="button" class="btn2" value="Создать студента..." onclick="javascript:window.location='/students_creating'">
</form>
<form class="btn_form2">
    <input type="button" class="btn1" value="Модифицировать выбранного студента" onclick="javascript:window.location='students_modifying.html'">
    <input type="button" class="btn2" value="Удалить выбранных студентов">
</form>

<table class="main" border="1">
    <caption>Список студентов</caption>
    <tr>
        <th class="td1"></th>
        <th>Фамилия</th>
        <th>Имя</th>
        <th>Группа</th>
        <th>Дата поступления</th>
    </tr>
    <c:forEach items="${allStudents}" var="student">
    <tr>
        <td class="td1"><input type="checkbox"></td>
        <td >${student.sername}</td>
        <td>${student.name}</td>
        <td>${student.group}</td>
        <td>${student.date}</td>
    </tr>
    </c:forEach>

</table>
</body>

</html>


