package Day12.Programs;

// Thread using Extending Thread class
// class MyThread extends Thread
// {
//     @Override
//     public void run()
//     {
//         int i = 0;
//         while(i<3000)
//         {
//         System.out.println("My Thread is running");
//         i++;
//         }
//     }
// }

// class MyThread2 extends Thread
// {
//     @Override
//     public void run()
//     {
//         int i = 0;
//         while(i<3000)
//         {
//         System.out.println("My Second Thread is running");
//         i++;
//         }
//     }
// }
// public class Threads {
    
//     public static void main(String[] args) {
//         MyThread myThread = new MyThread();
//         MyThread2 myThread2 = new MyThread2();
//         myThread.start();
//         myThread2.start();
//     }
// }

class  MyThread implements Runnable
{
    @Override
    public void run() {
        int i=0;
        while(i<40000)
        {
        System.out.println("I am a thread");
        i++;
        }
}
}
class MyThread2 implements Runnable
{
    @Override
    public void run() {
        int i = 0;
        while(i<40000)
        {
        System.out.println("I am thread 2");
        i++;
       }
}
}
public class Threads
{
    public static void main(String[] args) {
        
        MyThread myThread = new MyThread();
        MyThread2 myThread2 = new MyThread2();

        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread2);

        // myThread.run();
        // myThread2.run();

        t1.start();
        t2.start();
    }
}