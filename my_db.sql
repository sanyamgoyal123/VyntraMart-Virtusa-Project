CREATE TABLE category (
	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	CONSTRAINT pk_category_id PRIMARY KEY (id)
);
INSERT INTO category (name, description,image_url,is_active) VALUES ('T-shirt', 'This is description for T-shirt category!', 'CAT_1.png', true);
INSERT INTO category (name, description,image_url,is_active) VALUES ('Jeans', 'This is description for Jeans category!', 'CAT_2.png', true);
INSERT INTO category (name, description,image_url,is_active) VALUES ('Shoes', 'This is description for Shoes category!', 'CAT_3.png', true);

CREATE TABLE user_detail (
	id IDENTITY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(60),
	email VARCHAR(100),
	contact_number VARCHAR(15),	
	CONSTRAINT pk_user_id PRIMARY KEY(id)
);

INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Sanyam', 'Goyal', 'ADMIN', true, 'admin', 'sg@gmail.com', '9058287222');
INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Harleen', 'Walia', 'SUPPLIER', true, '12345', 'hw@gmail.com', '8219550861');
INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Garima', 'Pahwa', 'SUPPLIER', true, '67895', 'gp@gmail.com', '8439481744');

CREATE TABLE product (
	id IDENTITY,
	code VARCHAR(20),
	name VARCHAR(50),
	brand VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10,2),
	quantity INT,
	is_active BOOLEAN,
	category_id INT,
	supplier_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	CONSTRAINT pk_product_id PRIMARY KEY (id),
 	CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category (id),
	CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_detail(id)	
);

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views)
VALUES ('PRDABC123DEFX', 'PUMA T-SHIRT', 'PUMA', 'This is one of the comfortable tshirt available in the market right now!', 900, 100, true, 1, 2, 0, 0 );
INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views)
VALUES ('PRDDEF123DEFX', 'ADIDAS T-SHIRT', 'ADIDAS', 'A tshirt  by adidas!', 1100, 20, true, 1, 3, 0, 0 );
INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views)
VALUES ('PRDPQR123WGTX', 'NIKE T-SHIRT', 'NIKE', 'This is one of the rough and tough tshirt available in the market right now!', 1500, 5, true, 1, 2, 0, 0 );
INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views)
VALUES ('PRDMNO123PQRX', 'ARMANI JEANS', 'ARMANI', 'A jeans by Armani!', 3000, 25, true, 2, 3, 0, 0 );
INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views)
VALUES ('PRDABCXYZDEFX', 'LeeCooper Shoes', 'Lee-Cooper', 'Sneakers by Lee-Cooper!', 4000, 5, true, 3, 3, 0, 0 );
