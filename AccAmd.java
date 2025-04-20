package mpkg;
import mpkg.Util;
import mpkg.IAccAmd;
import mpkg.Account;
import java.io.*;
import java.util.*;
public class AccAmd implements IAccAmd {
    Account obj;
    LinkedList<Account> ls;
    public AccAmd()
    {
        obj=null;
        ls=new LinkedList<Account>();
    }
   
    public boolean search(int no)
    {
        int i=0,n=ls.size();
        while(i<n)
        {
            obj=ls.get(i);
            if(obj.getNo()==no) 
            {
                 break;
            }
            i++;
        }
         
        if(i==n)
             obj=null;
        return(i!=n);
    }
     
     public void search()
     {
        int no=Util.iInput("Enter A/c no:");
        if(search(no)==false)
            Util.display("Not Found");
        else
            Util.display("+obj"+"\n Total:"+obj.getBalance());
     }

     public void add()
     {
        int no=Util.iInput("Enter A/c no:");
        if(search(no)==true)
             Util.display("Record Exist");
        else
        {
             obj=new Account();
             obj.setData(no);
             ls.add(obj);
            Util.display("Record inserted");

        }
     }

    public void mod()
    {
        int no=Util.iInput("Enter A/c no:");
        if(search(no)==false)
              Util.display("Record does not Exist");
              else
              {
                  obj.setData(no);
                  Util.display("Record modified");                  
               }
    }
      

    public void del()
    {
        int no=Util.iInput("Enter A/c no:");
        if(search(no)==false)
              Util.display("Record does not exist");
              else
              {
                  ls.remove(obj);
                  Util.display("Record Removed");    
              }
    }

    public void display()
    {
        int i=0,n=ls.size();
        while(i<n)
        {
            obj=ls.get(i);
            String s="\n Data:"+obj+"\n Balance:"+obj.getBalance();
            Util.display(s);
            i++;
        }
    }


    public void transaction()
    {
        int no=0,opt=0;
        boolean res=true;
        no=Util.iInput("Enter the No:");
        while(true)
        {
            opt=Util.oInput("Choose Option", "Transaction", new String[]{"Deposit","withdraw","Balance","Back"});
            if(opt==3)
                 break;
            res=search(no);
            if(res==false)
            {
              Util.display("Invalid A/c no");
              continue;
            }
            switch (opt) {
                case 0:
                    obj.depo();  
                    break;
                case 1:
                    obj.with();  
                    break;
                case 2:
                    int bal=obj.getBalance();  
                    Util.display(obj.toString()+"\n Balance:"+bal);
                }

        }
    }


    public void menu()
    {
        int no=0,opt=0;
        boolean res=true;
        while (true) { 
            opt=Util.oInput("Choose option", "transaction", new String []{"Add","Mod","Del","Display","Search","Transaction","Exit"});
            if(opt==6)
               break;
            switch(opt)
            {
                  case 0:
                          add();
                          break;
                  case 1:
                           mod();
                           break;
                  case 2:
                        del();
                        break;
                  case 3:
                        display();
                        break;
                  case 4:
                       search();
                       break;
                 case 5:
                       transaction();
                    
            }
        }
    }


}
