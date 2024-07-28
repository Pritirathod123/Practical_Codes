
import java.util.*;
class BasicArray10{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number of students:");
                int numStudents = sc.nextInt();


                int[] scores = new int[numStudents];
                System.out.println("Enter the scores of students :");
                for(int i = 0; i<numStudents ; i++){
			System.out.print("Enter score for student " +(i+1) + " ");
                        scores[i] = sc.nextInt();
                }
                 int total = 0;
                
                for(int score :scores){
                        total += score;
                            
                        
                }
		double average = (double) total/numStudents;
                                System.out.println("Average score : " + average);
                        }
}


