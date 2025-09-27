import java.util.Scanner;
 
 public class ejercisio1 {
    
    public static void main(String[] args) {
        
     System.out.println("ingresa 2 numeros ");
        int numeroa = scanner.nextint();
        int numerob = scanner.nexitnt();
        double resultado = 0;

 if (numeroa>numerob){
    resultado=numeroa+numeroa;
    System.out.println("la suma es " + resultado);
    resultado=numeroa-numerob;
    System.out.println("la resta es " + resultado);
 }else 
    
    if (numeroa==numerob){
        resultado=numeroa*numeroa;
        System.out.println("la multiplicacion es  " + resultado);
        resultado=numeroa*numerob;
        System.out.println("la divicion es  " + resultado);

    }else 

    if (numerob==0){
        resultado=numerob=0;
        System.out.println("division no se puede realisar ");
    }else 

    System.out.println("la division es igual" + resultado );
    }
 scanner.close();
}
