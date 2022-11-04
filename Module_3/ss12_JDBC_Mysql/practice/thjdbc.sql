CREATE DATABASE `jdbcth`;
USE jdbcth;

create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 `name` varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);

insert into users(`name` , email , country)
values("Aý Huynh Huu Trí" , "lytri102@gmail.com" , "Quang Nam"),
	("Dua Viet Toan" , "toanXl@gmail.com" , "Quang Nam"),
	("Eon That Thanh Sang" , "SangDien@gmail.com" , "Hue"),
	("Bguyen Ngoc Hieu" , "HieuDo@gmail.com" , "Quang Nam"),
	("Cran Van Thai " , "Thai137@gmail.com" , "Nghe An");
    
    select * from users ;
    delete from users where id in (10,11,12,13,14) ;
    select * from users 
    where id = 1 ;
    
    select * from users 
    order by `name` ASC;
    
delimiter \\
create procedure add_customer(in new_name varchar(220), in new_email varchar(220) , in new_country varchar(220))
begin
insert into users(`name` , email , country)
values(new_name , new_email ,new_country);
end \\
delimiter ;

call add_customer("Hậu" , "haule@gmail.com" , "Hậu giang")