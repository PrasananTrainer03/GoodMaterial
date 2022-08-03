Drop Database if exists Canteen9;

Create Database Canteen9;

USE Canteen9;

Drop Table If Exists Menu;

Drop Table IF Exists Restaurant;

/* ******************************************************************************************
								Creating Restaurant Table 
   ******************************************************************************************
*/

Create Table Restaurant
(
    RestaurantID INT primary key auto_increment,
    RestaurantName varchar(30),
    city varchar(30),
    state varchar(30),
    Email varchar(30),
    Mobile varchar(15),
    rating numeric(5,2)
);

Insert into Restaurant(RestaurantName,City,State,Email,Mobile,Rating)
values('Chutneys','Hyderabad','TS','chutneys@gmail.com','885823855',4.0),
('Meridian','Panaji','GOA','meridian@gmail.com','882734422',4.2),
('Paradise','Hyderabad','TS','paradise@gmail.com','858858244',4.6),
('NanKing','Secunderabad','TS','king@gmail.com','885835434',4.8),
('The Taj','Bangalore','KA','tajblore@gmail.com','999492345',4.9);

select * from Restaurant;

Create Table Menu
(
   MenuID INT Primary Key auto_increment,
   RestaurantId INT references Restaurant(RestaurantID),
   ItemName varchar(30),
   Price Numeric(9,2),
   Speciality varchar(25)
);

Insert into Menu(RestaurantID,ItemName,Price,Speciality) 
values(1,'Dosa',85,'VEG'),
(1,'MLA Pesarattu',200,'VEG'),
(2,'Biryani',250,'NON-VEG'),
(2,'Chicken Fried Rice',300,'NON-VEG'),
(3,'Mutton Biryani',890,'NON-VEG'),
(3,'Chicken Curry',290,'NON-VEG'),
(4,'Butter NAN',88,'VEG'),
(4,'Kaju Paneer',899,'VEG'),
(5,'Chilly Paneer',1200,'VEG');

select * from Menu;

/* ***********************************************************************************************
						        Creating Customer Table 
   ***********************************************************************************************
*/

Drop Table If Exists Customer;

Create table Customer 
(
    CustomerId INT Primary Key auto_increment,
    CustomerName varchar(30),
    CustomerPhoneNo varchar(20),
    CustomerUserName varchar(25),
    CustomerPassword varchar(25),
    CustomerEmail varchar(30)
);

Insert into Customer(CustomerName,CustomerPhoneNo,CustomerUserName,CustomerPassword,
		CustomerEmail) values('Prasanna Pappu','9381413089','prassucp','hexaware@','prassucp@gmail.com'),
        ('Krishna Kumar','8939391144','krishnak','chennai@123','krishnak@gmail.com'),
        ('Renu Srivastav','8755144556','Renu','ghazi@117','renusan@gmmail.com'),
        ('Sunil','888235','sunilvizag','rushikonda','sunil@gmail.com'),
        ('Naresh','8488444882','nareshp','infinite','naresh@gmail.com');

select * from Customer;

Drop Table if Exists Vendor;

Create Table Vendor
(
   VendorId INT Primary Key auto_increment,
   VendorName varchar(30),
   VendorUserName varchar(20),
   VendorPassword varchar(20),
   VendorPhoneNo varchar(30),
   VendorEmail varchar(20)
);

Insert into Vendor(VendorName,VendorUserName,VendorPassword,VendorPhoneNo,VendorEmail)
values('Balan','8554535400','balan89','chennai@123','balan@gmail.com'),
('Anukriti','9184532455','anu56','bordia@123','anu.delhi@gmail.com'),
('Aarifa','9115879011','aarifk','saleem@123','aarifkhan@gmail.com'),
('Ksheerabdi','9874499011','ksheera','kolkata@123','ramki9@gmail.com'),
('Sai Kumar','88234555','saikumarm','infinite','sai@gmail.com'),
('Swiggy','84823855','swizzy999','AlwaysDeliver','swizzy99@gmail.com');

select * from Vendor;

Drop Table if exists Wallet;

Create Table Wallet
(
   CustomerId INT REFERENCES Customer(CustomerId),
   WalletId INT Primary Key auto_increment,
   Wallet_Amount numeric(9,2),
   Wal_Source ENUM('PAYTM','CREDIT_CARD','DEBIT_CARD')
);

select * from Wallet;

Insert into Wallet(CustomerId,Wallet_Amount,Wal_Source)
values(1,2000,'PAYTM'),
(1,3500,'CREDIT_CARD'),
(2,2500,'DEBIT_CARD'),
(2,1500,'PAYTM'),
(3,2000,'PAYTM'),
(3,2500,'CREDIT_CARD');

select * from Wallet;