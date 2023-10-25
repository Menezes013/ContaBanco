package br.com.poo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    ContaBanco p1 = new ContaBanco();

    p1.setNumConta(1250);
    p1.setDono("Miguel");
    p1.abrirConta("Conta Corrente");
    p1.depositar(100);
    p1.sacar(10);


    p1.estadoAtual();

    }
}