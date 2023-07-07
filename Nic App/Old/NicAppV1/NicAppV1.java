import javax.swing.JOptionPane;

public class  NicAppV1{

    public static void main(String args[]){

        String nic = JOptionPane.showInputDialog(null, "Enter Your NIC:");

        String error="" ;

        if(nic.length()!=10){

            error = "Invalid NIC";
        }
        else{

            char lastDigit = nic.charAt(9);

            if (lastDigit != 'V'){
                error = "NIC is Not Ends With V";
            }
        
            else{
                String numbers = nic.substring(0, 9);
                
                char digit [] = numbers.toCharArray();
                int c;

                for(c = 0; c < digit.length-1; c++){
                    if(!Character.isDigit(digit[c])){
                        error = "There are More Charactors Include in Given NIC";
                        break;
                    }
                }
            }
        }
        if(!error.isEmpty())
            JOptionPane.showMessageDialog(null, error);
        else
            JOptionPane.showMessageDialog(null, "The NIC Number  Valid");


    }
}