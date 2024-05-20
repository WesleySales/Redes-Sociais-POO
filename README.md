## Redes sociais com POO

Projeto simples proposto no bootcamp para melhor entendimento dos fundamentos da Programação Orientada a Objetos. 
##

Resumo: O projeto foi dividido em 5 classes: 
- 3 para os apps (Telegram, MSNMessenger e Whatsapp);
- 1 classe mãe para passar os métodos que todos os apps devem herdar (ServicoMensagemInstantanea);
- 1 classe chamada MeuComputador para demonstração.

## Usando os Pilares da POO: 
### Herança:
Sabendo que todos os aplicativos partem do mesmo principio de enviar mensagens, existem métodos em comum que eu pude aproveitar a partir da Herança.
Criei uma "Classe mãe", na qual trabalhei os métodos comuns para funcionamento de uma aplicativo do gênero. 
      
      package Apps;
      
      public class ServicoMensagemInstantanea {
          public void enviarMensagem() {
              validarConexaoInternet();
              System.out.println("Enviando mensagem");
              salvarHistoricoMensagem();    
          }
      
          public void receberMensagem() {
              System.out.println("Recebendo mensagem");
      
          }
          protected void validarConexaoInternet() {
              System.out.println("Verificando conexão");
      
          }
          private void salvarHistoricoMensagem() {
              System.out.println("Salvando histórico");
          }
      }


### Encapsulamento
Todo projeto é feito em inumeras camadas nas quais teremos interação de diferentes pessoas, usuários, desenvolvedores, prestadores de serviço, entre outros. A exemplo deste projeto, os usuários dos aplicativos de mensagem estão interessados em enviar e receber mensagens e os outros processos para o funcionamento do aplicativo, por mais que sejam imprescindíveis, não precisam estar visíveis para todos. 

Sendo mais direto, para enviar e receber uma mensagem, o usuário precisa estar com acesso a internet e os aplicativos fazem essa validação. Porém o usuário nao precisa ver como é realizado este processo ponta a ponta, apenas se ele foi bem sucedido ou não. Isso vale tambem para como o historico de mensagens é salvo. É importante, mas o usuário não precisa dos detalhes de como é feito.

        public void receberMensagem() {
              System.out.println("Recebendo mensagem");
      
          }
          protected void validarConexaoInternet() {
              System.out.println("Verificando conexão");
      
          }
          private void salvarHistoricoMensagem() {
              System.out.println("Salvando histórico");
          }

##
### Abstração

##
### Polimorfismo

