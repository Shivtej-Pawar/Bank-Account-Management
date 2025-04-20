package mpkg;
import javax.swing.*;
public class Util {
    public static void display(String s)
    {
        JOptionPane.showMessageDialog(null, s);
    }
    public static int iInput(String s)
    {
        int no=0;
        try
        {
            no=Integer.parseInt(JOptionPane.showInputDialog(null, s));
        }
        catch(Exception e){}
        return no;
    }

    public static double dInput(String s)
    {
        double no=0.0;
        try
        {
            no=Double.parseDouble(JOptionPane.showInputDialog(null,s));
        }
        catch(Exception e){}
        return no;
    }
public static String sInput(String msg)
{
    String str=JOptionPane.showInputDialog(null, msg);
    return str;
}

public static int oInput(String title,String msg,String []choice)
{
    int res=JOptionPane.showOptionDialog(null, msg, title, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, choice, 0);
    return res;
}

}
