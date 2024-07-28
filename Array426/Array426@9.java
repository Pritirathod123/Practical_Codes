import java.util.Scanner;
class ArrayAvg9{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the no of size:");
                int size = sc.nextInt();
                System.out.println("Enter the elements");
                char[] arr = new char[size];
                for(int i = 0; i<size;i++){
                        arr[i] = sc.next().charAt(0);
                }
		for(int i = 0; i<size ; i++){
			if(arr[i] <'a' || arr[i] >'z'){
				arr[i] = '#';
			}
		}
		System.out.println("Output:");
		System.out.println("Array:");
		for(char c : arr){
			System.out.println(c);
			}
	}

}
