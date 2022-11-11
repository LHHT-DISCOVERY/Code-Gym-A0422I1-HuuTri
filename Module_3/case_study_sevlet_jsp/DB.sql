drop database db_sevlet_jsp;
create database `db_sevlet_jsp`;
use db_sevlet_jsp;

create table `position` (
	position_id int primary key,
    position_name varchar(255)
);

create table education_degree(
	education_degree_id int primary key,
    education_degree_name varchar(45)
);

create table division(
	division_id int primary key,
    division_name varchar(45)
);
create table `user` (
	username varchar(255) primary key ,
    password varchar(255) 
);

create table `role`(
	role_id int primary key,
    role_name varchar(255)
);

create table user_role(
	role_id int ,
    username varchar(255),
    foreign key(role_id) references `role`(role_id),
    foreign key (username) references `user`(username)
);

create table  attach_service(
	attach_service_id int primary key ,
    attach_service_name varchar(45),
    attach_service_cost double ,
    attach_service_unit varchar(45) ,
    attach_service_status varchar(45)
);
 

 create table employee(
	employee_id int primary key,
    employee_name varchar(200) ,
    employee_birthday date ,
    employee_id_card varchar(45),
    employee_salary double ,
    employee_phone varchar(40),
    employee_email varchar(45),
    employee_address varchar(45),
    position_id int ,
    education_degree_id int,
    division_id int ,
    username varchar(45),
    foreign key(position_id) references `position`(position_id),
    foreign key (education_degree_id) references education_degree(education_degree_id),
    foreign key (division_id) references division(division_id),
    foreign key(username) references `user`(username)
 );
 
create table  customer_type(
	customer_type_id int primary key,
    customer_type_name varchar(45)
);
 
 create table customer(
	customer_id int primary key ,
    customer_type_id int ,
    customer_name varchar(45),
    customer_birthday varchar(45),
	customer_gender BIT(1),
    customer_id_card varchar (45) ,
    customer_phone varchar(45),
    customer_email varchar(45) ,
    customer_address varchar(45),
     foreign key (customer_type_id) references  customer_type(customer_type_id)
 );
 
 create table service_type (
	service_type_id int primary key ,
    service_type_name varchar(45)
 );
 
 create table rent_type(
	rent_type_id int primary key ,
    rent_type_name varchar(45),
    rent_type_cost double
 );
 
 create table service(
	service_id int primary key ,
    service_name varchar(45) ,
    service_area int ,
    service_cost double ,
    service_max_people int, 
    rent_type_id int ,
    service_type_id int ,
    standard_room varchar(45),
    description_other_convenience varchar(45),
    pool_area double ,
    number_of_flooors int ,
    foreign key(rent_type_id) references rent_type(rent_type_id),
    foreign key(service_type_id) references service_type(service_type_id)
 );
 
 create table contract(
	contract_id int primary key ,
    contract_start_date datetime ,
    contract_end_date datetime ,
    contract_deposit double ,
    employee_id int ,
    customer_id int ,
    service_id int ,
    foreign key(employee_id) references employee(employee_id),
    foreign key (customer_id) references customer(customer_id),
    foreign key (service_id) references service(service_id)
 );
 
 create table contract_detail(
	contract_detail_id int ,
    contract_id int ,
    attach_service_id int ,
    quantity int,
    foreign key (contract_id) references contract(contract_id),
    foreign key (attach_service_id ) references attach_service(attach_service_id )
 );
 
 select * from `position`;
 insert into`position` (position_id, position_name)
 value(1,'Quản Lý'),
	(2,'Nhân Viên');
    
    
select * from education_degree;    
insert into education_degree()
values (1,'Trung Cấp'),
	(2, "Cao Đẳng" ),
	(3	,"Đại Học"),
	(4,"Sau Đại Học");
    
select* from division ;
insert into division ()
values(1,'Sale-Marketing'),
	(2,	'Hành chính'),
	(3,'Phục vụ'),
	(4,	'Quản lý');
    
select * from customer_type ;
insert into customer_type (customer_type_id, customer_type_name) 
value (1,	'Diamond'),
	(2,	'Platinium'),
	(3,	'Gold'),
	(4,	'Silver'),
	(5,	'Member');
    
    
    
