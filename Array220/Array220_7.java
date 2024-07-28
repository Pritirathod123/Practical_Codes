import java.util.Scanner;
class Array7{
            public static void main(String [] args){
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter the size");
                    int size = sc.nextInt();
                    int arrp[] = new int[size];
                    System.out.print("Enter array elements ");
                    for(int i = 0; i<size;i++){
                            arrp[i] = sc.nextInt();
                    }
                    		                                              
			    if(size%2==0){
				    System.out.println(" Array element even print alternate elements");
			     for(int i = 0; i<size;i++){
                            
			    if(i%2==0){
                                    System.out.println("Array elements are array" + arrp[i] );
			     
			     }
			     }
			    }

			   if(size%2==1){
				   System.out.println("Whole array: ");
                                 for(int i = 0;i<size; i++){
					 System.out.println(arrp[i]);
                           
                    
                          System.out.println();

                    }
		    }
	    }
}

