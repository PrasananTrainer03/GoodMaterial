drop database if exists cabsystem;

create database cabsystem;

use cabsystem;

Drop Table If Exists Booking;

drop table If exists Wallet;

Drop Table if Exists UserDetails;

Create Table UserDetails
(
    UserId INT primary Key auto_increment,
    UserName varchar(30) UNIQUE KEY,
    PassCode varchar(30),
    FirstName varchar(30),
    LastName varchar(30),
    City varchar(30),
    State varchar(30),
    Mobile varchar(15),
    Email varchar(25)
);

Insert into UserDetails(UserName,Passcode,FirstName,LastName,City,State,Mobile,Email)
values('dada','dada@123','Data','Kalandar','Chennai','TN','94823542','dadak@gmail.com'),
('saikumar','saik@234','Sai Kumar','Naidu','Tirupathi','AP','99382345','saikumar@gmail.com'),
('Jyoshna','jyoshnak','Jyoshna','Kaikala','Tirupathi','AP','9842355','jyoshna@gmail.com'),
('babji','babji@123','Babji','Saheb','Chennai','TN','9882385','babji@gmail.com'),
('devisurya','devi@123','Devi','Surya','Tirupathi','AP','9923552','devis@gmail.com');

Drop Table If Exists DriverDetails;

Create Table DriverDetails
(
    DriverId INT auto_increment Primary Key,
    DriverUserName varchar(30) UNIQUE KEY,
    DriverPassword varchar(30),
    DriverFirstName varchar(30),
    DriverLastName varchar(30),
    DriverCity varchar(30),
    DriverState varchar(30),
    DriverMobile varchar(30),
    DriverEmail varchar(30),
    CabType varchar(30)
);

Insert into DriverDetails(DriverUserName,DriverPassword,DriverFirstName,
DriverLastName,DriverCity,DriverState,DriverMobile,DriverEmail,CabType)
values('Khaeel','sheik@123','Khaleel','Sheik','Chennai','TN','9942835',
'khaleel@gmail.com','MINI'),
('Bunty','Buntyjain@123','Bunty','Jain','Kohima','NL','99482355','buntyjain@gmail.com','SUV'),
('Naveen','naveenvelaga','Naveen','Kumar','Hyderabad','TS','99429355','naveenk@gmail.com','Prime'),
('Vinay','chodavarapu12','Vinay','Reddy','Tirupathi','TS','99492355','vijaych@gmail.com','XL');

Drop Table If Exists Wallet;

Create Table Wallet
(
	WalletId INT Primary Key auto_increment,
    Wallet_Type ENUM('PAYTM','GPAY','PHONEPE'),
    UserId INT REFERENCES UserDetails(UserID),
    WalletAmount Numeric(9,2)
);

Insert into Wallet(Wallet_Type,UserID,WalletAmount)
values('PAYTM',1,4823),('PHONEPE',1,4884),
('PAYTM',2,5523),('GPAY',2,8483),('PHONEPE',2,5852),
('PAYTM',3,4842),('PHONEPE',3,8324),('GPAY',3,8482),
('PAYTM',4,8822),('PHONEPE',4,6323),
('PHONEPE',5,8823),('GPAY',5,4433);
Create Table Booking
(
   BookingID INT auto_increment Primary Key,
   BookingDate Date,
   UserId INT REFERENCES UserDetails(UserId),
   DriverId INT REFERENCES DriverDetails(DriverID),
   StartingLocation varchar(30),
   EndingLocation varchar(30),
   Kilometers numeric(9,2),
   BookingStatus ENUM('PENDING','BOOKED','CANCELLED') DEFAULT 'BOOKED',
   BillAmount Numeric(9,2)
);
