import java.util.ArrayList;
public class testActivitySelection{	
	static int randomInt(int hi){
		return (int)(Math.random()*100) % hi;
	}

	static void printActivities(Activity[] ar){
		System.out.println("Activity i	startTime	finishTime");	
		for( int i = 0 ; i < ar.length; i++)
			System.out.println(ar[i]);	
	}
	
	public static void main(String argv[])	for( int i = 0 ; i < size; i++)	{
			int activityNr = i+1;	
			int finishTime = i + 4; 
			int random = randomInt(finishTime+1);
			int startTime = finishTime - (random ==0 ? 1 : random); 
			S[i] = new Activity(activityNr, startTime, finishTime); 
			/* ensure startTime<finishTime and startTime is non-negative*/
		} /* already sorted by finish time when generated */
		
		
		printActivities(S);
		ArrayList<Activity> A = activitySelection.activitySelection(S);	
		System.out.println("**** scheduled acitivities(max) *****"); 
		for( Activity act: A){ 
			System.out.println(act);		
		}
	}
}
