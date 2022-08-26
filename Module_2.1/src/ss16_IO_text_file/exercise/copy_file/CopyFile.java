package ss16_IO_text_file.exercise.copy_file;

import java.io.*;

public class CopyFile {
    public static void copyFile(String[] strings) throws IOException {
        InputStream input;
        OutputStream out;

        try {
            input = new FileInputStream(new File("src\\ss16_IO_text_file\\practice\\file.txt"));
            out = new FileOutputStream(new File("src\\ss16_IO_text_file\\exercise\\copy_file\\file_copy.txt"));

            int length;
            byte[] buffer = new byte[1024];

            while ((length = input.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            System.out.println("Copy is successful");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        copyFile(args);
    }
}
