//
package lucky7;

import java.awt.Color;
import java.awt.Graphics;

import java.util.Scanner;
public class Dice {
    private int number;
    int bestroll=1;
    int bestmoney;
    int money=0;
    public static void main(String[] args) {
    
    while(money>=0){
}
    

    
    
    public Dice(Graphics pen, int number){

        this.number=number;

    }
    
    public int getNumber(){
        Scanner s = new Scanner(System.in);
        System.out.print("How many dollars do you have? ");
        money = s.nextInt();
        return number;
    }
    
    public void roll(){
        number = (int)(Math.random()*6+1);
        
    }
}