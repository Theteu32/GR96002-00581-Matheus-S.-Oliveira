public class Loja
{
    private String nome;
    private int quantidadeFuncionarios;
    private float salarioBaseFuncionario;
    private Data dataFundacao;
    private Endereco endereco;


public Loja (String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao){
    this.nome=nome;
    this.quantidadeFuncionarios=quantidadeFuncionarios;
    this.salarioBaseFuncionario=quantidadeFuncionarios;
    this.dataFundacao = dataFundacao;
    this.endereco = endereco;
}

public Loja(String nome, int quantidadeFuncionarios,float salarioBaseFuncionario, Endereco endereco, Data dataFundacao){
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
}

public float gastosComSalario(){
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
public float getSalarioBaseFuncionario(){
    return salarioBaseFuncionario;
}
public  void setSalarioBaseFuncionario(float salarioBaseFuncionario){
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