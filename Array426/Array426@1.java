import java.util.Scanner;
class ArrayAvg1{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size:");
                int size = sc.nextInt();
                System.out.println("Enter array elements:");
                int[] arr = new int[size];
                for(int i = 0; i<size;i++){
                        arr[i] = sc.nextInt();
                }
                int sum = 0;
                for(int num : arr){
                        sum+=num;
                }
                double average = (double) sum/size;
                System.out.println("Array elements' average is : " + average);
        }
}
