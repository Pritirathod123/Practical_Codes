import java.util.Scanner;
class Array1{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of array : ");
                int size = sc.nextInt();
                int[] arr = new int [size];
		System.out.print("Enter the element of the array:" );
                for(int i = 0; i < size;i++){
                        arr[i] = sc.nextInt();
                }
		sc.close();
                int evenCount = 0;
		System.out.print("even numbers: ");
                for(int num : arr){
                        if(num % 2 == 0){
                                System.out.print( num + " " );
				 evenCount++;
			}
		}
                        
			//System.out.println("even number:" + " " arrp[i]);
			System.out.println("\n evenCount of even elements is: " + evenCount );
                }
                
        }

