/**
 *
 * @author JonatanM
 */
public class Rol {

//Declara los Atributos

    private String Nombre;
    private String Descripcion;

//Contructor por defecto de la clase Rol

    public Rol () {     }

/*
*Este contructor incluye todos los atributos de la clase
* @param nombre
* @param descripcion
 */
    public Rol(String nombre,String descripcion){
        this.Nombre=nombre;
        this.Descripcion=descripcion;
    }

/*
*A continuación se listan todos los métodos
* de seteo de cada atributo de la clase
 */

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}


