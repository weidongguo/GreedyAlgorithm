import java.util.ArrayList;

class Activity{
	int activityNr;// the activity number;
	int startTime; // start time of the activity;
	int finishTime;  // end time of the activity;
	public Activity(int aNr, int s, int f){
		activityNr = aNr;
		startTime = s;
		finishTime = f;
	}
	public String toString(){
		return ( activityNr + "		" + startTime + "		" + finishTime);
	}
}


public class activitySelection {
	/* ************* activitySelection() ******************************
	 * Use greedy algorithm in selecting activities to maximize the   *
	 * number of activities being scheduled 													*
	 * ****************************************************************/
	public static ArrayList<Activity> activitySelection(Activity S[]){
		int n = S.length;		
		ArrayList<Activity> A = new ArrayList<Activity>(); //new container for maximum number of activities that can be scheduled;
		A.add(S[0]);	// first off, 
									// add the acitivity that has the earliest finish time
									// it's part of the greedy algorithm;	
		int lastAddedActivityIndex = 0; // in terms of the array S;	
		for(int i = 1; i < n; i++){ // O(n);
			/* pick the compatible activity with the earliest finish time */
			if(S[i].startTime >= S[lastAddedActivityIndex].finishTime){
				A.add(S[i]); // add the compatible activity into the new container
				lastAddedActivityIndex = i; // update the last added activity index
			}
		}
		return A;
	} // T(n) = O(n);
}

