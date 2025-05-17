class PasswordBreaker extends Thread
{
    Bank b;
    int start,end;
    static volatile boolean found = false;

    public PasswordBreaker(Bank b, int start , int end)
    {
        this.b= b;
        this.start=start;
        this.end=end;
    }
    public void run()
    {
        for(int i = start;i<=end;i++)
        {
            if(found)
            {
                break;
            }
            if(b.login(i))
            {
                System.out.println("Password Found "+i);
                found=true;
                if(found=true) 
                {
                    break;
                }
            }
        }
    }
}


class Demo7
{
    public static void main(String args[])
    {
        Bank bank= new Bank();

        PasswordBreaker t1=new PasswordBreaker(bank,0,100);
        PasswordBreaker t2=new PasswordBreaker(bank,101,200);   
        PasswordBreaker t3=new PasswordBreaker(bank,201,300);
        PasswordBreaker t4=new PasswordBreaker(bank,301,400);
        PasswordBreaker t5=new PasswordBreaker(bank,401,500);
        PasswordBreaker t6=new PasswordBreaker(bank,501,600);
        PasswordBreaker t7=new PasswordBreaker(bank,601,700);
        PasswordBreaker t8=new PasswordBreaker(bank,701,800);
        PasswordBreaker t9=new PasswordBreaker(bank,801,900);
        PasswordBreaker t10=new PasswordBreaker(bank,901,999);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

    }   
}