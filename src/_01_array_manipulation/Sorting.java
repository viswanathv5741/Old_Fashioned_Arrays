package _01_array_manipulation;

public class Sorting {
	public static void sort(String[] x) {
		String temp = "";
		//int[] sorted = new int[x.length];
		for (int i=0; i<x.length; i++) {
			for (int j=0; j<x.length-1; j++) {
				if (x[j].compareTo(x[j+1]) > 0) {
					temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
				}
			}
		}
	}
}
