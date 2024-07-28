import java.util.Scanner;
class Array3{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the no of size");
                int size = sc.nextInt();
                char arrp[] = sc.charAt();
                for(int i = 0; i<arrp.length;i++){
                        arrp[i] = sc.next().charAt(0);
                }
                
                System.out.print("enter element:");
                for(int i = 0;i<arrp.length;i++){
                        if(arrp[i]%2==0){
                                System.out.print(  arrp[i] + " " );
                                 evenCount++;
                        }

                        }
                        System.out.println("\nTotal even number:" +evenCount);
                }

        }

