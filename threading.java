 public class threading {
    public static void main(String[] args) {
        multiThread t1 = new multiThread();
        // Thread ty1 = new Thread(t1);
        t1.setName("Thread 1");
        multiThread t2 = new multiThread();
        // Thread ty2 = new Thread(t2);
        t2.setName("Thread 2");
        multiThread t3 = new multiThread();
        // Thread ty2 = new Thread(t3);
        t3.setName("Thread 3");
       
        t1.start();
        // try {
        //     t1.join();
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        t2.start();
        t3.start();
         
     }  
    }  
class multiThread extends Thread{  
    public void run(){  
        // for (int i = 1; i <= 5; i++) {
        //     // try {
        //     //     Thread.sleep(2000);
        //     // } catch (InterruptedException e) {
        //     //     // TODO Auto-generated catch block
        //     //     e.printStackTrace();
        //     // }
            System.out.println(Thread.currentThread().getName()+"thread started");  
            System.out.println(Thread.currentThread().getName()+"thread ended");  
            // Thread.yield();
        // }
       
   
    }
    }  
