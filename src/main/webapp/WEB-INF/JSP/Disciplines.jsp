
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">

<head>
    <meta charset="UTF-8">
    <title>Список дисциплин</title>
    <link rel="stylesheet" href="CSS/students_style.css">
</head>

<body>
<div class="logo_wrap">
    <div class="logo">Система управления студентами и их успеваемостью</div>
    <a href="">Logout</a>
</div>
<div>
    <div class="back">
        <a href="http://localhost:8080">На главную</a>
    </div>
    <form class="modify_title" style="padding-left: 63px">
        <p>Список дисциплин </p>
    </form>
</div>

<table class="main" align="left" border="1">
    <tr>
        <th class="td1"></th>
        <th>Наименование дисциплины</th>
    </tr>
    <tr>
        <td class="td1"><input type="checkbox"></td>
        <td class="td2">Высшая математика</td>
    </tr>
    <tr>
        <td class="td1"><input type="checkbox"></td>
        <td class="td2">История Науки и Техники</td>
    </tr>
    <tr>
        <td class="td1"><input type="checkbox"></td>
        <td class="td2">Политология</td>
    </tr>
    <tr>
        <td class="td1"><input type="checkbox"></td>
        <td class="td2">Информатика</td>
    </tr>
    <tr>
        <td class="td1"><input type="checkbox"></td>
        <td class="td2">Теория Алгоритмизации</td>
    </tr>
</table>
<div class="div_btn" >
    <input class="opt_progress2" style="width: 270px; padding: 3px" type="submit" value="Создать дисциплину..." onclick="javascript:window.location='disciplines_creating.html'">
</div>
<div class="div_btn" >
    <input class="opt_progress2" style="width: 270px; padding: 3px" type="submit" value="Модифицировать выбранную дисциплину..." onclick="javascript:window.location='disciplines_modifying.html'">
</div>
<div class="div_btn" >
    <input class="opt_progress2" style="width: 270px; padding: 3px" type="submit" value="Удалить выбранную дисциплину...">
</div>



</body>

</html>

