import java.util.Scanner;
class Array2{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the no of size");
                int size = sc.nextInt();
                int arrp[] = new int [size];
                for(int i = 0; i<arrp.length;i++){
                        arrp[i] = sc.nextInt();
                }
                int sum = 0;
                System.out.print("elements divisible by 3 :");
                for(int i = 0;i<arrp.length;i++){
                        if(arrp[i]%3==0){
                                System.out.print(  arrp[i] + " " );
                                 sum+=arrp[i];
                        }

                        }
                        System.out.println("\nsum of elements divisible by 3:" +sum);
                }

        }

