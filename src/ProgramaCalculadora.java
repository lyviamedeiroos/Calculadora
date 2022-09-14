import javax.swing.*;
public class ProgramaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int opcoes;
        String menu = "Olá usuário! O que você deseja fazer hoje? \n\n" +
                "1-Somar\n" +
                "2-Subtrair\n" +
                "3-Multiplicar\n" +
                "4-Dividir\n" +
                "5-Finalizar\n";

        opcoes = 1;
        while (opcoes != 4) {

            opcoes = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Programa Calculadora", JOptionPane.QUESTION_MESSAGE));

            switch (opcoes){

                case 1: //Somar
                    calculadora.recebeValores();
                    calculadora.somar();
                    calculadora.mostraResultado();
                    break;
                case 2: //Subtrair
                    calculadora.recebeValores();
                    calculadora.subtrair();
                    calculadora.mostraResultado();
                    break;
                case 3: //Multiplicar
                    calculadora.recebeValores();
                    calculadora.multiplicar();
                    calculadora.mostraResultado();
                    break;
                case 4: //Divisão
                    calculadora.recebeValores();
                    if (calculadora.dividir(calculadora.getValor1(),calculadora.getValor2())){
                            calculadora.mostraResultado();
                    }else{
                        JOptionPane.showMessageDialog(null,"NÃO É POSSÍVEL DIVIDIR POR ZERO ");
                    }
                    break;
            }

        }while (true);




    }

}
