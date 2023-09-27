import java.util.*;
public class calculator {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int marks_limit;
       int marks[] = new int[50];

       System.out.print("Enter the number of subjects: ");
       marks_limit= sc.nextInt();
       System.out.println(" ");

       System.out.println("Enter the number aquired in every subjects out of 100: ");
       for(int i=0; i<marks_limit; i++)
       {
          marks[i] = sc.nextInt();
       }

       calculaTor(marks,marks_limit);
      
       sc.close();
    }
    public static void calculaTor(int marks[],int marks_limit){
      
      double total = 0;
       for(int i=0;i<marks_limit;i++){
         total += marks[i];
       }

       double avg_percent  = (total/marks_limit);
       if(avg_percent>90)
       {
         System.out.println("Grade is O ");
         System.out.println("Total: "+total);
         System.out.println("Average Percentage: "+avg_percent);
       }

       if(avg_percent>80.0 && avg_percent<=90.0)
       {
         System.out.println("Grade is E ");
         System.out.println("Total: "+total);
         System.out.println("Average Percentage: "+avg_percent);
       }

       if(avg_percent>70.0 && avg_percent<=80.0)
       {
         System.out.println("Grade is A ");
         System.out.println("Total: "+total);
         System.out.println("Average Percentage: "+avg_percent);
       }
       
       if(avg_percent>60.0 && avg_percent<=70.0)
       {
         System.out.println("Grade is B");
         System.out.println("Total: "+total);
         System.out.println("Average Percentage: "+avg_percent);
       }
       
       if(avg_percent>50.0 && avg_percent<=60.0)
       {
         System.out.println("Grade is C");
         System.out.println("Total: "+total);
         System.out.println("Average Percentage: "+avg_percent);
       }
       
       if(avg_percent>40 && avg_percent<=50.0)
       {
         System.out.println("Grade is D");
         System.out.println("Total: "+total);
         System.out.println("Average Percentage: "+avg_percent);
       }
       
       if(avg_percent<40.0)
       {
          System.out.println("Grade is F");
          System.out.println("Total: "+total);
         System.out.println("Average Percentage: "+avg_percent);
       }
       
    }
    
}
