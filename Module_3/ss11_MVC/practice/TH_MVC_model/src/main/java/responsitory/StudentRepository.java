package responsitory;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1 , " Hữu Trí" , true , "20/10/2001" , 9 , "lytri102@gmail.com" , 1 , "lytri102@gmail.com"));
        studentList.add(new Student(2 , " Đông Trung " , true , "08/10/2001" , 9 , "lytri102@gmail.com" , 1 , "lytri102@gmail.com"));
        studentList.add(new Student(3 , " Huy Phú" , true , "20/09/2001" , 9 , "lytri102@gmail.com" , 1 , "lytri102@gmail.com"));
        studentList.add(new Student(4 , " Thanh Sang " , true , "20/11/2001" , 9 , "lytri102@gmail.com" , 1 , "lytri102@gmail.com"));
        studentList.add(new Student(5 , " Việt Toàn " , true , "07/06/2001" , 9, "lytri102@gmail.com" , 1 , "lytri102@gmail.com"));
        studentList.add(new Student(6 , " Văn Thái" , true , "09/06/2001" , 9 , "lytri102@gmail.com" , 1 , "lytri102@gmail.com"));
        studentList.add(new Student(7 , " Ngọc Hiếu" , true , "20/05/2001" , 9 , "lytri102@gmail.com" , 1 , "lytri102@gmail.com"));
        studentList.add(new Student(8 , " Ngọc Tiên " , true , "03/10/2001" , 9 , "lytri102@gmail.com" , 1 , "lytri102@gmail.com"));
        studentList.add(new Student(9 , " Thanh Tuấn" , true , "01/09/2001" , 9 , "lytri102@gmail.com" , 1 , "lytri102@gmail.com"));
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public boolean add(Student student) {
        return false;
    }

    @Override
    public boolean delete(int ID) {
        return false;
    }
}
