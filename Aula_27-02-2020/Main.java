import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    // Mensagem de saída
    System.out.println("Informe o valor da nota:");
    // Recebendo o valor da nota
    // Através da classe Scanner
    Scanner entrada = new Scanner(System.in);
    // Pegando o valor que foi digitado e 
    // guardando na variável nota
    // double nota = entrada.nextDouble();

    // Criando instância de Nota
    Nota instanciaNota = new Nota();
    // Atribuindo ao atributo valor presente
    // na classe nota o que foi digitado pelo usuário
    // atrvavés do entrada.nextDouble();
    instanciaNota.valor = entrada.nextDouble();

    System.out.println("Valor da nota:"+instanciaNota.valor);
  }

}