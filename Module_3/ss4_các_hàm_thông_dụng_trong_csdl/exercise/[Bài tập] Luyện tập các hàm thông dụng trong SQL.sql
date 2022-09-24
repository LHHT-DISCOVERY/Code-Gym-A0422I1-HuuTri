use `quanlysinhvien`;
select * from student;
select * from mark;
select * from class;   
select * from subject;   

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * , max(credit) from subject;

-- hiển thị tất cả thông tin môn học có điểm thi lớn nhất
select subject.* from subject 
left join mark on mark.subID = subject.subID
where mark = (select max(mark) from mark);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần

select student.* , ifnull(avg(mark),'học viên chưa có điểm ') as 'DTB' from student 
left join mark on mark.studentID = student.studentID
group by studentID
order by avg(mark) desc , studentName asc


