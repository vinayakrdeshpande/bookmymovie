CREATE SEQUENCE IF NOT EXISTS theatre_seq
START WITH 1
INCREMENT BY 1;

CREATE SEQUENCE IF NOT EXISTS show_seq
START WITH 1
INCREMENT BY 1;

CREATE SEQUENCE IF NOT EXISTS theatre_show_seq
START WITH 1
INCREMENT BY 1;

CREATE TABLE theatre(
  id bigint DEFAULT nextval('theatre_seq'),
  name VARCHAR(100) NOT NULL,
  address VARCHAR(500) NOT NULL,
  city VARCHAR(50) NOT NULL,
  pincode INTEGER NOT NULL,
  seats INTEGER NOT NULL default 50,
  PRIMARY KEY (id)
);

CREATE TABLE show(
  id bigint DEFAULT nextval('show_seq'),
  name VARCHAR(150) NOT NULL,
  startTime timestamp NOT NULL,
  endTime timestamp NOT NULL,
  price SMALLINT NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE theatre_show(
  id bigint DEFAULT nextval('theatre_show_seq'),
  theatre_id INTEGER NOT NULL,
  show_id INTEGER,
  PRIMARY KEY (id),
  FOREIGN KEY (theatre_id) REFERENCES theatre (id)
    ON DELETE CASCADE,
  FOREIGN KEY (show_id) REFERENCES show (id)
    ON DELETE SET NULL
);