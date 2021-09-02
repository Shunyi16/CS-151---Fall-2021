package GitTesting;

public class SecondClass {
    public static void main(String[] args) {
            String name = makeChange(" Shunyi");
            String greet = greeting( "How are you?");
            String passWord1 = PassWord.password1;
        System.out.println(name);
        System.out.println(greet);
    }
    private static String makeChange(String name){
        return "Hello" + name;
    }
    private static String greeting(String greeting){
        return greeting;
    }
}
