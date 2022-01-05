import java.awt.event.*;
import javax.swing.JOptionPane;

public class action extends frame{
    @Override
    public void actionPerformed(ActionEvent click){

        //OWNER ACCOUNT
        TYPE[0] = "OWNER";
        USERNAME[0] = "APAC";
        PASSWORD[0] = "OWNER";
        ID[0] = "APAC";
        CASH[0] = 10000000;

        //Login
        if(click.getSource() == loginbox_button){
            String id = ID_field.getText();
            String pw = String.valueOf(PW_field.getPassword());

            if(id.isEmpty() || pw.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter your ID and Password", "Error login", 0);
                return;
            }

            if(id.matches(ID[0]) && pw.matches(PASSWORD[0])){
                dash_label[2].setText(TYPE[0]);
                dash_label[4].setText(ID[0]);
                dash_label[6].setText(USERNAME[0]);
                dash_label[8].setText(String.valueOf(CASH[0]));
                ACTIVE = 0;
                login_frame.dispose();
                dash_frame.setVisible(true);
            }

            for(int i = 0; i < REGISTERED; i++){
                if(id.matches(ID[i]) && pw.matches(PASSWORD[i])){
                    //DATA IN
                    dash_label[2].setText(TYPE[i]);
                    dash_label[4].setText(ID[i]);
                    dash_label[6].setText(USERNAME[i]);
                    dash_label[8].setText(String.valueOf(CASH[i]));
                    ACTIVE = i;

                    if(TYPE[i].equals("Admin")){
                        //Button
                        dash_button[0].setVisible(true);
                        dash_button[1].setVisible(true);

                        login_frame.dispose();
                        dash_frame.setVisible(true);
                    }
                    else if(TYPE[i].equals("Member")){
                        //Button
                        dash_button[0].setVisible(false);
                        dash_button[1].setVisible(false);

                        login_frame.dispose();
                        dash_frame.setVisible(true);
                    }
                    return;
                }
                if(i >= REGISTERED-1){
                    JOptionPane.showMessageDialog(null, "Account does not exist", "Error Login", 0);
                }
            }
        }

        //logout
        if(click.getSource() == dash_button[4]){
            login_frame.setVisible(true);
            dash_frame.dispose();
        }

        //add member
        if(click.getSource() == dash_button[0]){
            registration_frame.setVisible(true);
        }

        //generate ID
        if(click.getSource() == registration_button[0]){
            int max = 999999;
            int min = 100000;
            int key5 = (int)(Math.random()*(max-min+1)+min);
            int key1 = (int)(Math.random()*(9-1+1)+1);

            String unique_id = key5 + "-" + key1;
            registration_field[1].setText(unique_id);

            registration_button[0].setEnabled(false);
            registration_button[0].setVisible(false);
            registration_button[1].setVisible(true);
            registration_button[0].setEnabled(true);
        }

        //submit registration
        if(click.getSource() == registration_button[1]){
            String regType = String.valueOf(type_selection.getSelectedItem());
            String regName = registration_field[0].getText().toUpperCase();
            String regID = registration_field[1].getText();
            String regPW = String.valueOf(registration_pw[0].getPassword());
            String regRPW = String.valueOf(registration_pw[1].getPassword());

            if(regName.isBlank() || regPW.isBlank() || regRPW.isBlank()){
                JOptionPane.showMessageDialog(null, "Fill up all field", "Error Registration", 0);
                return;
            }

            if(!regPW.matches(regRPW)){
                JOptionPane.showMessageDialog(null, "Password does not match", "Error Registration", 0);
                return;
            }

            for(int i = 0; i < regName.length(); i++){
                if(regName.charAt(i) >= '1' && regName.charAt(i) <= '9'){
                    JOptionPane.showMessageDialog(null, "Name contain number", "Error Registration", 0);
                    return;
                }
            }

            if(regPW.length() < 8){
                JOptionPane.showMessageDialog(null, "Password should be 8 characters long", "Error Registration", 0);
            }

            ///ADD DATA
            else{
                HISTORY[ACTIVE] = "Add new member with an ID " + regID;
                TYPE[REGISTERED] = regType;
                ID[REGISTERED] = regID;
                USERNAME[REGISTERED] = regName;
                PASSWORD[REGISTERED] = regPW;
                CASH[REGISTERED] = 0;
                REGISTERED++;
                JOptionPane.showMessageDialog(null, "Success", "Success Registration", 1);
                registration_field[0].setText("");
                registration_field[1].setText("");
                registration_pw[0].setText("");
                registration_pw[1].setText("");

                registration_button[0].setEnabled(true);
                registration_button[0].setVisible(true);
                registration_button[1].setVisible(false);
                registration_frame.dispose();
            }

        }

        //Show Member Button
        if(click.getSource() == dash_button[1]){
            view_box.setText("");
            view_frame.setVisible(true);
        }

        //Show Member Push User
        if(click.getSource() == view_button){
            boolean gotclick = false;
            String Areaformat = "";
            for(int i = 1; i < REGISTERED; i++){
                Areaformat = "(" + TYPE[i] + ") [" + USERNAME[i] + "] [" + ID[i] + "] [" + PASSWORD[i] + "] " + "[" + String.valueOf(CASH[i]) + "] \n" + Areaformat;
                view_box.setText(Areaformat);
                gotclick = true;
            }
            if(gotclick){
                view_button.setText("Refresh");
            }
        }

        //Send Cash
        if(click.getSource() == dash_button[2]){
            cash_field[0].setText("");
            cash_field[1].setText("");
            cash_frame.setVisible(true);
        }

        //Send Cash Button
        if(click.getSource() == cash_button){
            String id = cash_field[0].getText();
            String String_amount = cash_field[1].getText();
            int cash = CASH[ACTIVE];

            if(id.isEmpty() || String_amount.isEmpty()){
                JOptionPane.showMessageDialog(null, "Fill up all field", "Error Sending", 0);
                return;
            }

            for(int i = 0; i < id.length(); i++){
                if(id.charAt(i) >= 'a' && id.charAt(i) <= 'z'){
                    JOptionPane.showMessageDialog(null, "ID contain letter", "Error Sending", 0);
                    return;
                }
            }

            for(int i = 0; i < String_amount.length(); i++){
                if(id.charAt(i) >= 'a' && id.charAt(i) <= 'z'){
                    JOptionPane.showMessageDialog(null, "AMOUNT contain letter", "Error Sending", 0);
                    return;
                }
            }

            for(int i = 0; i < REGISTERED; i++){
                if(id.matches(ID[i])){
                    int amount = Integer.parseInt(String_amount);

                    if(id.matches(ID[ACTIVE])){
                        JOptionPane.showMessageDialog(null, "Sending Failed", "Error Sending", 0);
                        return;
                    }

                    if(amount > cash){
                        JOptionPane.showMessageDialog(null, "Error Amount", "Error Sending", 0);
                        return;
                    }
                    else if(amount <= 0){
                        JOptionPane.showMessageDialog(null, "Error Amount", "Error Sending", 0);
                        return;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Success", "Success Sending", 1);
                        cash -= amount;
                        HISTORY[ACTIVE] = "Send " + amount + " to " + USERNAME[i] + "\n" + HISTORY[ACTIVE];
                        dash_label[8].setText(String.valueOf(cash));
                        CASH[i] += amount;
                        return;
                    }
                }

                if(i >= REGISTERED - 1){
                    JOptionPane.showMessageDialog(null, "ID does not exist", "Error Sending", 0);
                }
            }
        }

        //transaction history
        if(click.getSource() == dash_button[3]){
            history_frame.setVisible(true);
            history_box.setText("");
        }
        
        //transaction PUSH
        if(click.getSource() == history_button){
            String Areaformat = "";
            Areaformat = HISTORY[ACTIVE];
            history_box.setText(Areaformat);
        }
   }
}