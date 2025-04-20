package mpkg;
import java.io.*;
import java.util.LinkedList;
public class NewAccAmd extends AccAmd{
    public NewAccAmd()
    {
        super();
    }

    public void save()
    {
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try
        {
            fos=new FileOutputStream("bank.dat");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();
            fos.close();
        }
        catch(Exception e){}
    }

   public void open() {
    FileInputStream fis = null;
    ObjectInputStream ois = null;
    try {
        fis = new FileInputStream("bank.dat");
        ois = new ObjectInputStream(fis);
       
        ls = (LinkedList<Account>) ois.readObject();
        ois.close();
        fis.close();
    } catch (Exception e) {
        System.out.println("Error loading data: " + e.getMessage());
    }
}

    public void menu()
    {
        open();
        super.menu();
        save();
    }
}
