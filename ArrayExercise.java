//learning to make a 2d array


/*January = $37
  February = $29
  March = $67
  April = $12
  May = $45
  June = $68
  July = $72
  August = $19
  September = $23
  October = $45
  November = $21
  December = $15 */

public class ArrayExercise {
	
	public static void main(String[] args) {
		
		int revenueArray[][] = new int[12][2];

		revenueArray[0] [0] =  1; //setting the month with numerical value ie 1=January
		revenueArray[1] [0] =  2;
		revenueArray[2] [0] =  3;
		revenueArray[3] [0] =  4;
		revenueArray[4] [0] =  5;
		revenueArray[5] [0] =  6;
		revenueArray[6] [0] =  7;
		revenueArray[7] [0] =  8;
		revenueArray[8] [0] =  9;
		revenueArray[9] [0] = 10;
		revenueArray[10][0] = 11;
		revenueArray[11][0] = 12;

		revenueArray[0] [1] = 37;  //setting column 2 with money made in sales
		revenueArray[1] [1] = 29;
		revenueArray[2] [1] = 67;
		revenueArray[3] [1] = 12;
		revenueArray[4] [1] = 45;
		revenueArray[5] [1] = 68;
		revenueArray[6] [1] = 72;
		revenueArray[7] [1] = 19;
		revenueArray[8] [1] = 23;
		revenueArray[9] [1] = 45;
		revenueArray[10][1] = 21;
		revenueArray[11][1] = 15;
		

		for(int i=0; i<=11; i++){     //looping through the months
			System.out.println("For month number " + revenueArray[i][0] + " revenue was $" + revenueArray[i][1]);
		}
	}
}
		