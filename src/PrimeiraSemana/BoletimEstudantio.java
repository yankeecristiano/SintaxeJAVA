package PrimeiraSemana;
public class BoletimEstudantio{


    public static void main (String [] args){
        int mediaFinal= 7;

        if (mediaFinal < 6)
            System.out.println("REPROVADO.");
        else if (mediaFinal == 6)
            System.out.println("Prova Minerva");
        else
            System.out.println("APROVADO(A).");
              
    }
}