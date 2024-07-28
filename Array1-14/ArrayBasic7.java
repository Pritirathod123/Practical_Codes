import java.util.Scanner;
class BasicArray7{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter size:");
                int size = sc.nextInt();


                int[] arr1 = new int[size];
                System.out.println("Enter the element of the array :");
                for(int i = 0; i<size ; i++){
                        arr1[i] = sc.nextInt();
                }

                System.out.println("output :");
                for(int i = 0 ; i<size ; i++){
                        if(arr1[i] % 4 == 0){


                                System.out.println(arr1[i]+ " is divisible by 4 and its index is " + i);
                       }
                }
        }


}
