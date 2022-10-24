package service;

import model.Student;
import responsitory.IStudentRepository;
import responsitory.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService{

    private IStudentRepository StudentRepository = new StudentRepository();

    @Override
    public List<Student> findAll() {
        return StudentRepository.findAll();
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
