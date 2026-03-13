package br.com.fiap.fintech;

public class Income {
    //Atributos
    private String incomeDate;
    private String incomeDescription;
    private double incomeValue;

    //Construtor
    public Income(String incomeDate, String incomeDescription, double incomeValue) {
        this.incomeDate = incomeDate;
        this.incomeDescription = incomeDescription;
        this.incomeValue = incomeValue;
    }

    //Metodo exibir receita
    public String showIncome() {
        String messageShowIncome = "Método para exibir uma receita: Adicionando uma receita na data de: " +incomeDate+ ", com a descrição: " +incomeDescription+ ", e com o valor de: " + incomeValue;
        System.out.println(messageShowIncome);
        return messageShowIncome;
    }

    //Metodo editar receita
    public String editIncome() {
        String messageEditIncome = "Método para editar uma receita";
        System.out.println(messageEditIncome);
        return messageEditIncome;
    }

    //Getters and Setters

    public String getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(String incomeDate) {
        this.incomeDate = incomeDate;
    }

    public String getIncomeDescription() {
        return incomeDescription;
    }

    public void setIncomeDescription(String incomeDescription) {
        this.incomeDescription = incomeDescription;
    }

    public double getIncomeValue() {
        return incomeValue;
    }

    public void setIncomeValue(double incomeValue) {
        this.incomeValue = incomeValue;
    }
}
