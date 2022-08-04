package apppb_contas;

public class Conta {
	private int num;
	private String nome;
	private double saldo;
	
	public Conta(int num, String nome, double saldo) {
		this.num = num;
		this.nome = nome;
		this.saldo = saldo;
		
	}

	@Override
	public String toString() {
		return "Conta [num = " + num + ", nome = " + nome + ", saldo = " + saldo + "]";
	}
	
	public void creditar(double valor) {
		saldo += valor;
	}
	
	public void debitar(double valor) {
		saldo -= valor;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
