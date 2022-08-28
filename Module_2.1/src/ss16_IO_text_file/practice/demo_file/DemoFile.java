package ss16_IO_text_file.practice.demo_file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DemoFile {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nam", 18, "Da Nang"));
        students.add(new Student("Thanh", 19, "Da Nang"));
        students.add(new Student("Bao", 20, "Quang Nam"));

        FileUtils.writeFile("student.txt", students, false);

        File file = new File("sample.txt");

//        System.out.println(file.getAbsoluteFile());
//        FileUtils.writeFileWithResource("E:\\", students, true);
        // \n \t \\ \" \r CRLF

        List<Student> studentListFromFile = FileUtils.getStudentFromFile("student.csv");
        studentListFromFile.forEach(System.out::println);
    }
}

