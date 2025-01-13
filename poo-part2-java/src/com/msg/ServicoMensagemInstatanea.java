package com.msg;

public class ServicoMensagemInstatanea {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando Mensagem");
        salvarHistoricoInternet();
    }
    public void receberMensagem(){
        System.out.println("Recebendo Mensagem");
    }
    private void validarConectadoInternet() {
        System.out.println("Validando Conectado Internet");
    }
    private void salvarHistoricoInternet() {
        System.out.println("Salvando Historico Internet");
    }
}
