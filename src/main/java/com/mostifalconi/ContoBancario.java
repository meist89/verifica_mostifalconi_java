package com.mostifalconi;

/**
 * Classe che rappresenta un conto bancario.
 */
public class ContoBancario {

    /**
     * L'IBAN del conto bancario.
     */
    protected String iban;

    /**
     * Il saldo del conto bancario.
     */
    protected double saldo;

    /**
     * Costruttore che inizializza il conto bancario con un IBAN e un saldo.
     *
     * @param iban  il numero del conto bancario
     * @param saldo il saldo iniziale del conto bancario
     */
    public ContoBancario(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    /**
     * Restituisce il numero del conto bancario.
     *
     * @return il numero del conto bancario
     */
    public String getIban() {
        return iban;
    }

    /**
     * Restituisce il saldo del conto bancario.
     *
     * @return il saldo del conto bancario
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Deposita una somma di denaro sul conto bancario, incrementando il saldo.
     *
     * @param importo la somma di denaro da depositare
     * @throws IllegalArgumentException se l'importo è negativo
     */
    public void deposita(double importo) {
        if (importo < 0) {
            throw new IllegalArgumentException("L'importo da depositare non può essere negativo.");
        }
        saldo += importo;
    }

    /**
     * Preleva una somma di denaro dal conto bancario, decrementando il saldo.
     *
     * @param importo la somma di denaro da prelevare
     * @throws IllegalArgumentException se l'importo è negativo o supera il saldo
     *                                  disponibile
     */
    public void preleva(double importo) {
        if (importo < 0) {
            throw new IllegalArgumentException("L'importo da prelevare non può essere negativo.");
        }
        if (importo > saldo) {
            throw new IllegalArgumentException("Saldo insufficiente.");
        }
        saldo -= importo;
    }

    /**
     * Restituisce una rappresentazione stringa del conto bancario.
     * Include l'IBAN e il saldo, formattata in modo leggibile.
     *
     * @return una rappresentazione stringa del conto bancario
     */
    @Override
    public String toString() {
        return "Conto Bancario:\n" +
                "IBAN: " + iban + "\n" +
                "Saldo: " + saldo + " EUR";
    }
}
