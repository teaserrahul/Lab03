package Day1;
import java.lang.Math;
import java.util.*;

public class Prog {
	static double calcDistance(int a1, int b1, int a2, int b2)
	{
		return Math.sqrt(((a1-a2)*(a1-a2)) + ((b1-b2)*(b1-b2)));
	}
			
	public static void main(String[] args) 
	{
		int x, y;
		Scanner inp = new Scanner(System.in);
		
		for(int j = 0; j<3; j++) 
		{
			
			x = inp.nextInt();
			y = inp.nextInt();
		
			double d1 = calcDistance(100, 0, x, y);
			double d2 = calcDistance(0, 100, x, y);
			double d3 = calcDistance(90, 17, x, y);
			double d4 = calcDistance(21, 80, x, y);
		
			double[] distance = {d1, d2, d3, d4};
		
			double min = distance[0];
			for(int i = 1; i<distance.length; i++)
			{
				if(distance[i] < min)
					min = distance[i];
			}
		
			if(min == d1 || min == d3)
				System.out.println("Action");
			else
				System.out.println("Comedy");
		
		}
	}

}
