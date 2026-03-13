public class Investment {

    String investmentDate;
    String investmentDescription;
    double investmentValue;

    public Investment(String investmentDate, String investmentDescription, double investmentValue) {
        this.investmentDate = investmentDate;
        this.investmentDescription = investmentDescription;
        this.investmentValue = investmentValue;
    }

    //Exibir investimento
    public void showInvestiment(){
        System.out.println("Método para exibir um investimento: Adicionando um investimento, na data de: " +investmentDate+ ", com a descrição: " +investmentDescription+ ", e com o valor de: " +investmentValue+" chamado.");
    }

    // Validação do investimento
    public void isValid() {
        System.out.println("Método para validação do investimento.");
    }

    // Atualizar valor com aporte adicional
    public void updateInvestmentValue() {
        System.out.println("Método para atualizar valor de investimento.");
    }

    // Calcular lucro/prejuízo com base no valor atual de mercado
    public void calculateProfit() {
        System.out.println("Método para calcular lucro/prejuízo do investimento.");
    }

    // Verificar se está dando lucro
    public void isProfitable() {
        System.out.println("Método para verificar se está dando lucro chamado.");
    }
}
