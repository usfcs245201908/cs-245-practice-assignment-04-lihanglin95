
public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		for(int i=0;i<a.length-1;i++)
			for(int j=0; j<a.length-1-i;j++)
				if(a[j]>a[j+1])
					swap(a,j,j+1);

	}

	void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}

}
