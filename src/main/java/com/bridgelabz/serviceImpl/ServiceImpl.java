package com.bridgelabz.serviceImpl;

import com.bridgelabz.model.MixedArray;
import com.bridgelabz.service.Service;

public class ServiceImpl implements Service {
    @Override
    public void intArray() {
        MixedArray mixedArray = new MixedArray();
        int[] intArray = new int[3];
        int i= 0;
        for (Object o : mixedArray.myArray ) {
            if (o instanceof Integer) {
                if(intArray[i]==0) {
                    intArray[i] = ((Integer) o).intValue();
                    i++;
                }
            }
        }
        System.out.print("Integer Array Elements are : ");
        for (int element: intArray) {
            System.out.print(element+", ");
        }
        System.out.println();
    }
    @Override
    public void stringArray() {
        MixedArray mixedArray = new MixedArray();
        String[] stringArray = new String[2];
        int i= 0;
        for (Object o : mixedArray.myArray ) {
            if (o instanceof String) {
                if(stringArray[i]==null) {
                    stringArray[i] = (String) o;
                    i++;
                }

            }
        }
        System.out.print("String Array Elements are : ");
        for (String element: stringArray) {
            System.out.print(element+", ");
        }
        System.out.println();
    }

    @Override
    public void booleanArray() {
        MixedArray mixedArray = new MixedArray();
        Boolean[] booleanArray = new Boolean[2];
        int i= 0;
        for (Object o : mixedArray.myArray ) {
            if (o instanceof Boolean) {
                if (booleanArray[i] == null) {
                    booleanArray[i] = (Boolean) o;
                    i++;
                }
            }
        }
        System.out.print("Boolean Array Elements are : ");
        for (Boolean element: booleanArray) {
            System.out.print(element+", ");
        }
        System.out.println();
    }

    @Override
    public void doubleArray() {
        MixedArray mixedArray = new MixedArray();
        Double[] doubleArray = new Double[3];
        int i= 0;
        for (Object o : mixedArray.myArray ) {
            if (o instanceof Double) {
                if (doubleArray[i] == null) {
                    doubleArray[i] = (Double) o;
                    i++;
                }
            }
        }
        System.out.print("Double Array Elements are : ");
        for (Double element: doubleArray) {
            System.out.print(element+", ");
        }
        System.out.println();
    }

    @Override
    public void characterArray() {
        MixedArray mixedArray = new MixedArray();
        Character[] characterArray = new Character[3];
        int i= 0;
        for (Object o : mixedArray.myArray ) {
            if (o instanceof Character) {
                if (characterArray[i] == null) {
                    characterArray[i] = (Character) o;
                    i++;
                }
            }
        }
        System.out.print("Character Array Elements are : ");
        for (Character element: characterArray) {
            System.out.print(element+", ");
        }
        System.out.println();
    }

    @Override
    public void longArray() {
        MixedArray mixedArray = new MixedArray();
        Long[] longArray = new Long[3];
        int i= 0;
        for (Object o : mixedArray.myArray ) {
            if (o instanceof Long) {
                if (longArray[i] == null) {
                    longArray[i] = (Long) o;
                    i++;
                }
            }
        }
        System.out.print("Long Array Elements are : ");
        for (Long element: longArray) {
            System.out.print(element+", ");
        }
        System.out.println();
    }
}
