package service;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public void saveStudent(String data) {

        try {

            FileWriter writer =
                new FileWriter(
                    "C:\\Users\\KDS\\Desktop\\Smart Student Management System\\students.txt",
                    true);

            writer.write(data + "\n");

            writer.close();

        }

        catch(IOException e) {

            System.out.println(
                "File Error: " + e.getMessage());

        }

    }
}