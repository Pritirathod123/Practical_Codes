import java.util.Scanner;
class ArrayAvg8{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the no of size:");
                int size = sc.nextInt();
                System.out.println("Enter the elements");
                char[] arr = new char[size];
                for(int i = 0; i<size;i++){
                        arr[i] = sc.next().charAt(0);
                }
		System.out.println("Enter the character to check :");
		char cha = sc.next().charAt(0);
		int count = 0;
		for(char c : arr){
			if(c == cha){
				count++;
			}
		}
		System.out.println(cha + " occurs "  + count  +  " times in the given array.");
	}
}
