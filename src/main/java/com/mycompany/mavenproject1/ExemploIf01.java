
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;


public class ExemploIf01 {
    public void exemplo01(){
        // Operadores relacionais
        // Igual            ==
        // Menor            <
        // Menor ou igual   <=
        // Maior            >
        // Maior ou igual   >=
        // Diferente        !=
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));
        
        float imc = peso / (altura * altura); // 18.51
        if(imc <= 18.5){
            JOptionPane.showMessageDialog(null, "Abaixo do peso");
        }else if(imc <= 24.9){
            JOptionPane.showMessageDialog(null, "Peso ideal");
        }else{
            JOptionPane.showMessageDialog(null, "Acima do peso");
        }
    }
    
    public void exemploOperadorLogicoE(){
        // Operador Lógico E &&
        // V e V => V
        // V e F => F
        // F e V => F
        // F e F => F
        int idade = 0;
        // V e V
        if (idade >= 0 && idade <= 10){
            JOptionPane.showMessageDialog(null, "Criança");
        }else if(idade >= 11 && idade <= 17){
            JOptionPane.showMessageDialog(null, "Adolescente");
        }else{
            JOptionPane.showMessageDialog(null, "Adulto");
        }
    }
    
    public void exemploOperadorLogicoOu(){
        // Operador Lógico Ou || (pipe)
        // V ou V => V
        // V ou F => V
        // F ou V => V
        // F ou F => F
        boolean empregadoClt = false;
        boolean empregadoAutonomo = false;
        // V ou V => V
        if (empregadoClt == true || empregadoAutonomo == true){
            JOptionPane.showMessageDialog(null, "Boa viagem para Disney");
        }else{
            JOptionPane.showMessageDialog(null, "Fica em casa");
        }
    }

    public static void main(String[] args) {
        new ExemploIf01().exemploOperadorLogicoOu();
    }
}
