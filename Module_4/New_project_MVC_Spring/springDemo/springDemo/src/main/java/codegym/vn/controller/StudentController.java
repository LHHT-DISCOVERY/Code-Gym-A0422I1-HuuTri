package codegym.vn.controller;

import codegym.vn.bean.Student;
import codegym.vn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/list")
    public String displayList(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "student/list";
    }

    @GetMapping("/update")
    public String showUpdate(Model model, @RequestParam("id") String id) {
        model.addAttribute("student", studentService.findById(id));
        return "student/update";
    }

    @GetMapping("/create")
    public String showCreate(){
        return "student/create";
    }

    @GetMapping("/delete")
    public String doDelete(Model model , @RequestParam("id") String id ){
        studentService.deleteById(id);
        return "redirect:/student/list";
    }

    @PostMapping("/create")
    public String doCreate(@RequestParam("id") String id , @RequestParam("name") String name ,
    @RequestParam("age") int age , @RequestParam("address") String address){
        Student student = new Student(id , name , age , address);
        studentService.createOrUpdate(student);
        return "redirect:/student/list";
    }

    @PostMapping("/update")
    public String doUpdate(@RequestParam("id") String id, @RequestParam("name") String name,
                           @RequestParam("age") int age, @RequestParam("address") String address) {
        Student student = new Student(id, name, age, address);
        studentService.createOrUpdate(student);
        return "redirect:/student/list";
    }
}
