-- tạo database
create database `code_text_database`;
-- tạo bảng
create table code_text_database.data_tinhthanh(
id int ,
soXe int ,
tinhthanh varchar(50)
);
-- chèn giá trị vào bảng
insert into code_text_database.data_tinhthanh(id , soXe , tinhthanh)
value(323,92,'Quang Nam'),
(2,92,'Quang Nam'),
(3,92,'Quang Nam'),
(4,92,'Quang Nam'),
(5,92,'Quang Nam'),
(6,92,'Quang Nam'),
(7,92,'Quang Nam')
,(8,92,'Quang Nam')
,(9,92,'Quang Nam')
,(10,92,'Quang Nam')
,(11,92,'Quang Nam')
,(12,92,'Quang Nam')
,(13,92,'Quang Nam')
,(14,92,'Quang Nam')
,(15,92,'Quang Nam'),
(16,92,'Quang Nam'),
(17,92,'Quang Nam'),
(18,92,'Quang Nam'),
(19,92,'Quang Nam'),
(20,92,'Quang Nam'),
(21,92,'Quang Nam'),
(22,92,'Quang Nam'),
(23,92,'Quang Nam'),
(24,92,'Quang Nam'),
(25,92,'Quang Nam'),
(26,92,'Quang Nam'),
(27,92,'Quang Nam'),
(28,92,'Quang Nam'),
(29,92,'Quang Nam'),
(30,92,'Quang Nam'),
(31,92,'Quang Nam'),
(32,92,'Quang Nam'),
(33,92,'Quang Nam'),
(34,92,'Quang Nam'),
(35,92,'Quang Nam'),
(36,92,'Quang Nam');
-- in ra giá trị từ bảng 
select * from  code_text_database.data_tinhthanh;
-- in ra giá trị tỉnh thành từ bảng 
select tinhthanh from code_text_database.data_tinhthanh;
-- xóa giá trị tại cột id
delete from code_text_database.data_tinhthanh where  id  = 36  ;
-- update
update code_text_database.data_tinhthanh
set 
tinhthanh = "Quang Ngai",
soXe = 76
where 
id = 6;