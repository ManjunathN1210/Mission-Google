package Day12.Programs;

class Thread1 extends Thread
{
    @Override
    public void run()
    {
        while(true)
        {
            try {
                Thread.sleep(100);
            } 
            catch (Exception e) {
            }
        System.out.println("Good Morning");
        }
    }
}
class Thread2 extends Thread
{
    @Override
    public void run()
    {
        while(true)
        {
            try {
                Thread.sleep(100);
            } 
            catch (Exception e) {
            }
        System.out.println("Welcome");
        }
    }
}
public class Print_Repetitive
{
    public static void main(String[] args) {
        
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();     
    }
}