package com.bridgelabz.JavaGenerics;
//uc1

public class FindTheMaxInteger
{
    public static Integer compareTo(Integer a,Integer b,Integer c)
    {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        FindTheMaxInteger s = new FindTheMaxInteger();
        System.out.println("max Number for 1st test case="+s.compareTo(5,3,2));
        System.out.println("max Number for 2nd test case="+s.compareTo(2,6,3));
        System.out.println("max Number for 3rd test case="+s.compareTo(1,2,3));
    }
}