package af.automovel;


public class Automovel {

  public String cor;
  protected String marca;
  protected String modelo;

  
  public Automovel () { };
  

  protected void andar()
  {
      System.out.println("o carro esta andando! ");
  }


  protected void parar()
  {
      System.out.println("o carro esta parado! ");
  }


  protected void ligar()
  {
      System.out.println("o carro esta ligado! ");
  }


}