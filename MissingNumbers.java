package com.company;

import java.util.Random;
import java.util.Scanner;

public class MissingNumbers {
    private int [] arr;
    int x; boolean isThere;
    Random rd=new Random();

    public void generate(){
        arr = new int[100];
        for(int i=0; i<100; i++){
            x = rd.nextInt(1,100);
            arr[i] = x;
        }
    }

    public void display(){
        for(int i=0; i<100; i++){
            if(i==50){
                System.out.println();
            }
            System.out.print(arr[i] + " ");
        }
    }

    public void check(){
        for(int i=1; i<=100; i++){
            isThere = false;
            for(int j=0; j<100; j++){
                if (arr[j] == i) {
                    isThere = true;
                    break;
                }
            }
            if(!isThere){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MissingNumbers ob=new MissingNumbers();
        ob.generate();
        System.out.println("Elements in array: ");
        ob.display();
        System.out.println();
        System.out.println("Missing Numbers from (1 to 100): ");
        ob.check();
    }
}
