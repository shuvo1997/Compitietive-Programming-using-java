import java.io.*;

public class matrix {
    static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Reader s = new Reader();
        StringBuffer sb = new StringBuffer();
        int n = s.nextInt();
        int m = s.nextInt();
        int k = s.nextInt();
        int[][] mat = new int[n][m];
        while (k!=0){
            int qu = s.nextInt();
            if(qu == 1){
                int row = s.nextInt();
                int val = s.nextInt();
                for (int i=0; i<m-2; i = i+3){
                    mat[row-1][i] = val;
                    mat[row-1][i+1] = val;
                    mat[row-1][i+2] = val;
                }
                if(m%2 != 0){
                    mat[row-1][m-1] = val;
                }
            }else {
                int col = s.nextInt();
                int val = s.nextInt();
                for (int i=0; i<n-1; i = i+2){
                    mat[i][col-1] = val;
                    mat[i+1][col-1] = val;
                }
                if(n%2 != 0){
                    mat[n-1][col-1] = val;
                }
            }
            k--;
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                sb.append(mat[i][j]+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
