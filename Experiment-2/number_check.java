import java.util.Scanner;
public class number_check {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        float a=s.nextInt();
        if(a==0){
            System.out.print("The number you entered is zero");
        }
        else if(a>0){
            System.out.print("The number you entered is positive");
        }
        else{
            System.out.print("The number you entered is negative");
        }
        s.close();
    }
}
