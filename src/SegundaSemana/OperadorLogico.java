package SegundaSemana;

public class OperadorLogico {
    public static void main(String[] args) {
    int a, b;
    a = 5;
    b = 6;

    String resultado = "";
    //"mesmo resultado" String resultado = a == b ?"Verdadeiro" : "Falso";

    if (a == b)
        resultado = "Verdadeiro";
    else
        resultado = " Falso";


    System.out.println(resultado);
}

}
// && Operador Lógico "E"
// ||Operador Lógico "OU"

// == Quando desejamos verificar se uma variável é IGUAL A outra.
// != Quando desejamos verificar se uma variável é DIFERENTE da outra.
// >  Quando desejamos verificar se uma variável é MAIOR QUE a outra.
// >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
// <  Quando desejamos verificar se uma variável é MENOR QUE outra.
// <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.