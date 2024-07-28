import java.util.Scanner;
class ArrayAvg10{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the no of size:");
                int size = sc.nextInt();
                System.out.println("Enter the elements");
                char[] arr = new char[size];
                for(int i = 0; i<size;i++){
                        arr[i] = sc.next().charAt(0);
		}
			System.out.println("Enter the key");
			char key = sc.next().charAt(0);
               
		System.out.println("Output");
                for(int i = 0; i<size; i++){
                  
                if(arr[i]== key){
			break;
		}

                        System.out.print(arr[i]);
                }
        }
}
