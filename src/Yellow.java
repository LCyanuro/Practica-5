public class Yellow extends pajaro
{
    String habilidad = "Acelerar";
    public Yellow(String nombre, int masa, int radio, String color)
    {
        super(nombre, masa, radio, color);
    }

    public void usarHabilidad()
    {
        System.out.println(nombre + " va a " + habilidad);
        this.aceleracion = 8f;

        System.out.println("✦ Debido a la velocidad Amarillo rompió varios objetos.");
        chocarAlgo("Caja");
        this.aceleracion = 6f;
        chocarAlgo("Caja");
        this.aceleracion = 4f;
        chocarAlgo("Cerdo");
        this.aceleracion = 2f;
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
