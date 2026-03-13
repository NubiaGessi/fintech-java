package br.com.fiap.fintech;

public class Expense {
    //Atributos
    private String expenseDate;
    private String expenseDescription;
    private double expenseValue;

    //Construtor
    public Expense(String expenseDate, String expenseDescription, double expenseValue) {
        this.expenseDate = expenseDate;
        this.expenseDescription = expenseDescription;
        this.expenseValue = expenseValue;
    }

    //Metodo exibir gasto
    public String showExpense() {
        String messageShowExpense = "Método para exibir um gasto: Adicionando um gasto na data de: " +expenseDate+ ", com a descrição: " +expenseDescription+ ", e com o valor de: " + expenseValue;
        System.out.println(messageShowExpense);
        return messageShowExpense;
    }

    //Metodo editar gasto
    public String editExpense() {
        String messageEditExpense = "Método edição do gasto";
        System.out.println(messageEditExpense);
        return messageEditExpense;
    }

    //Getters and Setters

    public String getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(String expenseDate) {
        this.expenseDate = expenseDate;
    }

    public String getExpenseDescription() {
        return expenseDescription;
    }

    public void setExpenseDescription(String expenseDescription) {
        this.expenseDescription = expenseDescription;
    }

    public double getExpenseValue() {
        return expenseValue;
    }

    public void setExpenseValue(double expenseValue) {
        this.expenseValue = expenseValue;
    }
}