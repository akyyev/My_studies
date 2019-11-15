package day49_abstract_classes;

import java.util.Arrays;

public class SkylineProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[4][4];
		
		
		int[] [] ar = { {9,2,4,5},
						{4,5,2,4},
						{3,5,7,9},
						{3,6,4,1}};
		
		int count = 0;
		
		int[] maxOfHor = new int[4];
		int[] maxOfVer = new int[4];
		int c=0;
		for(int[] each : ar) {
			int max = Integer.MIN_VALUE;
			for(int one: each) {
				if(one>max) max=one;
			}
			maxOfHor[c]=max;
			c++;
		}
		
		c=0;
		for(int j=0; j<4; j++) {
			int maxVer = Integer.MIN_VALUE;
			for(int i=0; i<4; i++) {
				if(ar[i][j]>maxVer) maxVer = ar[i][j];
			}
			maxOfVer[c]=maxVer;
			c++;
		}
		
		
		
		System.out.println(Arrays.toString(maxOfHor));
		System.out.println(Arrays.toString(maxOfVer));
		
		System.gc();
	}

}
