package Algorithms;

/******************
 * @author Lalwani*
 ******************/
public class LOOK {
	public LOOK(int[] Queue,int IH,int PH)
	{
		int dl=0,seek_time=0,i,j,f=0,n=Queue.length;
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
				//System.out.println(Queue[j]+"/"+IH);
				if(f==0)
				{
					//System.out.println(Math.abs(Queue[j] - IH)+"//");
					if(Queue[j]>IH && min>Math.abs(Queue[j]-IH) && visited[j]==0)
					{
						//System.out.println(Math.abs(Queue[j] - IH));
						min = Math.abs(Queue[j] - IH);
						pos = j;
					}
				}
				
				else if(f==1)
				{
					if(Queue[j]<=IH && min>Math.abs(Queue[j]-IH) && visited[j]==0)
					{
						//System.out.println(Math.abs(Queue[j] - IH));
						pos = j;
						min = Math.abs(Queue[j]-IH);
					}
				}
			}
			//System.out.println(pos);
			if(pos==-1)
			{
				if(f==0)
				{
					f=1;
				}
				else 
				{
					f=0;
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
