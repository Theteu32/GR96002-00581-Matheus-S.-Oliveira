public class Loja
{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;


public Loja (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoque){
    this.nome=nome;
    this.quantidadeFuncionarios=quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto [capacidadeEstoque];
}

public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int capacidadeEstoque){
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto[capacidadeEstoque];
}

public double gastosComSalario(){
    if (salarioBaseFuncionario >= 0 && quantidadeFuncionarios >= 0){
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }
    else {
        return -1;
    }
}
public char tamanhoDaLoja(){
    if (quantidadeFuncionarios < 10){
        return 'P';
    }
    else if (quantidadeFuncionarios <= 30){
        return 'M';
    }
    else{
        return 'G';
    }
}


public String getNome(){
    return nome;
}
public  void setNome(String nome){
    this.nome = nome;
}
public int getQuantidadeFuncionarios(){
    return quantidadeFuncionarios;
}
public  void setQuantidadeFuncionarios(int quantidadeFuncionarios){
    this.quantidadeFuncionarios = quantidadeFuncionarios;
}
public double getSalarioBaseFuncionario(){
    return salarioBaseFuncionario;
}
public  void setSalarioBaseFuncionario(double salarioBaseFuncionario){
    this.salarioBaseFuncionario = salarioBaseFuncionario;
}
public Data getDataFundacao() {
        return dataFundacao;
    }
public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
public Endereco getEndereco() {
        return endereco;
    }
public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
public Produto[] getEstoqueProdutos(){
    return estoqueProdutos;
}

public void imprimeProdutos(){
    System.out.println("Produtos na Loja " + nome + ":");
    boolean produtosEncontrados = false;

    for (Produto produto : estoqueProdutos){
        if (produto != null){
            System.out.println(produto.toString());
        }
    }
    if (!produtosEncontrados){
        System.out.println("Nenhum produto encontrado.");
    }
}


public boolean insereProduto(Produto produto){
    for ( int i = 0; i < estoqueProdutos.length; i++){
        if (estoqueProdutos[i] == null){
            estoqueProdutos[i] = produto;
            return true;
        }
    }
    return false;
}

public boolean removeProduto(String nomeProduto){
    for (int i = 0; i <estoqueProdutos.length; i++){
        if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)){
           estoqueProdutos[i] = null;
           return true; 
        }
    }
    return false;
}


public String toString(){
    return "(Nome: "+ nome +
     ", Quantidade de funcionarios: "+ quantidadeFuncionarios + 
     ", Salario dos funcionarios: "+ salarioBaseFuncionario + 
     ", Gasto com salarios: "+ gastosComSalario() + 
     ", Tamanho da loja: "+ tamanhoDaLoja() +
     ", Endereço: "+ endereco+
     ", Data da Fundação: "+ dataFundacao+ ")";
}
}