import javax.swing.JOptionPane;

import exception.InvalidMarksException;
import service.FileManager;
import service.StudentService;
import util.ValidationUtil;
import ui.MainFrame;

public class Main {

    public static void main(String[] args) {

        MainFrame frame = new MainFrame();

        StudentService service = new StudentService();

        frame.btnGrade.addActionListener(e -> {

            try {

                int marks = Integer.parseInt(
                        frame.txtMarks.getText());

                ValidationUtil.validateMarks(marks);

                String grade =
                        service.calculateGrade(marks);

                frame.lblResult.setText(
                        "Grade : " + grade);

            }

            catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        null,
                        "Enter valid number");

            }

            catch (InvalidMarksException ex) {

                JOptionPane.showMessageDialog(
                        null,
                        ex.getMessage());

            }

        });

        frame.btnClear.addActionListener(e -> {

            frame.txtId.setText("");
            frame.txtName.setText("");
            frame.txtMarks.setText("");
            frame.lblResult.setText("");

        });

        frame.btnAdd.addActionListener(e -> {

            try {

                String id =
                        frame.txtId.getText();

                String name =
                        frame.txtName.getText();

                String marks =
                        frame.txtMarks.getText();

                if(id.isEmpty() ||
                   name.isEmpty() ||
                   marks.isEmpty()) {

                    JOptionPane.showMessageDialog(
                            null,
                            "All fields are required");

                    return;
                }

                FileManager fileManager =
                        new FileManager();

                fileManager.saveStudent(
                        id + "," + name + "," + marks);

                JOptionPane.showMessageDialog(
                        null,
                        "Student Saved Successfully");

            }

            catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        null,
                        "Error Saving Student");

            }

        });

    }
}