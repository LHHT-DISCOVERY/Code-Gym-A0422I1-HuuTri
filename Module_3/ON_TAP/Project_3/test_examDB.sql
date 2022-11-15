create database `test_exam`;
use test_exam;

select * from  sach;
create table sach(
 ma_sach int primary key auto_increment ,
 ten_sach varchar(45),
 tac_gia varchar(45),
 mo_ta varchar(45),
 so_luong int 
);

select * from hoc_sinh;
create table hoc_sinh(
ma_hoc_sinh int primary key auto_increment,
ho_ten varchar(45),
lop varchar(45)
);

select * from the_muon_sach ;
create table the_muon_sach(
ma_muon_sach int primary key auto_increment,
trang_thai bit(1),
ngay_muon date ,
ngay_tra date ,
ma_sach int ,
ma_hoc_sinh int ,
foreign key (ma_sach) references sach(ma_sach),
foreign key (ma_hoc_sinh) references hoc_sinh(ma_hoc_sinh)
);

insert into sach(ten_sach, tac_gia, mo_ta, so_luong)
value("Sổ Đỏ " , "Vũ Trọng Phụng " , "Nhân vật chính là xuân tóc đỏ" ,10),
(" Truyện kiều " , "Nguyễn Du" , "Cuộc đời thúy kiều",15);

insert into hoc_sinh( ho_ten, lop)
value("Nguyễn văn a ", "10A1" );

insert into the_muon_sach(trang_thai, ngay_muon, ngay_tra, ma_sach, ma_hoc_sinh)
value(1,"2020-04-08" ,"2020-04-08" ,1,1);

select ma_muon_sach , ten_sach , tac_gia ,ho_ten,lop,ngay_muon,ngay_tra from hoc_sinh
join sach on ma_sach
join the_muon_sach
