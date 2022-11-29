/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.oscartinajero117.bubble_method;

/**
 *
 * @author Oscar Tinajero
 */
public class Bubble_method {

    public static void main(String[] args) {
        ///List
        int array[] = {20,10,5,19,50,49};
        
        System.out.println("Before bubble!");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            ///Sout before
            System.out.print(array[i]+",");
        }
        System.out.println("]");
        
        ///Array bubble
        int buuble[] = bubble(array, false);
        System.out.println("After bubble!");
        System.out.print("[");
        
        for (int i = 0; i < buuble.length; i++) {
            ///Sout After
            System.out.print(buuble[i]+",");
        }
        System.out.println("]");
    }

    private static int[] bubble(int[] myArray, boolean isAscend) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length - 1; j++) {
                int item = myArray[j],
                        nextItem = myArray[j + 1];
                if (isAscend) {
                    if (item > nextItem) {
                        myArray[j] = nextItem;
                        myArray[j + 1] = item;
                    }
                }else{
                    if (item < nextItem) {
                        myArray[j] = nextItem;
                        myArray[j + 1] = item;
                    }
                }
            }
        }
        
        return myArray;
    }
}
