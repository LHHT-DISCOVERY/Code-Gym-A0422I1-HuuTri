use `QuanLySinhVien`;
select * from student;

-- lấy tất cả các tên học sinh có chữ 'h' trong tên 
select s.studentName  from student s
where studentName like '%h%';

-- Hiển thị thông tin lớp học bắt đầu từ tháng 12 
select className , startDate from class 
where startDate like '%-12-%';

-- hiển thị tất cả các môn học có credit trongg khoảng từ 3-5
select subName , credit from subject 
where credit >= 3 and credit <= 5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.


-- Hiển thị các thông tin: StudentName, SubName, Mark. 
-- Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select studentName as TÊN_HỌC_VIÊN , subName as MÔN_HỌC , mark as ĐIỂM from student as s
join  mark as m on s.studentID = m.studentID
join subject as sub on m.subID = sub.subID
order by mark desc , studentName asc