select * from employee ;    
insert into employee(employee_id, employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id, username) 
values (1,'Nguyễn Văn An','1970-11-07','456231786',10000000,0901234121,'annguyen@gmail.com','295 Nguyễn Tất Thành,Đà Nẵng',1,3,1, "annguyen@gmail.com"),
	(2,'Lê Văn Bình','1997-04-09','654231234',7000000,0934212314,'binhlv@gmail.com','22 Yên Bái, Đà Nẵng',1,2,2,"binhlv@gmail.com"),
	(3,'Hồ Thị Yến','1995-12-12','999231723',14000000,0412352315,'thiyen@gmail.com','K234/11 Điện Biên Phủ,Gia Lai',1,3,2 ,"thiyen@gmail.com"),
	(4,'Võ Công Toản','1980-04-04','123231365',17000000,0374443232,'toan0404@gmail.com','77 Hoàng Diệu,Quảng Trị',1,4,4,"toan0404@gmail.com"),
	(5,'Nguyễn Bỉnh Phát','1999-12-09','454363232',6000000,0902341231,'phatphat@gmail.com','43 Yên Bái,Đà Nẵng',2,1,1,"phatphat@gmail.com"),
	(6,'Khúc Nguyễn An Nghi','2000-11-08','964542311',7000000,0978653213,'annghi20@gmail.com','294 Nguyễn Tất Thành,Đà Nẵng',2,2,3,"annghi20@gmail.com"),
	(7,'Nguyễn Hữu Hà','1993-01-01','534323231',8000000,0941234553,'nhh0101@gmail.com','4 Nguyễn Chí Thanh,Huế',2,3,2,"nhh0101@gmail.com"),
	(8,'Nguyễn Hà Đông','1989-09-03','234414123',9000000,0642123111,'donghanguyen@gmail.com','111 Hùng Vương,Hà Nội',2,4,4,'donghanguyen@gmail.com'),
	(9,'Tòng Hoang','1982-09-03','256781231',6000000,0245144444,'hoangtong@gmail.com','213 Hàm Nghi, Đà Nẵng',2,4,4,'hoangtong@gmail.com'),
	(10,'Nguyễn Công Đạo','1994-01-08','755434343',8000000,0988767111,'nguyencongdao12@gmail.com','6 Hoà Khánh,Đồng Nai',2,3,2,'nguyencongdao12@gmail.com');
    
    
select * from customer ;
insert into `customer` (customer_id, customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address)
values(1,1,'Nguyễn Thị Hào','1970-11-07',0,'643431213','0945423362','thihao07@gmail.com','23 Nguyễn Hoàng,Đà Nẵng'),	
	(2,2,'Phạm Xuân Diệu','1992-08-08',1,'865342123','0954333333','xuandieu92@gmail.com','K77/22 Thái Phiên,Quảng Trị'),
	(3,1,'Trương Đình Nghệ','1990-02-27',1,'488645199','0373213122','nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh'),
	(4,2,'Dương Văn Quan','1981-07-08',1,'543432111','0490039241','duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng'),
	(5,2,'Hoàng Trần Nhi Nhi','1995-12-09',0,'795453345','0312345678','nhinhi123@gmail.com','224 Lý Thái Tổ,Gia Lai'),
	(6,2,'Tôn Nữ Mộc Châu','2005-12-06',0,'732434215','0988888844','tonnuchau@gmail.com','37 Yên Thế,Đà Nẵng'),
	(7,2,'Nguyễn Mỹ Kim','1984-04-08',0,'856453123','0912345698','kimcuong84@gmail.com','K123/45 Lê Lợi,Hồ Chí Minh'),
	(8,2,'Nguyễn Thị Hào','1999-04-08',0,'965656433','0763212345','haohao99@gmail.com','55 Nguyễn Văn Linh,Kon Tum'),
	(9,3,'Trần Đại Danh','1994-07-01',1,'432341235','0643343433','danhhai99@gmail.com','24 Lý Thường Kiệt Quảng Ngãi'),
	(10,1,'Nguyễn Tâm Đắc','1989-07-01',1,'344343432','0987654321','dactam@gmail.com','22 Ngô Quyền, Đà Nẵng');
    
    
    
    select * from service_type ;
    insert into service_type(service_type_id, service_type_name) 
    value 
	(1,'Villa'),
	(2,'House'),
	(3,'Room');
    
    select * from attach_service ;
    insert into attach_service(attach_service_id, attach_service_name, attach_service_cost, attach_service_unit, attach_service_status)
    values  
	(1,'Karaoke',10000,'giờ','tiện nghi,hiện tại'),
	(2,'Thuê xe máy',10000,'chiếc','hỏng 1 xe'),
	(3,'Thuê xe đạp',20000,'chiếc','tốt'),
	(4,'Buffet buổi sáng',15000,'suất','đầy đủ đồ ăn,tráng miệng'),
	(5,'Buffet buổi trưa',90000,'suất','đầy đủ đồ ăn,tráng miệng'),
	(6,'Buffet buổi tối',16000,'suất','đầy đủ đồ ăn,tráng miệng');
    
    
    select * from rent_type ;
    insert into rent_type()
    value (1, "vip" , 1000000 ),
		(2, "normal" , 500000 );

select * from customer
where customer_address like "23 Nguyễn Hoàng,Đà Nẵng" ;

delete from customer 
where customer_id = 6565;

drop procedure update_customer;
delimiter \\
create procedure update_customer ( in new_customer_id int , in new_customer_type_id int, in new_customer_name varchar(45),
 in new_customer_birthday varchar(45), in new_customer_gender BIT(1), in new_customer_id_card varchar(45),
 in new_customer_phone varchar(45), in new_customer_email varchar(45), in new_customer_address varchar(45))
begin
update customer 
set
customer_type_id  = new_customer_type_id,
customer_name  = new_customer_name ,
customer_birthday = new_customer_birthday,
customer_gender = new_customer_gender,
customer_id_card = new_customer_id_card,
customer_phone = new_customer_phone,
customer_email = new_customer_email,
customer_email = new_customer_address
where customer_id = new_customer_id ;
end \\
delimiter ;
 call update_customer(1,2,"Nguyễn Thị Hảo", "2001-10-20" ,0,1234567,0333915138,"lytri102@gmail.com " , "Hiep Duc ,Quang Nam");
 
 select * from customer 
 where customer_id = 1 ;

select * from service ;
