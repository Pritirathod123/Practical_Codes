import java.util.Scanner;
class BasicArray3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size:");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		System.out.println("Enter " +size + " elements:");
		for(int i = 0; i<size ; i++){
			arr1[i] = sc.nextInt();
		}
		System.out.println(" Even elements in the Array:");
		for(int i = 0 ; i<size ; i++){
			if(arr1[i]%2==0){
				System.out.println(arr1[i] + " ");
			}
		}
	}
}
