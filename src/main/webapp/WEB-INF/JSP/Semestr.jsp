
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">

<head>
    <meta charset="UTF-8">
    <title>Семестры</title>
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
</div>
<form style="padding-left: 216px">
    <p style="padding: 10px">
        Выбрать семестр
        <select class="opt_progress1">
            <option value="1">Семестр1</option>
            <option value="2">Семестр2</option>
            <option value="3">Семестр3</option>
        </select>
        <input class="opt_progress2" type="submit" value="выбрать">
    </p>
    <p style="padding-left: 10px">
        Длительность семестр: 24 недели
    </p>
</form>
<table class="main" align="left" border="1">
    <caption>Список дисциплин семестра</caption>
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
<div style="padding-top: 38px">
    <div class="div_btn">
        <input class="opt_progress2" style="width: 270px; padding: 3px" type="submit" value="Создать семестр..." onclick="javascript:window.location='terms_creating.html'">
    </div>
    <div class="div_btn">
        <input class="opt_progress2" style="width: 270px; padding: 3px" type="submit" value="Модифицировать текущий семестр..." onclick="javascript:window.location='term_modifying.html'">
    </div>
    <div class="div_btn">
        <input class="opt_progress2" style="width: 270px; padding: 3px" type="submit" value="Удалить текущий семестр">
    </div>
</div>




</body></html>

