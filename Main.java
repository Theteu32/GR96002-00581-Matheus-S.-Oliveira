public class Main {
    public static void main(String[] args){
        Loja loja = new Loja("matheus", 3, 2500);
        Produto produto = new Produto("matheus", 2500);
        Endereco endereco = new Endereco("Rua ferrabraz", "são leopoldo", "rio grande do sul", "brasil", "93130-370", "200", "casa");
        
        System.out.println(loja.toString());
        System.out.println(endereco.toString());
        System.out.println(produto.toString());
    }
}
