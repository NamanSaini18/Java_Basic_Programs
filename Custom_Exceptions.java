public class Mythread extends Thread {
    public static Thread obj;
    public void run()
    {
        try{
            obj.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        for(int i=0; i<10;i++){
            System.out.println("Currently in mythread class");
        }
    }
}
class Test{
    public static void main(String[] args) {
        Mythread.obj = Thread.currentThread();
        Mythread obj1 = new Mythread();
        obj1.start();
        for(int i=0;i<10;i++){
            System.out.println("Currently in main thread");
        }

    }
}
