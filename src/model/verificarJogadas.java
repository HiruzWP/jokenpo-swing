package model;

import view.GameInterface;

public class verificarJogadas {

	//gera jogada da máquina
	private static int gerarJogada() {

		int JogadaOponente = (int) (Math.random() * 3 + 1);

		return JogadaOponente;
	}
	
	public static void adicionarPlay(Jogada jogada) {

		verificarVencedor(jogada, gerarJogada());
		//
	}
	
	private static void verificarVencedor(Jogada player, int opponent) {
		
		
		if(player == Jogada.PEDRA && opponent == 2) {
			
			GameInterface.setResultado("Oponente venceu!", "Jogada do oponente: PAPEL", Jogada.PEDRA);
			
			
		}else if(player == Jogada.PEDRA && opponent == 3) {
			
			GameInterface.setResultado("Voce venceu!", "Jogada do oponente: TESOURA", Jogada.PEDRA);
				
		}else if(player == Jogada.PAPEL && opponent == 1) {
			
			GameInterface.setResultado("Voce venceu!", "Jogada do oponente: PEDRA", Jogada.PAPEL);
		
		}else if(player == Jogada.PAPEL && opponent == 3) {
			
			GameInterface.setResultado("Oponente venceu!", "Jogada do oponente: TESOURA", Jogada.PAPEL);
			
		}else if(player == Jogada.TESOURA && opponent == 1) {
			
			GameInterface.setResultado("Oponente venceu!", "Jogada do oponente: PEDRA", Jogada.TESOURA);
			
		}else if(player == Jogada.TESOURA && opponent == 2) {
			
			GameInterface.setResultado("Voce venceu!", "Jogada do oponente: PAPEL", Jogada.TESOURA);
			
		}else {
			
			GameInterface.setResultado("Empate.", "emp", player);
			
		}
		
	}
}
