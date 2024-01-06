package exercices.matrix.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números para gerar uma matriz nXm");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] vect = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j  = 0; j < m; j++){
                vect[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite um número pertencente a matriz");
        int num = sc.nextInt();
        for(int i = 0; i < vect.length; i++){
            for(int j = 0; j < vect[i].length; j++){
                if(vect[i][j] == num){
                    if(i != 0){
                        System.out.println("UP: " + vect[i-1][j]);
                    }
                    if(i != n -1){
                        System.out.println("DOWN: " + vect[i+1][j]);
                    }
                    if(j != 0){
                        System.out.println("LEFT: " + vect[i][j-1]);
                    }
                    if(j != m - 1){
                        System.out.println("RIGHT: " + vect[i][j+1]);
                    }
                }
            }
        }
    }
}
