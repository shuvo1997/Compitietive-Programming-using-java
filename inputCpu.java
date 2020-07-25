/*     J = 8
       K = 13
       L = 34
       M = 19
       N = 74
       O = 6
       N = 74*/


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class inputCpu {
    public static void main(String[] args) throws FileNotFoundException {
        int[] processes = new int[8];
        int[] burst_time = new int[8];
        int[] arrival_time = new int[8];
        Random r = new Random();
        File file = new File("E:\\Hredoy\\input.txt");
        PrintWriter pw = new PrintWriter(file);

        //Number of processes
        pw.println(processes.length);
        int n = 74;
        while (n>0) {
            pw.println("Test case:"+(75-n));
            for (int i = 0; i < processes.length; i++) {
                processes[i] = i + 1;
            }
            for (int i = 0; i < processes.length; i++) {
                burst_time[i] = 1 + r.nextInt(12);
                pw.println(burst_time[i]);
            }
            for (int i = 0; i < processes.length; i++) {
                arrival_time[i] = r.nextInt(34);
                pw.println(arrival_time[i]);
            }
            n--;
        }
        pw.close();
    }
}
