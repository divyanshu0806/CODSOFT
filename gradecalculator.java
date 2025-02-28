import java.util.*;
public class gradecalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter no. of subjects");
        n=sc.nextInt();
        double totalmarks=0.0;
        double marks[]=new double[n]; 
        for (int i=0;i<n;i++){
            System.out.println("enter marks for subject"+(i+1)+"=");
            marks[i]=sc.nextDouble();
            totalmarks+=marks[i];         
        }
        double percent=(totalmarks/n);
        System.out.println("TOTAL MARKS OBTAINED BY THE STUDENT IS = "+totalmarks);
        System.out.println("PERCENTAGE OBTAINED BY THE STUDENT IS = "+percent);
        char grade;
        if (percent>= 90) {
            grade = 'A';
        } else if (percent>= 80){
            grade = 'B';
        } else if (percent>= 70) {
            grade = 'C';
        } else if (percent>= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("GRADE OBTATINED BY THE STUDENT IS : "+grade);
        System.out.println("THANKYOU!");
    }
}
