
public class Bubble {

	public static void main(String[] args) {
		 int[] arr= {5,6,12,1,3,4};
		 
		 int a=arr.length;
		 System.out.println(a);
		 for(int i=0; i<=a; i++) {
			 for(int j=1; j<(a-i); j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				} 
			}
		 }
	}

}
