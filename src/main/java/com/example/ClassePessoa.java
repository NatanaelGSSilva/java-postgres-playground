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
    this.Nome = Nome;
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
    ClassePessoa pessoa = new ClassePessoa("Alina", "30/08/1995");
    System.out.println(pessoa.getNome());
    //modificando o acesso
    pessoa.setNome("20/10/2000");
    System.out.println("idade é " + pessoa.getDataNascimento());
}

  
}