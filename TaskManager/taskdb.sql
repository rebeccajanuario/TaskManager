CREATE DATABASE IF NOT EXISTS taskdb;
USE taskdb;

CREATE TABLE IF NOT EXISTS tasks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(255),
    descricao TEXT
);


GRANT ALL PRIVILEGES ON taskdb.* TO 'root'@'localhost';
FLUSH PRIVILEGES;
SHOW DATABASES LIKE 'taskdb';

USE taskdb;
SHOW TABLES;
SELECT * FROM tasks;

SHOW GRANTS FOR 'root'@'localhost';