DROP TABLE IF EXISTS student;

CREATE TABLE student (
   id BIGINT not null AUTO_INCREMENT,
    dob DATE,
    email VARCHAR(255),
    name VARCHAR(255),
    CONSTRAINT student_pk primary key (id)
);
