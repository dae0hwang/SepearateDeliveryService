DROP TABLE IF EXISTS company_members;

CREATE TABLE company_members(
    id BIGINT AUTO_INCREMENT PRIMARY KEY ,
    login_name VARCHAR(30) NOT NULL UNIQUE ,
    password VARCHAR(128) NOT NULL ,
    name VARCHAR(30) NOT NULL ,
    phone_verification TINYINT(1) NOT NULL,
    registration_date TIMESTAMP NOT NULL
);

DROP TABLE IF EXISTS company_food;

CREATE TABLE company_food(
     id BIGINT AUTO_INCREMENT PRIMARY KEY ,
     member_id BIGINT NOT NULL ,
     name VARCHAR(30) NOT NULL ,
     registration_date TIMESTAMP NOT NULL
);

DROP TABLE IF EXISTS company_food_price;

CREATE TABLE company_food_price(
     id BIGINT AUTO_INCREMENT PRIMARY KEY ,
     food_id BIGINT NOT NULL ,
     price DECIMAL NOT NULL,
     update_date TIMESTAMP NOT NULL
);

DROP TABLE IF EXISTS general_members;

CREATE TABLE general_members(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    login_name VARCHAR(30) NOT NULL UNIQUE ,
    password VARCHAR(128) NOT NULL ,
    name VARCHAR(30) NOT NULL ,
    phone_verification TINYINT(1) NOT NULL,
    registration_date TIMESTAMP NOT NULL
);

DROP TABLE IF EXISTS order_list;

CREATE TABLE order_list(
      id BIGINT AUTO_INCREMENT PRIMARY KEY,
      general_id BIGINT NOT NULL ,
      registration_date TIMESTAMP NOT NULL
);

DROP TABLE IF EXISTS order_detail_list;

CREATE TABLE order_detail_list(
      id BIGINT AUTO_INCREMENT PRIMARY KEY,
      order_id BIGINT NOT NULL,
      company_id BIGINT NOT NULL ,
      food_id BIGINT NOT NULL ,
      food_price DECIMAL NOT NULL,
      food_amount  INT NOT NULL
);
