import javax.swing.JOptionPane;

import java.time.LocalDate;

public class NicAppV4{

    public static void main(String [] args){

        String regex = "^[0-9]{9}V$";

        String nic = JOptionPane.showInputDialog(null, "Enter Your NIC:");

        if(!nic.matches(regex)){
            JOptionPane.showMessageDialog(null, "NIC is Invalid");

        }else {

            String numbers = nic.substring(0,2);

            LocalDate date = LocalDate.now();
            int year = date.getYear();

            int num = Integer.parseInt(numbers);
            int birthYear = num + 1900;
            int age = year - birthYear;

            if (!(age>18)) {
                JOptionPane.showMessageDialog(null, "NIC doesn't Match with Age");
            }
            else {
                JOptionPane.showMessageDialog(null, "The Entered NIC is Valid");
            }

        }

    }


}