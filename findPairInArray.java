package com.company;

import java.util.Scanner;

public class findPairInArray {
    public void findPair(int [] arr, int number){
        int count = 0;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1; j< arr.length; j++) {
                if ((arr[i] + arr[j]) == number) {
                    count++;
                    System.out.printf("[%d, %d] \n", arr[i], arr[j]);
                }
            }
        }
        System.out.println("Pairs are: " + count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        findPairInArray fp=new findPairInArray();
        System.out.println("Enter a number: ");
        int x= sc.nextInt();
        int [] arr = {21,23,25,26,50,27,29,28,12,14,18,16,13,17,-10,19,24};
        System.out.println("Possible pairs from array: ");
        fp.findPair(arr,x);
    }
}
