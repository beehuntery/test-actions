public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    
    // 2つの数値を足して結果を返す関数
    public static int add(int a, int b) {
        return a + b;
    }
    
    // 2つの数値を引いて結果を返す関数
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    // 2つの数値を掛けて結果を返す関数
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    // 2つの数値を割って結果を返す関数。bが0の場合は例外を投げる。
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}
