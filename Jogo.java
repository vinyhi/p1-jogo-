import java.util.Random;
public class Jogo {
  public static void main(String[] args) throws Exception {
    Random gerador = new Random();
    Random gerador2 = new Random();
    Personagem personagem = new Personagem("John");
    Personagem personagem2 = new Personagem("Dio", 5, 8, 0);
    
    while(true){
      int oQueFazer = gerador.nextInt(3); //[0..3[
      switch(oQueFazer){
        case 0:
          personagem.cacar();
          break;
        case 1:
        personagem.comer();
          break;
        case 2:
        personagem.dormir();
        break;
      }
      personagem.morrer();
      personagem.exibirEstado();
    
      System.out.println("--------------------");
     
      
      int oQueFazer2 = gerador2.nextInt(3); //[0..3[
      switch(oQueFazer2){
        case 0:
          personagem2.cacar();
          break;
        case 1:
        personagem2.comer();
          break;
        case 2:
        personagem2.dormir();
        break;
      }
      personagem2.morrer();
      personagem2.exibirEstado();
      
      Thread.sleep(800);
      
    }
}}


