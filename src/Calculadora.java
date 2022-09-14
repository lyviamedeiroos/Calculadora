import javax.print.attribute.IntegerSyntax;
import javax.swing.*;
import java.awt.*;

//Atributos
    public class Calculadora {
    private double valor1;
    private double valor2;
    private double resultado;
    JFrame jFrame = new JFrame();

    //Costrutores
    public Calculadora(double valor1, double valor2, double resultado) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = resultado;
    }

    public Calculadora() {
    }

    //Metodos
    public void somar() {
        this.setResultado(this.getValor1() + this.getValor2());

    }

    public void subtrair() {
        this.setResultado(this.getValor1() - this.getValor2());
    }

    public void multiplicar() {
        this.setResultado(this.getValor1() * this.getValor2());
    }

    public boolean dividir(double valor1, double valor2) {
        if (this.valor2 != 0){
            this.setResultado(this.getValor1() / this.getValor2());
            return true;
        }else {
            return false;
        }
    }

    public void recebeValores() {
        //Recebendo os valores
        this.setValor1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: ")));
        this.setValor2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: ")));
    }

    public void mostraResultado() {
        JOptionPane.showMessageDialog(null, "Resultado da sua operação: " + this.getResultado());
    }

    //Getters e Setters
    public double getValor1() {
        return this.valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return this.valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getResultado() {
        return this.resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }



}