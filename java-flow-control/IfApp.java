public class IfApp {
    public static void main(String[] args) {
        System.out.println("a");
        if (false) {
            System.out.println(1);

        } else if (true) {
            System.out.println("b");
        } else {
            System.out.println(3);
        }
        System.out.println(2);
    }
}
