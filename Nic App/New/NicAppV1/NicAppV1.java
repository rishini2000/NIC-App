import javax.swing.JOptionPane;

public class NicAppV1{

    public static void main(String args []){

        String nic= JOptionPane.showInputDialog(null, "Enter Your NIC");

        String error = "" ;

        if(nic.length()!=12){

            error = "Invalid NIC" ;
        }
        else{
            String numbers = nic.substring(0, 11);
                
            char digit [] = numbers.toCharArray();
            int c;

            for(c=0;c < digit.length;c++){
                if(!Character.isDigit(digit[c])){
                    error = "There are more Characters in Given NIC";
                    break;
                }
            }

        }
        if(!error.isEmpty()){
            JOptionPane.showMessageDialog(null, error);
        }
        else{
            JOptionPane.showMessageDialog(null, "Your NIC is Valid");
        }
    }
}