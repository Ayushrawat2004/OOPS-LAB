import java.util.Scanner;
public class greatest_int {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first integer:");
        int x=s.nextInt();
        System.out.print("Enter the second integer:");
        int y=s.nextInt();
        System.out.print("Enter the third integer:");
        int z=s.nextInt();
        if(x>y && x>z){
            System.out.print(x+" is the greatest integer");
        }
        else if(y>x && y>z){
            System.out.print(y+" is the greatest integer");
        }
        else if(z>x && z>x){
            System.out.print(z+" is the greatest integer");
        }
    }
}
