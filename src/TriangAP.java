import java.util.Scanner;

public class TriangAP {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o comprimento do primeiro lado do Triângulo:");
            double lado1 = entrada.nextDouble();

        System.out.println("Digite o comprimento do segundo lado do Triângulo:");
            double lado2 = entrada.nextDouble();

        System.out.println("Digite o comprimento do terceiro lado do Triângulo:");
            double lado3 = entrada.nextDouble();
        entrada.close();

        double perimetro = lado1 + lado2 + lado3;       //calcula o perímetro

        double semiperimetro = perimetro / 2;       //calcula a área
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        
        System.out.println("O perímetro do triângulo é: "+perimetro);
        System.out.println("A área do triângulo é: "+area);
        }
}
