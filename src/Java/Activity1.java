package Java;
import java.util.Scanner;
public class Activity1 {
    public static void main(String[] args) {
        String name;
        int sci, his, math, soc, arts;
        Scanner sc = new Scanner(System.in);            
        System.out.print("Enter Name: ");
        name = sc.next();    
        System.out.print("Enter marks in Science: ");
        sci = sc.nextInt();     
        System.out.print("Enter marks in History: ");
        his = sc.nextInt();      
        System.out.print("Enter marks in Math: ");
        math = sc.nextInt();       
        System.out.print("Enter marks in Soc: ");
        soc = sc.nextInt();
        System.out.print("Enter marks in Arts: ");
        arts = sc.nextInt();
        float ave;
        int total;
        total = sci + his + math + soc + arts;
        System.out.println("Total marks: "+ total);
        ave = total/5;
        System.out.println("Total percentage: "+ ave);
       if(ave > 90){
           System.out.println("Excellent");
       }else if (ave > 85)
           System.out.println("Very Good");
       else if (ave > 80)
           System.out.println("Good");
       else if (ave > 75)
           System.out.println("Fiar");
       else if (ave > 70)
           System.out.println("Poor");
       else if (ave > 69)
           System.out.println("Fail");
    }
}
