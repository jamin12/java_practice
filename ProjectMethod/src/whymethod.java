import java.io.FileWriter;
import java.io.IOException;

public class whymethod {

    public static void printTwoTimes(String Text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(Text);
        System.out.println(Text);
    }

    public static void WriteTwoTimes(String Text, String delimiter) {
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write(delimiter + "\n");
            fw.write(Text + "\n");
            fw.write(Text + "\n");
            fw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        printTwoTimes("a", "-");
        printTwoTimes("a", "*");
        printTwoTimes("a", ")(");

    }
}
