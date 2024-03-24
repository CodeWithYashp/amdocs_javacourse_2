public class MultiThread extends Thread{
    public static void main(String[] args){
        MultiThread Thread = new MultiThread();
        Thread.start();
        System.out.println("Outside of thread");
    }
    public void run(){
        System.out.println("Code is running in a thread");
    }
}
