import java.awt.Color;

import lista.Lista;

public class Peao {
	
	Lista lst;
	Peca p, p1;

	public Peao(String cor_jogador) {
		lst = new Lista();
		p = new Peca();
		p1 = new Peca();
		
		PintaCor(cor_jogador);
		PopulaLista(cor_jogador);
	}
	
	private void PintaCor(String cor_jogador) {
		switch(cor_jogador) {
		case "vermelho":
			p.a = Color.RED;
			p1.a = Color.RED;
			break;
		case "amarelo":
			p.a = Color.YELLOW;
			p1.a = Color.YELLOW;
			break;
		case "verde":
			p.a = Color.GREEN;
			p1.a = Color.GREEN;
			break;
		case "azul":
			p.a = Color.BLUE;
			p1.a = Color.BLUE;
			break;
		}
	}
	
	private void PopulaLista(String cor_jogador) {
		switch(cor_jogador) {
		case "vermelho":
			lst.insIni(new Vetor(6,1)); // 1- casa inicio vermelho
			lst.insFin(new Vetor(6,2)); // 2
			lst.insFin(new Vetor(6,3)); // 3
			lst.insFin(new Vetor(6,4)); // 4
			lst.insFin(new Vetor(6,5)); // 5
			lst.insFin(new Vetor(5,6)); // 6
			lst.insFin(new Vetor(4,6)); // 7
			lst.insFin(new Vetor(3,6)); // 8
			lst.insFin(new Vetor(2,6)); // 9
			lst.insFin(new Vetor(1,6)); // 10- casa preta
			lst.insFin(new Vetor(0,6)); // 11
			lst.insFin(new Vetor(0,7)); // 12
			lst.insFin(new Vetor(0,8)); // 13
			lst.insFin(new Vetor(1,8)); // 14- casa inicio verde
			lst.insFin(new Vetor(2,8)); // 15
			lst.insFin(new Vetor(3,8)); // 16
			lst.insFin(new Vetor(4,8)); // 17
			lst.insFin(new Vetor(5,8)); // 18
			lst.insFin(new Vetor(6,9)); // 19
			lst.insFin(new Vetor(6,10)); // 20
			lst.insFin(new Vetor(6,11)); // 21
			lst.insFin(new Vetor(6,12)); // 22
			lst.insFin(new Vetor(6,13)); // 23- casa preta
			lst.insFin(new Vetor(6,14)); // 24
			lst.insFin(new Vetor(7,14)); // 25
			lst.insFin(new Vetor(8,14)); // 26
			lst.insFin(new Vetor(8,13)); // 27- casa inicio amarelo
			lst.insFin(new Vetor(8,12)); // 28
			lst.insFin(new Vetor(8,11)); // 29
			lst.insFin(new Vetor(8,10)); // 30
			lst.insFin(new Vetor(8,9)); // 31
			lst.insFin(new Vetor(9,8)); // 32
			lst.insFin(new Vetor(10,8)); // 33
			lst.insFin(new Vetor(11,8)); // 34
			lst.insFin(new Vetor(12,8)); // 35
			lst.insFin(new Vetor(13,8)); // 36- casa preta
			lst.insFin(new Vetor(14,8)); // 37
			lst.insFin(new Vetor(14,7)); // 38
			lst.insFin(new Vetor(14,6)); // 39
			lst.insFin(new Vetor(13,6)); // 40- casa inicio azul
			lst.insFin(new Vetor(12,6)); // 41
			lst.insFin(new Vetor(11,6)); // 42
			lst.insFin(new Vetor(10,6)); // 43
			lst.insFin(new Vetor(9,6)); // 44
			lst.insFin(new Vetor(8,5)); // 45
			lst.insFin(new Vetor(8,4)); // 46
			lst.insFin(new Vetor(8,3)); // 47
			lst.insFin(new Vetor(8,2)); // 48
			lst.insFin(new Vetor(8,1)); // 49-  casa preta
			lst.insFin(new Vetor(8,0)); // 50
			lst.insFin(new Vetor(7,0)); // 51
			lst.insFin(new Vetor(6,0)); // 52

			//caminho vermelho
			lst.insFin(new Vetor(7,1)); // 53
			lst.insFin(new Vetor(7,2)); // 54
			lst.insFin(new Vetor(7,3)); // 55
			lst.insFin(new Vetor(7,4)); // 56
			lst.insFin(new Vetor(7,5)); // 57

			//caminho verde
			lst.insFin(new Vetor(1,7)); // 58
			lst.insFin(new Vetor(2,7)); // 59
			lst.insFin(new Vetor(3,7)); // 60
			lst.insFin(new Vetor(4,7)); // 61
			lst.insFin(new Vetor(5,7)); // 62

			//caminho amarelo
			lst.insFin(new Vetor(7,13)); // 63
			lst.insFin(new Vetor(7,12)); // 64
			lst.insFin(new Vetor(7,11)); // 65
			lst.insFin(new Vetor(7,10)); // 66
			lst.insFin(new Vetor(7,9)); // 67

			//caminho azul
			lst.insFin(new Vetor(13,7)); // 68
			lst.insFin(new Vetor(12,7)); // 69
			lst.insFin(new Vetor(11,7)); // 70
			lst.insFin(new Vetor(10,7)); // 71
			lst.insFin(new Vetor(9,7)); // 72

			//final
			lst.insFin(new Vetor(7,6)); // 73
			lst.insFin(new Vetor(6,7)); // 74
			lst.insFin(new Vetor(7,8)); // 75
			lst.insFin(new Vetor(8,7)); // 76
			
			lst.posIni();
			
			break;
		case "amarelo":

		case "verde":

		case "azul":

		}


	}
}