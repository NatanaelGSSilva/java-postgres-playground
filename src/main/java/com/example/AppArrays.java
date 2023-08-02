package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        // double vetor[] = {10,20,30};
        //System.out.println(Arrays.toString(vetor));
        // var vetorposicao0 = vetor[0];
        // var vetorposicao1 = vetor[1];
        // var vetorposicao2 = vetor[2];
        //System.out.println(vetorposicao0);
        // vetor[0] = 1;
        //System.out.println(vetor[0]);

        int vetor3[] = new int[5];
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = 100* (i+1);
        }
        System.out.println(Arrays.toString(vetor3));


        // double matriz[][] = {{10,20,30},{40,50,60}};
        // matriz[0] = new double[]{1,2};
        // matriz[1][2] = 1000;
        // System.out.println(Arrays.toString(matriz[1]));
        // System.out.println(Arrays.toString(matriz[0]));

    }
}
