package Teoria;

public class classeseMetodosFinais {

	public static void main(String[] args) {
		
		// CLASSES E MÉTODOS FINAIS
		
		/*
		 * Palavra chave: FINAL
		 * 
		 * CLASSE: Evita que a classe seja herdada
		 * MÉTODO: Evita que o método sob seja sobreposto
		 * 
		 */
		
		/*
		 * SINTAXE
		 * 
		 * public final class SavingsAccount {}
		 * 
		 */
		
		/*
		 * EXEMPLO - CLASSE FINAL
		 * 
		 * Suponha que você queira evitar que sejam criadas subclasses de SavingsAccount
		 * 
		 * public final class SavingsAccount {
		 * 		(...) }
		 * 
		 */
		
		/*
		 * EXEMPLO - MÉTODO FINAL
		 * 
		 * Suponha que você não queira que o método Withdraw de SavingsAccount seja sobreposto
		 * 
		 * @Override
		 * public final void withdraw(double amount) {
		 * 		balance -= amount;
		 * }
		 * 
		 */
		
		// PRA QUÊ?
		/*
		 * Segurança: Dependendo das regras do negócio, ás vezes é desejável garantir que uma classe não seja
		 * herdada, ou que um método não seja sobreposto.
		 * (Geralmente convém acrescentar FINAL em métodos sobrepostos, pois sobreposições múltiplas podem ser
		 * uma porta de entrada para inconsitências).
		 * 
		 * Performance: Atributos de tipo de uma classe final são analisados de forma mais rápida em tempo de 
		 * execução.
		 * (Exemplo clássico: String)
		 */

	}

}
