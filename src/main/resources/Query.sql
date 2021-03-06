/*Create database*/
CREATE DATABASE itcs6112_project;
/*Create tables*/
CREATE TABLE doctor
(
username varchar(40),
email varchar(40) NOT NULL,
address varchar(255),
password varchar(30),
telephoneNumber varchar(20),
gender varchar(10),  
patientNumber int, 
introduction varchar(255),
status bit
);

ALTER TABLE doctor ADD PRIMARY KEY (email);

ALTER TABLE doctor
ADD CONSTRAINT chk_doctor CHECK (patientNumber>=0 AND patientNumber<=20);

CREATE TABLE patient
(
username varchar(40) NOT NULL,
email varchar(40) NOT NULL,
address varchar(255),
password varchar(30),
telephoneNumber varchar(20),
gender varchar(10),  
birthdate DATE,
medicalHistory varchar(1000)
);

ALTER TABLE patient ADD PRIMARY KEY (email);


CREATE TABLE care
(
doctorEmail varchar(40),
patientEmail varchar(40),
FOREIGN KEY (doctorEmail) REFERENCES doctor(email),
FOREIGN KEY (patientEmail) REFERENCES patient(email)
);

/*insert some emails in doctor table*/
INSERT INTO doctor (email) VALUES ('doctor1@gmail.com');
INSERT INTO doctor (email) VALUES ('doctor2@gmail.com');
INSERT INTO doctor (email) VALUES ('doctor3@gmail.com');
INSERT INTO doctor (email) VALUES ('doctor4@gmail.com');
INSERT INTO doctor (email) VALUES ('doctor5@gmail.com');
INSERT INTO doctor (email) VALUES ('doctor6@gmail.com');
INSERT INTO doctor (email) VALUES ('doctor7@gmail.com');
INSERT INTO doctor (email) VALUES ('doctor8@gmail.com');
INSERT INTO doctor (email) VALUES ('doctor9@gmail.com');
INSERT INTO doctor (email) VALUES ('doctor10@gmail.com');

