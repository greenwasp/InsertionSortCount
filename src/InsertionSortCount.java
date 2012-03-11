import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Input{
	private int listCount;
	private int listMembers[];
	private int swapCounter;
	
	Input(){
		listCount = 0;
		swapCounter = 0;
	}
	
	public void SetListCount(int x){
		listCount = x;
	}
	
	public void SetListMembers(int[] arr){
		listMembers = new int[listCount];
		for (int i = 0; i < arr.length; i++) {
			listMembers[i] = arr[i];
		}
		
	}
	
	public void PrintInputs(){
		System.out.println("The number of inputs are "+listCount);
	
	}
	private void SetSwapCounter(int x){
		swapCounter = x;
	}
	
	public void ProcessOutput(){
		int j= 0;
		int counter = 0;
		for (int i = 2; i <= listCount; i++) {
			j = i;
			while(j > 1 && (listMembers[j] < listMembers[j-1])){
				listMembers[j-1] = listMembers[j];
				counter = counter + 1;
				j = j-1;
			}
			
		}
		SetSwapCounter(counter);
	}
}
	

public class InsertionSortCount {
	 int NoOfTestCases;
	
	InsertionSortCount(){
		NoOfTestCases = 0;
	}
	
	private void SetNoOfTestCases(int x){
		NoOfTestCases = x;
		
		
	}
	
	
	
	public static void main(String[] args){
		InsertionSortCount ISC1 = new InsertionSortCount();
		String line1 = null;
		int inp1=0;
		int inp2=0;
		int counter = 0;
	//	try{
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//line1 = br.readLine();
			Scanner sc = new Scanner(System.in);
			inp1 = sc.nextInt();
			//inp1 = Integer.parseInt(line1);
			
			ISC1.SetNoOfTestCases(inp1);
			
			for (int i = 0; i < inp1; i++) {
				Input I = new Input();
				
				Scanner sc1 = new Scanner(System.in);
				int listCount = sc1.nextInt();
				I.SetListCount(listCount);
				
				Scanner sc2 = new Scanner(System.in);
				int tempList[] = new int[listCount];
				for (int j = 0; j < listCount; j++) {
					tempList[j] = sc2.nextInt();
				}
				I.SetListMembers(tempList);
				//I.PrintInputs();
			
			}
			
	/*	
			for (int i = 0; i < inp1; i++) {
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				line1 = br1.readLine();
				inp2 = Integer.parseInt(line1);
				
				Scanner s = new Scanner(System.in);
				int[]tempInpArri = new int[inp2];
				for (int j = 0; j < inp2; j++) {
					if(s.hasNextInt()){
						tempInpArri[j] = s.nextInt();
					}
				}
				counter = 0;
				for (int j = 2; j <= tempInpArri.length; j++) {
					int k = j;
					
					while(k > 1 && tempInpArri[k] < tempInpArri[k-1]){
						tempInpArri[k-1] = tempInpArri[k];
						counter = counter + 1;
						k = k-1;
					}
				}
				System.out.println("The swap count is " +counter);
			}
			
		}
		catch(IOException ex){
			System.out.println("IO Error. Program will exit!");
	    	System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException ex){
			throw ex;
		}*/
	}
}
