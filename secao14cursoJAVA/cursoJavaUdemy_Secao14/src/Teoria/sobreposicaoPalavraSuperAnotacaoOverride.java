package Teoria;

public class sobreposicaoPalavraSuperAnotacaoOverride {

	public static void main(String[] args) {
		//SOBREPOSIÇÃO OU SOBRESCRITA
		
		/*
		 * É a implementação d eum método de uma superclasse na subclasse
		 * 
		 * É fortemente recomendável usar a anotação @Override em um método sobrescrito
		 * - Facilita a leitura e compreenção do código
		 * - Avisamos ao compilador (boa prática)
		 */
		
		/*
		 * EXEMPLO
		 * 
		 * Suponha que a operação de saque possui uma taxa no valor de 5.0. Entretanto, se a conta
		 * for do tipo poupança, esta taxa não deve ser cobrada.
		 * 
		 * Como resolver isso?
		 * 
		 * RESPOSTA: Sobrescrevendo o método withdraw na subclasse SavingsAccount
		 * 
		 * Account:
		 * 
		 * public void withdraw(double amount) {
		 * 		balance -= amount + 5.0;
		 * }
		 * 
		 * SavingsAccount:
		 * 
		 * @Override
		 * public void withdraw(double amount) {
		 * 		balance -= amount;
		 * }
		 */
		

	}

}
