import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //cria scanner
        String nomePaciente; 
        double peso, altura;
        double IMC;

        //Coleta os dados do paciente
        System.out.print("Insira o nome do paciente: ");
        nomePaciente = input.nextLine();
        System.out.print("Insira o peso do paciente: ");
        peso = input.nextDouble();
        System.out.print("Insira a altura do paciente: ");
        altura = input.nextDouble();
        
        //Calcula imc e mostra resultado
        IMC = peso/Math.pow(altura,2);
        System.out.println(nomePaciente+" esta com IMC de "+IMC);
        
        if(IMC < 18.5) 
            System.out.println(nomePaciente+" esta abaixo do peso");
        else if(IMC >= 18.5 && IMC <= 24.9) 
            System.out.println(nomePaciente+" esta com peso normal");
        else if(IMC >= 25 && IMC <= 29.9)
            System.out.println(nomePaciente+" esta com sobrepeso");
        else if(IMC >= 30 && IMC <= 34.9)
            System.out.println(nomePaciente+" esta com obesidade grau 1"); 
        else if(IMC >= 35 && IMC <= 39.9)
            System.out.println(nomePaciente+" esta com obesidade grau 2");
        else if(IMC >= 40)
            System.out.println(nomePaciente+" esta com obesidade grau 3 ou mórbida");  

        input.close(); //fecha scanner

    }

}
