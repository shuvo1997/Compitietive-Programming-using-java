import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class fashionablee {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) throws IOException {
       // Reader sc = new Reader();
       // Scanner sc = new Scanner(System.in);
        FastReader sc = new FastReader();
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            StringBuilder s = new StringBuilder(sc.next());
            int numberofzeros = 0;
            boolean flag = false;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '1'){
                    flag = true;
                }
                if(s.charAt(i) == '0' && flag){
                    numberofzeros++;
                }
            }
            //System.out.println(numberofzeros);
            for (int i = 0; i < s.length()-1; ) {
                if(s.charAt(i) == '1' && s.charAt(i+1) == '0'){
                    if(numberofzeros != 1){
                        s.deleteCharAt(i+1);
                        numberofzeros--;
                        continue;
                    }
                    else {
                        s.deleteCharAt(i);
                  //      System.out.println("In else block"+s);
                        if(i >= 1){
                            i--;
                        }
                        else
                            i=0;
                        continue;
                    }
                }
                //System.out.println(s);
                //System.out.println(s.length());
                i++;
            }
            System.out.println(s);
        }
    }
}
