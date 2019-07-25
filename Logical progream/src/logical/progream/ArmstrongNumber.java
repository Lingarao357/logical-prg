/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical.progream;

/**
 *
 * @author Linga357
 */import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num,temp,total=0;
        System.out.println("Pls enter any 3digites number");
    
        Scanner scanner=new Scanner(System.in);
       num= scanner.nextInt();
       scanner.close();
       for(int n=num;n!=0;n/=10){
       temp=n%10;
       total=total+temp*temp*temp;
       }
       if(total==num){
           System.out.println(num+"Number is Armstrongnumber");
       }
       else{
           System.out.println(num+"Given number is not Armstrongnuber");
       }
    }
}
