public class AuthApp2 {
    public static void main(String[] args) {
        String id = "egoing";
        String inputId = args[0];

        String pass = "1111";
        String pass2 = "2222";
        String inputPass = args[1];
        System.out.println("hi");

        // // if (inputId == id) {
        // if (inputId.equals(id)) {
        // if (inputPass.equals(pass)) {
        // System.out.println("master");
        // } else {
        // System.out.println("Wrong password");
        // }
        // } else {
        // System.out.println("Who are you?");
        // }

        boolean isRight = (inputPass.equals(pass) || inputPass.equals(pass2));
        if (inputId.equals(id) && isRight) {
            System.out.println("master");
        } else {
            System.out.println("Who are you?");
        }
    }
}
