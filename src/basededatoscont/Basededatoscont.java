
package basededatoscont;

import java.util.Scanner;


public class Basededatoscont {

   
    public static void main(String[] args) {
      cont dat[] = new cont[15];
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        while (op != 5) {
            System.out.println("-----------------------------");
            System.out.println("----------MENU---------------");
            System.out.println("---1. Guardar contacto-------");
            System.out.println("---2. Buscar Contacto--------");
            System.out.println("---3. Ver todos los contacros");
            System.out.println("---4. Modificar contacto-----");
            System.out.println("---5. ----------Salir---------");
            System.out.println("------------------------------");
            System.out.println("Ingrese el numero de opcion: ");
            op = entrada.nextInt();
            System.out.println("################################");
            if (op == 1) {
                System.out.println("Ingrese el numero de telefono: ");
                int tel = entrada.nextInt();
                System.out.println("Ingrese el nombre del contacto: ");
                String nombre = teclado.nextLine();
                System.out.println("Ingrese el correo electronico: ");
                String correo = teclado.nextLine();
                System.out.println(nuevoCont(tel, nombre, correo, dat));
            } else if (op == 2) {
                System.out.println("Ingrese el numero de telefonico");
                int telefono = teclado.nextInt();
                System.out.println(buscarContactos(telefono, dat));
            } else if (op == 3) {
                System.out.println(imprimir(dat));
            } else if (op == 4) {
                System.out.println("Ingrese el numero de telefono ");
                int telefono = entrada.nextInt();
                if (buscarContactosBooleano(telefono, dat)) {
                    System.out.println("Ingrese el nuevo nombre ");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el nuevo correo");
                    String correo = teclado.nextLine();
                    System.out.println(modDatos(telefono, nombre, correo, dat));
                } else {
                    System.out.println("No existe el contacto");
                }
                
            }
        }
    }
        public static String nuevoCont(int telefono, String nombre, String correo, cont arreglo[]) { 
        boolean lleno = true; 
        for (int i = 0; i < arreglo.length; i++) { 
            if (arreglo[i] == null) { 
                arreglo[i] = new cont(telefono, nombre, correo); 
                lleno = false; 
                break; 
            } else if (arreglo[i].getTelefono() == telefono) { 
                return "Ya existe el contacto"; 
            }
        } 
        if (!lleno) { 
            return "Contacto guardado"; 
        } else { 
            return "Ya no hay espacio"; 
        } 
    } 
    public static String buscarContactos(int telefono, cont arr[]) { 
          for (int i = 0; i < arr.length; i++) { 
            if (arr[i] != null && arr[i].getTelefono() == telefono) { 
                   return "Los datos \n nombre: " + arr[i].getNombre()+ "Telefono: " + arr[i].getTelefono()+"" + "correo: " + arr[i].getCorreo(); 
            } 
        } 
        return "No existe el contacto ingresado"; 
    }  
   public static String imprimir(cont arreglo[]) { 
        String cadena = ""; 
        for (int i = 0; i < arreglo.length; i++) { 
            if (arreglo[i] != null) { 
                cadena = cadena + arreglo[i].getNombre() + "|" + arreglo[i].getTelefono() + "|" + arreglo[i].getCorreo() + "\n"; 
            } 
        } 
        return cadena; 
    } 
    public static boolean buscarContactosBooleano(int telefono, cont arr[]) { 
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] != null && arr[i].getTelefono() == telefono) { 
                return true; 
            } 
        } 
        return false; 
    } 
    public static String modDatos(int telefono,String nombre,String correo, cont arreglo[]) { 
        for (int i = 0; i < arreglo.length; i++) { 
            if (arreglo[i] != null && arreglo[i].getTelefono() == telefono) {  
                arreglo[i].setNombre(nombre);  
                arreglo[i].setCorreo(correo); 
                return "Se actualizo con exito"; 
            } 
        } 
        return ""; 
    } 
}
    



