package desafio02ex03;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Desafio02Ex03 {
    public static void main(String[] args) {
        /* Faça um algoritmo que leia 3 idades, calcule a média das idades e escreva o resultado. */
        
        double Age1, Age2, Age3, Average;
        DecimalFormat f = new DecimalFormat("0.00");
        
        Age1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira idade:"));
        Age2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda idade:"));
        Age3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira idade:"));
        Average = (Age1 + Age2 + Age3)/3;
            JOptionPane.showMessageDialog(null, "A média das idades é: "+f.format(Average));
    }
    
}
