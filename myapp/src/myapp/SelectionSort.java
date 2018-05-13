/*
 * selection sort
 */

package myapp;

public class SelectionSort {
	
	public static void sort() {
		int arr[] = {2, 9, 4, 15, 7, 23, 16};
		int n = 7;
		for(int i= 1; i<=n; i++) {
			for(int j = 0; j<n-1; j++) {
				int k = j+1;
				int a = arr[j];
				int b = arr[k];
				if(b<a) {
					int temp = a;
					arr[j] = b;
					arr[k] = temp;
				}
			}
			
		}
		System.out.println("The numbers in ascending order");
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		ss.sort();

	}

}
