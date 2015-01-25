class Conta{
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;
	private static int numeroIncremental = 1;

	//Posso invocar um construtor dentro do
	//outro da seguite forma:
	public Conta(int numero, double limite){
		this(numero, limite, 0);
	}
	
	public Conta(int numero, double limite, double saldoInicial){
		this.numero = numero;
		this.limite = limite;
		this.saldo = saldoInicial;
	}

	public Conta(){
		this.numero = numeroIncremental;
		numeroIncremental++;

	}

	public void saca(double valor){
		if (valor>this.saldo + this.limite){
			System.out.println("Saque invalido");
		}else{
			this.saldo = this.saldo - valor;
		}
	}

	public void deposita(double valor){
		this.saldo = this.saldo + valor;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public void setLimite(double novoLimite){
		this.limite = novoLimite;
	}

	public int getNumero(){
		return this.numero;
	}
}

class Cliente{
	String nome;
	String endereco;
}

class TesteStatic{
	public static void main(String args[]){
		
		Conta joao = new Conta();
		System.out.println(joao.getNumero());

		Conta jose = new Conta();
		System.out.println(jose.getNumero());
	}
}