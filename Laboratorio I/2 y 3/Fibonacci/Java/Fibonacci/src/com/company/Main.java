package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b,n, res;
        n= sc.nextInt();
        a = 0;
        b=1;
        System.out.println(a);
        System.out.println(b);
	for (int i=2; i<n; i++){
        res=a+b;
        a=b;
        b=res;
        System.out.println(res);
    }
    }
}
