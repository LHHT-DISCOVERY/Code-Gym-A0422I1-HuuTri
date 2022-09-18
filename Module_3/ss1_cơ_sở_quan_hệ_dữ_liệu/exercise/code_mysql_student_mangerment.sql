create database `student_managermen`;

create table student_managermen.class(
id int primary key,
`name` varchar(50)
);

create table student_managermen.Tearcher (
id int primary key,
`name` varchar(50),
age int ,
country varchar(50)
);

insert into student_managermen.Tearcher(id ,`name`, age , country)
value(1,'Ly Huynh Huu Tri' , 21 , 'Quang Nam'),
(2,'Ton That Thanh Sang ' , 21 , 'Hue'),
(3,'Nguyen Ngoc Hieu ' , 21 , 'Quang Nam'),
(4,'Hua Viet Toan' , 21 , 'Quang Nam');

delete from student_managermen.tearcher where id = 1;

select * from student_managermen.tearcher


