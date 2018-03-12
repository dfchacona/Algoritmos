#include <iostream>
using namespace std;
int main() {

        int n;
        int B [n][n];
        int A [n][n];
        int ans [n][n];
        cin>>n;
        A=leerMatriz(n);
        B=leerMatriz(n);
        ans=multiplicarMatrices(A,B,n);
        imprimir(ans,n);


    return 0;
}
    static int [][] leerMatriz( int n){
    

    int [][] matrix = new int [n][n];
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            cin>>matrix[i][j];
        }
    }
    return matrix;
}
    static void imprimir( int [][] A, int n){


    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            cout<<"["<<i<<"] ["<<j<<"]: "<<A[i][j];
        }
    }

}
    static int [][] multiplicarMatrices(int [][] A, int [][] B, int n){
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
    cout<<(“Tiempo de ejecucion: "+endTime);
    return ans;
}