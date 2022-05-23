import java.io.*;
import java.io.IOException;
public class AreaYPerimetro{
    public static void main(String[] args ) throws IOException{
        double area;
        double perimetro;
        int b,h,calculos,cdt,rom,B,diag; 
        String conti;
        BufferedReader guard= new BufferedReader(new InputStreamReader(System.in));
        do{ System.out.println("\n1=cuadrilatero\n2=Trapecio\n3=Triangulo\n4=Circulo");
        System.out.println("Introduzaca el valor de la opcion a realizar:");
            calculos= Integer.parseInt(guard.readLine());    
         switch (calculos)
            {
              case 1:  
                  System.out.println("Escoja que tipo de cuadrilatero es:");
                  System.out.println("\n1=cuadrado\n2=rectangulo\n3=rombo\n");
                  cdt=Integer.parseInt(guard.readLine());

                  switch(cdt){
                
                    case 1: 
                    System.out.println("Introduzca el valor de uno de los lados:");
                    b=Integer.parseInt(guard.readLine());
                    area= b*b;
                    perimetro=b+b+b+b;
                    System.out.println("El Area es="+ area +  " el Perimetro es=" + perimetro);
                    break;
                    
                    case 2:
                    System.out.println("Introduzca el valor de la base:");
                    b=Integer.parseInt(guard.readLine());
                    System.out.println("Introduzca el valor de la altura:");
                    h=Integer.parseInt(guard.readLine());
                    area= b*h;
                    perimetro= b+h+b+h;
                    System.out.println("El Area es="+ area +  " el Perimetro es=" + perimetro);
                    break;

                    case 3:
                    System.out.println("Introduzca el valor de uno de sus lados:");
                    rom=Integer.parseInt(guard.readLine());
                    System.out.println("Introduzca el primer valor de la diagonal:");
                    b=Integer.parseInt(guard.readLine());
                    System.out.println("Introduzca el segundo valor de la diagonal:");
                    h=Integer.parseInt(guard.readLine());
                    area= (h*b)/2;  
                    perimetro=rom*4;
                    System.out.println("El Area es="+ area +  " el Perimetro es=" + perimetro);
                    break;
                  } break;
             case 2:
             System.out.println("Introduzca el valor del lado mas largo:");
             B=Integer.parseInt(guard.readLine());
             System.out.println("Introduzca el valor del lado mas corto");
             b=Integer.parseInt(guard.readLine());
             System.out.println("Introduzca el valor de la altura:");
             h=Integer.parseInt(guard.readLine());
             System.out.println("Introduzca el valor de la recta diagonal:");
             diag=Integer.parseInt(guard.readLine());
             area=((B+b)/2)*h;
             perimetro=B+b+(diag*2);
             System.out.println("El Area es="+ area +  " el Perimetro es=" + perimetro);
             break;

             case 3:
             System.out.println("Escoja que tipo de triangulo es:");
             System.out.println("\n1=Equilatero\n2=Isoceles\n3=Escaleno\n");
             cdt=Integer.parseInt(guard.readLine());
               switch(cdt){

                    case 1:
                    System.out.println("Introduzca el valor uno de sus lados");
                    B=Integer.parseInt(guard.readLine());
                    System.out.println("Introduzca el valor de la altura:");
                    h=Integer.parseInt(guard.readLine());
                    area= (B*h)/2;
                    perimetro=B*3;
                    System.out.println("El Area es="+ area +  " el Perimetro es=" + perimetro);
                    break;

                    case 2:
                    System.out.println("Introduzca el valor de la base");
                    B=Integer.parseInt(guard.readLine());
                    System.out.println("Introduzca el valor del lado que se repite:");
                    b=Integer.parseInt(guard.readLine());
                    System.out.println("Introduzca la altura");
                    h=Integer.parseInt(guard.readLine());
                    area=(B*h)/2;
                    perimetro=(b*2)+B;
                    System.out.println("El Area es="+ area +  " el Perimetro es=" + perimetro);
                    break;

                    case 3:
                    System.out.println("Introduzca el valor de la base");
                    B=Integer.parseInt(guard.readLine());
                    System.out.println("Introduzca el valor del lado a:");
                    b=Integer.parseInt(guard.readLine());
                    System.out.println("Introduzca el valor del lado c:");
                    h=Integer.parseInt(guard.readLine());
                    System.out.println("Introduzca la altura");
                    rom=Integer.parseInt(guard.readLine());
                    area=(B*rom)/2;
                    perimetro= B+b+h;
                    System.out.println("El Area es="+ area +  " el Perimetro es=" + perimetro);
                    break;
               }break;
             
             case 4:
             System.out.println("Introduzca el valor del radio:");
             B=Integer.parseInt(guard.readLine());
             area=3.14*(B*B);
             perimetro=(2*3.14)*B;
             System.out.println("El Area es="+ area +  " el Perimetro es=" + perimetro);
             break;
            }
           
            System.out.println("\nDeseas continuar analizando figuras, ingrese si o Si:");
            conti=guard.readLine();
           
        } 
        while (conti.equals("Si") || conti.equals("si"));
    
    }


}