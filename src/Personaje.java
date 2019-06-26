/**
 *
 * @author JonatanM
 */

public class Personaje {

    private String NombreEnPelicula;
    private Actor actor;
    private Rol rol;

//Constructor por defecto

    public Personaje(){}


    public Personaje(String nombreEnPelicula,Actor actor,Rol rol){

        this.NombreEnPelicula=nombreEnPelicula;
        this.actor=actor;
        this.rol=rol;
    }

    public String getNombreEnPelicula() {
        return NombreEnPelicula;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {
        NombreEnPelicula = nombreEnPelicula;
    }

    public Actor getActor() { return actor; }

    public void setActor(Actor actor) { this.actor = actor; }

    public Rol getRol() { return rol; }

    public void setRol(Rol rol) { this.rol = rol; }
}
