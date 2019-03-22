package Algorithms;




public class CSCAN
{
    public CSCAN(int[] Queue,int IH,int PH, int TT)
    {
        int n = Queue.length;
        int dl=0,seek_time=0,i,j,f=0;
        int[] visited = new int[n+1];

        System.out.println("Disk Location \t Seek Time");

        if(PH<=IH) f=0;
        else f=1;

        for(i=0;i<n;i++)
        {
                int pos = -1;
                int min = 10000;
                for(j=0;j<n;j++)
                {
                        if(f==0)
                        {
                                if(Queue[j]>IH && min>Queue[j]-IH && visited[j]==0)
                                {
                                        min = Queue[j] - IH;
                                        pos = j;
                                }
                        }

                        else if(f==1)
                        {
                                if(Queue[j]<=IH && min>IH-Queue[j] && visited[j]==0)
                                {
                                        pos = j;
                                        min = IH-Queue[j];
                                }
                        }
                }
                //System.out.println(pos);
                if(pos==-1)
                {
                        if(f==0)
                        {
                                seek_time += Math.abs(TT - IH);
                                System.out.println(TT+"\t\t "+seek_time);
                                IH = 0;
                        }
                        else 
                        {
                                seek_time += Math.abs(0 - IH);
                                System.out.println(0+"\t\t "+seek_time);
                                IH = TT;
                        }
                        System.out.println("-------------------------------------------------");
                        System.out.println("Changing Directions");
                        System.out.println("-------------------------------------------------");
                        System.out.println("Disk Location \t Seek Time");
                        i--;
                        continue;
                }
                visited[pos] = 1;
                seek_time += Math.abs(Queue[pos] - IH);
                System.out.println(Queue[pos]+"\t\t "+seek_time);
                IH = Queue[pos];
        }

        System.out.println();
        System.out.println("Total Seek Time :"+seek_time);
    }
}