/**
 *
 * @author JonatanM
 */
public class Actor {

    private Boolean Animado;
    private String Nombre;
    private String Apellido;
    private Sexo sexo;

// contructor por defecto

    public Actor(){}

// Declaracion de Atributos

    public Actor(Boolean animado,String nombre,String apellido,Sexo sexo){
        this.Animado=animado;
        this.Nombre=nombre;
        this.Apellido=apellido;
        this.sexo=sexo;
    }

 //seteo de metodos


    public Boolean getAnimado() {
        return Animado;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setAnimado(Boolean animado) {
        Animado = animado;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Sexo getSexo() { return sexo; }

    public void setSexo(Sexo sexo) { this.sexo = sexo; }
}
