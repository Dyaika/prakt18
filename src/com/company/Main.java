package com.company;

public class Main {
    public static void zdn18(){
        int size = 10;
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int)(Math.random() * 1000);
        }
        for (int i:
             array) {
            System.out.print(i + " ");
        }

        System.out.println();
        int cur = array[0];
        for (int i = 1; i < size; i++){
            cur = array[i];
            int j = i - 1;
            while (j >= 0 && cur < array[j]){
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = cur;
        }
        for (int i:
                array) {
            System.out.print(i + " ");
        }
    }

    
    public static void main(String[] args) {
        zdn18();
    }
}
