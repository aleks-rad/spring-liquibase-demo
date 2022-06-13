# spring-liquibase-demo
Демо-приложение для работы с liquibase

### Эндпоинты:

Данные Liquibase из таблицы DATABASECHANGELOG

http://localhost:8080/liquibase/changelog

Данные из таблицы PRODUCTS

http://localhost:8080/product/all

Данные из таблицы ORDERS

http://localhost:8080/order/all

Создать новый заказ

http://localhost:8080/order/create

**После старта H2 база данных доступна по адресу:**

http://localhost:8080/h2-console