
public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		for(int i =0;i<a.length;i++)
			swap(a,i,findmin(a,i));

	}

	void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}

	int findmin(int[] a, int start) {
		int min = start;
		for(int i=start+1;i<a.length;i++)
			if(a[i]<a[min])
				min=i;
		
		return min;
	}

}
