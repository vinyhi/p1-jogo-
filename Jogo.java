import java.util.Random;
public class Jogo {
  public static void main(String[] args) throws Exception {
    Random gerador = new Random();
    Random gerador2 = new Random();
    Random gerador3 = new Random();
    Personagem personagem = new Personagem("John");
    Personagem personagem2 = new Personagem("Dio", 10, 8, 0);
    System.out.println("jogo iniciando");
    System.out.println("\n");
    personagem.exibirEstado();
    personagem2.exibirEstado();
    System.out.println("_______________");

    while(true){
      
      int oQueFazer = gerador.nextInt(3); //[0..3[
      if(personagem.morrer()==0){
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
      }
      
     
      
      int oQueFazer2 = gerador2.nextInt(3); //[0..3[
      if(personagem2.morrer()==0){
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
    
    personagem2.exibirEstado();}
    int levougolpe = gerador3.nextInt(2); //[0..3[
        switch(levougolpe){
        case 0:
        if(personagem.morrer()==0&&personagem2.morrer()==0){
          personagem2.receberGolpe();
          break;}
        case 1:
        if(personagem2.morrer()==0&&personagem2.morrer()==0)
        personagem.receberGolpe();
          break;}
        if (personagem.morrer()==1)
      {
        personagem.avisamorte();
      }
      if (personagem2.morrer()==1)
      {
      personagem2.avisamorte();
      Thread.sleep(8000);
      
      if (personagem.morrer()==1&&personagem2.morrer()==1){
        System.exit(0);
      }
      
    }
    System.out.println("_______________");}
}}


