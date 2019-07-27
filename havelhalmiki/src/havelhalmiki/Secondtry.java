package havelhalmiki;
import java.util.*;
public class Secondtry {
	public static void main(String[] args) {
		
		int l=0;
		System.out.println("input the length:\t");
		Scanner scan = new Scanner(System.in);
		l=scan.nextInt();
		array(l);
		scan.close();
		
		
	}
	public static void array(int x) {
		int[] firarr;
		firarr = new int[x];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(int i=0;i<x;i++) {
			firarr[i]=scan.nextInt();
		}
		System.out.println("Array input is:");
		for(int i=0;i<x;i++) {
			System.out.print(firarr[i]+"\t");
		}
		int l = firarr.length;
		scan.close();
		wrmup2(firarr,l);
	}
	public static void wrmup2(int[] brr,int x) {
		int temp=0;
		for(int i=0;i<x;i++) {
			for(int k=0;k<x;k++)
			if(brr[i]<brr[k]) {
				temp=brr[i];
				brr[i]=brr[k];
				brr[k]=temp;
			}
		}
		System.out.println("\nSorted array is:");
		for(int i=0;i<x;i++) {
			System.out.print(brr[i]+"\t");
		}
		wrmup1(brr,x);
	}
	public static void wrmup1(int[] arr,int y) {
		int index=0,k=0,i=0;
		int[] wrm1;
		for(i=0;i<y;i++) {
			if(arr[i]==0) {
				index++;
			}	
		}
		System.out.println("\nNumber of zeroes :\t"+index);
		wrm1 = new int[y-index];
		if(index!=y) {
		for(i=0,k=0;i<y;i++) {
			if(arr[i]!=0) {
				wrm1[k]=arr[i];
				k++;
			}
			else {
				continue;
			}
		}
		System.out.println("\nWarmup 1:");
		for(i=0;i<k;i++) {
			System.out.print(wrm1[i]+"\t");
		}
		wrmup3(wrm1,k);
		}
		else
			System.out.println("Satisfies Havel Halmiki criteria");
	} 
	public static void wrmup3(int[] crr,int z) {
		int N=0,i=0;
		int[] drr;
		drr = new int[z-1];
		N=crr[0];
		for(i=1;i<z;i++) {
			drr[i-1]=crr[i];
		}
		int p =crr.length;
		if(N>p) {
			System.out.println("\nDoesn't satify the Havel Halmiki criteria");
			return;
		}
		else {
		System.out.println("\nThird Warmup is :\n");
		for(i=0;i<z-1;i++) {
			System.out.println(drr[i]+"\t");
		}
		int q = z-1;
		wrmup4(drr,q);
		}
	}
	public static void wrmup4(int[] frr,int v) {
		int[] grr;
		int i=0;
		grr = new int[v];
		for(i=0;i<v;i++) {
			grr[i]=frr[i]-1;
		}
		System.out.println("\nFourth Warmup is :\n");
		for(i=0;i<v;i++) {
			System.out.print(grr[i]+"\t");
		}
		wrmup1(grr,v);
	}

}
