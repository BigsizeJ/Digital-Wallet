import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class data {
    //Data Array
    String TYPE[] = new String[20];
    String ID[] = new String[20];
    String USERNAME[] = new String[20];
    String PASSWORD[] = new String[20];
    String HISTORY[] = new String[20];
    String recent_transaction = "";
    int CASH[] = new int[20];
    int REGISTERED = 1;
    int ACTIVE;

    //LoginBox
    JFrame login_frame= new JFrame("Login Account");
    JPanel login_panel = new JPanel();
    JLabel loginbox_label[] = new JLabel[3];
    JTextField ID_field = new JTextField();
    JPasswordField PW_field = new JPasswordField();
    JButton loginbox_button = new JButton();

    //DashBoard
    JFrame dash_frame = new JFrame("Dashboard");
    JPanel dash_panel = new JPanel();
    JLabel dash_label[] = new JLabel[9];
    JButton dash_button[] = new JButton[10];

    //MemberRegistration
    JFrame registration_frame = new JFrame("Member Registration");
    JPanel registration_panel = new JPanel();
    JLabel registration_label[] = new JLabel[10];
    JTextField registration_field[] = new JTextField[2];
    JPasswordField registration_pw[] = new JPasswordField[2];
    JButton registration_button[] = new JButton[2];
    String account_type[] = {"Admin", "Member"};
    JComboBox<String> type_selection = new JComboBox<String>(account_type);

    //Show Member
    JFrame view_frame = new JFrame("Member list");
    JPanel view_panel = new JPanel();
    JTextArea view_box = new JTextArea();
    JButton view_button = new JButton();
    JLabel view_info[] = new JLabel[4];
    Border border = BorderFactory.createLineBorder(Color.black);
    Border view_border = BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10));
    Color view_color = new Color(217, 219, 222);

    //Send Cash
    JFrame cash_frame = new JFrame("Send Cash");
    JPanel cash_panel = new JPanel();
    JLabel cash_label[] = new JLabel[2];
    JButton cash_button = new JButton();
    JTextField cash_field[] = new JTextField[2];

    //History
    JFrame history_frame = new JFrame("Transaction History");
    JPanel history_panel = new JPanel();
    JTextArea history_box = new JTextArea();
    JButton history_button = new JButton();
    JLabel history_title = new JLabel();
    Border history_border = BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10));
    Color history_color = new Color(217, 219, 222);

    
}
