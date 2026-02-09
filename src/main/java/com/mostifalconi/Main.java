package com.mostifalconi;

public class Main {

    public static void main(String[] args) {

        // Creazione del conto bancario
        ContoBancario conto = new ContoBancario(
                "miao",
                1000.0);

        // Stampa stato iniziale
        System.out.println(conto);

        // Deposito
        conto.deposita(500.0);
        System.out.println(conto);

        // Prelievo valido
        conto.preleva(300.0);
        System.out.println(conto);

        // Test deposito negativo
        try {
            conto.deposita(-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        // Test prelievo superiore al saldo
        try {
            conto.preleva(2000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        // Test prelievo negativo
        try {
            conto.preleva(-50.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        // Stato finale
        System.out.println(conto);
    }
}
