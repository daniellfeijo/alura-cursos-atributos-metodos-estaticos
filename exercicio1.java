class Funcionario{
	//atributos da classe
	private String nome;
	private String departamento;
	private double salario;
	private String rg;
	private int identificador;
	public static int identificadorStatico = 1;

	public Funcionario(String nome){
		this.nome = nome;
	}

	public Funcionario(){
		this.identificador = identificadorStatico;
		identificadorStatico++;
	}
	
	//metodo recebeAumento sem retorno "void"
	//recebe como parametro o percetual de aumento	
	public void recebeAumento (double percentual){
		this.salario += this.salario*percentual;

	}
	//metodo calculaGanhoAnual com retorno double
	public double getGanhoAnual(){
		double ganhoAnual = this.salario*12;
		return ganhoAnual;		
	}
	//metodo para mostrar todos os atributos
	public void mostra(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salario: "+this.salario);
		System.out.println("RG: "+this.rg);
	}
	public int getIdentificador(){
		return this.identificador;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public double getSalario(){
		return this.salario;
	}
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	public String getDepartamento(){
		return this.departamento;
	}
	public void setRg(String rg){
		this.rg = rg;
	}
	public String getRg(){
		return this.rg;
	}

}

class TesteStatico{
	public static void main(String[] args){
		Funcionario joao = new Funcionario();
		System.out.println(joao.getIdentificador());
		Funcionario maria = new Funcionario();
		System.out.println(maria.getIdentificador());
		
	}


}