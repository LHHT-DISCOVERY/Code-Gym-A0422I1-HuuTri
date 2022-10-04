use furama_managerment;

-- task 2 : Hiển thị thông tin của tất cả nhân viên có trong hệ thống 
-- có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự
select * from nhan_vien where ho_ten regexp '(^[a-zA-Z\\s]+\\s[htk][A-Za-z]+$)';

-- task 3 : Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * ,year(curdate())-year(ngay_sinh) as 'Tuổi' from khach_hang 
where ( 18<= year(curdate())-year(ngay_sinh) and  year(curdate())-year(ngay_sinh) <= 50) and (dia_chi like '%Đà Nẵng%' or dia_chi like '%Quảng Trị%');
 
 -- task 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
 -- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
 -- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select c.ma_khach_hang, c.ho_ten, count(ct.ma_khach_hang) as 'số lần đặt ' from hop_dong as ct
left join khach_hang as c on c.ma_khach_hang = ct.ma_khach_hang
left join loai_khach as ts on ts.ma_loai_khach = c.ma_loai_khach
where ts.ma_loai_khach = 1    
group by ma_khach_hang
order by count(ct.ma_khach_hang) desc;

-- task 5 : Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
-- (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) 
-- cho tất cả các khách hàng đã từng đặt phòng. 
-- (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select kh.ma_khach_hang , kh.ho_ten , lk.ten_loai_khach ,
ifnull(ct.ma_hop_dong , 'Chưa có hợp đồng')  as 'Mã Hợp Đồng' ,
ifnull(dv.ten_dich_vu , 'chưa có dịch vụ') as 'Tên Dịch Vụ',
ifnull(ct.ngay_lam_hop_dong, 'chưa có ') as "ngày làm hợp đồng",
ifnull(ct.ngay_ket_thuc,'chưa có ') as "ngày kết thúc",
sum(ifnull(dv.chi_phi_thue ,0) + ifnull(ctc.so_luong,0)*ifnull(dvdk.gia,0))  as 'Tổng Tiền' 
from khach_hang kh
join loai_khach as lk on lk.ma_loai_khach = kh.ma_loai_khach
left join hop_dong ct on ct.ma_khach_hang = kh.ma_khach_hang
left join dich_vu as dv on ct.ma_dich_vu = dv.ma_dich_vu
left join hop_dong_chi_tiet as ctc on  ct.ma_hop_dong = ctc.ma_hop_dong
left join dich_vu_di_kem as dvdk on  ctc.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
group by ct.ma_hop_dong , kh.ma_khach_hang
order by ma_khach_hang asc ;


-- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu 
-- của tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
select ma_dich_vu , ten_dich_vu , dien_tich , chi_phi_thue , ten_loai_dich_vu from dich_vu join loai_dich_vu using (ma_loai_dich_vu)
where ma_dich_vu not in(
   select
            ma_dich_vu
        from
            dich_vu
            join hop_dong using (ma_dich_vu)
        where
            year(ngay_lam_hop_dong) = 2021 
            and (month(ngay_lam_hop_dong) between '1' and '3'));


-- 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu 
-- của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 
-- nhưng chưa từng được khách hàng đặt phòng trong năm 2021.
select
    ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu
from dich_vu dv
join loai_dich_vu using(ma_loai_dich_vu)
where ma_dich_vu in (select ma_dich_vu from dich_vu join hop_dong using(ma_dich_vu) where year(ngay_lam_hop_dong) = 2020)
and ma_dich_vu not in (select ma_dich_vu from dich_vu join hop_dong using(ma_dich_vu) where year(ngay_lam_hop_dong) = 2021);

-- 8.Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- c1 :  
select ho_ten, count(*) as khach_hang_trung_ten from khach_hang
group by ho_ten;

-- c2 : 
select ho_ten from khach_hang union select ho_ten from khach_hang;

-- c3 :
select distinct(ho_ten) from khach_hang ;

-- 9.Thực hiện thống kê doanh thu theo tháng,
 -- nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
 select month(hd.ngay_lam_hop_dong) as thang, count(ma_khach_hang) from hop_dong as hd
 where year(hd.ngay_lam_hop_dong) = 2021
 group by thang
 order by thang asc;
 
 -- 10. Hiển thị thông tin tương ứng với từng hợp đồng 
 -- thì đã sử dụng bao nhiêu dịch vụ đi kèm. Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem
 -- (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).
select ma_hop_dong , ngay_lam_hop_dong , ngay_ket_thuc , tien_dat_coc , ifnull(sum(hop_dong_chi_tiet.so_luong),0) as so_luong from hop_dong 
left join hop_dong_chi_tiet using(ma_hop_dong)
group by ma_hop_dong;

-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được 
--  sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
select dvdk.ma_dich_vu_di_kem , dvdk.ten_dich_vu_di_kem from dich_vu_di_kem dvdk
join hop_dong_chi_tiet as hdct on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
join hop_dong as hd on hd.ma_hop_dong = hdct.ma_hop_dong
join khach_hang as kh on kh.ma_khach_hang = hd.ma_khach_hang
join loai_khach as lk on lk.ma_loai_khach = kh.ma_loai_khach
where (lk.ma_loai_khach = 1 and (dia_chi like "%Quảng Ngãi%" or dia_Chi like "%Vinh%"));

-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem 
-- (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 
-- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
select ma_hop_dong , nv.ho_ten as "Nhân Viên"  , kh.ho_ten as "Khách Hàng" ,
kh.so_dien_thoai as SDT_Khach_Hang , ifnull(sum(hdct.so_luong),0) as so_luong_dich_vu_di_kem ,
ten_dich_vu , hd.tien_dat_coc from hop_dong as hd
left join hop_dong_chi_tiet hdct using (ma_hop_dong)
left join nhan_vien nv using(ma_nhan_vien)
left join khach_hang kh using(ma_khach_hang)
left join dich_vu dv using (ma_dich_vu)
where month(hd.ngay_lam_hop_dong)  between '10' and '12' and year(hd.ngay_lam_hop_dong) = 2020 
and not ( month(hd.ngay_lam_hop_dong)  between '1' and '6' and  year(hd.ngay_lam_hop_dong) = 2021)
group by ma_hop_dong;

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
--  (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

select  ma_dich_vu_di_kem ,ten_dich_vu_di_kem , count(hdct.ma_dich_vu_di_kem) as 'Số Lần Đặt' , sum(hdct.so_luong) as so_luong  from hop_dong_chi_tiet hdct
left join dich_vu_di_kem using (ma_dich_vu_di_kem)
group by ma_dich_vu_di_kem 
order by so_luong desc limit 2;

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung 
-- (được tính dựa trên việc count các ma_dich_vu_di_kem).
select  ma_dich_vu_di_kem ,ten_dich_vu_di_kem , count(hdct.ma_dich_vu_di_kem) as 'Số Lần Đặt'  from hop_dong_chi_tiet hdct
left join dich_vu_di_kem using (ma_dich_vu_di_kem)
group by ma_dich_vu_di_kem 
having count(hdct.ma_dich_vu_di_kem) = 1;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi
--  mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021
select ma_nhan_vien, ho_ten, ten_trinh_do , ten_bo_phan , so_dien_thoai , dia_chi ,ngay_lam_hop_dong  from hop_dong hd 
join nhan_vien using(ma_nhan_vien) 
left join bo_phan bp using(ma_bo_phan)	
left join trinh_do td using(ma_trinh_do) 
group by ma_nhan_vien 
having count(ma_nhan_vien) <= 3 and year(hd.ngay_lam_hop_dong) between '2020' and '2021'
order by ma_nhan_vien asc;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
delete from nhan_vien nv
where 
nv.ma_nhan_vien in (select * from (select nv_a.ma_nhan_vien  from nhan_vien nv_a 
left join hop_dong hd  using(ma_nhan_vien) where nv_a.ma_nhan_vien not in (select ma_nhan_vien from hop_dong)
) as c);

-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.

update khach_hang kh_a
set
ma_loai_khach = 1 
where
kh_a.ma_khach_hang in  (select * from (select kh.ma_khach_hang from khach_hang kh
left join loai_khach lk using(ma_loai_khach)
where lk.ten_loai_khach = 'Platinium') as a);

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
set foreign_key_checks = 0;
delete kh , hd from khach_hang kh join hop_dong as hd using(ma_khach_hang)
where kh.ma_khach_hang in (select * from (select ma_khach_hang from hop_dong join khach_hang using (ma_khach_hang) where year(ngay_lam_hop_dong) < 2021) as abc );
set foreign_key_checks = 1;

select ma_khach_hang ,ho_ten from khach_hang;
select *  from hop_dong;

-- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
update dich_vu_di_kem 
set 
gia = gia*2
where(
ma_dich_vu_di_kem in (select * from (  select ma_dich_vu_di_kem from hop_dong_chi_tiet
group by ma_dich_vu_di_kem
having sum(so_luong) > 10) as a )
);
select * from dich_vu_di_kem;


-- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, 
-- thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.

select nv.ma_nhan_vien as id , nv.ho_ten, nv.email, nv.so_dien_thoai, nv.ngay_sinh, nv.dia_chi from nhan_vien nv
union
select kh.ma_khach_hang , kh.ho_ten , kh.email , kh.so_dien_thoai , kh.ngay_sinh , kh.dia_chi from khach_hang kh;

-- 21.	Tạo khung nhìn có tên là v_nhan_vien để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” 
-- và đã từng lập hợp đồng cho một hoặc nhiều khách hàng bất kì với ngày lập hợp đồng là “12/12/2019”.

-- 22.	Thông qua khung nhìn v_nhan_vien thực hiện cập nhật địa chỉ thành “Liên Chiểu” 
-- đối với tất cả các nhân viên được nhìn thấy bởi khung nhìn này.

-- 	23.	Tạo Stored Procedure sp_xoa_khach_hang dùng để xóa thông tin của một khách hàng nào đó với ma_khach_hang 
-- được truyền vào như là 1 tham số của sp_xoa_khach_hang.

-- 24.	Tạo Stored Procedure sp_them_moi_hop_dong dùng để thêm mới vào bảng hop_dong 
-- với yêu cầu sp_them_moi_hop_dong phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung, 
-- với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.

-- 25.	Tạo Trigger có tên tr_xoa_hop_dong khi xóa bản ghi trong bảng hop_dong 
-- thì hiển thị tổng số lượng bản ghi còn lại có trong bảng hop_dong ra giao diện console của database.
-- Lưu ý: Đối với MySQL thì sử dụng SIGNAL hoặc ghi log thay cho việc ghi ở console.


-- 26.	Tạo Trigger có tên tr_cap_nhat_hop_dong khi cập nhật ngày kết thúc hợp đồng,
--  cần kiểm tra xem thời gian cập nhật có phù hợp hay không, với quy tắc sau: Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày.
--  Nếu dữ liệu hợp lệ thì cho phép cập nhật, nếu dữ liệu không hợp lệ 
-- thì in ra thông báo “Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày” trên console của database.
-- Lưu ý: Đối với MySQL thì sử dụng SIGNAL hoặc ghi log thay cho việc ghi ở console.


-- 27.	Tạo Function thực hiện yêu cầu sau:
-- a.	Tạo Function func_dem_dich_vu: Đếm các dịch vụ đã được sử dụng với tổng tiền là > 2.000.000 VNĐ.
-- b.	Tạo Function func_tinh_thoi_gian_hop_dong: Tính khoảng thời gian dài nhất tính từ lúc bắt đầu làm hợp đồng đến lúc kết thúc hợp đồng 
-- mà khách hàng đã thực hiện thuê dịch vụ (lưu ý chỉ xét các khoảng thời gian dựa vào từng lần làm hợp đồng thuê dịch vụ
--  không xét trên toàn bộ các lần làm hợp đồng). Mã của khách hàng được truyền vào như là 1 tham số của function này.


-- 28.	Tạo Stored Procedure sp_xoa_dich_vu_va_hd_room để tìm các dịch vụ được thuê bởi khách hàng với loại dịch vụ là “Room” 
-- từ đầu năm 2015 đến hết năm 2019 để xóa thông tin của các dịch vụ đó (tức là xóa các bảng ghi trong bảng dich_vu) 
-- và xóa những hop_dong sử dụng dịch vụ liên quan (tức là phải xóa những bản gi trong bảng hop_dong) và những bản liên quan khác.


