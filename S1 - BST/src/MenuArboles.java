import java.util.Scanner;

import jdk.nashorn.internal.ir.WhileNode;


public class MenuArboles {

	public static void main(String[] args){
		BinarySearchTree<String> arbol = new BinarySearchTree<String>();

		boolean bandera = true;
		Scanner scan = new Scanner(System.in);

		String entrada;
		//s = scan.nextLine();

		//System.out.println("asd: "+ s);

		while(bandera){
			System.out.println("Selecciona una operacion:");
			System.out.println();
			System.out.println("1. isEmpty: ");
			System.out.println("2. size: ");
			System.out.println("3. size2: ");
			System.out.println("4. contains: ");
			System.out.println("5. remove: ");
			System.out.println("6. get: ");
			System.out.println("7. add: ");
			System.out.println("8. print (traversal order): ");
			System.out.println("9. exit: ");

			entrada = scan.next();

			if (entrada.equals("1")) {
				System.out.println("El arbol esta vacio: " + arbol.isEmpty());
			}else if (entrada.equals("2")) {
				System.out.println("Resultado de size: " + arbol.size());
			}else if (entrada.equals("3")) {
				System.out.println("Resultado de size2: "+ arbol.size2());
			}else if (entrada.equals("4")) {
				System.out.println("Elemento a encontrar: ");
				entrada = scan.next();
				System.out.println("Elemento encontrado: "+arbol.contains(entrada));
			}else if (entrada.equals("5")) {
				System.out.println("Elemento a remover: ");
				entrada = scan.next();
				arbol.remove(entrada);
			}else if (entrada.equals("6")) {
				System.out.println("Elemento a obtener: ");
				entrada = scan.next();
				System.out.println("Elemento obtenido: "+arbol.get(entrada));
			}else if (entrada.equals("7")) {
				System.out.println("Elemento a agregar: ");
				entrada = scan.next();
				arbol.add(entrada);
			}else if (entrada.equals("8")) {
				System.out.println("Selecciona el metodo de ordenamiento: ");
				System.out.println("1: Preorden");
				System.out.println("2: Inorder");
				System.out.println("3: Postorder");

				entrada = scan.next();
				System.out.println("");
				System.out.println("Los datos ordenados son: ");

				if (entrada.equals("1")) {
					arbol.reset(2);//preorder
					while (!arbol.preOrderQueue.isEmpty()) {
						System.out.println(arbol.getNext(2));
					}
				}else if (entrada.equals("2")) {
					arbol.reset(1);//inor
					while (!arbol.inOrderQueue.isEmpty()) {
						System.out.println(arbol.getNext(1));
					}
				}else if (entrada.equals("3")) {
					arbol.reset(3);//postor
					while (!arbol.postOrderQueue.isEmpty()) {
						System.out.println(arbol.getNext(3));
					}
				}

			}else if (entrada.equals("9")) {
				bandera=false;
				System.out.println("Bye");
			}
			System.out.println();
		}
		scan.close();
	}


}
