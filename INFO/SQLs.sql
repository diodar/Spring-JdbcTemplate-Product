CREATE DATABASE demo_db;

CREATE TABLE IF NOT EXISTS products
( id INTEGER NOT NULL AUTO_INCREMENT,
  name VARCHAR(128) NOT NULL,
  quota INTEGER NOT NULL,
  price DOUBLE NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO products (name, quota, price) VALUES (?, ?, ?)

SELECT * FROM products

SELECT * FROM products WHERE id = ? LIMIT 1

UPDATE products SET name = ?, quota = ?, price = ? WHERE id = ?

DELETE FROM products WHERE id = ?