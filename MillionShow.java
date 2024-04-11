import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class MillionShow {
   public static void main(String args[]) {
      ImageIcon logo = new ImageIcon("images/logo.png");

      String[] selection = { "Comecar" };

      // show the welcome message
      int welcome = JOptionPane.showOptionDialog(null,
            "Voce esta preparadoª para ser desafiado por Silvio, com perguntas de conhecimentos gerais, e ter a chance de ganhar 1 milhão?",
            "Show do Milhao", JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE, logo, selection, selection[0]);

      if (welcome != 0) {
         exit();
      }

      ImageIcon silvio1 = new ImageIcon("images/silvio1.png");

      // ask for the user's name
      Object scanInput = JOptionPane.showInputDialog(null,
            "Maoeee! Bem vindo ao Show do Milhao, antes de iniciar as perguntas me conte, qualeh seu nome queridoª?",
            "Conhecendo Silvio", JOptionPane.INFORMATION_MESSAGE, silvio1, null, "");

      if (scanInput == null || scanInput.equals("")) {
         scanInput = "fulano";
      }

      ImageIcon silvio2 = new ImageIcon("images/silvio2.png");

      Object[] alternatives1 = { "Lenin", "Gorbatchov", "Karl Marx", "Allan Kardec" };

      // first question
      Object question1 = JOptionPane.showInputDialog(null,
            "HiHiHiHi, certo " + scanInput
                  + " vamos começar! Primeira Pergunta... Quem é o autor do manisfesto comunista?",
            "Primeira Pergunta - Valendo 250 mil", JOptionPane.QUESTION_MESSAGE, silvio2, alternatives1,
            alternatives1[0]);

      if (question1 != "Karl Marx") {
         exit();
      }

      ImageIcon silvio3 = new ImageIcon("images/silvio3.png");

      Object[] alternatives2 = { "Astigmatismo", "Pedofilia", "Vitiligo", "Bruxismo" };

      // second question
      Object question2 = JOptionPane.showInputDialog(null, "Muito bem " + scanInput
            + " vamos para próxima... Como se chama a doença que causou o clariamento da pele de Michael Jackson?",
            "Segunda Pergunta - Valendo 500 mil", JOptionPane.QUESTION_MESSAGE, silvio3, alternatives2,
            alternatives2[0]);

      if (question2 != "Vitiligo") {
         exit();
      }

      ImageIcon silvio5 = new ImageIcon("images/silvio5.png");

      Object[] alternatives3 = { "Jabuti", "Onça", "Arara", "Tucano" };

      // third question
      Object question3 = JOptionPane.showInputDialog(null,
            "Maoeeeeee as coisas entao esquentando " + scanInput
                  + " mais uma pergunta... Que animal da fauna brasileira esta retratado na nota de dez reais?",
            "Terceira Pergunta - Valendo 750 mil", JOptionPane.QUESTION_MESSAGE, silvio5, alternatives3,
            alternatives3[0]);

      if (question3 != "Arara") {
         exit();
      }

      ImageIcon maisa1 = new ImageIcon("images/maisa1.png");

      String[] alternatives4 = { "Continuar" };

      // fourth question by Maisa
      int question4 = JOptionPane.showOptionDialog(null, "Silvioo eu tenho uma perguntaa!!", "Quee, Maisa?",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE, maisa1, alternatives4, alternatives4[0]);

      if (question4 != 0) {
         exit();
      }

      ImageIcon silvio6 = new ImageIcon("images/silvio6.png");

      String[] alternatives5 = { "Continuar" };

      // Maisa continues
      int question5 = JOptionPane.showOptionDialog(null, "HiHiHiHi pode fala Maisa!", "Quee, Maisa?",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE, silvio6, alternatives5, alternatives5[0]);

      if (question5 != 0) {
         exit();
      }

      ImageIcon maisa2 = new ImageIcon("images/maisa2.png");

      Object[] alternatives6 = { "Touca", "Peruca", "Everson Zoio", "Torradeira" };

      // Maisa's bonus question
      Object question6 = JOptionPane.showInputDialog(null,
            "Então " + scanInput + ", minha pergunta de ouro é... O que o Silvio usa na cabeça?",
            "Quarta Pergunta - Pergunta Bônus", JOptionPane.QUESTION_MESSAGE, maisa2, alternatives6, alternatives6[0]);

      if (question6 != "Peruca") {
         exitMaisa();
      }

      ImageIcon silvio7 = new ImageIcon("images/silvio7.png");

      Object[] alternatives7 = { "Diana", "Lois Lane", "Jane", "Chita" };

      // fifth question
      Object question7 = JOptionPane.showInputDialog(null, "Ok maisa, flw... Qual é nome da mulher do Tarzan?",
            "Quinta Pergunta - Valendo 800 mil", JOptionPane.QUESTION_MESSAGE, silvio7, alternatives7,
            alternatives7[0]);

      if (question7 != "Jane") {
         exit();
      }

      ImageIcon silvio8 = new ImageIcon("images/silvio8.png");

      Object[] alternatives8 = { "Chiquita Bacana", "Chiquinha Gonzaga", "Chica da Silva", "Chiquititas" };

      // sixth question
      Object question8 = JOptionPane.showInputDialog(null,
            "Voce esta conseguindo hein, vamos ver se consegue passar dessa... Que compositora brasileira fez sucesso com a sua marchinha 'Abre Alas'? ",
            "Sexta Pergunta - Valendo 900 mil", JOptionPane.QUESTION_MESSAGE, silvio8, alternatives8, alternatives8[0]);

      if (question8 != "Chiquinha Gonzaga") {
         exit();
      }

      ImageIcon silvio9 = new ImageIcon("images/silvio9.png");

      Object[] alternatives9 = { "13", "15", "14", "16" };

      // seventh question
      Object question9 = JOptionPane.showInputDialog(null,
            "Carambolas voce nao erra uma! Quantas letras contem a escrita da bandeira nacional brasileira?",
            "Setima Pergunta - Valendo 950 mil", JOptionPane.QUESTION_MESSAGE, silvio9, alternatives9,
            alternatives9[0]);

      if (question9 != "15") {
         exit();
      }

      ImageIcon silvio4 = new ImageIcon("images/silvio4.png");

      Object[] alternatives10 = { "Corra", "Ande", "Pense", "Fale" };

      // final question for the million
      Object question10 = JOptionPane.showInputDialog(null,
            "Que  rufem os tambores... Pergunta valhendo 1 milhao! Segundo a lenda, ao terminar de esculpir Moises Michelangelo fez qual pedido a estatua?",
            "Terceira Pergunta - Valendo 1 milhão", JOptionPane.QUESTION_MESSAGE, silvio4, alternatives10,
            alternatives10[0]);

      if (question10 != "Fale") {
         exit();
      }

      // game completed
      ImageIcon silvioMoney = new ImageIcon("images/silviograna.png");

      JOptionPane.showMessageDialog(null, "*Silvao lhe entrega o pacote enquanto admira sua inteligencia",
            "Voce ganhou 1 milhao!", JOptionPane.PLAIN_MESSAGE, silvioMoney);
   }

   static void exit() {
      ImageIcon silvioSad = new ImageIcon("images/silviotristo.png");
      JOptionPane.showMessageDialog(null,
            "Voce decepcionou tanto Silvão, que ele foi obrigado a expulsa-loª do programa sem nada!", "perdeu",
            JOptionPane.WARNING_MESSAGE, silvioSad);
      System.exit(0);
   }

   static void exitMaisa() {
      ImageIcon maisaSad = new ImageIcon("images/maisa3.png");
      JOptionPane.showMessageDialog(null, "Oh la, eh muito burro Silvio!", "perdeu", JOptionPane.WARNING_MESSAGE,
            maisaSad);
      System.exit(0);
   }
}
