create database orm ;
use orm ;

create table student(
	id int primary key auto_increment,
    `name` varchar(255),
    age int ,
    address varchar(255)
);

insert into student()
value(1 , "ly huynh huu tri" , 21 ,"quang nam");

select * from student ;