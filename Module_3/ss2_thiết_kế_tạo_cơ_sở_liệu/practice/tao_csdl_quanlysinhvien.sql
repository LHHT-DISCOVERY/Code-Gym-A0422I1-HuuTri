create database `QuanLySinhVien`;
use QuanLySinhVien ;
create table class(
classID int not null auto_increment primary key,
className varchar(60) not null ,
startDate datetime ,
status bit 
);
select * from class;
create table student (
studentID int not null auto_increment primary key ,
studentName varchar(50) not null ,
address varchar(20),
phone varchar(20),
status bit ,
classID int not null ,
foreign key (classID) references class(classID)
);
select * from subject;
create table subject(
subID int not null auto_increment primary key,
subName varchar(30) not null,
credit tinyint not null default 1 check (credit >= 1),
status bit default 1
);
select * from mark;
create table mark(
markID int not null auto_increment primary key ,
subID int not null ,
studentID int not null,
mark float default 0 check (mark between 0 and 100),
examTimes tinyint default 1,
unique (subID , studentID),
foreign key (subID) references subject (subID),
foreign key (studentID) references student (studentID)
);

select * from mark;
INSERT INTO student(`studentID`, `studentName`, `address`, `phone`, `status`, `classID`) VALUES ('3', 'Tri', 'DA Nang', '0333915128', b'0', b'1');

