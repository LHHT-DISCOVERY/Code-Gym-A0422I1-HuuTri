package ss16_IO_text_file.practice.read_and_write_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeFile(String path, List<Country> countriesList, boolean append) {
        BufferedWriter writer;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path, append);
            writer = new BufferedWriter(fileWriter);
            for (Country country : countriesList
            ) {
                writer.write(country.getStt() + "," + country.getCode() + "," + country.getName());
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        List<Country> countries = new ArrayList<>();
        countries.add(new Country(1, "us", "USA"));
        countries.add(new Country(2, "us", "Canada"));
        countries.add(new Country(3, "vn", "VietNam"));

        Main.writeFile("country.csv", countries, false);


        List<Country> countryListFromFile = ReadFile.getCountry("country.csv");
        countryListFromFile.forEach(System.out::println);
    }
}
