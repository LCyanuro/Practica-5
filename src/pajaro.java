public class pajaro
{
    String nombre;
    int masa;
    int radio;
    String color;

    public pajaro(String nombre, int masa, int radio, String color)
    {
        setNombre(nombre);
        setMasa(masa);
        setRadio(radio);
        setColor(color);
    }

    float aceleracion = 0;
    float fuerza = 0;

    //setter, getter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMasa() {
        return masa;
    }

    public int getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    public void saltarResortera()
    {
        System.out.println("⬉ "+ nombre +  " Ha saltado a la resortera.");
    }

    public void tirarResortera()
    {
        System.out.println("⬅ Se ha tirado la resortera para atrás con " + nombre + " encima.");
    }

    public void volarResortera()
    {
        this.aceleracion = 2f;
        System.out.println("⇶ " + nombre + " ha volado con una aceleración de: " + aceleracion + " m/s^2.");
    }

    public void chocarAlgo(String objeto)
    {
        fuerza = masa * aceleracion;
        System.out.println("╳ " + nombre + " se ha estrellado contra " + objeto + " Con una fuerza de " + fuerza + " N.");
    }
    public void preparar() {

    }
}
