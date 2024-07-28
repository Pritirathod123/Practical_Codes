import java.util.Scanner;
class BasicArray4{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter size:");
                int size = sc.nextInt();
		
		
                int[] arr1 = new int[size];
                System.out.println("Enter " +size + " elements:i");
                for(int i = 0; i<size ; i++){
                        arr1[i] = sc.nextInt();
                }
		 int sum = 0;
                System.out.println("Array:");
                for(int i = 0 ; i<size ; i++){
                        if(arr1[i]%2==1){
				sum = sum + arr1[i];
			}
		}
                                System.out.println( " Sum of Odd elements : " + sum);
                        }

                
        
}
