CREATE DATABASE setup;

USE setup; 

CREATE TABLE IF NOT EXISTS setup.users (
	id INT NOT NULL auto_increment,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    handle VARCHAR(100),
    age INT,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP, 
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);

INSERT INTO `users`(`id`, `first_name`, `last_name`, `handle`, `age`) 
VALUES (NULL,"daniel","inoztroza","contabilidad",36);

INSERT INTO `users`(`id`, `first_name`, `last_name`, `handle`, `age`) 
VALUES (NULL,"sebastian","llanquileo","it",39);

INSERT INTO `users`(`id`, `first_name`, `last_name`, `handle`, `age`) 
VALUES (NULL,"tammy","aguirre","rrhh",42);

INSERT INTO `users`(`id`, `first_name`, `last_name`, `handle`, `age`) 
VALUES (NULL,"luis","torres","marketing", 25);

SELECT * FROM users where age >= 35;

DELETE FROM `users` WHERE YEAR(created_at) > "2023";

SELECT * FROM users;

UPDATE `users` SET `first_name`="fernando",`last_name`="troncoso",`handle`="boss",`age`=29 WHERE id=1;

SELECT * FROM users;