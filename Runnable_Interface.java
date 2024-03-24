public class Runnable_Interface implements Runnable{
    public static void main(String[] args){
        Runnable_Interface obj = new Runnable_Interface();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("Outside of a thread");
    }

    public void run(){
        System.out.println("Inside a thread");
    }
}
