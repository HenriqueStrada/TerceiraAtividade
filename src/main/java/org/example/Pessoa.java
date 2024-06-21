package org.example;

public class Pessoa{
    private int id;
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(int id, String nome, int idade, double altura, double peso){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
}
