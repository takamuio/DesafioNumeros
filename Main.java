package com.mycompany.desafionumeros;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();

        int variavel = 0;
        int index = 0;
        

        System.out.println("Digite um numero: ");
        variavel = ler.nextInt();

        do {
            int membro = variavel % 10;
            numeros.add(membro);
            variavel = variavel / 10;
        } while (variavel != 0);

        do {
            int decimal = (int) Math.pow(10, index) * numeros.get(index);
            variavel = decimal;
            if (index > 0) {
            numeros.set(index, variavel);
            
            index++;
        } while (index < numeros.size());

        java.util.Collections.reverse(numeros);
        System.out.println(numeros);

    }
}
