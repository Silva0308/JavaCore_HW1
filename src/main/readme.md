# Java Core (семинары)
## Урок 1. Компиляция и интерпретация кода
Создать проект из трёх+ классов (основной с точкой входа и два класса в другом пакете),
которые вместе должны составлять одну программу (простое приложение на Ваш выбор), которое просто демонстрирует работу некоторого механизма).

Пример моего приложения - в материалах урока.

Необходимо установить Docker Desktop.
Создать Dockerfile, позволяющий откопировать исходный код вашего приложения в образ для демонстрации работы вашего приложения при создании соответствующего контейнера.

# Конвертер температуры
Сделала приложение, позволяющее конвертировать температуру между градусами Цельсия и Фаренгейта
Созданы классы: <br>
Main https://github.com/Silva0308/JavaCore_HW1/blob/master/src/main/java/ru/gb/Main.java
<br> Сам конвертер: https://github.com/Silva0308/JavaCore_HW1/tree/master/src/main/java/ru/gb/converter
<br> Класс декоратора: https://github.com/Silva0308/JavaCore_HW1/blob/master/src/main/java/ru/gb/Decorator.java
 
Написан Докерфайл: <br> https://github.com/Silva0308/JavaCore_HW1/blob/master/src/main/dockerfile

Собрала Docker с помощью команды:

**`docker build . -t converter:v1.1`**

Запустила контейнер:  **`docker run converter:v1.1`**

