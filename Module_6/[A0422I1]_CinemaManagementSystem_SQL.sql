create database theater_management;
use theater_management;

create table promotion (
id int primary key auto_increment,
`description` longtext not null,
`name` varchar(255) not null,
sale_off double not null,
`time` date not null,
is_delete bit(1)
);

create table `role`(
id int primary key auto_increment,
`name` varchar(255) not null,
is_delete bit(1)
);

create table `account`(
username varchar(45) primary key,
is_enable bit(1) not null,
`password` varchar(255) not null,
verification_code varchar(255),
is_delete bit(1)
);

create table account_role (
id int primary key auto_increment,
username varchar(45) not null,
role_id int not null,
is_delete bit(1),
foreign key (username) references `account`(username),
foreign key (role_id) references `role`(id)
);

create table `position` (
id int primary key auto_increment,
`name` varchar(255) not null,
is_delete bit(1)
);

create table employee (
id varchar(45) primary key,
address varchar(255) not null,
birthday date not null,
card_id varchar(255) not null,
email varchar(255) not null,
full_name varchar(255) not null,
gender bit(1) not null,
image varchar(255) not null,
phone_number varchar(15) not null,
username varchar(45) not null unique,
position_id int not null,
is_activated bit(1) not null,
is_delete bit(1),
foreign key (username) references `account`(username),
foreign key (position_id) references `position`(id));

create table customer (
id varchar(45) primary key,
address varchar(255) not null,
birthday date not null,
card_id varchar(255) not null,
email varchar(255) not null,
full_name varchar(255) not null,
gender bit(1) not null,
phone_number varchar(15) not null,
username varchar(45) not null unique,
is_delete bit(1),
foreign key (username) references `account`(username));

create table `point` (
id int primary key auto_increment,
`point` int default(0) not null,
`date` datetime not null,
`description` varchar(255) not null,
customer_id varchar(45) not null,
is_delete bit(1),
foreign key (customer_id) references customer(id)
);

create table room (
id int primary key auto_increment,
`name` varchar(255) not null,
screen varchar(255) not null,
is_delete bit(1)
);

create table chair (
id int primary key auto_increment,
`name` varchar(255) not null,
is_delete bit(1)
);

create table chair_room (
id int primary key auto_increment,
room_id int not null,
chair_id int not null,
`status` bit(1) not null, -- hỏng hay dùng được 
is_delete bit(1),
foreign key (room_id) references room(id),
foreign key (chair_id) references chair(id)
);

create table movie_type (
id int primary key auto_increment,
`name` varchar(255) not null,
is_delete bit(1)
);

create table actor (
id int primary key auto_increment,
`name` varchar(255),
is_delete bit(1)
);

create table director (
id int primary key auto_increment,
`name` varchar(255),
is_delete bit(1)
);

create table movie_studio (
id int primary key auto_increment,
`name` varchar(255),
is_delete bit(1)
);

create table movie (
id int primary key auto_increment,
`description` longtext not null,
image varchar(255) not null,
`name` varchar(255) not null,
`status` bit(1) not null,
start_day date not null,
time_amount int not null,
trailer varchar(255) not null,
rating double not null,
`language` varchar(255) not null,
is_delete bit(1)
);

create table movie_and_type (
id int primary key auto_increment,
movie_id int not null,
movie_type_id int not null,
foreign key (movie_id) references movie(id),
foreign key (movie_type_id) references movie_type(id)
);

create table movie_actor (
id int primary key auto_increment,
movie_id int not null,
actor_id int not null,
foreign key (movie_id) references movie(id),
foreign key (actor_id) references actor(id)
);

create table movie_director (
id int primary key auto_increment,
movie_id int not null,
director_id int not null,
foreign key (movie_id) references movie(id),
foreign key (director_id) references director(id)
);

create table movie_and_studio (
id int primary key auto_increment,
movie_id int not null,
movie_studio_id int not null,
foreign key (movie_id) references movie(id),
foreign key (movie_studio_id) references movie_studio(id)
);

create table showtime (
id int primary key auto_increment,
`date` date not null,
start_time time not null,
end_time time,
movie_id int not null,
sold_out bit(1) not null,
is_delete bit(1),
foreign key (movie_id) references movie(id)
);

create table ticket (
id varchar(10) primary key,
price double not null,
date_booking Date,
`status` bit(1), -- đã đặt hay chưa
customer_id varchar(20) null,
showtime_id int not null,
employee_id varchar(20) not null,
chair_id int not null,
is_delete bit(1),
foreign key (showtime_id) references showtime(id),
foreign key (employee_id) references employee(id),
foreign key (customer_id) references customer(id),
foreign key (chair_id) references chair(id)
);


