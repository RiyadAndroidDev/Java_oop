
package From40;

import java.util.Scanner;


public class ReverseOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,r,temp,sum = 0;
        System.out.print("Enter Any Number : ");
        num = input.nextInt();
        
        temp = num;
        while(temp !=0){
            r = temp % 10;
            sum = sum *10+ r;
            temp = temp / 10;
        
        }
        System.out.println("Sum of Digit : "+sum);
    }
    
}
