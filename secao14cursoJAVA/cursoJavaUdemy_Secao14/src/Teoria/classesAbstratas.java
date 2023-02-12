package Teoria;

public class classesAbstratas {

	public static void main(String[] args) {
		
		// CLASSES ABSTRATAS
		
		/*
		 * São classes que não podem ser instanciadas
		 * 
		 * É uma forma de garantir herança total: somente subclasses não abstratas podem ser instanciadas,
		 * mas nunca a superclasses abstratas.
		 */
		
		/*
		 * EXEMPLO
		 * 
		 * Suponha que em um negócio relacionado a banco, apenas contas poupança e contas para empresas são permitidas.
		 * Não existe conta comum.
		 * 
		 * Para garantir que contas comuns não possam ser instanciadas, basta acrescentar a palavra ABSTRACT na 
		 * declaração da classe.
		 * 
		 * public abstract class Account {
		 * 		(...)
		 * }
		 * 
		 */
		
		// QUESTIONAMENTO
		
		/*
		 * Se a classe Account não pode ser instanciada, porque simplesmente não criar somente SavingsAccount
		 * e BusinessAccount?
		 */
		
		// RESPOSTA
		
		/*
		 * Reuso
		 * Polimorfismo
		 * A superclasse genérica nos permite tratar de forma fácil e uniforme todos os tipos de conta, inclusive
		 * com polimorfismo se for o caso (como fizemos nos últimos exercícios). Por exemplo, você pode colocar todos tipos
		 * de contas em uma mesma coleção.
		 */
		
		// DEMO
		
		/*
		 * Suponha que você queira totalizar o saldo de todas as contas, ou seja depositar 10.000 em todas as contas.
		 */
		
		

	}

}
