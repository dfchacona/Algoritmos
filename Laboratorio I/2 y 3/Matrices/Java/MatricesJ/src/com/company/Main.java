package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int [][] A, B, ans;
        n=sc.nextInt();
        A=leerMatriz(n);
        B=leerMatriz(n);
        ans=multiplicarMatrices(A,B,n);
        imprimir(ans,n);
    }
    public static int [][] leerMatriz( int n){
        Scanner sc = new Scanner(System.in);

        int [][] matrix = new int [n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        return matrix;
    }
    public static void imprimir( int [][] A, int n){


        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.println("["+i+"] ["+j+"]: "+A[i][j]);
            }
        }

    }
    public static int [][] multiplicarMatrices(int [][] A, int [][] B, int n){
        int [][] ans = new int [n][n];
        long startTime = System.nanoTime();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        // aquí se multiplica la matriz

                        ans[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        long endTime = System.nanoTime() - startTime;
        System.out.println("Tiempo de ejecucion: "+endTime);
        return ans;
    }
}
