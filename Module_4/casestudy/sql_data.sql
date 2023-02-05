SELECT * FROM case_study_m4.position;
insert into position (position_id ,position_name) values 
	(1,'Quản Lý'),
	(2,'Nhân Viên');
    
    insert into education_degree(education_degree_id, education_degree_name) 
values
	(1,'Trung Cấp'),
	(2, "Cao Đẳng" ),
	(3	,"Đại Học"),
	(4,"Sau Đại Học");
    
    insert into division(division_id , division_name)
values
	(1,'Sale-Marketing'),
	(2,	'Hành chính'),
	(3,'Phục vụ'),
	(4,	'Quản lý');
    
    select * from employee where employee_name like "%tri";
    
insert into customer_type(customer_type_id,customer_type_name)
values
	(1,	'Diamond'),
	(2,	'Platinium'),
	(3,	'Gold'),
	(4,	'Silver'),
	(5,	'Member');