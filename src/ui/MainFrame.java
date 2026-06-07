package ui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public JTextField txtId;
    public JTextField txtName;
    public JTextField txtMarks;

    public JButton btnAdd;
    public JButton btnClear;
    public JButton btnGrade;

    public JLabel lblResult;

    public MainFrame() {

        setTitle("Smart Student Management System");

        setSize(600, 500);

        setLayout(null);

        getContentPane().setBackground(
                new Color(44, 62, 80));

        JLabel title =
                new JLabel("Student Management System");

        title.setBounds(150, 20, 300, 30);

        title.setForeground(Color.WHITE);

        add(title);

        JLabel idLabel =
                new JLabel("Student ID");

        idLabel.setBounds(50, 80, 100, 30);

        idLabel.setForeground(Color.WHITE);

        add(idLabel);

        txtId = new JTextField();

        txtId.setBounds(180, 80, 200, 30);

        add(txtId);

        JLabel nameLabel =
                new JLabel("Name");

        nameLabel.setBounds(50, 130, 100, 30);

        nameLabel.setForeground(Color.WHITE);

        add(nameLabel);

        txtName = new JTextField();

        txtName.setBounds(180, 130, 200, 30);

        add(txtName);

        JLabel marksLabel =
                new JLabel("Marks");

        marksLabel.setBounds(50, 180, 100, 30);

        marksLabel.setForeground(Color.WHITE);

        add(marksLabel);

        txtMarks = new JTextField();

        txtMarks.setBounds(180, 180, 200, 30);

        add(txtMarks);

        btnAdd = new JButton("Add Student");

        btnAdd.setBounds(50, 250, 140, 40);

        add(btnAdd);

        btnGrade = new JButton("Grade");

        btnGrade.setBounds(220, 250, 140, 40);

        add(btnGrade);

        btnClear = new JButton("Clear");

        btnClear.setBounds(390, 250, 140, 40);

        add(btnClear);

        lblResult = new JLabel();

        lblResult.setBounds(50, 330, 400, 30);

        lblResult.setForeground(Color.YELLOW);

        add(lblResult);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }
}