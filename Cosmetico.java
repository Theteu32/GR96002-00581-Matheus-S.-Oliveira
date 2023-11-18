public class Cosmetico{
    private String nome;
    private int quantidadeFuncionarios;
    private float salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private double taxaComercializacao;

public Cosmetico (String nome,
                 int quantidadeFuncionarios, 
                 float salarioBaseFuncionario,
                 Endereco endereco, 
                 Data dataFundacao, 
                 double taxaComercializacao){
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.taxaComercializacao = taxaComercializacao;                
}

public float gastosComSalario(){
    if (salarioBaseFuncionario >= 0){
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }
    else {
        return -1;
    }
}








public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getQuantidadeFuncionarios() {
    return quantidadeFuncionarios;
}
public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
    this.quantidadeFuncionarios = quantidadeFuncionarios;
}
public float getSalarioBaseFuncionario() {
    return salarioBaseFuncionario;
}
public void setSalarioBaseFuncionario(float salarioBaseFuncionario) {
    this.salarioBaseFuncionario = salarioBaseFuncionario;
}
public Endereco getEndereco() {
    return endereco;
}
public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
}
public Data getDataFundacao() {
    return dataFundacao;
}
public void setDataFundacao(Data dataFundacao) {
    this.dataFundacao = dataFundacao;
}
 public double getTaxaComercializacao() {
    return taxaComercializacao;
}
public void setTaxaComercializacao(double taxaComercializacao) {
    this.taxaComercializacao = taxaComercializacao;
}
public String toString(){
    return "( Taxa de comercialização: "+ taxaComercializacao +
    " )";
}
}