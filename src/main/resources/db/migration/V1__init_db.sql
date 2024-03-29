CREATE TABLE notes(
id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
title VARCHAR(250) NOT NULL CHECK(LENGTH(title) BETWEEN 3 AND 250),
content VARCHAR NOT NULL
);

CREATE TABLE users (
	id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	username VARCHAR(25) NOT NULL CHECK (LENGTH(username) BETWEEN 3 AND 25),
	password VARCHAR(25) NOT NULL CHECK (LENGTH(password) BETWEEN 6 AND 25)
);