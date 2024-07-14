package modelagem.iphone;

import java.util.Scanner;

import modelagem.iphone.broswer.NavegadorInternet;
import modelagem.iphone.desbloqueioiphone.DesbloqueioMobile;
import modelagem.iphone.ipod.ReprodutorMusical;
import modelagem.iphone.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico, DesbloqueioMobile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DesbloqueioMobile desbloquear = new Iphone();
		ReprodutorMusical mobile = new Iphone();
		AparelhoTelefonico mobile1 = new Iphone();
		NavegadorInternet mobile2 = new Iphone();
		boolean sair = false;


		System.out.println("Arraste para direita para desbloquear Iphone.");
		
		System.out.println("Arrastou para direita? (s/n)");
		char toque = ler.next().charAt(0);
		
		if(toque == 's') {
			desbloquear.desbloquearIphone();

		}else {
			desbloquear.bloquearIphone();
			sair = true;
			}
		
		
		
		while(!sair) {
			//Simular clique
			
			
			System.out.println("-------------------------");
			System.out.println("1. Reproduto Musical");
			System.out.println("2. Aparelho Telefônico");
			System.out.println("3. Navegador Internet");
			System.out.println("4. Desligar/Bloquear Telefone");
			System.out.println("-------------------------");
			
			
			
			System.out.println("Digite o comando desejado: ");
			byte comand = ler.nextByte();
			
			
			switch(comand) {
			case 1:
				System.out.println("Digite o nome da musica: ");
				String titulo = ler.next();
				mobile.selecionarMusica(titulo);
				
				mobile.tocar();
				
				System.out.println("Pausar Música? (s/n)");
				char resp = ler.next().charAt(0);
				if(resp == 's') {
					mobile.pausar();
				}else {
					mobile.tocar();
				}
				break;	
			
			case 2:
				System.out.println("Digite o número com DDD: ");
				String num = ler.next();
				mobile1.ligar(num);
				System.out.println("Ligação Encerrada!");
				
				mobile1.atender();
				System.out.println("1. Atender");
				System.out.println("2. Negar");
				
				System.out.println("Escolha: ");
				byte escolha = ler.nextByte();
				
				if(escolha == 1) {
					System.out.println("Ligação Atendida");
				}else if(escolha == 2) {
					System.out.println("Ligação Negada.");
					mobile1.iniciarCorreioVoz();
				}
				
				
				
				break;
				
			case 3:
				System.out.println("Pesquisa: ");
				String site = ler.next();
				mobile2.exibirPagina(site);
				
				mobile2.adicionarNovaAba();
				
				mobile2.atualizarPaginaa();
				
				break;
				
			case 4:
				sair = true;
				desbloquear.bloquearIphone();
				break;
				
			default:
				System.out.println("Ação Incorreta. Celular Bloqueado.");
			}

		}
	}
	
	
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para +" + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Recebendo Ligação!");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de Voz Iniciado!");
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Acessando www." + url + ". Caregado...");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada!");
		
	}

	@Override
	public void atualizarPaginaa() {
		System.out.println("Página atualizando. Aguarde...");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando Música!");
		
	}

	@Override
	public void pausar() {
		System.out.println("Música Pausada!");
		
	}

	@Override
	public void selecionarMusica(String music) {
		System.out.println("A musíca " + music + ". Foi escolhida!");
		
	}


	@Override
	public void desbloquearIphone() {
		System.out.println("Iphone Desbloqueado!");
		
	}


	@Override
	public void bloquearIphone() {
		System.out.println("Celular Desligado/Bloqueado!");
		
	}


}
