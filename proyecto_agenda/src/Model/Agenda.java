package Model;

public class Agenda {

    /*String[] contactos = new String[50];
    int[] id = {1,2,3,4,5,6,7,8,9,10};
    String[] nombres = {"Esther", "David", "Ezequiel", "Francisco", "Josefina", "Marcos", "Maria", "Olga",
            "Patricia", "Pedro"};
    String[] apellidos = {"Del carmen", "Muñoz", "Ventura", "Jimenez", "Cruz", "Rodriguez", "Beriguete",
            "Hernandez", "Feliciano", "Orozco"};
    String[] telefonos = {"809-537-8596","809-963-8956","809-789-4563","809-745-9865","809-123-7896",
            "809-856-3217","809-731-6429","809-746-5631","809-463-5129","809-428-8916"};*/

    //Atributos
    private Contacto[] contactos;

    //Constructor
    public Agenda() {
        this.contactos = new Contacto[20]; //por defecto
    }

    public void addContacto(Contacto c){

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] == null && !agendaLlena()) { //controlo los nulos y veo si hay espacios en la agenda
                contactos[i] = c; //Inserto el contacto
                encontrado = true; //Indico que lo he encontrado
            }
        }

        if (encontrado) {
            System.out.println("Se ha añadido");
        } else {
            System.out.println("No se ha podido añadir");
        }

    }

    public void listarContactos(){

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if(contactos[i] != null){
                System.out.println(contactos[i]);
            }else {
                System.out.println("Aun no hay contactos.");
                encontrado = true;
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

    public void eliminarContacto(Contacto c){

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if(contactos[i] != null && contactos[i].getId() == c.getId()){
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
