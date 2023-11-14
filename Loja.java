public class Loja
{
    private String nome;
    private int quantidadeFuncionarios;
    private float salarioBaseFuncionario;
    private float gastosComSalario;
    private String tamanhoDaLoja;

public Loja (String nome, int quantidadeFuncionarios, float salarioBaseFuncionario){
    this.nome=nome;
    this.quantidadeFuncionarios=quantidadeFuncionarios;
    this.salarioBaseFuncionario=salarioBaseFuncionario;
    this.gastosComSalario=calcularGastosComSalario();
    this.tamanhoDaLoja=calcularTamanhoDaLoja();
}

public Loja(String nome, int quantidadeFuncionarios){
    this.nome=nome;
    this.quantidadeFuncionarios=quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1;
    this.gastosComSalario=calcularGastosComSalario();
    this.tamanhoDaLoja=calcularTamanhoDaLoja();
}
private float calcularGastosComSalario(){
    if (salarioBaseFuncionario >=0){
        return quantidadeFuncionarios *salarioBaseFuncionario;
    }
    else {
        return 0;
    }
}
private String calcularTamanhoDaLoja(){
    if (quantidadeFuncionarios <= 10){
        return "P";
    }
    else if (quantidadeFuncionarios <= 30){
        return "M";
    }
    else{
        return "G";
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

public String toString(){
    return "(Nome: "+ nome + ", Quantidade de funcionarios: "+ quantidadeFuncionarios + ", Salario dos funcionarios: "+ salarioBaseFuncionario + ", Gasto com salarios: "+ gastosComSalario + ", Tamanho da loja: "+ tamanhoDaLoja +")";
}
}