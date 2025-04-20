package mpkg;
import java.io.*;

public class Student implements Serializable
{
    int rno;
    String snm;
    public Student()  
    {
        rno=0;
        snm=new String();
    }

    public void setData(int n)
    {
        rno=n;
        snm=Util.sInput("Enter the name:");
    }

    public String toString()
    {
        String s="\nStudent Data:\n Roll No:"+rno+"\n Student Name:"+snm;
        return s;
    }

    public void display()
    {
        Util.display(toString());
    }
    
    
    public int getNo()
    {
        return rno;
    }

    public String getName()
    {
        return snm;
    }
}