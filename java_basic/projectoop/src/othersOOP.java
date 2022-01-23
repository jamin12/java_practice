import java.io.FileWriter;
import java.io.IOException;

public class othersOOP {
    public static void main(String[] args) throws IOException {
        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.write(" java");
        f1.close();

    }
}
