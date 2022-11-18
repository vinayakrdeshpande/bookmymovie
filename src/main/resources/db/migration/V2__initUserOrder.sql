CREATE SEQUENCE IF NOT EXISTS users_seq
  START WITH 100
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

CREATE SEQUENCE IF NOT EXISTS orders_seq
  START WITH 100
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;


CREATE TABLE users(
  users_id INTEGER DEFAULT nextval('users_seq'),
  name VARCHAR(100) NOT NULL,
  address VARCHAR(500) NOT NULL,
  state VARCHAR(50) NOT NULL,
  city VARCHAR(50) NOT NULL,
  pincode VARCHAR(6) NOT NULL,
  mobileNo VARCHAR(10) NOT NULL,
  email VARCHAR(100) NOT NULL,
  userType VARCHAR(50) NOT NULL,
  createdDate TIMESTAMP NOT NULL default CURRENT_DATE,
  PRIMARY KEY (users_id)
);


CREATE TABLE orders(
  order_id INTEGER DEFAULT nextval('orders_seq'),
  movieDate DATE default CURRENT_DATE,
  bookedDate TIMESTAMP NOT NULL,
  paid bigint NOT NULL,
  users_id INTEGER NOT NULL,
  theatreshow_id INTEGER NOT NULL,
  PRIMARY KEY (order_id),
  FOREIGN KEY (users_id) REFERENCES users (users_id)
    ON DELETE CASCADE,
  FOREIGN KEY (theatreshow_id) REFERENCES theatreshow (theatreshow_id)
    ON DELETE CASCADE
);