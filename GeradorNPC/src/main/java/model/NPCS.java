package model;

import java.util.Random;

public class NPCS {

	private String raca;
	private int idade;
	private String alinhamento;
	private String atributoAlto;
	private String atributoBaixo;
	private String estiloCombate;

	static Random random = new Random();

	public NPCS() {
		
	}




	public void statusNPC () {
		gerandoRaca();
		escolherIdade();
		escolherAlinhamento();
		escolhaAtributoAltoeBaixo();
		escolhendoEstiloCombate();
	
//		System.out.println("Raça: " + getRaca());
//		System.out.println("Idade: " + getIdade());
//		System.out.println("Alinhamento: " + getAlinhamento());
//		System.out.println("Atributo alto: " + getAtributoAlto());
//		System.out.println("Atributo baixo: " + getAtributoBaixo());
//		System.out.println("Estilo de combate: " + getEstiloCombate());
	}
	
	
	

	public void gerandoRaca () {
		int escolha;
		escolha = random.nextInt(10) + 1;
		switch (escolha) {
		case 1:
			setRaca("Elfo");
			break;
		case 2:
			setRaca("Meio-Elfo");
			break;
		case 3:
			setRaca("Draconato");
			break;
		case 4:
			setRaca("Humano");
			break;
		case 5:
			setRaca("Halfling");
			break;
		case 6:
			setRaca("Warforged");
			break;
		case 7:
			setRaca("Tiefling");
			break;
		case 8:
			setRaca("Gnomo");
			break;
		case 9:
			setRaca("Anão");
			break;
		case 10:
			setRaca("Shapeshifter");
			break;

		default:
			break;
		}
	}

	public void escolherIdade () {
		int escolha; 
		if (getRaca() == "Anão" || getRaca() == "Meio-Elfo" || getRaca() == "Elfo" || getRaca() == "Draconato") {
			escolha = random.nextInt(250) + 20;
		}else if (getRaca() == "Warforged") {
			escolha = random.nextInt(1000) + 20;
		}else {
			escolha = random.nextInt(81) + 12;
		}
		setIdade(escolha);
		
		
		
		
	}

	public void escolherAlinhamento () {
		int escolha;
		escolha = random.nextInt(3) + 1;
		switch (escolha) {
		case 1:
			setAlinhamento("do Bem");
			break;
		case 2:
			setAlinhamento("Neutro");
			break;
		case 3:
			setAlinhamento("do Mal");
			break;
		default:
			break;
		}

	}

	public void escolhaAtributoAltoeBaixo () {
		int escolha1;
		int escolha2;

		escolha1 = random.nextInt(6) + 1;

		switch (escolha1) {
		case 1:
			setAtributoAlto("Força");
			break;
		case 2:
			setAtributoAlto("Destreza");
			break;
		case 3:
			setAtributoAlto("Constituição");
			break;
		case 4:
			setAtributoAlto("Inteligência");
			break;
		case 5:
			setAtributoAlto("Sabedoria");
			break;
		case 6:
			setAtributoAlto("Carisma");
			break;
		default:
			break;
		}

		do {
			escolha2 = random.nextInt(6) + 1;
		} while (escolha2 == escolha1);

		switch (escolha2) {
		case 1:
			setAtributoBaixo("Força");
			break;
		case 2:
			setAtributoBaixo("Destreza");
			break;
		case 3:
			setAtributoBaixo("Constituição");
			break;
		case 4:
			setAtributoBaixo("Inteligência");
			break;
		case 5:
			setAtributoBaixo("Sabedoria");
			break;
		case 6:
			setAtributoBaixo("Carisma");
			break;
		default:
			break;
		}
	}


	public void escolhendoEstiloCombate () {
		int escolha;
		escolha = random.nextInt(4) + 1;

		switch (escolha) {
		case 1:
			setEstiloCombate("Melee");
			break;
		case 2:
			setEstiloCombate("Arma Ranged");
			break;
		case 3:
			setEstiloCombate("Suporte");
			break;
		case 4:
			setEstiloCombate("Mago");
			break;
		default:
			break;
		}

	}



	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getAlinhamento() {
		return alinhamento;
	}
	public void setAlinhamento(String alinhamento) {
		this.alinhamento = alinhamento;
	}
	public String getAtributoAlto() {
		return atributoAlto;
	}
	public void setAtributoAlto(String atributoAlto) {
		this.atributoAlto = atributoAlto;
	}
	public String getAtributoBaixo() {
		return atributoBaixo;
	}
	public void setAtributoBaixo(String atributoBaixo) {
		this.atributoBaixo = atributoBaixo;
	}
	public String getEstiloCombate() {
		return estiloCombate;
	}
	public void setEstiloCombate(String estiloCombate) {
		this.estiloCombate = estiloCombate;
	}



}
