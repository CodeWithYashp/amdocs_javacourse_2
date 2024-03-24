//When multiple threads are running at the same time there is no way to determine which thread is executing
public class Concurrency_Problems extends Thread {
    public static int amount = 0;
    public static void main(String[] args){
        Concurrency_Problems thread = new Concurrency_Problems();
        thread.start();
        while (thread.isAlive()){
            System.out.println("Waiting...");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run(){
        amount++;
    }
}
