import javax.swing.JOptionPane; 

public class calculator {
    public static void main(String[] args) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
        
        if (valor >=2 && valor <= 1000) {
            if (valor%2==0 && valor%5==0) {
                 if (valor>=200){

                     for (double i = valor; i >= 200; i=i-200 ) { 
                            int resposta = JOptionPane.showConfirmDialog(null,"Você quer sacar novamente uma nota de 200?");
                            System.out.println(resposta);
                            if (resposta==1) {
                                System.exit(0);
                            }
                    }
                }      
            }
        }
    }
}
