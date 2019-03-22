package Algorithms;

import java.util.Arrays;

/******************
 * @author Lalwani*
 ******************/

public class CLOOK {



	public CLOOK(int[] Queue,int IH,int PH)
	{
		int n = Queue.length,max_loc=0,min_loc=10000;
		int seek_time=0,i,j,f=0,d=0;
                
		Arrays.sort(Queue);
                min_loc = Queue[0];
                max_loc = Queue[n-1];
		
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
				if(d==1)
				{
					if(Queue[j] == IH) 
					{
						pos=j;
						break;
					}
				}
				else
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
			}
			//System.out.println(pos);
			if(pos==-1)
			{
				if(f==0)
				{
					IH = min_loc;
					//System.out.println(IH);
					d=1;
				}
				else 
				{
					IH = max_loc;
					//System.out.println(IH);
					d=1;
				}
				System.out.println("-------------------------------------------------");
				System.out.println("Changing Directions");
				System.out.println("-------------------------------------------------");
				System.out.println("Disk Location \t Seek Time");
				i--;
				continue;
			}
			visited[pos] = 1;
			if(d==0) seek_time += Math.abs(Queue[pos] - IH);
			else if(d==1) d=0;
			System.out.println(Queue[pos]+"\t\t "+seek_time);
			IH = Queue[pos];
		}
		
		System.out.println();
		System.out.println("Total Seek Time :"+seek_time);
	}
}
