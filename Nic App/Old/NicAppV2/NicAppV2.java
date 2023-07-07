import java.util.regex.Matcher;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class NicAppV2{

    public static void main(String [] args){

        String nic = JOptionPane.showInputDialog(null,"Enter Your NIC:");

        Pattern pattern = Pattern.compile("^[0-9]{9}V$" , Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(nic);

        if(matcher.find()){
            JOptionPane.showMessageDialog(null,"NIC Valid");
        }else{
            JOptionPane.showMessageDialog(null,"NIC Invalid");
        }
    }
}