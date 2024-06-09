public class Iphone {
    public static void main(String args[]) {

        System.out.println("Telefone Ligado");

        ReprodutorMusical musica = new ReprodutorMusical();
        musica.tocar();
        musica.pausar();
        musica.selecionarMusica();

        System.out.println("Chamada");

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        System.out.println("Iniciando Navegador");

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.AtualizarPagina();
    }
}