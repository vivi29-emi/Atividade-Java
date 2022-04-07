package br.com.generation.encapsulamento;

public class Exherança {

	public static void main(String[] args) {
		
		Cachorro adocao = new Cachorro();
		Cavalo adocao1=new Cavalo();
		Preguiça adocao2 = new Preguiça();
		
		
		adocao.setNome("Bolota");
		adocao.setRaça("Labrador");
		adocao.setIdade(2);
		adocao.setCor("Bege");
		adocao.setEmiteSom("Au ...Au");
		adocao.setVelocidade(68);
		
		
		adocao1.setNome("Zorro");
		adocao1.setTipos("Friesian");
		adocao1.setCor("Preto");
		adocao1.setIdade(25);
		adocao1.setVelocidade(800);
		adocao1.setAltura("1,75 m ");
		
		adocao2.setNome("Flash");
		adocao2.setTipos("Xenarthra");
		adocao2.setCor("Bege e preto");
		adocao2.setIdade(20);
		adocao2.setAmbiente("Preferência em arvores");
		
		System.out.println("************Dados para doação***************");
		System.out.println();
		System.out.println("----------Cachorro-----------");
		System.out.println();
		System.out.println("Nome : "  + adocao.getNome());
		System.out.println("Raça: "   + adocao.getRaça());
		System.out.println("Idade: "  + adocao.getIdade());
		System.out.println("Cor: "    +adocao.getCor());
		System.out.println("Som emitido rsrsr...: " + adocao.getEmiteSom());
		System.out.println("Velocidade: "           +adocao.getVelocidade());
		
		System.out.println("----------Cavalo-----------");
		System.out.println();
		System.out.println("Nome : "  + adocao1.getNome());
		System.out.println("Raça: "   + adocao1.getTipos());
		System.out.println("Idade: "  + adocao1.getIdade());
		System.out.println("Cor: "    +adocao1.getCor());
		System.out.println("Velocidade: "           +adocao1.getVelocidade());
		
		System.out.println("----------Bicho Preguiça-----------");
		System.out.println();
		System.out.println("Nome : "  + adocao2.getNome());
		System.out.println("Raça: "   + adocao2.getTipos());
		System.out.println("Idade: "  + adocao2.getIdade());
		System.out.println("Cor: "    +adocao2.getCor());
		System.out.println("Velocidade: "           +adocao2.getAmbiente());
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
