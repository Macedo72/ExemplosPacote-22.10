package com.exemplo.pacote;

public class Teste {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setNome("Ze Curubu"); // Acesso permitido (Metodo public)
        animal.fazerSom(); // Acesso permitido (Metodo protected dentro do mesmo pacote)
    }
}
