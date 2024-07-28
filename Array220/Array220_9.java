import java.util.Scanner;
class Array9{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the no of size");
                int size = sc.nextInt();
                int arrp[] = new int [size];
                for(int i = 0; i<arrp.length;i++){
                        arrp[i] = sc.nextInt();
                }
                int min = arrp[0];
                for(int i = 0;i<arrp.length;i++){
                        if(arrp[i]<min){
                                min = arrp[i];
                        }
                }
                System.out.println("minimum number in the array : " + min);
        }
}
