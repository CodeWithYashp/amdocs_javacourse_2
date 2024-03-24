public class Method_overloading {
    static int add(int x, int y){
        return x + y;
    }
    static double add(double x, double y){
        return x + y;
    }
    public static void main(String[] args){
        int myTotal = add(5, 7);
        double myTot = add(2.2, 7.8);
        System.out.println(myTotal);
        System.out.println(myTot);
    }
}
