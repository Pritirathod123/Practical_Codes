import java.util.Scanner;
class ArrayAvg2{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the no of size:");
                int size = sc.nextInt();
                System.out.println("Enter the elements");
                 
                int[] arr = new int[size];
                for(int i = 0; i<size;i++){
                        arr[i] = sc.nextInt();
                }
                int min = arr[0];
		int max = arr[0];

                for(int i = 1; i<size; i++){
                        if(arr[i]<min){
				min = arr[i];
                }
		if(arr[i] >max){
			max = arr[i];
		}

		}
		int difference = max - min;

                
                System.out.println(" The difference betweeen the minimum and maximum elements is :" + difference );
        }
}
