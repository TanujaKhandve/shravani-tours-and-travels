// Ass23.java
// Question: Write a java program to design a following GUI. Use appropriate Layout and Components.
// This program creates a registration form GUI using GridBagLayout with various components

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ass23 extends JFrame {
    private JTextField nameField, emailField, phoneField;
    private JRadioButton maleRadio, femaleRadio;
    private JComboBox<String> countryCombo;
    private JCheckBox termsCheck;
    private JTextArea addressArea;
    
    public Ass23() {
        setTitle("Registration Form - Assignment 3");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Main Panel with GridBagLayout
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Title
        JLabel titleLabel = new JLabel("Registration Form", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        mainPanel.add(titleLabel, gbc);
        
        gbc.gridwidth = 1;
        
        // Name
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        nameField = new JTextField(20);
        mainPanel.add(nameField, gbc);
        
        // Email
        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPanel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        emailField = new JTextField(20);
        mainPanel.add(emailField, gbc);
        
        // Phone
        gbc.gridx = 0;
        gbc.gridy = 3;
        mainPanel.add(new JLabel("Phone:"), gbc);
        gbc.gridx = 1;
        phoneField = new JTextField(20);
        mainPanel.add(phoneField, gbc);
        
        // Gender
        gbc.gridx = 0;
        gbc.gridy = 4;
        mainPanel.add(new JLabel("Gender:"), gbc);
        gbc.gridx = 1;
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        mainPanel.add(genderPanel, gbc);
        
        // Country
        gbc.gridx = 0;
        gbc.gridy = 5;
        mainPanel.add(new JLabel("Country:"), gbc);
        gbc.gridx = 1;
        String[] countries = {"Select Country", "India", "USA", "UK", "Canada", "Australia"};
        countryCombo = new JComboBox<>(countries);
        mainPanel.add(countryCombo, gbc);
        
        // Address
        gbc.gridx = 0;
        gbc.gridy = 6;
        mainPanel.add(new JLabel("Address:"), gbc);
        gbc.gridx = 1;
        addressArea = new JTextArea(4, 20);
        JScrollPane scrollPane = new JScrollPane(addressArea);
        mainPanel.add(scrollPane, gbc);
        
        // Terms and Conditions
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        termsCheck = new JCheckBox("I agree to terms and conditions");
        mainPanel.add(termsCheck, gbc);
        
        // Buttons
        gbc.gridy = 8;
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton submitBtn = new JButton("Submit");
        JButton resetBtn = new JButton("Reset");
        
        submitBtn.addActionListener(e -> submitForm());
        resetBtn.addActionListener(e -> resetForm());
        
        buttonPanel.add(submitBtn);
        buttonPanel.add(resetBtn);
        mainPanel.add(buttonPanel, gbc);
        
        add(mainPanel, BorderLayout.CENTER);
        setVisible(true);
    }
    
    private void submitForm() {
        if (nameField.getText().isEmpty() || emailField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all required fields!", 
                                          "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!termsCheck.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please accept terms and conditions!", 
                                          "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Registration Successful!", 
                                      "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void resetForm() {
        nameField.setText("");
        emailField.setText("");
        phoneField.setText("");
        addressArea.setText("");
        maleRadio.setSelected(false);
        femaleRadio.setSelected(false);
        countryCombo.setSelectedIndex(0);
        termsCheck.setSelected(false);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ass23());
    }
}