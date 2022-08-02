DROP Database if exists practice9;

create database practice9;

use practice9;

/* ***********************************************************************************
							Creating Employ Table
   ***********************************************************************************
*/

Create Table Employ
(
   Empno INT auto_increment primary key, 
   Name varchar(30) NOT NULL,
   Gender ENUM('MALE','FEMALE'),
   Dept varchar(30),
   Desig varchar(30),
   Basic numeric(9,2)
);

/* ************************************************************************************
				Inserting Data into Employ Table 
   ************************************************************************************
*/

Insert into Employ(Name,Gender,Dept,Desig,Basic)
values('Swathi','FEMALE','Java','Programmer',84823),
('Tenzing','MALE','Dotnet','Expert',84233),
('Tushar','MALE','Java','Expert',88323),
('TimpleShree','FEMALE','Dotnet','Manager',88424);

select * from Employ;