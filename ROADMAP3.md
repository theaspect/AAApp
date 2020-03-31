# План 3
1. Создать файл Roadmap3.md в репозитории проекта
2. Создать класс Logger - R3.1.
   1. Создать функцию log, принимающая текст сообщения
   2. Создать функцию для логирования введенных аргументов
   3. Дописать работу программы с использованием методов логирования
3. Создать базу данных SQLite
   1. Создать таблицы Session, Users, Resources - R.3.4.
   2. Внести тестовые данные в таблицы
4. Создать класс BaseService для взаимодействия с БД - R.3.10 && R.3.9
   1. Создать метод инициализации БД, если она  не найдена - R.3.5.
   2. Добавить метод внесения тестовых данных в БД, если она не найдена - R.3.6.
   3. Добавить методы для получения данных из БД с использованием PreparedStatement  - R.3.7.
   4. Добавить методы для внесения данных в  БД с использованием PreparedStatement  - R.3.8.
   5. Переписать работу сервисов с использованием методов BaseService  - R.3.3.