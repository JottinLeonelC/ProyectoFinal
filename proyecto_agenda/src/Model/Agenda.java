package Model;

public class Agenda {

    //Atributos
    private Contacto[] contactos;

    //Constructor
    public Agenda() {

        this.contactos = new Contacto[100]; //por defecto
    }

    public void addContacto(Contacto c){

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] == null && !agendaLlena()) { //controlo los nulos y veo si hay espacios en la agenda
                contactos[i] = c; //Inserto el contacto
                encontrado = true; //Indico que lo he encontrado
            }
        }

        if (encontrado == true) {
            System.out.println("Se ha añadido");
        } else {
            System.out.println("No se ha podido añadir");
        }

    }

    public void precargaContactos(){
        Contacto c1 = new Contacto("BRANDOLF", "MUNOZ", "8295642575", 1);
        Contacto c2 = new Contacto("ALAN", "RODRIGUEZ", "8099956076", 2);
        Contacto c3 = new Contacto("JOTTIN", "COLLADO", "8298901592", 3);
        Contacto c4 = new Contacto("LUIS", "RODRIGUEZ", "8492563125", 4);
        Contacto c5 = new Contacto("VIANNY", "PEREZ", "8094568977", 5);
        Contacto c6 = new Contacto("MARLENNY", "PERALTA", "8296589965", 6);
        Contacto c7 = new Contacto("VICTOR", "SALAZAR", "8494589432", 7);
        Contacto c8 = new Contacto("MARIA", "RAMIREZ", "8099785223", 8);
        Contacto c9 = new Contacto("FELIZ", "GOMEZ", "8092356588", 9);
        Contacto c10 = new Contacto("FERMINA", "ARIAS", "8098452144", 10);

        addContacto(c1);
        addContacto(c2);
        addContacto(c3);
        addContacto(c4);
        addContacto(c5);
        addContacto(c6);
        addContacto(c7);
        addContacto(c8);
        addContacto(c9);
        addContacto(c10);
    }

    public void listarContactos(){


        for (int i = 0; i < contactos.length; i++) {
            if(contactos[i] != null){
                System.out.println(contactos[i]);
            }
        }

    }

    public void buscarPorNombre(String nombre){

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            //Controlo nulos y compruebo que es el contacto buscado
            if (contactos[i] != null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                System.out.println("Su telefono es " + contactos[i].getTelefono()); //muestro el telefono
                encontrado = true; //Indico que lo he encontrado
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado el contacto");
        }
    }

    public void buscarPorId(int id){


        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            //Controlo nulos y compruebo que es el contacto buscado
            if (contactos[i] != null && contactos[i].getId() == id) {
                System.out.println("Su telefono es " + contactos[i].getTelefono()); //muestro el telefono
                encontrado = true; //Indico que lo he encontrado
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado el contacto");
        }
    }

    public void eliminarContacto(int id){

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if(contactos[i] != null && contactos[i].getId() == id){
                contactos[i] = null;
                encontrado = true;
            }
        }
        if(encontrado){
            System.out.println("Eliminado correctamente.");
        }else {
            System.out.println("No se ha podido eliminar el contacto.");
        }

    }

    public void actualizarContacto(int id, Contacto c){

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if(contactos[i] != null && contactos[i].getId() == id ){
                contactos[i] = c;
                encontrado = true;
            }
        }

        if(encontrado){
            System.out.println("Contacto actualizado");
        }else {
            System.out.println("No se ha podido actializar el contacto");
        }
    }

    /**
     * Indica si la agenda esta llena o no
     */
    public boolean agendaLlena() {

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) { //Controlo nulos
                return false; //indico que no esta llena
            }
        }

        return true; //esta llena

    }

}
