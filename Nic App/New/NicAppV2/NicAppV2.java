import javax.swing.JOptionPane;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class NicAppV2{

    public static void main(String args[]){

        String nic = JOptionPane.showInputDialog(null, "Enter Your NIC:");

        Pattern pattern = Pattern.compile("^[0-9]{12}$");
        Matcher matcher = pattern.matcher(nic);

        if(matcher.find()){
            JOptionPane.showMessageDialog(null, "NIC is Valid");
        }
        else{
            JOptionPane.showMessageDialog(null, "NIC is Invalid");
        }
    }
}