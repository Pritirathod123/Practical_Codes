
import java.util.*;
class BasicArray9{

        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter size:");
                int size = sc.nextInt();


                int[] arr1 = new int[size];
                System.out.println("Enter " +size + " elements:");
                for(int i = 0; i<size ; i++){
                        arr1[i] = sc.nextInt();
                }
                 
                System.out.println("Array:");
                for(int i = 0 ; i<size ; i++){
                        if(i%2==1){
                                
                        
                
                                System.out.println( "  Odd index elements : " +arr1[i]);
                        }
		}
	}
}


