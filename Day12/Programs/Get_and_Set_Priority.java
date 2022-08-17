package Day12.Programs;

class Thread1 extends Thread
{
    @Override
    public void run()
    {
        // while(true)
        // {
        //     try {
        //         Thread.sleep(100);
        //     } 
        //     catch (Exception e) {
        //     }
        // System.out.println("Good Morning");
        // }
    }
}
class Thread2 extends Thread
{
    @Override
    public void run()
    {
        // while(true)
        // {
        //     try {
        //         Thread.sleep(100);
        //     } 
        //     catch (Exception e) {
        //     }
        // System.out.println("Welcome");
        }
}

public class Get_and_Set_Priority {
 
        public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();  
        //thread1.setPriority(4);
        //thread2.setPriority(6);

        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
        }
}
