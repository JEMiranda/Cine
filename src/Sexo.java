/**
 *
 * @author JonatanM
 */
public class Sexo {

//Atributos
    private String Nombre;

//Contructor por defecto
    public Sexo(){}

//declaracion de atributos
    public Sexo(String nombre){
        this.Nombre=nombre;
    }

//seteo de metodos


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}