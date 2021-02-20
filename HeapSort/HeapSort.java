import java.util.Arrays;

public class HeapSort{
	public void heapSort(int arr[]){
		
		
		//First heapify the array
		//Take the right most children and compare it with its parent and keep doing that
		//Here started from n/2 because we heapify from lowest subtree and parent of lowest subtree is at n/2
		int n = arr.length;
		for(int i = n/2-1; i>=0; i--){
			heapify(arr, n-1, i);
		}
		
		for(int i=n-1; i>= 0; i--){
			//swap first element to last
			int swap = arr[i];
			arr[i] = arr[0];
			arr[0] = swap;
			
			//heapify again ignoring the last element
			//Always push smallest element from top place to last place in order to pull the biggest element at 0.
			heapify(arr, i-1, 0);
		}
		
		//Heap function will work in such a way that 
		//take root and then heapify
	}
	
	/**
	i: total element in the array
	n: Parent node where max value is supposed to appear
	Here heapify works from top to bottom, so this will make sure that parent will always have the biggest one
	*/
	private void heapify(int arr[], int i, int n){
		int leftChild = 2*n+1;
		int rightChild = 2*n+2;
		int largest = n;
		
		if(leftChild <=i && arr[leftChild] > arr[largest] )
			largest = leftChild;
		
		if(rightChild<=i && arr[rightChild] > arr[largest])
			largest = rightChild;
		
		if(largest != n){
			int swap = arr[n];
			arr[n] = arr[largest];
			arr[largest] = swap;
			
			heapify(arr, i, largest);
		}
		
	}
	
	public static void main(String arg[]){
		HeapSort heapSort = new HeapSort();
		int[] arr = {12,10,13,9,85,41,32,56,22,1};
		System.out.println(Arrays.toString(arr));
		heapSort.heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
}