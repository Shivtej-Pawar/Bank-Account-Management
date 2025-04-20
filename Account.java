package mpkg;
import mpkg.Util;
import mpkg.Icomp;
import mpkg.Idataio;
import java.io.*;
import java.util.*;
public class Account implements Serializable,Idataio,Icomp {
    int no;
    String nm;
    int opn;
    boolean state;
    LinkedList<Integer>ls;
    public Account()
    {
        no=0;
        nm=new String();
        opn=0;
        state=false;
        ls=new LinkedList<Integer>();
    }

    public void setData(int a)
    {
        no=a;
        opn=Util.iInput("Enter Opening balance:");
        nm=Util.sInput("Enter Name:");
        state=true;
    }

    public String toString()
    {
        String s="A/c Data: \n A/c No:"+no+"\n Name:"+nm+"\n Opening balance:"+opn+"\n State"+state;
        return s;
    }

     public void display()
     {
        Util.display(toString());
     }
    
     public int balance()
     {
        int amt=opn;
        int i=0,n=ls.size();
        while(i<n)
        {
           amt=amt+ls.get(i);
           i++;
        }
           return amt;
     }

     public int getNo()
     {
        return no;
     }

     public int getBalance()
     {
        return balance();
     }


     public void depo()
     {
        int amt=Util.iInput("Enter deposit Amount: ");
        if(amt<=0)
        {
            Util.display("Invalid");
            return;
        }       
        ls.add(amt);
     }

    public void with()
    {
        int wamt=Util.iInput("Enter withdraw amount:");

        if(wamt<=0)
        {
            Util.display("Invalid");
            return;
        }
        int bal=balance();
        if(bal-wamt<=0)
        {
            Util.display("Invalid");
            return;
       
        }
        ls.add(-wamt);
    }

}
