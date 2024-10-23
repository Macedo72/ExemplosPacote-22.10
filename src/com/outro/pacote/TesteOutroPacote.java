package com.outro.pacote;

import com.exemplo.pacote.Animal;

public class TesteOutroPacote {
    public static void main(String[] args) {
        Animal animal = new Animal();
        //animal.fazerSom(); // Acesso permitido (Metodo public)
        //animal.fazerSom(); // Acesso permitido (Metodo protected dentro do mesmo pacote)
    }
}
