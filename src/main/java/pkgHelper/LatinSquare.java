package pkgHelper;

import java.util.Arrays;

public class LatinSquare {
	
	private int[][] LatinSquare;
	public LatinSquare() {
		super();
	}
	public LatinSquare(int[][] puzzle) {
		super();
		LatinSquare = puzzle;
	}
	public int[][] getLatinSquare(){
		return LatinSquare;
	}
	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}
	public static boolean doesElementExist(int[] arr, int iValue){
		for (int i:arr){
			if (i == iValue) {
				return true;
			}
		}
		return false;
	}
	public static boolean hasAllValues(int[] arr1,int[] arr2) {
		boolean hasAllValues = true;
		for (int i = 0; i < arr2.length; i++) {
			boolean bFound = false;
			for (int j = 0;j < arr1.length; j++) {
				if (arr2[i]==arr1[j]) {
					bFound = true;
					break;
				}
			}
			if (!bFound) {
				hasAllValues = false;
				break;
			}
		}
		return hasAllValues;
	}
	public boolean containsZero() {
		for (int i = 0;i<this.LatinSquare.length;i++) {
			for(int j = 0;j<this.LatinSquare[i].length;j++) {
				if(LatinSquare[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}
	public static boolean hasDuplicates(int[] arr) {
		Arrays.sort(arr);
		for(int i =  0; i<arr.length-1;i++) {
			if(arr[i] == arr[i+1]) {
				return true;
			}
		}
		return false;
	}
	public int[] getRow(int iRow) {
		return this.LatinSquare[iRow]; 	
	}
	public int[] getCol(int iCol) {
		int[] column = new int[this.LatinSquare.length];
		for(int i= 0;i<this.LatinSquare.length;i++) {
			column[i] = this.LatinSquare[i][iCol];
		}
		return column;
	}
	public boolean isLatinSquare() {
		for(int i= 0; i<this.LatinSquare.length; i++) {
			if(LatinSquare.hasDuplicates((this.getRow(i)) || (LatinSquare.hasDuplicates((this.getCol(i))) {
				
			}
		}
		return true;
	}
	}
}
