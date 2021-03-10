package lec01basic;

import java.util.Scanner;
//isXXX hasXXX canXXX =>boolean
//doSomthing
//class Car
//void moveCar
public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        while(cin.hasNext()){
            int a=cin.nextInt();
            int b=cin.nextInt();
            System.out.println(a+b);
        }


        cin.close();
        int x=4;
        if(x == 3){

        }
        int y= (int) 3.4;
        double z=3;

    }
}
