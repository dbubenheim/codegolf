package codesignal;

public class ArithmeticProgression2 {

    static int arithmeticProgression(int e, int f, int n) {
        return e - (e - f) * (n - 1);
    }

    public static void main(String[] args) {
        System.out.println(arithmeticProgression(2,3,4));
    }
}