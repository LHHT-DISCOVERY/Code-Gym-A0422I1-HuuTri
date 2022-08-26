package ss16_IO_text_file.practice.demo_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static final String DELIMITER = ",";
    public static final String EMPTY = "";

    public static void writeFile(String path, List<Student> studentList, boolean append) {
        BufferedWriter writer;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path, append);
            writer = new BufferedWriter(fileWriter);
            for (Student student : studentList) {
                // tsv, csv
                writer.write(student.getName() + DELIMITER
                        + student.getAge() + DELIMITER
                        + student.getAddress());
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


//    public static void writeFileWithResource(String path, List<Student> studentList, boolean append) {
//        try (BufferedWriter writer = new BufferedWriter(
//                new FileWriter(path, append))) {
//            for (Student student : studentList) {
//                // tsv, csv
//                writer.write(student.getName() + DELIMITER
//                        + student.getAge() + DELIMITER
//                        + student.getAddress());
//                writer.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static List<Student> getStudentFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String temp;
            while ((temp = reader.readLine()) != null) {
                if (EMPTY.equals(temp.trim())) {
                    continue;
                }
                String[] result = temp.split(DELIMITER);
                if (result.length != 3) {
                    continue;
                }
                String name = result[0];
                int age = Integer.parseInt(result[1]);
                String address = result[2];
                students.add(new Student(name, age, address));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }
}
