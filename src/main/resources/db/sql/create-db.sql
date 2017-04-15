CREATE TABLE USERS(
	ID bigint generated by default as identity (start with 2),
	NAME varchar(255),
	LASTNAME varchar(255),
	EMAIL varchar(255) NOT NULL,
	PASSWORD varchar(255) NOT NULL,
	JOB varchar(255),
	primary key (ID));