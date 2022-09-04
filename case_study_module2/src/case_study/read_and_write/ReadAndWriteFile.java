package case_study.read_and_write;

import case_study.models.human.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeToFile(String path, List<Employee> list) {
        BufferedWriter writer;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
            writer = new BufferedWriter(fileWriter);
            for (Employee s : list) {
                writer.write(s.getEmployeeId());
                writer.newLine();
            }
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println("ERROR : " + e.getMessage());
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


//    public void writeToFileEmployee(String path, List<Employee> employeeList) {
//        List<Employee> employeeList1 = new ArrayList();
//        for (Employee employee : employeeList
//        ) {
//            System.out.println(employee);
//            employeeList1.add(employee.writeToInfo());
//        }
//        writeToFile(path, employeeList1);
//    }
}
