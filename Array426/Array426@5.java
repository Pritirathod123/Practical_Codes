import java.util.Scanner;
class ArrayAvg5{
             public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
        
        
                 System.out.println("Enter the size of the array:");
                 int size = sc.nextInt();
        
        
                 int[] array = new int[size];
		 

        
      
               System.out.println("Enter the elements of the array:");
               for (int i = 0; i < array.length; i++) {
		       array[i] = sc.nextInt();
                System.out.print(array[i]+ " ");
	       }
	       System.out.println();
	       System.out.println("The reversed array is : ");
	       for(int i = array.length-1;i>=0;i--){
		       System.out.print(array[i] +" ");
	       }
	     }
}
       
