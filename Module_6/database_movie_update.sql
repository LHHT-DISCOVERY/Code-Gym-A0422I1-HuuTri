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
id varchar(45) primary key ,
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
id varchar(45) primary key ,
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
`status` bit(1), -- đã đặt hay chưa
customer_id varchar(20) ,
showtime_id int not null,
chair_room_id int ,
book_datetime datetime,
is_delete bit(1),
foreign key (showtime_id) references showtime(id),
foreign key (customer_id) references customer(id),
foreign key (chair_room_id) references chair_room(id)
);

-- ----------Nhập dữ liệu---------

		-- Role
insert into `role` (`name`,is_Delete)
values ('Admin',0),('Employee',0),('Customer',0);
select * from `role`;

		-- Acount
insert into `account` (username ,is_enable ,`password` ,verification_code ,is_delete )
values ('admin',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
		('customer',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('customer1',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('customer2',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('customer3',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('customer4',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('customer5',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('customer6',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('customer7',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('customer8',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('customer9',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('customer10',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('customer11',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('employee1',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('employee2',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('employee3',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('employee4',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('employee5',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('employee6',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('employee7',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('employee8',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('employee9',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('employee10',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0),
        ('employee11',0,'$2a$12$X.6Dcr7IGghIskLkTLj06egeCZ4E4NJvBp/s0jizDqVxdYe1Fckx2', null , 0);
select * from `account`;

		-- Acount role
insert into `account_role` (username ,`role_id`,is_delete )
values ('admin', 1,0),
		('customer', 3,0),
        ('customer1', 3,0),
        ('customer2', 3,0),
        ('customer3', 3,0),
        ('customer4', 3,0),
        ('customer5', 3,0),
        ('customer6', 3,0),
        ('customer7', 3,0),
        ('customer8', 3,0),
        ('customer9', 3,0),
        ('customer10', 3,0),
        ('customer11', 3,0),
        ('employee1', 2,0),
        ('employee2', 2,0),
        ('employee3', 2,0),
        ('employee4', 2,0),
        ('employee5', 2,0),
        ('employee6', 2,0),
        ('employee7', 2,0),
        ('employee8', 2,0),
        ('employee9', 2,0),
        ('employee10', 2,0),
        ('employee11', 2,0);
select * from `account_role`;

		-- Customer
insert into customer (id,full_name ,birthday,gender ,card_id ,phone_number,email, address  ,username ,is_delete )
values ('KH-001','Nguyễn Thị Hào', '1970-11-07', 0, '643431213', '0945423362', 'thihao07@gmail.com', '23 Nguyễn Hoàng, Đà Nẵng','customer' ,0),
		('KH-002','Phạm Xuân Diệu', '1992-08-08', 1, '865342123', '0954333333', 'xuandieu92@gmail.com', 'K77/22 Thái Phiên, Quảng Trị','customer1' ,0),
        ('KH-003', 'Trương Đình Nghệ', '1990-02-27', 1, '488645199', '0373213122', 'nghenhan2702@gmail.com', 'K323/12 Ông Ích Khiêm, Vinh','customer2' ,0),
        ('KH-004', 'Dương Văn Quan', '1981-07-08', 1, '543432111', '0490039241', 'duongquan@gmail.com', 'K453/12 Lê Lợi, Đà Nẵng','customer3' ,0),
        ('KH-005','Hoàng Trần Nhi Nhi', '1995-12-09', 0, '795453345', '0312345678', 'nhinhi123@gmail.com', '224 Lý Thái Tổ, Gia Lai','customer4' ,0),
        ('KH-006', 'Tôn Nữ Mộc Châu', '2005-12-06', 0, '732434215', '0988888844', 'tonnuchau@gmail.com', '37 Yên Thế, Đà Nẵng','customer5' ,0),
       ('KH-007', 'Nguyễn Mỹ Kim', '1984-04-08', 0, '856453123', '0912345698', 'kimcuong84@gmail.com', 'K123/45 Lê Lợi, Hồ Chí Minh','customer6' ,0),
       ('KH-008', 'Nguyễn Thị Hào', '1999-04-08', 0, '965656433', '0763212345', 'haohao99@gmail.com', '55 Nguyễn Văn Linh, Kon Tum','customer7' ,0),
       ( 'KH-009','Trần Đại Danh', '1994-07-01', 1, '432341235', '0643343433', 'danhhai99@gmail.com', '24 Lý Thường Kiệt, Quảng Ngãi','customer8' ,0),
       ('KH-010', 'Nguyễn Tâm Đắc', '1989-07-01', 1, '344343432', '0987654321', 'dactam@gmail.com', '22 Ngô Quyền, Đà Nẵng','customer9' ,0),
       ('KH-011','Hoàng Trần Hoàng', '1995-12-09', 0, '795453445', '0312345676', 'nhi123@gmail.com', '224 Lý Thái Tổ, Gia Lai','customer10' ,0),
        ( 'KH-012','Tôn Nữ Mộc Châu Cách Cách', '2005-12-06', 0, '732434215', '0988888844', 'tonnuhau@gmail.com', '37 Yên Thế, Đà Nẵng','customer11' ,0);
select * from customer;

		-- Point
insert into `point` (`point` ,`date` ,`description`,customer_id ,is_delete )
values (10000,'2023-12-09','Điểm tích lũy','KH-001',0),
		(10000,'2023-12-11','Điểm tích lũy','KH-002',0),
        (10000,'2023-12-12','Điểm tích lũy','KH-003',0),
        (10000,'2023-12-13','Điểm tích lũy','KH-004',0),
        (10000,'2023-12-14','Điểm tích lũy','KH-005',0),
        (10000,'2023-12-15','Điểm tích lũy','KH-006',0),
        (10000,'2023-12-16','Điểm tích lũy','KH-007',0),
        (10000,'2023-12-17','Điểm tích lũy','KH-008',0),
        (10000,'2023-12-18','Điểm tích lũy','KH-009',0),
        (10000,'2023-12-1','Điểm tích lũy','KH-010',0),
        (10000,'2023-12-2','Điểm tích lũy','KH-011',0);
select * from `point`;

		-- Position
insert into position (`name`,is_delete)
values ('Lễ tân',0), ('Phục vụ',0), ('Nhân Viên Bán vé',0), ('Giám sát',0), ('Quản lý',0), ('Giám đốc',0);
select * from position;

		-- Employee
insert into employee (gender,id, full_name, birthday, card_id, phone_number, email, address, position_id, is_activated, is_delete, `username`,image)
values 
		(0,'NV-001','Lê Văn Bình', '1997-04-09', '654231234', '0934212314', 'binhlv@gmail.com', '22 Yên Bái, Đà Nẵng', 2, 1, 0,'employee1', 'empty'),
       (0,'NV-002','Hồ Thị Yến', '1995-12-12', '999231723', '0412352315', 'thiyen@gmail.com', 'K234/11 Điện Biên Phủ, Gia Lai', 3, 1, 0,'employee2', 'empty'),
       (1,'NV-003','Võ Công Toản', '1980-04-04', '123231365', '0374443232', 'toan0404@gmail.com', '77 Hoàng Diệu, Quảng Trị', 2, 0, 0,'employee3', 'empty'),
       (0,'NV-004','Nguyễn Bỉnh Phát', '1999-12-09', '454363232', '0902341231', 'phatphat@gmail.com', '43 Yên Bái, Đà Nẵng', 1, 1, 0,'employee4', 'empty'),
       (1,'NV-005','Khúc Nguyễn An Nghi', '2000-11-08', '964542311','0978653213', 'annghi20@gmail.com', '294 Nguyễn Tất Thành, Đà Nẵng', 4, 1, 0,'employee5', 'empty'),
       (0,'NV-006','Nguyễn Hữu Hà', '1993-01-01', '534323231', '0941234553', 'nhh0101@gmail.com', '4 Nguyễn Chí Thanh, Huế', 5, 1, 0,'employee6', 'empty'),
       (1,'NV-007','Nguyễn Hà Đông', '1989-09-03', '234414123', '0642123111', 'donghanguyen@gmail.com', '111 Hùng Vương, Hà Nội', 4, 1, 0,'employee7', 'empty'),
       (1,'NV-008','Tòng Hoang', '1982-09-03', '256781231', '0245144444', 'hoangtong@gmail.com', '213 Hàm Nghi, Đà Nẵng', 6, 1, 0,'employee8', 'empty'),
       (1,'NV-009','Nguyễn Công Danh', '1994-01-08', '755434343', '0988767111', 'nguyencongdao12@gmail.com', '6 Hoà Khánh, Đồng Nai', 1, 1, 0,'employee9', 'empty'),
       (1,'NV-010','Nguyễn Công Du', '1994-01-08', '755434343', '0988767111', 'nguyencongdao12@gmail.com', '6 Hoà Khánh, Đồng Nai', 1, 1, 0,'employee10', 'empty'),
       (1,'NV-011','Nguyễn Công Đạo', '1994-01-08', '755434343', '0988767111', 'nguyencongdao12@gmail.com', '6 Hoà Khánh, Đồng Nai', 1, 1, 0,'employee11', 'empty');
select * from employee;

		-- Movie
insert into movie (`description`,image ,`name`,`status` ,start_day ,time_amount ,trailer ,rating ,`language` ,is_delete)
values 
		('"Khóa Chặt Cửa Nào Suzume" kể câu chuyện khi Suzume vô tình gặp một chàng trai trẻ đến thị trấn nơi cô sinh sống với mục đích tìm kiếm "một cánh cửa". Để bảo vệ Nhật Bản khỏi thảm họa, những cánh cửa rải rác khắp nơi phải được đóng lại, và bất ngờ thay Suzume cũng có khả năng đóng cửa đặc biệt này. Từ đó cả hai cùng nhau thực hiện sự mệnh "khóa chặt cửa"!
		', 'empty', 'SUZUME NO TOJIMARI',1, '2023-03-10', 122, 'empty', 5, 'English', 0),
		('Ming-Han là một cảnh sát nhiệt huyết. Một ngày nọ, trong quá trình truy bắt tội phạm cùng người đồng nghiệp xinh đẹp Zi-Qing, Ming-Han vô tình nhặt được một phong bao màu đỏ, và một nhóm người bất ngờ nhảy ra gọi anh là "con rể". Họ yêu cầu anh ta kết hôn với đứa con đã chết của họ.
        ','empty', 'MARRY MY DEAD BODY',1, '2023-04-07', 130, 'empty', 4.5, 'English', 0),
        ('Dự án chuyển thể từ trò chơi điện tử huyền thoại gắn liền với tuổi thơ của hàng triệu fan trên toàn thế giới và là sự kết hợp đặc biệt giữa hai “ông lớn” Nintendo và Illumination, Phim Anh Em Super Mario sẽ đưa khán giả quay trở lại từ nguồn gốc về cuộc phiêu lưu đến Vương quốc Nấm của anh chàng thợ sửa ống nước Mario và quá trình anh vươn lên trở thành một huyền thoại
        ','empty', 'ANH EM SUPER MARIO',1, '2023-04-07', 93, 'empty', 3, 'English', 0),
        ('Thuộc phong cách hành động – hài hước với các “cú lừa” thông minh và lầy lội đến từ bộ đôi Tú (Anh Tú) và Khoa (Mạc Văn Khoa), Siêu Lừa Gặp Siêu Lầy của đạo diễn Võ Thanh Hòa theo chân của Khoa – tên lừa đảo tầm cỡ “quốc nội” đến đảo ngọc Phú Quốc với mong muốn đổi đời. Tại đây, Khoa gặp Tú – tay lừa đảo “hàng real” và cùng Tú thực hiện các phi vụ từ nhỏ đến lớn
        ','empty', 'SIÊU LỪA GẶP SIÊU LẦY', 1, '2023-03-01', 112, 'empty', 3, 'Vietnamese', 0),
        ('Lấy cảm hứng từ những hồ sơ có thật của Cha Gabriele Amorth, Trưởng Trừ Tà của Vatican (Russell Crowe, đoạt giải Oscar), bộ phim "The Popes Exorcist" theo chân Amorth trong cuộc điều tra về vụ quỷ ám kinh hoàng của một cậu bé và dần khám phá ra những bí mật hàng thế kỷ mà Vatican đã cố gắng giấu kín.
        ','empty', 'KHẮC TINH CỦA QUỶ',1, '2023-04-12', 104, 'empty', 3, 'USA', 0),
        ('BIỆT ĐỘI RẤT ỔN xoay quanh bộ đôi Khuê (Hoàng Oanh) và Phong (Hứa Vĩ Văn). Sau lần chạm trán tình cờ, bộ đôi lôi kéo Bảy Cục (Võ Tấn Phát), Bảy Súc (Nguyên Thảo), Quạu (Ngọc Phước), Quọ (Ngọc Hoa) tham gia vào phi vụ đặc biệt'
        ,'empty', 'BIỆT ĐỘI RẤT ỔN', 1, '2023-03-30', 104, 'empty', 3, 'Vietnamese', 0),
        ('Nhóm du khách trẻ vô tình phá bỏ phong ấn của con quái vật khát máu khi đến tham quan một hòn đảo cấm không dân địa phương nào dám đặt chân đến. Liệu họ có thể bình an thoát khỏi hay đó sẽ là nơi chôn vùi tất cả?
        ','empty', 'ĐẢO TỘI ÁC',1, '2023-03-31', 112, 'empty', 5, 'Australia', 0),
        ('Trong câu chuyện quái vật hiện đại về người hầu trung thành của Dracula, Renfield (do Nicholas Hoult thủ vai), kẻ bề tôi đáng thương của ông chủ tự ái nhất lịch sử, Dracula (do Nicolas Cage thủ vai). Renfield bị buộc phải bắt con mồi về cho chủ nhân và thực hiện mọi mệnh lệnh, kể cả việc đó nhục nhã như thế nào.
        ','empty', 'TAY SAI CỦA QUỶ',1, '2023-04-14', 91, 'empty', 5, 'English', 0),
        ('Từ đạo diễn đã từng đoạt giải thưởng Ben Affleck, AIR hé lộ mối quan hệ đột phá giữa huyền thoại Michael Jordan khi mới bắt đầu sự nghiệp và bộ phận bóng rổ còn non trẻ của Nike, đã làm thay đổi thế giới thể thao và văn hóa đương đại với thương hiệu Air Jordan
        ','empty', 'AIR - THEO ĐUỔI MỘT HUYỀN THOẠI',1, '2023-04-14', 112, 'empty', 5, 'English', 0),
        ('Bộ phim hoạt hình chuyển thể từ loạt truyện tranh “Slam Dunk” nổi tiếng của Takehiko Inoue, khắc họa quá trình trưởng thành cá nhân của những học sinh trung học cống hiến tuổi trẻ cho bóng rổ
        ','empty', 'PHIM CÚ ÚP RỔ ĐẦU TIÊN',1, '2023-04-14', 124, 'empty', 5, 'Japan', 0),
        ('Hira, một nam sinh 17 tuổi có một cuộc sống cô độc ở trường, không bao giờ muốn phơi bày tật nói lắp của mình với các bạn cùng lớp. Anh ấy nhìn thế giới qua ống kính máy ảnh của mình, cho đến một ngày Kiyoi Sou bước qua cửa lớp.
        ','empty', 'CHÀNG TRAI XINH ĐẸP CỦA TÔI',1, '2023-04-14', 132, 'empty', 5, 'Japan', 0),
        ('Bí ẩn về cái chết của em gái Evie 20 năm trước còn bỏ ngỏ, vào lúc 09:09 hằng đêm, hàng loạt cuộc chạm trán kinh hoàng xảy ra. Liệu Margot có biết được sự thật ai là kẻ giết em gái mình?
        ','empty', 'MẶT NẠ QUỶ',1, '2023-04-14', 102, 'empty', 5, 'English', 0),
        ('Theo chân một tên trộm quyến rũ và một nhóm những kẻ bịp bợm nghiệp dư thực hiện vụ trộm sử thi nhằm lấy lại một di vật đã mất, nhưng mọi thứ trở nên nguy hiểm khó lường hơn bao giờ hết khi họ đã chạm trán nhầm người
        ','empty', 'NGỤC TỐI & RỒNG: DANH DỰ CỦA KẺ TRỘM',1, '2023-04-21', 132, 'empty', 5, 'English', 0),
        ('Trong nhiệm vụ cuối cùng ở Afghanistan, Trung sĩ John Kinley cùng đội với phiên dịch viên bản địa Ahmed. Khi đơn vị của họ bị phục kích, Kinley và Ahmed là 2 người sống sót duy nhất.
        ','empty', 'KHẾ ƯỚC',1, '2023-04-21', 123, 'empty', 5, 'English', 0),
        ('Phim Đầu Gấu Đụng Đầu Đất dựa trên câu chuyện thần thoại nổi tiếng tại Hàn Quốc về hai chú gấu sinh đôi hoá thành người sau khi ăn tỏi và ngải cứu trong 100 ngày. Chú gấu ăn tỏi trở thành Na Woong-nam, được một cặp vợ chồng nhà khoa học mang về nuôi nấng, tuy chỉ mới 25 tuổi nhưng lại sở hữu “giao diện” của một ông chú 52 với cái “đầu đất” ngây thơ, hiền lành.
        ','empty', 'ĐẦU GẤU ĐỤNG ĐẦU ĐẤT',1, '2023-04-21', 132, 'empty', 5, 'Korea', 0),
        ('Sau cái chết của cha, Emma (Penelope Sangiorgi) vội vã bay từ New York về quê nhà ở Ý để lo hậu sự. Trong thời gian diễn ra tang lễ, Emma ở một mình trong căn nhà mà cha mẹ để lại.
        ','empty', 'ÂM VỰC CHẾT',1, '2023-04-21', 132, 'empty', 5, 'English', 0);
select * from movie;

	-- Movie type
insert into movie_type(`name`,is_delete)
values ('Kinh Dị',0),
		('Hài',0),
        ('Hành Động',0),
        ('Hồi hộp',0),
        ('Tâm Lý',0),
        ('Tình cảm',0),
        ('Giả Tưởng',0),
        ('Hoạt Hình',0),
        ('Bí ẩn',0),
        ('Phim tài liệu',0),
        ('Phiêu Lưu',0),
        ('Khoa Học Viễn Tưởng',0),
        ('Thần thoại',0),
        ('Tội phạm',0),
        ('Gia đình',0);
select * from movie_type;


		-- Movie and Type
insert into movie_and_type(movie_id,movie_type_id)
values (1,8),
		(1,2),
        (2,1),
        (2,6),
        (3,7),
        (3,5),
        (4,12),
        (4,11),
        (5,14),
        (5,1),
        (6,9),
		(6,6),
        (7,10),
        (7,12),
        (8,2),
        (8,3),
        (9,5),
        (9,6),
        (10,13),
        (10,14),
        (11,10),
		(11,1),
        (12,8),
        (12,9),
        (13,7),
        (13,5),
        (14,2),
        (14,3),
        (15,15),
        (15,3),
        (16,5),
        (16,8);
select * from movie_and_type;

		-- Actor 
insert into actor (`name`, is_delete)
values ('Lucia Caporaso',0),
		('Chiara Casolari',0),
        ('Thái Hòa',0),
        ('Huỳnh Phương',0),
        ('Russell Crowe',0),
        ('Franco Nero',0),
        ('Vinh Râu',0),
        ('Kim Da-mi',0),
        ('Woo-Seok Byeon',0),
        ('So-nee Jeon',0),
        ('Kim Soo Hyung',0),
        ('Zachary Levi',0),
        ('Asher Angel',0),
        ('Jack Dylan Grazer',0),
        (' Marta Milans',0),
        ('Cooper Andrews',0);
select * from actor;

		-- Movie actor
insert into movie_actor(movie_id, actor_id)
values (1,8),
		(1,2),
        (2,1),
        (2,6),
        (3,7),
        (3,5),
        (4,12),
        (4,11),
        (5,14),
        (5,1),
        (6,9),
		(6,6),
        (7,10),
        (7,12),
        (8,2),
        (8,3),
        (9,5),
        (9,6),
        (10,13),
        (10,14),
        (11,10),
		(11,1),
        (12,8),
        (12,9),
        (13,7),
        (13,5),
        (14,2),
        (14,3),
        (15,15),
        (15,3),
        (16,5),
        (16,8);
select * from movie_actor;

		-- Movie studio
insert into movie_studio (`name`, is_delete)
values ('CoMix Wave Films',0),
		('Marvel Studios',0),
        ('Warner Bros',0),
        ('Universal Pictures',0),
        ('Walt Disney Studios Motion Pictures',0),
		('20th Century Fox',0),
        ('Paramount Pictures',0),
        ('Sony Pictures Studios',0),
        ('Pixar',0),
		('Dream Works',0),
        ('Columbia Pictures',0),
        ('The godfather',0),
        ('Raging Bull',0),
		('City Lights',0),
        ('Psycho',0),
        ('The General',0);
select * from movie_studio;

		-- Movie and Studio
insert into movie_and_studio(movie_id, movie_studio_id)
values (1,8),
		(1,2),
        (2,1),
        (2,6),
        (3,7),
        (3,5),
        (4,12),
        (4,11),
        (5,14),
        (5,1),
        (6,9),
		(6,6),
        (7,10),
        (7,12),
        (8,2),
        (8,3),
        (9,5),
        (9,6),
        (10,13),
        (10,14),
        (11,10),
		(11,1),
        (12,8),
        (12,9),
        (13,7),
        (13,5),
        (14,2),
        (14,3),
        (15,15),
        (15,3),
        (16,5),
        (16,8);
select * from movie_and_studio;

	-- Director
insert into director(`name` , is_delete)
values ('Orson Welles',0),
		('Francis Ford Coppola',0),
        ('Michael Curtiz',0),
        ('Martin Scorsese',0),
        ('Gene Kelly',0),
		('Stanley Donen',0),
        ('David Lean',0),
        ('Steven Spielberg',0),
        ('John Ford',0),
		('Billy Wilder',0),
        ('George Lucas',0),
        ('Alfred Hitchcock',0),
        ('Frank Capra',0),
		('Elia Kazan',0),
        ('Robert Mulligan',0),
        ('Billy Wilder',0);
select * from director;

		-- Movie director 
insert into movie_director(movie_id, director_id)
values (1,8),
		(1,2),
        (2,1),
        (2,6),
        (3,7),
        (3,5),
        (4,12),
        (4,11),
        (5,14),
        (5,1),
        (6,9),
		(6,6),
        (7,10),
        (7,12),
        (8,2),
        (8,3),
        (9,5),
        (9,6),
        (10,13),
        (10,14),
        (11,10),
		(11,1),
        (12,8),
        (12,9),
        (13,7),
        (13,5),
        (14,2),
        (14,3),
        (15,15),
        (15,3),
        (16,5),
        (16,8);
select * from movie_director;

		-- Showtime
insert into showtime (`date`, start_time, end_time, movie_id, sold_out, is_delete)
values ('2023-03-10', '15:00', '17:10' , 1 , 0 , 0),
		('2023-03-10', '13:00', '15:10' , 1 , 0 , 0),
		('2023-04-07', '09:00', '11:10' , 2 , 0 , 0),
        ('2023-04-07', '19:00', '21:00' , 2 , 0 , 0),
        ('2023-04-07', '09:00', '11:10' , 3 , 0 , 0),
        ('2023-04-07', '19:00', '21:00' , 3 , 0 , 0),
        ('2023-03-01', '09:00', '11:10' , 4 , 0 , 0),
        ('2023-03-01', '19:00', '21:00' , 4 , 0 , 0),
        ('2023-04-12', '09:00', '11:10' , 5 , 0 , 0),
        ('2023-04-12', '19:00', '21:00' , 5 , 0 , 0),
        ('2023-03-30', '09:00', '11:10' , 6 , 0 , 0),
        ('2023-03-30', '19:00', '21:00' , 6 , 0 , 0),
        ('2023-03-31', '09:00', '11:10' , 7 , 0 , 0),
        ('2023-03-31', '19:00', '21:00' , 7 , 0 , 0),
        ('2023-04-14', '09:00', '11:10' , 8 , 0 , 0),
        ('2023-04-14', '19:00', '21:00' , 8 , 0 , 0),
        ('2023-04-14', '09:00', '11:10' , 9 , 0 , 0),
        ('2023-04-14', '19:00', '21:00' , 9 , 0 , 0);
select * from showtime;

		-- Room 
insert into room (`name`, `screen`, is_delete)
values ('A04 Cinema Room 1','A04 Cinema Screen 1',0),
		('A04 Cinema Room 2','A04 Cinema Screen 1',0),
        ('A04 Cinema Room 3','A04 Cinema Screen 1',0),
        ('A04 Cinema Room 4','A04 Cinema Screen 1',0);
select * from room;

		-- Chair
insert into chair (`name`, is_delete)
values ('A1',0),
		('A2',0),
        ('A3',0),
        ('A4',0),
        ('A5',0),
		('A6',0),
        ('A7',0),
        ('A8',0),
        ('B1',0),
		('B2',0),
        ('B3',0),
        ('B4',0),
		('B5',0),
		('B6',0),
        ('B7',0),
        ('B8',0),
		('C1',0),
       ('C2',0),
        ('C3',0),
       ('C4',0),
		('C5',0),
       ('C6',0),
        ('C7',0),
       ('C8',0),
		('D1',0),
        ('D2',0),
        ('D3',0),
        ('D4',0),
		('D5',0),
        ('D6',0),
        ('D7',0),
        ('D8',0),
		('E1',0),
        ('E2',0),
        ('E3',0),
       ('E4',0),
		('E5',0),
        ('E6',0),
        ('E7',0),
       ('E8',0);
select * from chair ;

		-- Chair room
insert into chair_room (`room_id`, `chair_id`, `status`, is_delete)
values (1,1,0,0),
		(1,2,0,0),
        (1,3,0,0),
        (1,4,0,0),
        (1,5,0,0),
        (1,6,0,0),
        (1,7,0,0),
        (1,8,0,0),
		(1,9,0,0),
		(1,10,0,0),
        (1,11,0,0),
		(1,12,0,0),
        (1,13,0,0),
        (1,14,0,0),
        (1,15,0,0),
        (1,16,0,0),
        (1,17,0,0),
        (1,18,0,0),
		(1,19,0,0),
		(1,20,0,0),
        (1,21,0,0),
		(1,22,0,0),
        (1,23,0,0),
        (1,24,0,0),
        (1,25,0,0),
        (1,26,0,0),
        (1,27,0,0),
        (1,28,0,0),
		(1,29,0,0),
		(1,30,0,0),
        (1,31,0,0),
		(1,32,0,0),
        (1,33,0,0),
        (1,34,0,0),
        (1,35,0,0),
        (1,36,0,0),
        (1,37,0,0),
        (1,38,0,0),
		(1,39,0,0),
		(1,40,0,0),
        
        (2,1,0,0),
		(2,2,0,0),
        (2,3,0,0),
        (2,4,0,0),
        (2,5,0,0),
        (2,6,0,0),
        (2,7,0,0),
        (2,8,0,0),
		(2,9,0,0),
		(2,10,0,0),
        (2,11,0,0),
		(2,12,0,0),
        (2,13,0,0),
        (2,14,0,0),
        (2,15,0,0),
        (2,16,0,0),
        (2,17,0,0),
        (2,18,0,0),
		(2,19,0,0),
		(2,20,0,0),
        (2,21,0,0),
		(2,22,0,0),
        (2,23,0,0),
        (2,24,0,0),
        (2,25,0,0),
        (2,26,0,0),
        (2,27,0,0),
        (2,28,0,0),
		(2,29,0,0),
		(2,30,0,0),
        (2,31,0,0),
		(2,32,0,0),
        (2,33,0,0),
        (2,34,0,0),
        (2,35,0,0),
        (2,36,0,0),
        (2,37,0,0),
        (2,38,0,0),
		(2,39,0,0),
		(2,40,0,0),
        
        (3,1,0,0),
		(3,2,0,0),
        (3,3,0,0),
        (3,4,0,0),
        (3,5,0,0),
        (3,6,0,0),
        (3,7,0,0),
        (3,8,0,0),
		(3,9,0,0),
		(3,10,0,0),
        (3,11,0,0),
		(3,12,0,0),
        (3,13,0,0),
        (3,14,0,0),
        (3,15,0,0),
        (3,16,0,0),
        (3,17,0,0),
        (3,18,0,0),
		(3,19,0,0),
		(3,20,0,0),
        (3,21,0,0),
		(3,22,0,0),
        (3,23,0,0),
        (3,24,0,0),
        (3,25,0,0),
        (3,26,0,0),
        (3,27,0,0),
        (3,28,0,0),
		(3,29,0,0),
		(3,30,0,0),
        (3,31,0,0),
		(3,32,0,0),
        (3,33,0,0),
        (3,34,0,0),
        (3,35,0,0),
        (3,36,0,0),
        (3,37,0,0),
        (3,38,0,0),
		(3,39,0,0),
		(3,40,0,0),
        
        (4,1,0,0),
		(4,2,0,0),
        (4,3,0,0),
        (4,4,0,0),
        (4,5,0,0),
        (4,6,0,0),
        (4,7,0,0),
        (4,8,0,0),
        (4,9,0,0),
		(4,10,0,0),
        (4,11,0,0),
		(4,12,0,0),
        (4,13,0,0),
        (4,14,0,0),
        (4,15,0,0),
        (4,16,0,0),
        (4,17,0,0),
        (4,18,0,0),
		(4,19,0,0),
		(4,20,0,0),
        (4,21,0,0),
		(4,22,0,0),
        (4,23,0,0),
        (4,24,0,0),
        (4,25,0,0),
        (4,26,0,0),
        (4,27,0,0),
        (4,28,0,0),
		(4,29,0,0),
		(4,30,0,0),
        (4,31,0,0),
		(4,32,0,0),
        (4,33,0,0),
        (4,34,0,0),
        (4,35,0,0),
        (4,36,0,0),
        (4,37,0,0),
        (4,38,0,0),
        (4,39,0,0),
		(4,40,0,0);
select * from chair_room;

		-- Ticket
insert into ticket (id , price ,`status`, customer_id , showtime_id , chair_room_id, book_datetime,  is_delete)
values (1, 40000 , 1 , null , 1,  1 ,'2023-03-10' ,0),
		(2, 40000 , 1 , null , 1,  2 , '2023-03-10' ,0),
        (3, 40000 , 1 , null , 1,  3 , '2023-03-10' ,0),
        (4, 40000 , 1 , null , 1,  4 , '2023-03-10' ,0),
        (5, 40000 , 1 , null , 1,  5 , '2023-03-10' ,0),
        (6, 40000 , 1 , null , 1,  6 , '2023-03-10' ,0),
        (7, 40000 , 1 , null , 1,  7 , '2023-03-10' ,0),
        (8, 40000 , 1 , null , 1,  8 , '2023-03-10' ,0),
        (9, 40000 , 1 , null , 1,  9 , '2023-03-10' ,0),
        (10, 40000 , 1 , null , 1,  10 , '2023-03-10' ,0),
        
        (11, 40000 , 1 , null , 1 ,  11 ,'2023-03-10' ,0),
		(12, 40000 , 1 , null , 1 ,  12 , '2023-03-10' ,0),
        (13, 40000 , 1 , null , 1 ,  13 , '2023-03-10' ,0),
        (14, 40000 , 1 , null , 1 , 14 , '2023-03-10' ,0),
        (15, 40000 , 1 , null , 1 ,  15 , '2023-03-10' ,0),
        (16, 40000 , 1 , null , 1 ,  16 , '2023-03-10' ,0),
        (17, 40000 , 1 , null , 1 ,  17 , '2023-03-10' ,0),
        (18, 40000 , 1 , null , 1 ,  18 , '2023-03-10' ,0),
        (19, 40000 , 1 , null , 1 ,  19 , '2023-03-10' ,0),
        (20, 40000 , 1 , null , 1 ,  20 , '2023-03-10' ,0),
        
        (21, 40000 , 0 , null , 1 ,  21 ,'2023-03-10' ,0),
		(22, 40000 , 0 , null , 1 ,  22 , '2023-03-10' ,0),
        (23, 40000 , 0 , null , 1 ,  23 , '2023-03-10' ,0),
        (24, 40000 , 0 , null , 1 ,  24 , '2023-03-10' ,0),
        (25, 40000 , 0 , null , 1 ,  25 , '2023-03-10' ,0),
        (26, 40000 , 0 , null , 1 ,  26 , '2023-03-10' ,0),
        (27, 40000 , 0 , null , 1 ,  27 , '2023-03-10' ,0),
        (28, 40000 , 0 , null , 1 ,  28 , '2023-03-10' ,0),
        (29, 40000 , 0 , null , 1 ,  29 , '2023-03-10' ,0),
        (30, 40000 , 0 , null , 1 ,  30 , '2023-03-10' ,0),
        
        (31, 40000 , 0 , null , 1 ,  31 ,'2023-03-10' ,0),
		(32, 40000 , 0 , null , 1 ,  32 , '2023-03-10' ,0),
        (33, 40000 , 0 , null , 1 ,  33 , '2023-03-10' ,0),
        (34, 40000 , 0 , null , 1 ,  34 , '2023-03-10' ,0),
        (35, 40000 , 0 , null , 1 ,  35 , '2023-03-10' ,0),
        (36, 40000 , 0 , null , 1 ,  36 , '2023-03-10' ,0),
        (37, 40000 , 0 , null , 1 ,  37 , '2023-03-10' ,0),
        (38, 40000 , 0 , null , 1 ,  38 , '2023-03-10' ,0),
        (39, 40000 , 0 , null , 1 ,  39 , '2023-03-10' ,0),
        (40, 40000 , 0 , null , 1 ,  40 , '2023-03-10' ,0);	
select * from ticket;
select * from point ;
select * from customer;


        



