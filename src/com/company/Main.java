package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str=scanner.nextLine().split(" ");
        int N=Integer.valueOf(str[0]);
        int D=Integer.valueOf(str[1]);
        String[] arr=scanner.nextLine().split(" ");
        int[] array=new int[N];
        for (int i=0;i<arr.length;i++){
            array[i]=Integer.valueOf(arr[i]);
        }
        int[] arrayExtra=new int[N];
        for (int i=0;i<arr.length;i++){
            arrayExtra[i]=Integer.valueOf(arr[i]);
        }
        for(int k=0;k<array.length-D;k++){
            array[k]=array[k+D];
            System.out.print(array[k]);
        }
        for (int k=0;k<D;k++){
            array[k]=arrayExtra[k];
            System.out.print(array[k]);
        }
    }
}
