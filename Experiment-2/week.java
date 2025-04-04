import java.util.Scanner;
public class week {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the day number to find its corresponding day of the week:");
        int day=s.nextInt();
        if(day>=1 && day<=7){
            System.out.print("\nThe day is:");
            switch(day){
                case 1:
                    System.out.println(" Monday");break;
                case 2:
                    System.out.println(" Tuesday");break;
                case 3:
                    System.out.println(" Wednesday");break;
                case 4:
                    System.out.println(" Thursday");break;
                case 5:
                    System.out.println(" Friday");break;
                case 6:
                    System.out.println(" Saturday");break;
                case 7:
                    System.out.println(" Sunday");break;
            }
        }
        else{
            System.out.println("Input the correct number");
        }
        s.close();
        }
}

