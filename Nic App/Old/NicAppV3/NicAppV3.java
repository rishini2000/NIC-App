import javax.swing.JOptionPane;

public class NicAppV3{

    public static void main(String [] args){

        String regex = "^[0-9]{9}V$";

        String nic = JOptionPane.showInputDialog(null, "Enter Your NIC:");

        if(nic.matches(regex)){
            JOptionPane.showMessageDialog(null, "NIC is Valid");
        }else JOptionPane.showMessageDialog(null, "NIC is Invalid");
    }


}