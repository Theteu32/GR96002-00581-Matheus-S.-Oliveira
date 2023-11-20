public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

public Shopping (String nome, Endereco endereco, int capacidadeLoja){
    this.nome = nome;
    this.endereco = endereco;
    this.lojas = new Loja[capacidadeLoja];
}

public boolean insereLoja(Loja loja){

    for (int i = 0; i < lojas.length; i++){
        if (lojas[i] == null){
            lojas[i] = loja;
            return true;
        }
    }
    return false;
}

public boolean removeLoja(String nomeLoja){

    for (int i = 0; i < lojas.length; i++){
        if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)){
            lojas[i] = null;
            return true;
        }
    }
    return false;
}

public int quantidadeLojasPorTipo(String tipoLoja){

    int quantidade = 0;

    for (Loja loja : lojas){
        if (loja != null && loja.getClass().getSimpleName().equalsIgnoreCase(tipoLoja)){
            quantidade ++;
        }
    }
    return quantidade > 0 ? quantidade : -1;
}

public Informatica lojaSeguroMaisCaro(){

    Informatica lojaInformaticaMaisCara = null;
    double maiorSeguro = 0;

    for (Loja loja : lojas){
        if (loja != null && loja instanceof Informatica){
            Informatica informatica = (Informatica) loja;
            if (informatica.getSeguroEletronicos() > maiorSeguro){
               maiorSeguro = informatica.getSeguroEletronicos(); 
               lojaInformaticaMaisCara = informatica;
            }
        }
    }
    return lojaInformaticaMaisCara;
}





public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public Endereco getEndereco() {
    return endereco;
}
public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
}
public Loja[] getLojas() {
    return lojas;
}
public void setLojas(Loja[] lojas) {
    this.lojas = lojas;
}
}
