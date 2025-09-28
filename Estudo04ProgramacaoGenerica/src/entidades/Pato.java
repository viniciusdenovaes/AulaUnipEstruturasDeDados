package entidades;

public class Pato implements Comparable<Pato>{
	
	private String nome;
	private int idade;
	
	public Pato(String aNome, int aIdade) {
		this.nome = aNome;
		this.idade = aIdade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public boolean equals(Object other) {
		
		if(this==other) return true;
		
		if(other==null) return false;
		
		if (!(other instanceof Pato)) return false;
		
		Pato otherPato = (Pato)other;
		
		return this.nome==otherPato.nome;
	}
	
	@Override
	public int compareTo(Pato otherPato) {
		if(this.equals(otherPato)) return 0;
		
		return this.nome.compareTo(otherPato.nome);
	}
	
	
	
	@Override
	public String toString() {
		return "Pato [nome=" + nome + ", idade=" + idade + "]";
	}

}
