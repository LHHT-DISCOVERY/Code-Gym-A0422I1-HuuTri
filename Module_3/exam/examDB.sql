drop database exam_module_3; 
create database `exam_module_3`;
use exam_module_3 ;

create table test(
id int primary key auto_increment,
ten varchar(45)
);

insert into test(ten)
value("tr");

select * from test;

