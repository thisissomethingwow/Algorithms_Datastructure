public class Recursion {
    public double sumOfInteger(int n){
        if (n==0){
            return 0;
        }
        return n%10 + sumOfInteger(n/10);

    }

    public String decimalToBinary(int n){
        if (n==0){
            return "0";
        }
        return decimalToBinary(n/2)+n%2;
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.sumOfInteger(110));
        System.out.println(recursion.decimalToBinary(100000));

    }
}


