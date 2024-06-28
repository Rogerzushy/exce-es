import java.util.Scanner;

public class contador {

public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();
    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();
    
    try {
        contar(parametroUm, parametroDois);
    
    }catch (ParametrosInvalidosException e) {
        System.out.println("segundo parametro necessita ser maior que o primeiro parametro");
        
    }
    
}
static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
    if (parametroUm >= parametroDois ){
       throw new ParametrosInvalidosException( " segundo parametro necessita ser maior que o primeiro parametro");
    }
    
    int contagem = parametroDois - parametroUm +1;
    for (int i =1 ; i< contagem; i++){
        System.out.println("imprimindo os numeros " + i);
    }
}
}