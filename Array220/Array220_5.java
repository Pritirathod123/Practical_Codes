import java.util.Scanner;
class Array5{
            public static void main(String [] args){
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the size");
		    int size = sc.nextInt();
		    int arrp[] = new int[size];
		    System.out.print("Enter the elements ");
		    for(int i = 0; i<size;i++){
			    arrp[i] = sc.nextInt();
		    }
		    int sum = 0;
		    for(int i = 1; i<size;i+=2){
			    

				    
				    sum = sum+arrp[i];
			    }
			    System.out.println("Sum of odd indexed elements: " + sum);
			    
		    }
			   
		    
}
