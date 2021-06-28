package com.nix;

import java.util.Arrays;

public class StringArray {
    public String[] arr;

    public StringArray(String... args) {
        arr = Arrays.copyOf(args, args.length);
        System.out.println(Arrays.toString(arr));


    }

    public void insertionSort() {
        for (int j = 1; j < arr.length; j++) {
            String value = arr[j];
            int i = j - 1;
            while (i >= 0) {
                if (value.compareTo(arr[i]) > 0) {
                    break;
                }
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = value;
    }}

    public void print() {
        System.out.println(Arrays.toString(arr));

    }

    public void numberPrint() {
        int num = 1;
        for (String s : arr
        ) {
            System.out.print(num + ": " + s + "; ");
            num++;
        }

    }

    public  void insertionSortReverse() {
        insertionSort();
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }



    }

    public static void main(String[] args) {
        StringArray myArr = new StringArray("s", "m", "7", "Hello", "world");
        myArr.insertionSort();
        myArr.print();
        myArr.insertionSortReverse();
        myArr.print();
        myArr.numberPrint();
    }
}
