public class Main {

    public static void main(String[] args) {
        StackTraceElement[] stack = add(10, 15);
        for (StackTraceElement element :stack) {
            System.out.println(element);
        }
    }

    public static StackTraceElement[] add(int a, int b) {
        System.out.println();
        return Thread.currentThread().getStackTrace();
    }
}