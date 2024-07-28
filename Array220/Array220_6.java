import java.util.Scanner;
class Array6{
            public static void main(String [] args){
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter the size");
                    int size = sc.nextInt();
                    int arrp[] = new int[size];
                    System.out.print("Enter the elements ");
                    for(int i = 0; i<size;i++){
                            arrp[i] = sc.nextInt();
                    }
                    int product = 1;
                    for(int i = 1; i<size;i++){
			    if(i%2==1){
                                    product = product*arrp[i];
                            }
		    }
                            System.out.println("Product of odd indexed elements: " + product);

                    }


}
