public class BigRed extends pajaro
{
    String habilidad = "chocar un poco mas fuerte";
    public BigRed(String nombre, int masa, int radio, String color)
    {
        super(nombre, masa, radio, color);
    }

    public void usarHabilidad()
    {
        System.out.println(nombre + " va a " + habilidad);
        chocarAlgo("Caja");
        chocarAlgo("Cerdo");
    }

    public void preparar()
    {
        saltarResortera();
        tirarResortera();
        volarResortera();
        usarHabilidad();
    }
}