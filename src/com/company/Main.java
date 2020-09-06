package com.company;


import java.util.Scanner;



public class Main {


    static int Func (int t, int res)
    {
        if (t == 0) return(res);

        res += t % 10;

        return Func(t / 10 , res );

    }

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Inpud your number :");
        int s = in.nextInt();
        System.out.println(Func(s,0));

        
    }
}
