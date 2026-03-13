package br.com.fiap.fintech;

// Superclasse
abstract class Transaction {
    private String transactionDate;
    private String transactionDescription;
    private double transactionValue;

    public Transaction(String transactionDate, String transactionDescription, double transactionValue) {
        this.transactionDate = transactionDate
        this.transactionDescription = transactionDescription;
        this.transactionValue = transactionValue;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public double getTransactionValue() {
        return transactionValue;
    }

    public abstract void mostrarDetalhes(); // Metodo abstrato
}

