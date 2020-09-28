import Model.Agenda;
import Model.Contacto;
import Utils.scanner;
import View.Menu;

public class AgendaMain {

    static int idContador = 11;

    public static void main(String[] args) {
        int decision;
        String name;
        String apellido;
        String telefono;
        int id;

        Agenda agendaTelefonica = new Agenda();
        Contacto c;

        agendaTelefonica.precargaContactos();

        Menu.menu();
        decision = scanner.entrada().nextInt();

        while (decision != 6){

            //LISTAR CONTACTOS//
            if(decision == 1){
                Menu.agendaDesplegue();
                agendaTelefonica.listarContactos();
            }
            //BUSQUEDA DE CONTACTOS//
            if(decision == 2){
                System.out.println("Busqueda de contactos por:\n1.Nombre\n2.ID");
                decision = scanner.entrada().nextInt();

                if(decision == 1){
                    System.out.println("Introduzca el nombre:");
                    name = scanner.entrada().nextLine();
                    agendaTelefonica.buscarPorNombre(name);
                }
                if(decision==2){
                    System.out.println("Introduzca el ID:");
                    id = scanner.entrada().nextInt();
                    agendaTelefonica.buscarPorId(id);
                }
            }
            //AGREGAR CONTACTOS//
            if(decision == 3){
                decision = 1;
                while (decision == 1) {
                    System.out.println("Para agregar un nuevo contacto introduzca:");
                    System.out.printf("Nombre: ");
                    name = scanner.entrada().nextLine();
                    System.out.printf("Apellido: ");
                    apellido = scanner.entrada().nextLine();
                    System.out.printf("Telefono: ");
                    telefono = scanner.entrada().nextLine();
                    /*System.out.printf("ID: ");
                    id = scanner.entrada().nextInt();*/

                    c = new Contacto(name, apellido, telefono, idContador);
                    agendaTelefonica.addContacto(c);
                    idContador++;
                    System.out.println("Desea agregar otro contacto?\n1.Si\n2.No");
                    decision = scanner.entrada().nextInt();
                }
            }
            //ACTUALIZAR CONTACTO
            if(decision == 4){
                System.out.println("Para actualizar el contacto ingrese su ID: ");
                id = scanner.entrada().nextInt();
                System.out.printf("Ingrese su nuevo nombre: ");
                name = scanner.entrada().nextLine();
                System.out.printf("Ingrese su apellido: ");
                apellido = scanner.entrada().nextLine();
                System.out.printf("Ingrese su telefono: ");
                telefono = scanner.entrada().nextLine();

                c = new Contacto(name,apellido,telefono,id);
                agendaTelefonica.actualizarContacto(id,c);
            }

            //ELIMINAR CONTACTO
            if(decision == 5){

                System.out.println("Para eliminar un contacto ingrese su ID");

                System.out.printf("ID: ");
                id = scanner.entrada().nextInt();

                agendaTelefonica.eliminarContacto(id);

            }

            if (decision > 6){
                System.out.println("Introduzca un numero valido.");
                Menu.menu();
                decision = scanner.entrada().nextInt();
            }

            Menu.menu();
            decision = scanner.entrada().nextInt();
        }



    }
}
