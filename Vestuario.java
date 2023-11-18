public class Vestuario extends Loja{
    private boolean produtosImportados;

public Vestuario (String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados){
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
    this.produtosImportados = produtosImportados;
}


public boolean getProdutosImportados() {
    return produtosImportados;
}

public void setProdutosImportados(boolean produtosImportados) {
    this.produtosImportados = produtosImportados;
}

public String toString() {
    return super.toString() +
            ", Produtos Importados: " + produtosImportados + ")";
}
}   
