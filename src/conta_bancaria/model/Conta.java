package conta_bancaria.model;

public class Conta {

	/* Atributos da Classe*/
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	// Metodo Construtor -Gerar as instâncias (Objetos) da Classe
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	// métodos Get(visualizar os dados) e Set (alterar os dados)
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	
	//Metodos Auxiliares
	
	public boolean sacar(float valor) {
		if (this.saldo < valor)
			return false;
		
		this.saldo -= valor;
		return true;
	}
	
	public void depositar(float valor) {
		this.saldo += valor;
	}
	
	public void visualizar() {
		
		
		String tipo = "";
		
		switch(this.tipo) {
			case 1:
				tipo = "Conta Corrente";
				break;
			case 2:
				tipo = "Conta Corrente";
				break;
		}
		System.out.println("******************************************");
		System.out.println("             DADOS DA CONTA               ");
		System.out.println("******************************************");
		System.out.printf("Número da conta: %d%n", this.numero);
		System.out.printf("Número da agência: %d%n", this.agencia);
		System.out.printf("Tipo da tipo: %s%n", tipo);
		System.out.printf("Nome do titular: %s%n", this.titular);
		System.out.printf("Número da saldo: %.2f%n", this.saldo);

	}
	
	
	

	
	
	}
