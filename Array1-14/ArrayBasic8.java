import java.util.Scanner;
class BasicArray8{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number of employees:");
                int count = sc.nextInt();


                int[] ages = new int[count];
                System.out.println("Enter the ages of employees :");
                for(int i = 0; i<count ; i++){
                        ages[i] = sc.nextInt();
                }
		
		

                System.out.println(" Ages of employees :");
                for(int i = 0 ; i<count ; i++){
                        


                                System.out.println(" Employees " +(i+1) + "age: " + ages[i] );
                       }
                }
        }



