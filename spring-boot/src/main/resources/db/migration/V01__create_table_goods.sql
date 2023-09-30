CREATE TABLE IF NOT EXISTS t_goods
(
    id          VARCHAR(255)   NOT NULL PRIMARY KEY,
    name        VARCHAR(255)   NOT NULL,
    description VARCHAR(255)   NOT NULL,
    price       NUMERIC(10, 2) NOT NULL,
    created_at  TIMESTAMP(6)   NOT NULL
);
