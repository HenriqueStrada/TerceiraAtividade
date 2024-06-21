package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Scanner scr = new Scanner(System.in);

        while (true) {
            System.out.println("Escreva o Id (Digite 0 para parar)");
            int id = scr.nextInt();
            if (id == 0) {
                break;
            }

            System.out.println("Escreva o nome:");
            String nome = scr.next();

            System.out.println("Escreva a idade:");
            int idade = scr.nextInt();

            System.out.println("Escreva a altura (em metros):");
            double altura = scr.nextDouble();

            System.out.println("Escreva o peso (em Kg):");
            double peso = scr.nextDouble();

            Pessoa pessoa = new Pessoa(id, nome, idade, altura, peso);
            pessoas.add(pessoa);
        }

        System.out.println("Lista de pessoas:");

        for (Pessoa pessoa : pessoas) {
            System.out.println("ID: " + pessoa.getId() + ", Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade() + ", Altura: " + pessoa.getAltura() + "m, Peso: " + pessoa.getPeso() + "kg");
        }
    }
}