##Cleans every iteration of the code
 
 DROP DATABASE IF EXISTS shop;

 CREATE DATABASE shop;
 
 USE shop;

   ##Subtablas de Clients
	
	##main del db schema
	CREATE TABLE customer(
    id MEDIUMINT NOT NULL PRIMARY KEY,
	name VARCHAR(40) NOT NULL,
	surname VARCHAR(40) NOT NULL,
    birthsday DATE NOT NULL,
	email VARCHAR(40) NOT NULL,
    password VARCHAR(40) NOT NULL,
    role VARCHAR(30) NOT NULL
    );
    
    CREATE TABLE customer_adress(
    id MEDIUMINT NOT NULL PRIMARY KEY,
     FOREIGN KEY(customer_id) REFERENCES customer(id) ,
    country VARCHAR(56) NOT NULL,
    city VARCHAR(85) NOT NULL,
    postalcode VARCHAR(9) NOT NULL,
    street VARCHAR(9) NOT NULL,
    numberstreet TINYINT NULL NOT NULL,
    flooranddoor VARCHAR(20) NULL,
    customer_id MEDIUMINT NOT NULL   
    );
    
    CREATE TABLE card(
		id MEDIUMINT NOT NULL PRIMARY KEY,
        FOREIGN KEY(customer_id) REFERENCES customer(id) ,
		number VARCHAR(18) NOT NULL,
		validity_date DATE NOT NULL,
		owner VARCHAR(50) NOT NULL,
		cvv_pin VARCHAR(3) NOT NULL,
        customer_id MEDIUMINT NOT NULL
		
		);
    
    ##Subtablas de Orders
    
        
    CREATE TABLE purchase(
	id MEDIUMINT NOT NULL PRIMARY KEY,
    FOREIGN KEY(customer_id) REFERENCES customer(id) ,
	FOREIGN KEY(customer_adress_id) REFERENCES customer_adress(id),
    status VARCHAR(30) NOT NULL,
    customer_id MEDIUMINT NOT NULL,
	customer_adress_id MEDIUMINT NOT NULL    
    );
    
   
    
   ##Subtablas de Products
        
    CREATE TABLE brand(
    id MEDIUMINT NOT NULL PRIMARY KEY,
    name VARCHAR(20) NOT NULL 
    );
    
    CREATE TABLE size_color(
    id MEDIUMINT NOT NULL PRIMARY KEY,
    name VARCHAR(30) NOT NULL
    );
    
	 CREATE TABLE product(
	id MEDIUMINT NOT NULL PRIMARY KEY,
    FOREIGN KEY (brand_id) REFERENCES brand (id),
    FOREIGN KEY (size_color_id) REFERENCES size_color (id),
    FOREIGN  KEY (purchase_id) REFERENCES purchase(id),
	title VARCHAR(40) NOT NULL,
    price INT NOT NULL,
    weight TINYINT NULL,
	stock TINYINT NOT NULL,
    brand_id MEDIUMINT NOT NULL,
    size_color_id MEDIUMINT NOT NULL,
    purchase_id MEDIUMINT NOT NULL
    );
    
	

	
    
    
    
    
    