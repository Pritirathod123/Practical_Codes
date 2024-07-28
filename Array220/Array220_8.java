import java.util.Scanner;
class Array8{
            public static void main(String [] args){
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter the size");
                    int size = sc.nextInt();
                    int arrp[] = new int[size];
                    System.out.print("Enter the elements ");
                    for(int i = 0; i<size;i++){
                            arrp[i] = sc.nextInt();
                    }
		   // System.out.print("Element greater than 5 but less than 9 :");
		    
		    for(int num : arrp){
			    

                            if(num>5 && num<9){
                                    System.out.println(num + " is greater than 5 but less than 9" + " ");

                             }
                           



                         

                    }
                    
            }
}
