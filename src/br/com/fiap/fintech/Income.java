package br.com.fiap.fintech;

//Subclasse
public class Income extends Transaction{
    public Income(){
        super();
    }

    public Income(String transactionDate, String transactionDescription, double transactionValue){
        super(transactionDate, transactionDescription, transactionValue);
    }

    @Override
    public String getResume() {
        return "Tipo: Receita | Data: " + getTransactionDate() + " | Descrição: " + getTransactionDescription()+ " | Valor: " + getTransactionValue();
    }
}