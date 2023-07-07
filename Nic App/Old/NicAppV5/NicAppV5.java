import javax.swing.JOptionPane;

public class NicAppV5{

    public static void main(String [] args){

        String regex = "^[0-9]{9}V$";

        String nic = JOptionPane.showInputDialog(null, "Enter Your NIC:");

        if(!nic.matches(regex)){
            JOptionPane.showMessageDialog(null, "NIC is Invalid");

        }else {

            String gender = JOptionPane.showInputDialog(null, "Enter Your Gender:");

            String digits = nic.substring(2,5);
            int value = Integer.parseInt(digits);

            if((value > 500 && gender.equalsIgnoreCase("male")) || /*OR Gate */ (value < 500 && gender.equalsIgnoreCase("female"))){

                JOptionPane.showMessageDialog(null, "NIC is Valid");
            }else {

                JOptionPane.showMessageDialog(null, "NIC is Invalid");
            }
        }

    }    

}