package org.example;

public class Matht {
    public int sum(int a, int b){
        return a + b;
    }
    public int[] setArray(int... arr){
        int[] newArr = new int[arr.length];
        for(short i=0; i < arr.length; i++)
            newArr[i] = arr[i];
        return newArr;
    }
    public int divide(int a,int b) throws ArithmeticException{
        return a/b;
    }
}
