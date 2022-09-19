create database `QuanLyDiemThi`;
use QuanLyDiemThi;
create table hocSinh(
MaHS varchar(20) primary key ,
TenHS varchar(255),
ngaySinh datetime,
lop varchar(20),
GT varchar(20)
);

create table monHoc(
maMH varchar(20) primary key ,
tenMH varchar(50)
);

create table bangDiem(
maHS varchar(20),
maMH varchar(20),
diemThi int,
ngayKT datetime,
primary key(maHS , maMH),
foreign key(maHS) references hocSinh(maHS),
foreign key (maMH) references monHoc(maMH)
);

create table giaoVien(
maGV varchar(20) primary key,
tenGV varchar(20),
sdt varchar(10)
);

select * from giaoVien ;
-- thêm thuộc tính mã giáo viên vào bảng môn học 
alter table monHoc add maGV varchar(20);
-- thêm 
alter table MonHoc add constraint FK_MaGV foreign key (MaGV) references GiaoVien(MaGV);