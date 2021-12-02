import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        int randomNumber=0;
        int sum=0;


        System.out.print("Enter the number of dice : ");
        Scanner sc=new Scanner(System.in);
        int diceNum=sc.nextInt();
        System.out.println("Your dice value : ");
        Random ranNum=new Random();
        for(int i=0;i<diceNum;i++){
            randomNumber=ranNum.nextInt(6)+1;
            sum=sum+randomNumber;
            System.out.print(randomNumber);
            System.out.println();
        }
        System.out.println("Total Number of dice is : " + sum);
    }
}
