## Gustavo Konflanz Mezzomo RA: 	1460482121021

## Diagrama de caso de uso

### Requisitos Funcionais

<img src = https://github.com/gustavomezzomo/bertoti/blob/main/engenhariaDeSoftware/Caso-de-uso.drawio.png>

## Requisitos Não Funcionais

## Usabilidade

<img src = https://github.com/gustavomezzomo/bertoti/blob/main/engenhariaDeSoftware/eur%C3%ADstica.drawio.png>

Heurística 8: design e estética minimalista:
design simples voltado a uma navegação acessível a todos, permitindo que uma pessoa com menos prática e experiencia com ferramentas do tipo consiga encontrar o que quer utilizar.


## Diagrama de classe UML

<img src = https://github.com/gustavomezzomo/bertoti/blob/main/engenhariaDeSoftware/exerc%C3%ADcio%20diagrama%20de%20classes.drawio.png>

~~~java
import java.util.LinkedList;
import java.util.List;

public class Plataforma de Ensino{

     private List<Pessoa> pessoas = new LinkedList<Pessoa>();

     public void cadastrarPessoa(Pessoa pessoas){
          pessoas.add(pessoas);
     }

     public List<Pessoa> buscarPessoaNome(String nome){
           List<Pessoa> encontradas = new LinkedList<Pessoa>();
           for(Pessoa pessoa:pessoas){
                if(pessoa.getNome().equals(nome)) encontradas.add(pessoa);
           }
           return encontradas;
     }

     public Pessoa buscarRa(int Ra){
          for(Pessoa pessoa:pessoas){
               if(pessoa.getRa().equals(Ra)) return pessoa; 
          }
          return null;
     }

     public List<Pessoa> getPessoas(){
           return pessoas;
     }
}

public class Pessoa{
	
	private int ra;
	private String nome;
	private String tipo;
	
	public Pessoa(int ra, String nome, String tipo) {
		this.ra = ra;
		this.placa = placa;
		this.espec = espec;
	}


	public int getRa(){
		return ra;
	}
	
	public void setRa(String novaPlaca){
		ra = novoRa;
	}

	public String getNome(){
		return nome;
	}
	
	public void setNome(String novoNome){
		nome = novoNome;
	}

	public String getTipo(){
		return tipo;
	}
	
	public void setTipo(String novoTipo){
		tipo = novoTipo;
	}

}
public class Disciplina{
	
	private String matéria;
		
	public Pessoa(String matéria) {
		this.placa = placa;
	}

	public String getMatéria(){
		return matéria;
	}
	
	public void setMatéria(String novaMatéria){
		matéria = novaMatéria;
	}
  
  ## Classe Pessoa
  
  <img src = https://github.com/gustavomezzomo/bertoti/blob/main/engenhariaDeSoftware/Classe%20Pessoa.drawio.png>
  
  ## Plataforma de ensino
  
  <img src = https://github.com/gustavomezzomo/bertoti/blob/main/engenhariaDeSoftware/Classe%20PlataformaEnsino.drawio.png>
    
  ## Turma
  
  <img src = https://github.com/gustavomezzomo/bertoti/blob/main/engenhariaDeSoftware/Classe%20turma.drawio.png>
  
~~~


