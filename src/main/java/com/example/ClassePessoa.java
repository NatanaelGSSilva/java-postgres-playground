package com.example;

/**
 * ClassePessoa
 */
public class ClassePessoa {

    private String Nome;
    private String DataNascimento;
    

  public ClassePessoa(String Nome, String DataNascimento){
    this.Nome = Nome;
    this.DataNascimento = DataNascimento;
  }

public String getNome() {
    return Nome;
}

public void setNome(String Nome) {
    if(Nome.isBlank()){
        System.out.println("Por favor preencha o nome corretamente");
    }
    else this.Nome = Nome.trim().toUpperCase();
}

public String getDataNascimento() {
    return DataNascimento;
}

public void setDataNascimento(String DataNascimento) {
    this.DataNascimento = DataNascimento;
}

public void CadastrarPessoa(){

};

public static void main(String[] args) {
    ClassePessoa pessoa = new ClassePessoa("Joao", "30/08/1995");
    // System.out.println(pessoa.getNome());
    //modificando o acesso
    pessoa.setNome("Agata");
    System.out.println("O nome é " + pessoa.getNome());
}

  
}