import java.util.Random;
public class Jogo {
  public static void main(String[] args) throws Exception {
    Random gerador = new Random();
    Personagem personagem = new Personagem("John");
    
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
      
      Thread.sleep(8000);
    }
  }
}
