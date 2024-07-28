import java.util.Scanner;
class Array4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of size");
		int size = sc.nextInt();
		int[] arrp = new int[size];
		System.out.print("Enter the element:");
		for(int i = 0 ; i< size;i++){
			arrp[i] = sc.nextInt();
		}
		System.out.print("Enter the number to search in array:");


		int searchNumber = sc.nextInt();
		int index = -1;
		for(int i = 0 ; i< size; i++){
			if(arrp[i] == searchNumber){
				index = i;
				
			}
		}
		if(index != -1){
			System.out.println("The number " + searchNumber + " is fount at index " + index + " ");
		}
		else{
			System.out.println("The number " + searchNumber + " is not found in the array");
		}
	}
}
