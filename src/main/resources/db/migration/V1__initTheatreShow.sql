CREATE SEQUENCE IF NOT EXISTS theatre_seq
 START WITH 100
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

CREATE SEQUENCE IF NOT EXISTS show_seq
 START WITH 100
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

CREATE SEQUENCE IF NOT EXISTS theatreshow_seq
 START WITH 100
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

CREATE TABLE theatre(
  theatre_id INTEGER DEFAULT nextval('theatre_seq'),
  name VARCHAR(100) NOT NULL,
  address VARCHAR(500) NOT NULL,
  state VARCHAR(50) NOT NULL,
  city VARCHAR(50) NOT NULL,
  pincode VARCHAR(6) NOT NULL,
  seats INTEGER NOT NULL default 50,
  PRIMARY KEY (theatre_id)
);

CREATE TABLE show(
  show_id INTEGER DEFAULT nextval('show_seq'),
  movie VARCHAR(150) NOT NULL,
  startTime timestamp NOT NULL,
  endTime timestamp NOT NULL,
  language VARCHAR(100) NOT NULL,
  genere VARCHAR(100) NOT NULL,
  price SMALLINT NOT NULL,
  PRIMARY KEY (show_id)
);

CREATE TABLE theatreshow(
  theatreshow_id INTEGER DEFAULT nextval('theatreshow_seq'),
  fromDate Date NOT NULL,
  tillDate Date NOT NULL,
  theatre_id INTEGER NOT NULL,
  show_id INTEGER NOT NULL,
  PRIMARY KEY (theatreshow_id),
  FOREIGN KEY (theatre_id) REFERENCES theatre(theatre_id)
    ON DELETE CASCADE,
  FOREIGN KEY (show_id) REFERENCES show(show_id)
    ON DELETE CASCADE
);