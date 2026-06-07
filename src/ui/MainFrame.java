package ui;

import javax.swing.*;
import javax.swing.border.*;
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

        setSize(800, 600);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setLayout(null);

        panel.setBackground(new Color(30, 39, 46));

        panel.setBorder(
                BorderFactory.createLineBorder(
                        new Color(52, 152, 219), 3));

        add(panel);

        JLabel title =
                new JLabel("SMART STUDENT MANAGEMENT SYSTEM");

        title.setBounds(120, 20, 600, 40);

        title.setForeground(Color.WHITE);

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24));

        panel.add(title);

        JLabel subtitle =
                new JLabel(
                        "Software Construction & Development Project");

        subtitle.setBounds(170, 60, 450, 25);

        subtitle.setForeground(
                new Color(189, 195, 199));

        subtitle.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        14));

        panel.add(subtitle);

        JPanel formPanel = new JPanel();

        formPanel.setLayout(null);

        formPanel.setBounds(80, 110, 620, 230);

        formPanel.setBackground(
                new Color(44, 62, 80));

        formPanel.setBorder(
                BorderFactory.createTitledBorder(
                        BorderFactory.createLineBorder(
                                new Color(52, 152, 219), 2),
                        "Student Information",
                        TitledBorder.LEFT,
                        TitledBorder.TOP,
                        new Font("Arial", Font.BOLD, 14),
                        Color.WHITE));

        panel.add(formPanel);

        JLabel idLabel =
                new JLabel("Student ID");

        idLabel.setBounds(40, 50, 120, 30);

        idLabel.setForeground(Color.WHITE);

        idLabel.setFont(
                new Font("Arial", Font.BOLD, 14));

        formPanel.add(idLabel);

        txtId = new JTextField();

        txtId.setBounds(180, 50, 250, 35);

        txtId.setBorder(
                new LineBorder(
                        new Color(52, 152, 219), 2));

        formPanel.add(txtId);

        JLabel nameLabel =
                new JLabel("Student Name");

        nameLabel.setBounds(40, 100, 120, 30);

        nameLabel.setForeground(Color.WHITE);

        nameLabel.setFont(
                new Font("Arial", Font.BOLD, 14));

        formPanel.add(nameLabel);

        txtName = new JTextField();

        txtName.setBounds(180, 100, 250, 35);

        txtName.setBorder(
                new LineBorder(
                        new Color(46, 204, 113), 2));

        formPanel.add(txtName);

        JLabel marksLabel =
                new JLabel("Marks");

        marksLabel.setBounds(40, 150, 120, 30);

        marksLabel.setForeground(Color.WHITE);

        marksLabel.setFont(
                new Font("Arial", Font.BOLD, 14));

        formPanel.add(marksLabel);

        txtMarks = new JTextField();

        txtMarks.setBounds(180, 150, 250, 35);

        txtMarks.setBorder(
                new LineBorder(
                        new Color(241, 196, 15), 2));

        formPanel.add(txtMarks);

        btnAdd = new JButton("Add Student");

        btnAdd.setBounds(80, 380, 180, 50);

        btnAdd.setBackground(
                new Color(46, 204, 113));

        btnAdd.setForeground(Color.WHITE);

        btnAdd.setFocusPainted(false);

        btnAdd.setFont(
                new Font("Arial", Font.BOLD, 14));

        panel.add(btnAdd);

        btnGrade = new JButton("Calculate Grade");

        btnGrade.setBounds(300, 380, 180, 50);

        btnGrade.setBackground(
                new Color(52, 152, 219));

        btnGrade.setForeground(Color.WHITE);

        btnGrade.setFocusPainted(false);

        btnGrade.setFont(
                new Font("Arial", Font.BOLD, 14));

        panel.add(btnGrade);

        btnClear = new JButton("Clear");

        btnClear.setBounds(520, 380, 120, 50);

        btnClear.setBackground(
                new Color(231, 76, 60));

        btnClear.setForeground(Color.WHITE);

        btnClear.setFocusPainted(false);

        btnClear.setFont(
                new Font("Arial", Font.BOLD, 14));

        panel.add(btnClear);

        lblResult = new JLabel(
                "Result Will Appear Here");

        lblResult.setBounds(220, 470, 350, 35);

        lblResult.setForeground(
                new Color(241, 196, 15));

        lblResult.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        18));

        panel.add(lblResult);

        JLabel footer =
                new JLabel(
                        "Developed by Muhammad Mahir Malik");

        footer.setBounds(
                250,
                525,
                300,
                20);

        footer.setForeground(
                new Color(189, 195, 199));

        panel.add(footer);

        setVisible(true);
    }
}