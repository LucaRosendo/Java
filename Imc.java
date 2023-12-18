public class Imc {
  String nome;
  float altura;
  double peso;
  char sexo;
  double setimc;

  public static void main(String[] args) {

    Imc imc = new Imc();
    
    System.out.println("Digite seu Sexo (M/F):");
    imc.sexo = System.console().readLine().charAt(0);

    System.out.println("Digite o seu nome:");
    imc.nome = System.console().readLine();

    System.out.println("Digite a sua altura:");
    imc.altura = Float.parseFloat(System.console().readLine());

    System.out.println("Digite o seu peso:");
    imc.peso = Double.parseDouble(System.console().readLine());

    functionImc(imc.altura, imc.peso, imc.nome, imc.sexo);
  }

  private static void functionImc(float altura, double peso, String nome, char sexo) {

    Imc imc = new Imc();

    imc.setimc = peso / (altura * altura);
    imc.nome = nome;
    imc.sexo = sexo;

    double Mpeso = (72.7*altura) - 58;
    double Fpeso = (62.1*altura) - 44.7;

    if (imc.sexo == 'M' || imc.sexo == 'm') {
      if (imc.setimc < Mpeso){ // deixar o -58
        System.out.printf("\n%s, você está abaixo do peso. O seu peso ideal é: %.2f", imc.nome, Mpeso);
      }else{
        System.out.printf("\n%s, você está acima do peso. O seu peso ideal é: %.2f", imc.nome, Mpeso);
      }
      
    } else if (imc.sexo == 'F' || imc.sexo == 'f') {
      System.out.println(imc.setimc);
      System.out.println(Fpeso);
      if (imc.setimc < Fpeso){ //deixar o -44.7
        System.out.printf("\n%s, você está abaixo do peso. O seu peso ideal é: %.2f", imc.nome, Mpeso);
      }else{
        System.out.printf("\n%s, você está acima do peso. O seu peso ideal é: %.2f", imc.nome, Mpeso);
      }
      
    } else {
      System.out.println("Sexo não identificado");
    }
  }
}
