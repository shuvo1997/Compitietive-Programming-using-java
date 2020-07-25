/*
import java.util.Scanner;

class Process1
{
    int pid; // Process ID
    int burst_time; // Burst Time
    int arrival_time; // Arrival Time

    public Process(int pid, int burst_time, int arrival_time)
    {
        this.pid = pid;
        this.burst_time = burst_time;
        this.arrival_time = arrival_time;
    }
}

public class SJF
{
    // Method to find the waiting time for all
    // processes
    static void SJFWaitingTime(Process proc[], int n,
                                int wt[])
    {
        int rt[] = new int[n];

        // Copy the burst time into rt[]
        for (int i = 0; i < n; i++)
            rt[i] = proc[i].burst_time;

        int complete = 0, t = 0, minm = Integer.MAX_VALUE;
        int shortest = 0, finish_time;
        boolean check = false;

        // Process until all processes gets
        // completed
        while (complete != n) {

            // Find process with minimum
            // remaining time among the
            // processes that arrives till the
            // current time`
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

            // Reduce remaining time by one
            rt[shortest]--;

            // Update minimum
            minm = rt[shortest];
            if (minm == 0)
                minm = Integer.MAX_VALUE;

            // If a process gets completely
            // executed
            if (rt[shortest] == 0) {

                // Increment complete
                complete++;
                check = false;

                // Find finish time of current
                // process
                finish_time = t + 1;

                // Calculate waiting time
                wt[shortest] = finish_time -
                        proc[shortest].burst_time -
                        proc[shortest].arrival_time;

                if (wt[shortest] < 0)
                    wt[shortest] = 0;
            }
            // Increment time
            t++;
        }
    }

    // Method to calculate turn around time
    static void SJFTurnAroundTime(Process proc[], int n,
                                   int wt[], int tat[])
    {
        // calculating turnaround time by adding
        // proc[i].burst_time + wt[i]
        for (int i = 0; i < n; i++)
            tat[i] = proc[i].burst_time + wt[i];
    }

    // Method to calculate average time
    static void SJFavgTime(Process proc[], int n)
    {
        int wt[] = new int[n], tat[] = new int[n];
        int total_wt = 0, total_tat = 0;

        // Function to find waiting time of all
        // processes
        SJFWaitingTime(proc, n, wt);

        // Function to find turn around time for
        // all processes
        SJFTurnAroundTime(proc, n, wt, tat);

        // Display processes along with all
        // details
        System.out.println("Processes " +
                " Burst time " +
                " Waiting time " +
                " Turn around time");

        // Calculate total waiting time and
        // total turnaround time
        for (int i = 0; i < n; i++) {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
            System.out.println(" " + proc[i].pid + "\t\t"
                    + proc[i].burst_time + "\t\t " + wt[i]
                    + "\t\t" + tat[i]);
        }

        System.out.println("Average waiting time = " +
                (float)total_wt / (float)n);
        System.out.println("Average turn around time = " +
                (float)total_tat / (float)n);
    }

    // Driver Method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] processes = {1,2,3,4};
        int[] burst_time = {6,8,7,3};
        int[] arrival_time = {1,1,2,3};

        Process proc[] = { new Process(sc.nextInt(), 6, 1),
                new Process(2, 8, 1),
                new Process(3, 7, 2),
                new Process(4, 3, 3)};

        SJFavgTime(proc, proc.length);
    }
}
*/
