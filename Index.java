public class Index{    
    float altura = 1.75f;
    double peso = 75.5;
    int dia = 10;
    char letra = 'a';
    boolean verdade = true;
    String nome = "João";

    public static void main(String[] args){

        Index index = new Index();

        System.out.println("Dia: " + index.dia);
        System.out.println("Altura: " + index.altura);
        System.out.println("Peso: " + index.peso);
        System.out.println("Letra: " + index.letra);
        System.out.println("Verdade: " + index.verdade);
        System.out.println("Nome: " + index.nome);
        
        System.out.println("=====================================");

        System.out.printf("Dia: %d", index.dia);
        System.out.printf("\nAltura: %.2f", index.altura);
        System.out.printf("\nPeso: %.2f", index.peso);
        System.out.printf("\nLetra: %c", index.letra);
        System.out.printf("\nVerdade: %b", index.verdade);
        System.out.printf("\nNome: %s", index.nome);
    }
}