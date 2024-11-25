<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="erste/static/index_style.css">
</head>
<body>


<div class="center-text">
    <h1>Вітаємо на порталі пригод!</h1>

    <p>Виберіть пригоду, яка Вам ближче до серця, і почніть свій шлях!</p>
    <div class="topnav">
        <a href="/Drieten/firstQuest?step=reg">Реєстрація</a>
        <a href="/Drieten/firstQuest?step=enter">Вхід</a>
        <a href="/Drieten/firstQuest?step=index">Головна</a>
    </div>
</div>

<div class="image-row">
    <div class="adventure-link">
        <a href="/Drieten/firstQuest?step=begin">
            <img src="erste/images/first.jpg" width="200" height="150" class="clickable">
        </a>
        <h2>Загублений Камінь Життя: <br>Повернення Хранителя</h2>
    </div>

    <div class="adventure-link">
        <a href="/Drieten/firstQuest?step=begin">
            <img src="erste/images/second.jpg" width="200" height="150" class="clickable">
        </a>
        <h2>Цікава пригода</h2>
    </div>

    <div class="adventure-link">
        <a href="/Drieten/firstQuest?step=begin">
            <img src="erste/images/third.jpg" width="200" height="150" class="clickable">
        </a>
        <h2>Фантастична планета</h2>
    </div>

</div>

</body>
</html>
