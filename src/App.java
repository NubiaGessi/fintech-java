import br.com.fiap.fintech.Expense;
import br.com.fiap.fintech.Income;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //GASTO

        System.out.println("Data do gasto: ");
        String expenseDate = sc.nextLine();

        System.out.println("Descrição do gasto: ");
        String expenseDescription = sc.nextLine();

        System.out.println("Valor do gasto: ");
        double expenseValue = sc.nextDouble();
        sc.nextLine();

        Expense expense = new Expense(expenseDate, expenseDescription, expenseValue);

        expense.showExpense();
        expense.editExpense();

        //RECEITA

        System.out.println("Data da receita: ");
        String incomeDate = sc.nextLine();

        System.out.println("Descrição da receita: ");
        String incomeDescription = sc.nextLine();

        System.out.println("Valor da receita: ");
        double incomeValue = sc.nextDouble();
        sc.nextLine();

        Income income = new Income(incomeDate, incomeDescription, incomeValue);

        income.showIncome();
        income.editIncome();

        //META
        System.out.println("Data para atingir a meta: ");
        String goalDate = sc.nextLine();

        System.out.println("Descrição da meta: ");
        String goalDescription = sc.nextLine();

        System.out.println("Valor da meta: ");
        double goalValue = sc.nextDouble();
        sc.nextLine();

        Goal goal = new Goal(goalDate, goalDescription, goalValue);

        goal.showGoal();
        goal.updateGoalValue();
        goal.calculateProgressPercentage();
        goal.followUpGoal();

        //INVESTIMENTO

        System.out.println("Data do investimento: ");
        String investmentDate = sc.nextLine();

        System.out.println("Descrição do investimento: ");
        String investmentDescription = sc.nextLine();

        System.out.println("Valor do investimento: ");
        double investmentValue = sc.nextDouble();
        sc.nextLine();

        Investment investment = new Investment(investmentDate, investmentDescription, investmentValue);

        investment.showInvestiment();
        investment.isValid();
        investment.updateInvestmentValue();
        investment.calculateProfit();
        investment.isProfitable();

        sc.close();
    }
}


