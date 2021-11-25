package com.company;

import java.util.Scanner;

public class FindPair{
    int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public void findPair(){
        for(int i=0; i<=number/2; i++){
            System.out.printf("[%d, %d]",i ,(number-i));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FindPair fp=new FindPair();
        System.out.println("Enter a number: ");
        fp.setNumber(sc.nextInt());
        System.out.println("Pairs are: ");
        fp.findPair();
    }
}
