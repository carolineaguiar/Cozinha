import java.time.LocalDate;

class Main {
  public static void main(String[] args) {
 
    System.out.println("Iniciando os trabalhos do restaurante...");

    //Cozinha Mineira 
    Cozinha cozMin = new Cozinha();
    cozMin.tipo = "Mineira";
    cozMin.numeroPratos = 10;
    cozMin.tempoPreparo = 30;
    cozMin.numeroCozinheiros = 5;
    cozMin.horaAbertura = 14;
    cozMin.horaFechamento = 20; 
    // ingredientes de cozinha mineira
    Ingrediente ingMin = new Ingrediente();
    ingMin.nome = "Feijão";
    ingMin.dataValidade = LocalDate.of(2021,10,31);
    cozMin.ingredientes.add(ingMin);
    ingMin = new Ingrediente();
    ingMin.nome = "Farinha";
    ingMin.dataValidade = LocalDate.of(2022,11,21);
    cozMin.ingredientes.add(ingMin);
    ingMin = new Ingrediente();
    ingMin.nome = "Arroz";
    ingMin.dataValidade = LocalDate.of(2022,10,01);
    cozMin.ingredientes.add(ingMin);
    ingMin = new Ingrediente();
    ingMin.nome = "Carne de Porco";
    ingMin.dataValidade = LocalDate.of(2022,11,21);
    cozMin.ingredientes.add(ingMin);
    ingMin = new Ingrediente();
    ingMin.nome = "Linguiça";
    ingMin.dataValidade = LocalDate.of(2024,12,27);
    cozMin.ingredientes.add(ingMin);
    // funcionarios de cozinha mineira
    Funcionario funcMin = new Funcionario();
    funcMin.nome = "Andreia"; 
    funcMin.atividade = "Chefe"; 
    cozMin.funcionarios.add(funcMin);
    funcMin = new Funcionario();
    funcMin.nome = "Roberval"; 
    funcMin.atividade = "Lavador de pratos"; 
    cozMin.funcionarios.add(funcMin);
    funcMin = new Funcionario();
    funcMin.nome = "Aparicida"; 
    funcMin.atividade = "Chefe Auxiliar"; 
    cozMin.funcionarios.add(funcMin);
    funcMin = new Funcionario();
    funcMin.nome = "Ana Clara"; 
    funcMin.atividade = "Ajudante"; 
    cozMin.funcionarios.add(funcMin);

    //Cozinha Chinesa
    Cozinha cozChi = new Cozinha();
    cozChi.tipo = "Chinesa";
    cozChi.tempoPreparo = 50;
    cozChi.numeroCozinheiros = 3;
    cozChi.horaAbertura = 13;
    cozChi.horaFechamento = 22; 
    cozChi.pratoPrincipal = "Yakissoba";

    // Ingredientes da cozinha Chinesa
    Ingrediente ingChi = new Ingrediente();
    ingChi.nome = "Champignon";
    ingChi.dataValidade = LocalDate.of(2021,10,31);
    cozMin.ingredientes.add(ingChi);
    ingChi = new Ingrediente();
    ingChi.nome = "Brócolis";
    ingChi.dataValidade = LocalDate.of(2024,10,20);
    cozMin.ingredientes.add(ingChi);
    ingChi = new Ingrediente();
    ingChi.nome = "Macarrão";
    ingChi.dataValidade = LocalDate.of(2023,10,05);
    cozMin.ingredientes.add(ingChi);
    ingChi = new Ingrediente();
    ingChi.nome = "Carne";
    ingChi.dataValidade = LocalDate.of(2021,11,21);
    cozMin.ingredientes.add(ingChi);

    // Funcionários Cozinha Chinesa 
    Funcionario funcChi = new Funcionario();
    funcChi.nome = "Yudi"; 
    funcChi.atividade = "Chefe"; 
    cozMin.funcionarios.add(funcChi);
    funcChi = new Funcionario();
    funcChi.nome = "Lee"; 
    funcChi.atividade = "Auxiliar"; 
    cozMin.funcionarios.add(funcChi);
    funcChi = new Funcionario();
    funcChi.nome = "Chan"; 
    funcChi.atividade = "Sushi man"; 
    cozMin.funcionarios.add(funcChi);
   
   // Cozinha Italiana 
    Cozinha cozIt = new Cozinha();
    cozIt.tipo = "Italiana";
    cozIt.tempoPreparo = 50;
    cozIt.numeroCozinheiros = 2;
    cozIt.horaAbertura = 13;
    cozIt.horaFechamento = 22; 
    cozIt.pratoPrincipal = "Espaguete";

    // Ingredientes Cozinha Italiana 
    Ingrediente ingIt = new Ingrediente();
    ingIt.nome = "Molho";
    ingIt.dataValidade = LocalDate.of(2021,5,01);
    cozMin.ingredientes.add(ingIt);
    ingIt = new Ingrediente();
    ingIt.nome = "Macarrão";
    ingIt.dataValidade = LocalDate.of(2022,02,28);
    cozMin.ingredientes.add(ingIt);
    ingIt = new Ingrediente();
    ingIt.nome = "Carne";
    ingIt.dataValidade = LocalDate.of(2023,10,05);
    cozMin.ingredientes.add(ingIt);
  }
}