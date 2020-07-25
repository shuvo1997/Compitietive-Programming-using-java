import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class universal_solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //FastReader sc = new FastReader();
        //PrintWriter pw = new PrintWriter(System.out);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String s = sc.next();
            StringBuilder ans = new StringBuilder();
            int rocks = 0;
            int scissors = 0;
            int papaers = 0;

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'R'){
                    rocks++;
                }
                else if(s.charAt(i) == 'P'){
                    papaers++;
                }
                else {
                    scissors++;
                }
            }
            if((rocks == papaers) && (papaers == scissors)){
                for (int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) == 'R')
                        ans.append("P");
                    else if(s.charAt(i) == 'P')
                        ans.append("S");
                    else
                        ans.append("R");
                }
            }
            else {
                int max = Math.max(rocks, Math.max(papaers, scissors));
                if (max == rocks){
                    for (int i = 0; i < s.length()/2; i++) {
                        ans.append("PP");
                    }
                    if(s.length()%2 != 0){
                        ans.append("P");
                    }
                }
                else if(max == papaers){
                    for (int i = 0; i < s.length()/2; i++) {
                        ans.append("SS");
                    }

                    if(s.length()%2 != 0){
                        ans.append("S");
                    }
                }
                else {
                    for (int i = 0; i < s.length()/2; i++) {
                        ans.append("RR");
                    }

                    if(s.length()%2 != 0){
                        ans.append("R");
                    }
                }
            }
           System.out.println(ans);

        }
        //pw.close();
    }

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
}
