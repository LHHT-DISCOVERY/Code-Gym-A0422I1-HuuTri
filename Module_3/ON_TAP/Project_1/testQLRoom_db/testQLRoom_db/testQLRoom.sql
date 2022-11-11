create database testQLRoom;
use testQLRoom;
drop database  testQLRoom;
create table Room(
room_id int primary key auto_increment,
customer_name varchar(120),
sdt int(20),
ngayBatDau Date,
idPayMent int ,
foreign key (idPayMent) references Payment(idPayMent)
);
drop table Room;
INSERT INTO Room(customer_name,sdt,ngayBatDau,idPayMent) VALUES ("Phat",0865267103,'2003-06-17',1);
INSERT INTO Room(customer_name,sdt,ngayBatDau,idPayMent) VALUES ("Phat",0865267103,'2003-06-17',1);
INSERT INTO Payment VALUES (1,'Theo tháng');
INSERT INTO Payment VALUES (2,'Theo ngày');
create table Payment(
idPayMent int primary key ,
namePayment varchar(120)
);
DELIMITER $$

select*from Room;
select*from Payment;
