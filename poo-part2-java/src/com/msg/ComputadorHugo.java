package com.msg;

public class ComputadorHugo {
    public static void main(String[] args) {
        MSNMenssager msn = new MSNMenssager();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMenssager fcb = new FacebookMenssager();
        msn.enviarMensagem();
        msn.receberMensagem();

        TelegramMenssager tlg = new TelegramMenssager();
        msn.enviarMensagem();
        msn.receberMensagem();
    }
}
