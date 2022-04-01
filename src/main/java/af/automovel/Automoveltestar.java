package af.automovel;

public class Automoveltestar {
    
    public static void main(String [] args){
        
Automovel a1 = new Automovel();

a1.cor = "Vermelho Ferrari";
a1.marca = "Voskwagem";
a1.modelo = "Fusca";

System.out.println("a cor do carro é: "+a1.cor);
System.out.println("a marca do carro é: "+a1.marca);
System.out.println("o modelo do carro é: "+a1.modelo);

a1.andar();
a1.parar();
a1.ligar();
    }
}
    
