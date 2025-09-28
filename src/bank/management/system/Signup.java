package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1, r2, M1, M2, M3;
    JButton next;
    JTextField textName, textFname, textEmail, textAdd, textCity, textPin, textState;
    JDateChooser dateChooser;

    //  Global font variables
    private final Font headingFont = new Font("Segoe UI", Font.BOLD, 38);
    private final Font subHeadingFont = new Font("Segoe UI", Font.BOLD, 22);
    private final Font labelFont = new Font("Segoe UI", Font.BOLD, 20);
    private final Font fieldFont = new Font("Segoe UI", Font.PLAIN, 14);
    private final Font buttonFont = new Font("Segoe UI", Font.BOLD, 14);

    Random ran = new Random();
    Long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");

        // Gradient background panel
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gp = new GradientPaint(0, 0, new Color(252, 208, 76),
                        0, getHeight(), new Color(252, 208, 76));
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        backgroundPanel.setLayout(null);
        setContentPane(backgroundPanel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(i2));
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(headingFont);
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(subHeadingFont);
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(subHeadingFont);
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(labelFont);
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = createStyledTextField();
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(labelFont);
        labelfName.setBounds(100, 240, 200, 30);
        add(labelfName);

        textFname = createStyledTextField();
        textFname.setBounds(300, 240, 400, 30);
        add(textFname);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(labelFont);
        labelG.setBounds(100, 290, 200, 30);
        add(labelG);

        r1 = createStyledRadioButton("Male");
        r1.setBounds(300, 290, 60, 30);
        add(r1);

        r2 = createStyledRadioButton("Female");
        r2.setBounds(450, 290, 90, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(labelFont);
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        dateChooser.setBorder(BorderFactory.createLineBorder(new Color(0, 150, 136), 1));
        add(dateChooser);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(labelFont);
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = createStyledTextField();
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(labelFont);
        labelMs.setBounds(100, 440, 200, 30);
        add(labelMs);

        M1 = createStyledRadioButton("Married");
        M1.setBounds(300, 440, 100, 30);
        add(M1);

        M2 = createStyledRadioButton("Unmarried");
        M2.setBounds(450, 440, 100, 30);
        add(M2);

        M3 = createStyledRadioButton("Other");
        M3.setBounds(635, 440, 100, 30);
        add(M3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(M1);
        buttonGroup1.add(M2);
        buttonGroup1.add(M3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(labelFont);
        labelAdd.setBounds(100, 490, 200, 30);
        add(labelAdd);

        textAdd = createStyledTextField();
        textAdd.setBounds(300, 490, 400, 30);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(labelFont);
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);

        textCity = createStyledTextField();
        textCity.setBounds(300, 540, 400, 30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(labelFont);
        labelPin.setBounds(100, 590, 200, 30);
        add(labelPin);

        textPin = createStyledTextField();
        textPin.setBounds(300, 590, 400, 30);
        add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(labelFont);
        labelState.setBounds(100, 640, 200, 30);
        add(labelState);

        textState = createStyledTextField();
        textState.setBounds(300, 640, 400, 30);
        add(textState);

//        next = createStyledButton("Next");
//        next.setBounds(620, 710, 80, 30);
//        next.addActionListener(this);
//        add(next);

        next = new JButton("Next");
        next.setFont(new Font("Segoe UI",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    private JTextField createStyledTextField() {
        JTextField tf = new JTextField();
        tf.setFont(fieldFont);
        tf.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(0, 150, 136), 1),
                BorderFactory.createEmptyBorder(2, 5, 2, 5)
        ));
        return tf;
    }

    private JRadioButton createStyledRadioButton(String text) {
        JRadioButton rb = new JRadioButton(text);
        rb.setFont(new Font("Segoe UI", Font.BOLD, 14));
        rb.setOpaque(false);
        rb.setFocusPainted(false);
        return rb;
    }

    private JButton createStyledButton(String text) {
        JButton btn = new JButton(text) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                GradientPaint gp = new GradientPaint(0, 0, new Color(0, 180, 150),
                        0, getHeight(), new Color(0, 140, 120));
                g2.setPaint(gp);
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
                g2.dispose();
                super.paintComponent(g);
            }
        };
        btn.setFont(buttonFont);
        btn.setForeground(Color.WHITE);
        btn.setContentAreaFilled(false);
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Action logic
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender= "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if (M1.isSelected()){
            marital = "Married";
        } else if (M2.isSelected()) {
            marital = "Unmarried";
        } else if (M3.isSelected()) {
            marital = "Other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try {
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Conn conn1 = new Conn();
                String q = "Insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                conn1.statement.executeUpdate(q);
                new signup2(formno);
                setVisible(false);
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
