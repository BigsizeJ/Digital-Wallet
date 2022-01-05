import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frame extends data implements ActionListener{

    //global variable
    Font boldfont = new Font("Roboto Mono", 1, 16);
    Font regularfont = new Font("Roboto Mono", 0, 16);
    Font titlefont = new Font("Roboto Mono", 1, 20);
    Color buttoncolor = new Color(157, 158, 161);

    //LoginBox
    

    frame(){
        Loginbox();
        Dashboard();
        Registration();
        Showmember();
        Sendcash();
        History();
    }

    void Loginbox(){
        login_frame.setSize(400, 210);
        login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login_frame.setLocationRelativeTo(null);
        login_panel.add(PW_field);
        login_panel.setLayout(null);
        login_panel.add(loginbox_button);
        login_frame.setResizable(false);
        login_frame.add(login_panel);

        for(int i = 0; i < loginbox_label.length; i++){
            loginbox_label[i] = new JLabel();
            loginbox_label[i].setHorizontalAlignment(JLabel.CENTER);
            loginbox_label[i].setFont(boldfont);
            login_panel.add(loginbox_label[i]);
        }

        //ICTS ID
        loginbox_label[0].setText("ID");
        loginbox_label[0].setBounds(10, 20, 100, 20);
        ID_field.setBounds(120,18, 250, 25);
        ID_field.setFont(regularfont);
        login_panel.add(ID_field);

        //Password
        loginbox_label[1].setText("PASSWORD");
        loginbox_label[1].setBounds(10, 70, 100, 20);
        PW_field.setBounds(120, 70, 250, 25);

        //button
        loginbox_button.setText("Login");
        loginbox_button.setBounds(20, 120, 350, 35);
        loginbox_button.setHorizontalAlignment(JButton.CENTER);
        loginbox_button.setFocusable(false);
        loginbox_button.setBackground(buttoncolor);
        loginbox_button.setBorder(null);
        loginbox_button.setFont(boldfont);
        loginbox_button.addActionListener(this);

        login_frame.setVisible(true);
    }

    void Dashboard(){
        dash_frame.setSize(500, 500);
        dash_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dash_frame.setLocationRelativeTo(null);
        dash_frame.setResizable(false);
        dash_panel.setLayout(null);
        dash_frame.add(dash_panel);

        for(int i = 0; i < dash_label.length; i++){
            dash_label[i] = new JLabel();
            dash_label[i].setFont(boldfont);
            dash_label[i].setHorizontalAlignment(JLabel.CENTER);
            dash_panel.add(dash_label[i]);
        }

        for(int i = 0; i < dash_button.length; i++){
            dash_button[i] = new JButton();
            dash_button[i].setFont(boldfont);
            dash_button[i].setFocusable(false);
            dash_button[i].setBorder(null);
            dash_button[i].setBackground(buttoncolor);
            dash_panel.add(dash_button[i]);
        }

        //title
        dash_label[0].setText("iCash - Digital Wallet");
        dash_label[0].setBorder(BorderFactory.createLineBorder(Color.black));
        dash_label[0].setHorizontalAlignment(JLabel.CENTER);
        dash_label[0].setBounds(10, 10, 470, 50);
        dash_label[0].setFont(titlefont);

        //User_type
        dash_label[1].setText("Account type: ");
        dash_label[1].setBounds(10, 80, 150, 30);
        //User_type DATA
        dash_label[2].setBounds(200, 80, 150, 30);
        dash_label[2].setFont(regularfont);

        //User_ID
        dash_label[3].setText("ID: ");
        dash_label[3].setBounds(10, 120, 150, 30);
        //User_ID DATA
        dash_label[4].setBounds(200, 120, 150, 30);
        dash_label[4].setFont(regularfont);

        //User_name
        dash_label[5].setText("Name: ");
        dash_label[5].setBounds(10, 160, 150, 30);
        //User_name DATA
        dash_label[6].setBounds(200, 160, 150, 30);
        dash_label[6].setFont(regularfont);

        //User_Cash
        dash_label[7].setText("Cash: ");
        dash_label[7].setBounds(10, 200, 150, 30);
        //User_cash DATA
        dash_label[8].setBounds(200, 200, 150, 30);
        dash_label[8].setFont(regularfont);

        //Add Member Button
        dash_button[0].setText("Add Member");
        dash_button[0].setBounds(10, 250, 220, 50);
        dash_button[0].addActionListener(this);

        //Show Member Button
        dash_button[1].setText("Show Member");
        dash_button[1].setBounds(260, 250, 220, 50);
        dash_button[1].addActionListener(this);

        //Send Cash Button
        dash_button[2].setText("Send Cash");
        dash_button[2].setBounds(10, 325, 220, 50);
        dash_button[2].addActionListener(this);

        //Transaction History Button
        dash_button[3].setText("History");
        dash_button[3].setBounds(260, 325, 220, 50);
        dash_button[3].addActionListener(this);

        //Logout Button
        dash_button[4].setText("Logout");
        dash_button[4].setBounds(10, 400, 470, 50);
        dash_button[4].addActionListener(this); 

        dash_frame.setVisible(true);
    }

    void Registration(){
        registration_frame.setSize(400, 550);
        registration_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        registration_frame.setLocationRelativeTo(null);
        registration_frame.setResizable(false);
        registration_frame.add(registration_panel);
        registration_panel.setLayout(null);
        registration_panel.add(type_selection);
        for(int i = 0; i < registration_label.length; i++){
            registration_label[i] = new JLabel();
            registration_label[i].setFont(boldfont);
            registration_label[i].setHorizontalAlignment(JLabel.CENTER);
            registration_panel.add(registration_label[i]);
        }

        for(int i = 0; i < registration_field.length; i++){
            registration_field[i] = new JTextField();
            registration_field[i].setHorizontalAlignment(JTextField.CENTER);
            registration_field[i].setFont(regularfont);
            registration_panel.add(registration_field[i]);
        }

        for(int i = 0; i < 2; i++){
            registration_pw[i] = new JPasswordField();
            registration_pw[i].setFont(regularfont);
            registration_pw[i].setHorizontalAlignment(JPasswordField.CENTER);
            registration_panel.add(registration_pw[i]);
            registration_button[i] = new JButton();
            registration_button[i].setFont(boldfont);
            registration_button[i].setFocusable(false);
            registration_button[i].setBorder(null);
            registration_button[i].setBackground(buttoncolor);
            registration_panel.add(registration_button[i]);
        }

        //title
        registration_label[0].setText("Registration");
        registration_label[0].setFont(titlefont);
        registration_label[0].setBounds(10, 10, 370, 50);
        registration_label[0].setBorder(BorderFactory.createLineBorder(Color.black));

        //Account Type
        registration_label[1].setText("Account type");
        registration_label[1].setBounds(10, 80, 370, 25);
        type_selection.setBounds(10, 110, 370, 30);
        type_selection.setFocusable(false);
        type_selection.setSelectedIndex(0);
        
        //Full name
        registration_label[2].setText("Full name");
        registration_label[2].setBounds(10, 150, 370, 25);
        registration_field[0].setBounds(10, 180, 370, 25);

        //ID
        registration_label[3].setText("iCash ID");
        registration_label[3].setBounds(10, 220, 370, 25);
        registration_field[1].setBounds(10, 250, 370, 25);
        registration_field[1].setEditable(false);

        //PW n Retype PW
        registration_label[4].setText("Password");
        registration_label[4].setBounds(10, 290, 370, 25);
        registration_pw[0].setBounds(10, 320, 370, 25);

        registration_label[5].setText("Retype Password");
        registration_label[5].setBounds(10, 360, 370, 25);
        registration_pw[1].setBounds(10, 390, 370, 25);

        //BUTTON
        registration_button[0].setText("Generate iCash ID");
        registration_button[0].setBounds(10, 440, 370, 50);
        registration_button[0].addActionListener(this);

        registration_button[1].setText("Submit");
        registration_button[1].setBounds(10, 440, 370, 50);
        registration_button[1].addActionListener(this);
    }

    void Showmember(){
        view_frame.setSize(500, 500);
        view_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        view_frame.setLocationRelativeTo(null);
        view_frame.setResizable(false);
        view_frame.add(view_panel);
        view_panel.setLayout(null);
        view_panel.add(view_box);
        view_panel.add(view_button);

        for(int i = 0; i < view_info.length; i++){
            view_info[i] = new JLabel();
            view_info[i].setFont(boldfont);
            view_panel.add(view_info[i]);
        }

        view_info[0].setText("Name");
        view_info[0].setBounds(10, 20, 200, 25);
        view_info[1].setText("ID");
        view_info[1].setBounds(150, 20, 150, 25);
        view_info[2].setText("Password");
        view_info[2].setBounds(250, 20, 200, 25);
        view_info[3].setText("Balance");
        view_info[3].setBounds(404, 20, 200, 25);

        JScrollPane Scroll = new JScrollPane(view_box, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        view_box.setFont(regularfont);
        view_box.setEditable(false);
        view_box.setBorder(view_border);
        view_box.setBackground(view_color);
        view_panel.add(Scroll);
        Scroll.setBounds(10, 60, 470, 300);

        view_button.setText("Show Member");
        view_button.addActionListener(this);
        view_button.setFont(boldfont);
        view_button.setBorder(null);
        view_button.setFocusable(false);
        view_button.setBackground(buttoncolor);
        view_button.setBounds(10, 390, 470, 50);

        view_frame.setVisible(true);
    }

    void Sendcash(){
        cash_frame.setSize(400, 210);
        cash_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cash_frame.setLocationRelativeTo(null);
        cash_frame.setResizable(false);
        cash_frame.add(cash_panel);
        cash_panel.setLayout(null);

        for(int i = 0; i < cash_label.length; i++){
            cash_label[i] = new JLabel();
            cash_label[i].setHorizontalAlignment(JLabel.CENTER);
            cash_label[i].setFont(boldfont);
            cash_panel.add(cash_label[i]);
        }
        
        for(int i = 0; i < cash_field.length; i++){
            cash_field[i] = new JTextField();
            cash_field[i].setFont(regularfont);
            cash_panel.add(cash_field[i]);
        }

        //ID
        cash_label[0].setText("ID");
        cash_label[0].setBounds(10, 20, 100, 20);
        cash_field[0].setBounds(120,18, 250, 25);
        
        //Amount
        cash_label[1].setText("AMOUNT");
        cash_label[1].setBounds(10, 70, 100, 20);
        cash_field[1].setBounds(120, 70, 250, 25);

        //button
        cash_button.setText("Send");
        cash_button.setBounds(20, 120, 350, 35);
        cash_button.setHorizontalAlignment(JButton.CENTER);
        cash_button.setFocusable(false);
        cash_button.setBackground(buttoncolor);
        cash_button.setBorder(null);
        cash_button.setFont(boldfont);
        cash_button.addActionListener(this);
        cash_panel.add(cash_button);


    }

    void History(){
        history_frame.setSize(500, 500);
        history_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        history_frame.setLocationRelativeTo(null);
        history_frame.setResizable(false);
        history_frame.add(history_panel);
        history_panel.setLayout(null);
        history_panel.add(history_box);
        history_panel.add(history_button);
        history_panel.add(history_title);

        history_title.setText("Transaction History");
        history_title.setFont(titlefont);
        history_title.setHorizontalAlignment(JLabel.CENTER);
        history_title.setBounds(10, 20, 490, 25);
 

        JScrollPane History_Scroll = new JScrollPane(history_box, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        history_box.setFont(regularfont);
        history_box.setEditable(false);
        history_box.setBorder(view_border);
        history_box.setBackground(view_color);
        history_panel.add(History_Scroll);
        History_Scroll.setBounds(10, 60, 470, 300);

        history_button.setText("Refresh");
        history_button.addActionListener(this);
        history_button.setFont(boldfont);
        history_button.setBorder(null);
        history_button.setFocusable(false);
        history_button.setBackground(buttoncolor);
        history_button.setBounds(10, 390, 470, 50);
    }

    @Override   
    public void actionPerformed(ActionEvent click){}
}