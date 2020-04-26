/*Create database*/
drop database itcs6112_project;
CREATE DATABASE itcs6112_project;
use itcs6112_project;

/*Create tables*/
CREATE TABLE doctor
(
username varchar(40),
email varchar(40) NOT NULL,
address varchar(255),
password varchar(30),
telephoneNumber varchar(20),
gender varchar(10),  
introduction varchar(255),
status char(1)
);

ALTER TABLE doctor ADD PRIMARY KEY (email);

ALTER TABLE doctor ADD CONSTRAINT chk_doctor CHECK (patientNumber>=0 AND patientNumber<=20);

CREATE TABLE patient
(
username varchar(40) NOT NULL,
email varchar(40) NOT NULL,
address varchar(255),
password varchar(30),
telephoneNumber varchar(20),
gender varchar(10),  
birthdate varchar(20),
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

INSERT INTO doctor (email,username,password,status) VALUES ('doctor11@gmail.com','Anna','QWE123qwe','1');
INSERT INTO doctor (email,username,password,status) VALUES ('doctor12@gmail.com','David','QWE123qwe','1');
INSERT INTO Patient (email,username,password) VALUES ('Ben@gmail.com','Ben','QWE123qwe');
INSERT INTO Patient (email,username,password) VALUES ('Lily@gmail.com','Lily','QWE123qwe');
INSERT INTO Patient (email,username,password) VALUES ('Geneva@gmail.com','Geneva','QWE123qwe');

create table PatientHealthData(
date varchar(20) not null,
email varchar(40) not null,
Height varchar(40),
Weight varchar(40),
BloodPressure varchar(255),
BloodSugar varchar(255),
Temp varchar(40),
FOREIGN KEY (email) REFERENCES patient(email)
);

INSERT INTO PatientHealthData VALUES ('04/26/2020','Lily@gmail.com','64','110','100/60','5.3','98.6');

INSERT INTO care VALUES ('doctor11@gmail.com','Lily@gmail.com');



