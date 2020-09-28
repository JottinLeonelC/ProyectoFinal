package Model;

public class Contacto {

    /*Hacer un programa que funcione como agenda telefónica
    *El programa debe precargar 10 contactos al iniciar.
    *Al iniciar el programa el usuario debe tener opciones que le permitan agregar, buscar,
    *actualizar y borrar un contacto. También una opción que le permita listar todos los contactos.
    *Cada contacto debe tener al menos 3 campos Id, nombre y teléfono. (puede agregar todos los
    que quiera)
    *El programa debe permitir buscar por id y por nombre.
    *Cuando elija agregar contacto debe de pedir si desea agregar otro.
    *Después de cada opción debe volver al menú.
    *El programa solo terminara cuando el usuario elija salir.*/

    int id;
    String nombre;
    String apellido;
    String telefono;

    public Contacto(String nombre, String apellido, String telefono, int id){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.id = id;
    }

    public Contacto(int id){
        this.id = id;
        this.nombre = nombre;
    }


    public int getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  id + "\t" +
                nombre + "\t\t\t\t" +
                apellido + "\t\t\t\t" +
                telefono;
    }
}
