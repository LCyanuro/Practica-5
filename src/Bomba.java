import java.sql.SQLOutput;

public class Bomba extends pajaro
{
    String habilidad = "Explotar";
    public Bomba(String nombre, int masa, int radio, String color)
    {
        super(nombre, masa, radio, color);
    }

    public void usarHabilidad()
    {
        System.out.println(nombre + " va a " + habilidad);
        System.out.println("BOOOOOOOOM!");
        chocarAlgo("Caja");
        chocarAlgo("Cerdo");
        chocarAlgo("Caja");
        chocarAlgo("Cristal");
    }

    public void preparar()
    {
        saltarResortera();
        tirarResortera();
        volarResortera();
        usarHabilidad();
    }
}