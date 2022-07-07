package com.bridgelabz.JavaGenerics;

import java.util.Scanner;

public class ExtendTheMaxAndPrint<T extends Comparable<T>>
{
    private T x;
    private final T T y,T z;

    {
        T x;
        public T y;
        public T z;


        public void testMaximum() {
        ExtendTheMaxAndPrint.checkMax(this.x,this.y,this.z);
    }
        public static <T extends Comparable<T>> void checkMax(T x,T y,T z)
        {
            T max = x;
            if (y.compareTo(max) > 0)
                max = y;
            if (z.compareTo(max) > 0)
                max = z;
            printMax(x,y,z,max);
        }

        public static void main(string[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter three integer");
            Integer i1 = input.nextInt(), i2 = input.nextInt(), i3 = input.nextInt();
            System.out.println("Enter three float");
            Float f1 = input.nextFloat(), f2 = input.nextFloat(), f3 = input.nextFloat();
            System.out.println("Enter three float");
            String s1 = input.next(), s2 = input.next(), s3 = input.next();
            new ExtendTheMaxAndPrint<Integer>(i1,i2,i3).testMaximum();
            new ExtendTheMaxAndPrint<Float>(f1,f2,f3).testMaximum();
            new ExtendTheMaxAndPrint<String>(s1,s2,s3).testMaximum();
        }
    }
    private void printMax(T x, T y, T z, T max) {
        System.out.println("Max of "+x+","+y+","+z+" is " +max);
    }

    public ExtendTheMaxAndPrint(T x, T y, T z)
    {
        this.x= x;
        this.y =y;
        this.z= z;
    }
}