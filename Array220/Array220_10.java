import java.util.Scanner;
class Array10{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the no of size");
                int size = sc.nextInt();
                int arrp[] = new int [size];
		System.out.println("Enter the elements: ");
                for(int i = 0; i<arrp.length;i++){
                        arrp[i] = sc.nextInt();
                }
                int max = arrp[0];
		int pos = 0;
                for(int i = 1;i<arrp.length;i++){
                        if(arrp[i]>max){
                                max = arrp[i];
				pos = i;
                        }
                }
                System.out.println("maximum number in the array is found at pos " + pos+  " is " + max);
        }
}
