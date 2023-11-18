public class Loja
{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;


public Loja (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao){
    this.nome=nome;
    this.quantidadeFuncionarios=quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
}

public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao){
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
}

public double gastosComSalario(){
    if (salarioBaseFuncionario >= 0){
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