package functionalprograms;

public class SumOfTriples {

	public static void main(String[] args) {
		int  array[] = { 1 ,0 ,-1,2,3,-2};
		int n = array.length;
		for (int i = 0; i<n-2 ; i++) {
			for (int j=i+1; j<n-1; j++) {
				for (int k=j+1;k<n;k++) {
					if ( array[i]+array[j]+array[k] == 0) {
						System.out.println(array[i]+" "+array[j]+" "+array[k]);
					}
				}
			}
			
		}
	}

}
