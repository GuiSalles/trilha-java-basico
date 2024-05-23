public class Operadores {
    public static void main(String[] args) throws Exception {
        double soma = 10.5 + 5.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 5;
        int divisao = 15/3;
        int modulo = 18%3;
        double resultado = (10*7) + (20/4);

        String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto);

        String concatenacao = "?"; 
        concatenacao = 1+1+1+"1"; //31
        concatenacao = 1 + "1" + 1 + 1; //1111 --> Não faz mais operação depois da primeira ocorrência de concatenação
        concatenacao = "1" + "1" + 1; //111
        concatenacao = "1" + (1+1+1); //13 --> Fez soma por causa dos parenteses
    }
}
