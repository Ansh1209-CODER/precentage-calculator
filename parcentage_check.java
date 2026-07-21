package practice.com;

import java.util.Scanner;

public class parcentage_check {
    static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the maths:");
        int maths= sc .nextInt();
        System.out.println("enter science marks:");
        int science=sc.nextInt();
        System.out.println("enter social_science:");
        int social_science=sc.nextInt();
        System.out.println("enter hindi marks:");
        int hindi=sc.nextInt();
        System.out.println("enter english marks:");
        int english=sc.nextInt();
        System.out.println("the total percemntage:");
        float avg=(maths+science+social_science+hindi+english)/5.0f;
        System.out.println(maths+science+social_science+hindi+english);
        System.out.println(avg+"%");
        System.out.println("checking the passing and failing  ");
        if(avg>=165){
            System.out.println("you are going to next class");
        }
        else{
            System.out.println("now you are fail !!");
        }
    }
}
