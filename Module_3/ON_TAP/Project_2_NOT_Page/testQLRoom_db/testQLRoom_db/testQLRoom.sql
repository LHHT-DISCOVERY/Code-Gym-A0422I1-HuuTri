create database testQLRoom;
use testQLRoom;

create table Room(
room_id int primary key auto_increment,
customer_name varchar(120),
sdt varchar(20),
ngayBatDau Date,
idPayMent int ,
ghichu varchar(45),
foreign key (idPayMent) references Payment(idPayMent)
);

INSERT INTO Room(customer_name,sdt,ngayBatDau,idPayMent,ghichu) VALUES ("Trí",0865267103,'2022-09-15',1,"KO có gì ");
INSERT INTO Room(customer_name,sdt,ngayBatDau,idPayMent,ghichu) VALUES ("Toàn",0865267103,'2020-10-14',2, "lắp điều hòa ");
INSERT INTO Payment VALUES (1,'Theo tháng');
INSERT INTO Payment VALUES (2,'Theo quý');
INSERT INTO Payment VALUES (3,'Theo năm');

create table Payment(
idPayMent int primary key ,
namePayment varchar(120)
);


select * from  Payment;
select * from Room;
drop database testQLRoom;
