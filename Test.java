import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\input.txt");
        BufferedReader input = new BufferedReader(new FileReader(f));
        PrintWriter pw = new PrintWriter("E:\\output.txt");
        String st;
        while ((st = input.readLine()) != null){
            pw.println(st);
        }
        pw.close();

    }
}
