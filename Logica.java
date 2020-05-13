import java.util.Scanner;

public class Logica{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la opción que desees");
		System.out.println("1. Numero de cifras");
		System.out.println("2. Llenar arreglo");
		System.out.println("3. Fibonacci");
		int opcion = sc.nextInt();

		switch(opcion){
			case 1://obteniendo el número de digitos de un número
				System.out.println("Digita la cifra en enteros");
				int cifra = sc.nextInt();
				int contador = 0; // bandera sire como un indicador
				while(cifra != 0){
					cifra = cifra / 10;
					//contador = contador + 1;
					contador++; 
				}
				System.out.println("Esta cifra tiene " + contador + " digitos");
			break;
			case 2://llenando arreglo
				int [] arregloEnteros = new int[3];
				//.lenght nos sirve para obtener la longitud de nuestro arreglo en este caso 3
				for(int i = 0; i < arregloEnteros.length;i++){
					System.out.println("Introduce el numero entero");
					arregloEnteros[i]= sc.nextInt();
					System.out.println(arregloEnteros[i]);
				}
			break;
			case 3:
				System.out.println("Dime el limite de la secuencia de Fibo");
				int limiteFibo = sc.nextInt();
				int fibo1 = 0; 
				int fibo2 = 1;
				//println hace un salto de línea 
				// print lo imprime en secuencia o seguido 
				System.out.print(fibo1 + ","+fibo2);
				
				//Empezamos en 3 porque ya tenemos los primeros valores de la secuencia
				for(int f = 3; f <= limiteFibo; f++){
					int temp = fibo2;
					fibo2 = fibo1 + fibo2;
					fibo1 = temp;
					System.out.print(","+fibo2);	 
				}
			break;
			case 4:// centigrados a kelvin

			break;
			case 5: // tabla de multiplicar de un número
				System.out.println("Teclee el numero del cual quiere saber su tabla de multiplicar"); 
				int numero = sc.nextInt();
				int contador = 0;
				int aux=0; 

				while (contador <11 ){
				aux=numero * contador;
				System.out.println(numero +"*"+contador+" = "+aux);
				contador ++;
				} 
			break;
			case 6: //Comprobar si un número es par o impar
				System.out.println("Dame el numero");
				int numero = sc.nextInt();
				double residuo;
				residuo = numero % 2 ;
				System.out.println(residuo);

				if(residuo == 0){
			
				System.out.println("EL NUMERO ES PAR");
				}
				else{
				System.out.println("EL NUMERO ES IMPAR");
				}


			break;
			case 7: // Pasar de decimal a binario


        System.out.println("Ingrese un número decimal:");
        int numero = sc.nextInt();




        String temp = " ";
        if (numero > 0) { 
            while (numero > 0) {
                if (numero % 2 == 0) {
                    temp = "0" + temp; 
                } else {
                    temp = "1" + temp;
                }
                numero = numero / 2;
            }
        }



         else if (numero == 0) {
            temp = "0";
        } 
        System.out.println("El número binario es: " + temp);





			break;

			case 8:
			float media = 0;
			float suma = 0;
			int mayor = 0;
			int menor = 0;

			System.out.print("Por favor ingrese el tamano del arreglo: ");
			int n = sc.nextInt();
   			int[] arregloNumeros = new int[n];
		
		  	for (int i = 0; i < arregloNumeros.length; i++) {
           	System.out.print("Ingrese el numero de la posicion " + (i) + " :");
            arregloNumeros[i] = sc.nextInt();

            //media
			suma = arregloNumeros[i]+suma;
			media = suma / arregloNumeros.length;
       		 }

			//menor
			for (int i = 0; i < arregloNumeros.length; i++) {
			if (i ==0 )
			{
				menor =arregloNumeros[i] ;
			}
			if(arregloNumeros[i] < menor) {
                menor = arregloNumeros[i];
            }
			//mayor

			else if  ( arregloNumeros[i] > mayor) {
				mayor = arregloNumeros[i];
			}
			}
	
			System.out.println("La media es:"+ media +" ,el numero menor es: " + menor + ", el numero mayor es: " + mayor );


			break;

			case 9: // Factorial de un número
				int factorial=1;
				int limite=0;
				Scanner scan= new Scanner(System.in);
				System.out.println("dame el valor del factorial");
				limite = scan.nextInt();
				for(int i=1;i<=limite;i++){
					factorial = factorial * i;
				}
				System.out.println("el resultado es = "+factorial);
			break;
			case 10: // Mostrar el mayor sueldo 	

 String[ ] nombre = new String[50];
    int [ ] sueldo = new int[1000];
    int mayor = 0;  
    int indiceM =0; 

  

  for(int i = 1; i<=5; i++)
  {
    System.out.println("Dijite Nombre del empleado " + i);
   nombre[i] = sc.nextLine(); 

   System.out.println("Dijite el sueldo del empleado " + i);   
   sueldo[i] = sc.nextInt();
   sc.nextLine();

   if(sueldo[i] > mayor )
   {
	mayor = sueldo[i] ;
   indiceM = i; 

   }


	}
	

   System.out.println("El sueldo mas alto  lo tiene " + nombre[indiceM]); 


			break;
			case 11: // Kilometros a millas

			break;
			case 12: //Mostrar numeros primos 
			Scanner sc = new Scanner(System.in);
			System.out.println("Cuantos numeros primos deseas obtener?");
			int limitePrimo = sc.nextInt();
			int contador = 1;
			int p = 2;
			int d = 2;
				while ( contador <= limitePrimo){
				if ( p % d == 0){
				if ( p == d) {
				System.out.print(p + ",");
					contador++;

				}
				d = 2;
				p++;
			} else {
				d++;
			}
	 }

	

			break;
			default:
				System.out.println("opción erronea");
			break;
		}
	}
}