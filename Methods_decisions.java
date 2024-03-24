public class Methods_decisions {
    static void checkAge(int age){
        if(age <= 18){
            System.out.println("Access Denied!");
        }else if(age <= 0){
            System.out.println("Please enter a valid age!");
        }else{
            System.out.println("Access Granted");
        }
    }
    public static void main(String[] args){
        checkAge(12);
    }
}
