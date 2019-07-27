/*
 * Challenge: the Havel-Hakimi algorithm

Remove all 0's from the sequence (i.e. warmup1). Done.

If the sequence is now empty (no elements left), stop and return true. Done.

Sort the sequence in descending order (i.e. warmup2). Done.


If N is greater than the length of this new sequence (i.e. warmup3), stop and return false. Done.

Subtract 1 from each of the first N elements of the new sequence (i.e. warmup4).

Continue from step 1 using the sequence from the previous step.
 */
package havelhalmiki;
import java.util.*;

public class HavelHalmiki {
	public static void main(String args[]) {
		int[] havarr;
		int[] firarr;
		int[] secarr;
		int n=0,i=0,k=0,index=0,bb=0;
		System.out.println("Input number of numbers:\t");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		havarr = new int[n];
		for(i=0;i<n;i++) {
			System.out.println("Enter the "+ i + " number:");
			havarr[i]=scan.nextInt();
		}
		for(i=0;i<n;i++) {
			if(havarr[i]==0) {	
				index++;
			}
		}
		firarr = new int[n-index];
		for(i=0,k=0;i<n;i++) {
			if(havarr[i]!=0) {
				firarr[k]=havarr[i];
				k++;
			}
			else {
				continue;
			}
		}
		if(index!=n) {
			for(i=0;i<firarr.length;i++) {
			for(k=0;k<firarr.length;k++){
				if(firarr[i]>firarr[k]) {
					bb=firarr[i];
					firarr[i]=firarr[k];
					firarr[k]=bb;	
				}
			}
		}
		scan.close();
		System.out.println("Updated array is : \t");	
		for(i=0;i<k;i++) {
			System.out.print(firarr[i]+"\t");
		}
	
		System.out.println("\nThird warmup array: \t");
		secarr=new int[k-1];
		for(i=0;i<k-1;i++) {
			secarr[i]=firarr[i+1];
		}
		for(i=0;i<k-1;i++) {
			System.out.print(secarr[i]+"\t");
		}
		int N = firarr[0];
		if(N>secarr.length) {
			System.out.println("\nFalse");		
			return;
		}
		for(i=0;i<k-1;i++) {
			secarr[i]=secarr[i]-1;
		}
		}
		else{
		System.out.println("true");
		}
	}
		
}


