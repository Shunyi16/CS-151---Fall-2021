package GitTesting;

public class SecondClass {
    public static void main(String[] args) {
        String name = makeChange(" Shunyi");
        System.out.println(name);
    }
    private static String makeChange(String name){
        return "Hello" + name;
    }
}
