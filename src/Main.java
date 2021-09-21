import java.util.Arrays;

public class Main {
    public static void main(String args[])
    {
        pajaro[] arreglo = {new BigRed("Pajalvaro", 5, 3, "Rojo"),new Yellow("FlashMan", 2, 3, "Amarillo"),new Bomba("Bomberman", 10, 3, "Negro")};
        int i;
        for(i=0;i<arreglo.length;i++)
        {
            System.out.println("");
            arreglo[i].preparar();
            System.out.println("");
        }
    }
}
