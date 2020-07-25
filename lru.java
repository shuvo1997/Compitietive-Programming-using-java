import java.io.*;
public class lru {
    File file = new File("E:\\input.txt");
    BufferedReader input = new BufferedReader(new FileReader(file));
    PrintWriter pw = new PrintWriter("E:\\output.txt");

    int n, page[], f, frames[], faults, count;
    double rate;

    public lru() throws IOException{
        n=Integer.parseInt(input.readLine());
        page=new int[n];
        f=Integer.parseInt(input.readLine());
        frames=new int[f];
        count=1;
    }

    void reset()
    {
        int j;
        for(j=0;j<f;j++)
            frames[j]=0;
        faults=0;
        count=1;
    }



    void read() throws IOException
    {
        int i;
        for(i=0;i<n;i++)
        {
            page[i]=Integer.parseInt(input.readLine());
        }
        for(i=0;i<f;i++)
            frames[i]=-1;
    }



    void lru()
    {
        int i,j,duration[],max;
        reset();
        duration=new int[f];
        boolean found=false;
        for(i=0;i<n;i++)
        {
            for(j=0;j<f;j++)
                duration[j]++;
            for(j=0;j<f;j++)
            {
                if(page[i]==frames[j])
                {
                    found=true;
                    duration[j]=0;
                }
            }
            if(found==false)
            {
                max=0;
                for(j=0;j<f;j++)
                {
                    if(duration[j]>duration[max])
                        max=j;
                }
                frames[max]=page[i];
                duration[max]=0;
                faults++;
            }

            display();
            found=false;

        }
        pw.println("Number of page faults = "+faults);
        pw.println("Avarage Number of Fault = "+(faults*1.0/n));

    }
    void opt()
    {
        int i,j=0,k,duration[],max,flag[];
        reset();
        duration=new int[f];
        flag=new int[f];
        boolean found=false;

        for(i=0;i<n;i++)
        {
            for(j=0;j<f;j++)
            {
                flag[j]=0;
                duration[j]=n;
            }

            for(k=i+1;k<n;k++)
            {
                for(j=0;j<f;j++)
                    if(page[k]==frames[j]&&flag[j]==0)
                    {
                        duration[j]=k;
                        flag[j]=1;
                    }
            }

            for(j=0;j<f;j++)
                if(page[i]==frames[j])
                    found=true;
            if(found==false)
            {
                max=0;
                for(j=0;j<f;j++)
                {
                    if(duration[j]>duration[max])
                        max=j;
                    if(frames[j]<0)
                    {
                        max=j;
                        break;
                    }
                }
                frames[max]=page[i];
                faults++;
            }

            display();
            found=false;

        }
        pw.println("Number of page faults = "+faults);
        pw.println("Avarage Number of Page Fault = "+(faults*1.0/n));
        pw.close();
    }


    void display()
    {
        int i;
        pw.print("Page frame "+count+" :");
        for(i=0;i<f;i++)
        {
            if(frames[i]==-1)
                pw.print(" -");
            else
                pw.print(" "+frames[i]);
        }
        pw.print("\n");
        count++;
    }
    public static void main(String[] args) throws IOException{
        lru p=new lru();
        p.read();
        p.lru();
        p.opt();

    }

}