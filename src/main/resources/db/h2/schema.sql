DROP TABLE customer IF EXISTS;

CREATE TABLE customer (
    `id` BIGINT IDENTITY PRIMARY KEY,
    `first_name` VARCHAR(30),
    `last_name` VARCHAR(30),
    `testyn` VARCHAR(1)
);