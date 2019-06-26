/**
 *
 * @author JonatanM
 */
public class PaisDeOrigen {

    private String Nombre;
    private String Idioma;

// Contructor por defecto

    public PaisDeOrigen(){}

// declaracion de atributos
    public  PaisDeOrigen(String nombre,String idioma){
        this.Nombre=nombre;
        this.Idioma=idioma;
    }

//seteo de metodos


    public String getNombre() {
        return Nombre;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setIdioma(String idioma) {
        Idioma = idioma;
    }
}
