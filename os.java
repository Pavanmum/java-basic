import java.io.*;
import java.util.*;
class job implements Runnable
{
    int process_id, no_of_instr,time_quantum;
    long millis;
    Thread t;
    job(int pid, int instr, int tq)
    {
        millis= System.currentTimeMillis();
        process_id = pid;
        no_of_instr = instr;
        time_quantum = tq;
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
        try
        {
            for(int i=1;i<=no_of_instr;i++)
            {
                Thread.sleep(time_quantum);
            }
            millis= System.currentTimeMillis() - millis;
            os.millitime = os.millitime + millis;
            System.out.println("Job " + process_id + " with " + no_of_instr + " instructions has completed in "+ millis +" milliseconds");
        }
        catch(InterruptedException e)
        {
            System.out.println("The job has been interrupted...");
        }
    }
}
class os
{
    static long millitime = 0;
    static int process_id=100, time_quantum = 100;
    public static void main(String args[])
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a user process starting number:");
            process_id = Integer.parseInt(br.readLine());
            System.out.println("Enter a time quantum(in millis);"); time_quantum = Integer.parseInt(br.readLine());
            job j1 = new job(++process_id, 25, time_quantum);
            job j2 = new job(++process_id, 15, time_quantum);
            job j3 = new job(++process_id, 9, time_quantum);
            Thread mainthread=Thread.currentThread();
            mainthread.sleep(3000);
            System.out.println("Average turn around time = " + (millitime)/3.0f);
        }
        catch(Exception e)
        {
            System.out.println("Some process failed to complete...");
            System.out.println("Plz contact system admin...");
        }
    }
}