import java.io.*;

/*     J = 8
       K = 13
       L = 34
       M = 19
       N = 74
       O = 6
       N = 74*/


class Process{
    int pid;
    int burst_time;
    int arrival_time;
    Process(int pid,int burst_time,int arrival_time){
        this.pid = pid;
        this.burst_time = burst_time;
        this.arrival_time = arrival_time;
    }
}

public class FCFS{
    static File input = new File("E:\\Hredoy\\input.txt");
    static BufferedReader br;

    static {
        try {
            br = new BufferedReader(new FileReader(input));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static File output = new File("E:\\Hredoy\\output1.txt");
    static PrintWriter pw;

    static {
        try {
            pw = new PrintWriter(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    static void fcfsWaitingTime(Process[] proc, int n, int wt[])
    {
        int service_time[] = new int[n];
        service_time[0] = 0;
        wt[0] = 0;

        for (int i = 1; i < n ; i++)
        {
            service_time[i] = service_time[i-1] + proc[i].burst_time;

            wt[i] = service_time[i] - proc[i].arrival_time;

            if (wt[i] < 0)
                wt[i] = 0;
        }
    }

    static void fcfsTurnAroundTime(Process[] proc, int n, int wt[], int tat[])
    {
        for (int i = 0; i < n ; i++)
            tat[i] = proc[i].burst_time + wt[i];
    }

    static void fcfsavgTime(Process[] proc, int n)
    {
        int wt[] = new int[n], tat[] = new int[n];

        fcfsWaitingTime(proc, n, wt);

        fcfsTurnAroundTime(proc, n, wt, tat);
        pw.println("FCFS");
        pw.print("Processes " + " Burst Time " + " Arrival Time " + " Waiting Time " + " Turn-Around Time " + " Completion Time \n");
        int total_wt = 0, total_tat = 0;
        for (int i = 0 ; i < n ; i++)
        {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
            int completion_time = tat[i] + proc[i].arrival_time;
            pw.println(i+1 + "\t\t\t" + proc[i].burst_time + "\t\t\t" + proc[i].arrival_time + "\t\t\t\t" + wt[i] + "\t\t\t\t" + tat[i] + "\t\t\t\t" + completion_time);
        }

        pw.print("Average waiting time = "+ (float)total_wt / (float)n);
        pw.print("\nAverage turn around time = "+ (float)total_tat / (float)n);
        pw.println();
    }
    static void SJFWaitingTime(Process proc[], int n,
                               int wt[])
    {
        int rt[] = new int[n];
        for (int i = 0; i < n; i++)
            rt[i] = proc[i].burst_time;

        int complete = 0, t = 0, minm = Integer.MAX_VALUE;
        int shortest = 0, finish_time;
        boolean check = false;
        while (complete != n) {

            for (int j = 0; j < n; j++)
            {
                if ((proc[j].arrival_time <= t) &&
                        (rt[j] < minm) && rt[j] > 0) {
                    minm = rt[j];
                    shortest = j;
                    check = true;
                }
            }

            if (check == false) {
                t++;
                continue;
            }

            rt[shortest]--;
            minm = rt[shortest];
            if (minm == 0)
                minm = Integer.MAX_VALUE;

                if (rt[shortest] == 0) {
                    complete++;
                    check = false;

                    finish_time = t + 1;
                    wt[shortest] = finish_time -
                        proc[shortest].burst_time -
                        proc[shortest].arrival_time;

                if (wt[shortest] < 0)
                    wt[shortest] = 0;
            }
            t++;
        }
    }
    static void SJFTurnAroundTime(Process proc[], int n,
                                  int wt[], int tat[])
    {
        for (int i = 0; i < n; i++)
            tat[i] = proc[i].burst_time + wt[i];
    }

    static void SJFavgTime(Process proc[], int n)
    {
        int wt[] = new int[n], tat[] = new int[n];
        int total_wt = 0, total_tat = 0;

        SJFWaitingTime(proc, n, wt);

        SJFTurnAroundTime(proc, n, wt, tat);

        pw.println("SJF");
        pw.println();
        pw.println();
        pw.println("Processes " +
                " Burst time " +
                " Waiting time " +
                " Turn around time");

        for (int i = 0; i < n; i++) {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
          pw.println(" " + proc[i].pid + "\t\t\t\t"
                    + proc[i].burst_time + "\t\t\t" + wt[i]
                    + "\t\t\t" + tat[i]);
        }

        pw.println("Average waiting time = " +
                (float)total_wt / (float)n);
        pw.println("Average turn around time = " +
                (float)total_tat / (float)n);
        pw.println();
    }


    public static void main(String args[]) throws IOException {

        int noofproc = Integer.parseInt(br.readLine());

        int N = 1;
        for(int j=0; j<N; j++) {
            pw.println("Test no:"+(j+1));
            br.readLine();
            Process[] proc = new Process[noofproc];
            for (int i = 0; i < 8; i++) {
                int bt = Integer.parseInt(br.readLine());
                int at = Integer.parseInt(br.readLine());
                proc[i] = new Process(i + 1, bt, at);
            }
            SJFavgTime(proc,proc.length);
        }
        pw.close();
    }
}
