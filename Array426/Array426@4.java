import java.util.Scanner;
class ArrayAvg4{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the no of size:");
                int size = sc.nextInt();
                System.out.println("Enter the elements");
                int[] arr = new int[size];
                for(int i = 0; i<size;i++){
                        arr[i] = sc.nextInt();
		}
			System.out.println("Enter the number to check");
			int number = sc.nextInt();
			int count = 0;
			for(int i = 0; i<size ; i++){
				if(arr[i] == number){
					count++;
				}
			}
			if(count > 2){
				System.out.println(number + " occurs more than 2 times in the array.");
			}
			else{
				System.out.println(number + " occurs " + count + " times in the aaray.");
			}
	}
}


