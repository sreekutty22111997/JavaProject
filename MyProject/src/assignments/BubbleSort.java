package assignments;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 2, 5, 20, 1};
		System.out.println("Array before sorting : " );
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		Sort(a);
		System.out.println("Array after sorting : ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");	
		}
	}
	
	static void Sort(int b[]) {
		int t = 0;
		for(int i=0; i<b.length; i++) {
			for(int j=1; j<b.length-i; j++) {
				if(b[j-1] > b[j]) {
					t = b[j-1];
					b[j-1] = b[j];
					b[j] = t;
				}
			}
		}
	}

}



