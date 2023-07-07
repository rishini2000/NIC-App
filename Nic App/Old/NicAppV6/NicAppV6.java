import javax.swing.JOptionPane;

public class NicAppV6{

    public static void main(String [] args){

        String regex = "^[0-9]{9}V$";

        int bdate = 0;
        int month = 0;
        int year = 0;

        int dts1[] = {31,59,90,120,151,181,212,243,273,304,334,365};
        int dts2[] = {31,60,91,121,152,182,213,244,274,305,335,366};
        
        String nic = JOptionPane.showInputDialog(null, "Enter Your NIC");

        if(!nic.matches(regex)) {
            JOptionPane.showMessageDialog(null, "The Entered NIC is Invalid");

        }
        else {
            String bday = JOptionPane.showInputDialog(null, "Enter Your Birthday (yyyy-mm-dd)");

            String d = nic.substring(2 , 5);
             int bd = Integer.parseInt(d);
            if(bd>500)
                bd = bd - 500;
                
            String y = nic.substring(0,2);

            year = 1900 + Integer.parseInt(y);

            int i = 0;
            if(year % 4 == 0){
                while(i < dts2.length){
                    if (bd < dts2[i]) {
                        break;
                    }
                    i++;
                }
                month = i + 1;
                bdate = bd -dts2[month-2];
            }
            else{
                while(i < dts1.length){
                    if(bd < dts1[i]){
                        break;

                    }
                    i++;
                }

            }month = i + 1;
            bdate = bd - dts1[month-2];

            String birthday = (year+"-" + month+"-"+bdate).toString();

        if(birthday.equals(bday))JOptionPane.showMessageDialog(null, "Valid NIC");
        else{
            JOptionPane.showMessageDialog(null, "Invalid NIC");
        }


        }
        
    }
}