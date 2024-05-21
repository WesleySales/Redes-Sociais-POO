package pacotes;

import Apps.MSNMessenger;
import Apps.ServicoMensagemInstantanea;
import Apps.Telegram;
import Apps.Whatsapp;
public class MeuComputador {
        public static void main(String[] args) {

            ServicoMensagemInstantanea smi = null;
            String appEscolhido = "Whatsapp";

            if (appEscolhido.equals("msn"))
                smi = new MSNMessenger();
            else if (appEscolhido.equals("Telegram"))
                smi = new Telegram();
            else if (appEscolhido.equals("Whatsapp"))
                smi = new Whatsapp();

            smi.enviarMensagem();
            smi.receberMensagem();

        }
}