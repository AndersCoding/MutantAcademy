-- Create new user and give it all rights to the database
CREATE USER 'Xavier'@'%' IDENTIFIED BY 'ProfessorX';
GRANT ALL PRIVILEGES ON * . * TO 'Xavier'@'%';

-- Create the database and initiate the use
create database MutantAcademyDB;
    use MutantAcademyDB;

-- Create student-table
  CREATE TABLE Students (
ID int not null auto_increment PRIMARY KEY,
Name varchar(255) not null,
Power varchar(255) not null,
PowerLvl int not null
  );