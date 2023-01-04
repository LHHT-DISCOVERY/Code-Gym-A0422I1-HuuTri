package codegym.vn.springboot.restcontroller;

import codegym.vn.springboot.entity.ClassName;
import codegym.vn.springboot.entity.Student;
import codegym.vn.springboot.form.StudentForm;
import codegym.vn.springboot.service.ClassNameService;
import codegym.vn.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// sử dụng restcontroller để lấy dữ liệu về
@RestController
@RequestMapping("/api/student")
public class RestStudentController {
    //   add student service vào
    @Autowired
    private StudentService studentService;

    @Autowired
    private ClassNameService classNameService;

    @GetMapping("/list")
    public ResponseEntity<List<Student>> getListStudent() {
//        HttpStatus.OK sẽ trả về 200.ok là hằng số để khai báo trong này
//        webservice cần vì FE lấy dựa và HttpStatus này để biết đang bị lỗi gì
//        HttpStatus.OK nếu OK là ko lỗi sẽ đi làm tiếp
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
//     trả về 1 tehfn student duy nhất
//     dung PathVariable id kiểu dữ liệu là string
    public ResponseEntity<Student> getStudentById(@PathVariable("id") String id) {
        Student student = studentService.findById(id);
//        vd về HttpStatus.NOT_FOUND : trả về lỗi nếu ko thấy (như try catch )
        if (student == null) {
//            trả về
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
//        trả về student + HttpStatus.OK
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

//    thử thêm Student
//    đơn giản dùng PostMapping là  /create vì ko cần FE để hiển thị
//     còn đối với website thì cần 1 cái GetMapping để hiển thị rồi ms PostMapping
//     còn bên webservice thì ko cần hiển thị
//    do khởi tạo nên ko cần trả về student chỉ cần trả về string là đc rồi
    @PostMapping("/create")
//     RequestBody ??
//        tạo một Student từ student form
    public String createStudent(@RequestBody StudentForm studentForm) {
//        sẽ có 3 trường như dưới
//         sẽ có 1 trường ClassName là Object
//         nên khai báo trường Class Name nhập ID và sẽ sãy ra lỗi 400 Bad request
//        khi đó sẽ xây dựng 1 cái form
//        bản chất cái Entity chi ra nhiều trường hợp như Entity lấy từ DB
//        còn dữ liệu lấy từ bên ngoài vào cụ thể từ phía client lên thì sẽ làm 1 cái form là đúng hơn
//        nên sẽ xây dựng 1 cái student form ở package form
//        dùng studentForm chấm đến trường như trong student
        String id = studentForm.getId();
        String name = studentForm.getName();
        ClassName className = classNameService.findById(studentForm.getClassNameId());
        boolean sex = studentForm.getSex().equals("1") ? true : false;
        String email = studentForm.getEmail();
        String phoneNumber = studentForm.getPhoneNumber();

        Student student = new Student(id, name, className, email, sex, phoneNumber, null);

        studentService.create(student);
        return "success";
    }

//     tương tự update ........
//     đưa form lên sau đó dựa vào form sửa ID
//     . get thông tin từ object từ DB ra bằng ID đó và set lại dữ liệu form vào object
}
