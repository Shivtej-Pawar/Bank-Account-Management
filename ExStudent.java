package mpkg;
import java.io.*;
import mpkg.Util;
import mpkg.Student;
public class ExStudent extends Student implements Serializable
{
    double mrk;
    public ExStudent()
    {
        super();
        mrk=0.0;
    }

    public void setData(int a)
    {
        super.setData(a);
        mrk=Util.dInput("Marks:");
    }
   
    public String toString()
    {
        String s=super.toString()+"\nMarks:"+mrk;
        return s;
    }

    public void display()
    {
       Util.display(toString());
    }

     public double getMarks()
     {
        return mrk;
     }

     
}
