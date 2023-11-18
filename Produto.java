public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;


public Produto (String nome, double preco, Data dataValidade){
    this.nome=nome;
    this.preco=preco;
    this.dataValidade=dataValidade;
}

public boolean estaVencido(Data data){
    if (data.getAno() < dataValidade.getAno())
        return false;
    else if(data.getAno() == dataValidade.getAno())
         if(data.getMes() < dataValidade.getMes())
         return false;
         else if(data.getMes() == dataValidade.getMes())
              if(data.getDia() <= dataValidade.getDia())
              return false;
    return true;   
}
public String getNome(){
    return nome;
}
public  void setNome(String nome){
    this.nome = nome;
}
public double getPreco(){
    return preco;
}
public  void setPreco(double preco){
    this.preco = preco;
}
public Data getDataValidade() {
    return dataValidade;
}
public void setDataValidade(Data dataValidade) {
    this.dataValidade = dataValidade;
}

public String toString(){
    return "(Nome: "+ nome + 
    ", Preço: "+ preco + 
    ", Data de validade:"+ dataValidade+ 
    ")";
    
}
}
