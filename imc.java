import javax.swing.JOptionPane;

public class Entradaa {

	public static void main(String[] args){
		 
		//IMC
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null, "Legal! vamos calcular seu IMC!");
		
		String peso = JOptionPane.showInputDialog("Qual seu peso?");
		String altura = JOptionPane.showInputDialog("Qual sua altura?");
		
		
		double x = Double.parseDouble(altura);
		double y = Double.parseDouble(peso);
		double imc = y / (x*x);
		
		
	
		
		if (imc<= 20){
			System.out.println("Abaixo do Peso");
			JOptionPane.showMessageDialog(null, "IMC = " + imc + "\n" + "Abaixo do Peso" );
		}
		
		else if (imc <=25){
			System.out.println("Peso ideal");
			JOptionPane.showMessageDialog(null, "IMC = " + imc + "\n" + "Peso ideal");
			
		}
		
		else if (imc <=30){
			System.out.println("Sobrepeso");
			JOptionPane.showMessageDialog(null,"IMC = " + imc + "\n" + "Sobrepeso");
			
		}
		
		else if (imc <=35){
			System.out.println("Obesidade Moderada");
			JOptionPane.showMessageDialog(null, "IMC = " + imc + "\n" + "Obesidade Moderada");
			
		}
		
		else if (imc <=40){
			System.out.println("Obesidade Severa");
			JOptionPane.showMessageDialog(null, "IMC = " + imc + "\n" + "Obesidade Severa");
			
		}
		
		else if (imc <=50){
			System.out.println("Obesidade Mórbida");
			JOptionPane.showMessageDialog(null, "IMC = " + imc + "\n" + "Obesidade Mórbida");
			
		}
		
		else {
			System.out.println("Super-Obesidade");
			JOptionPane.showMessageDialog(null, "IMC = " + imc + "\n" + "Super-Obesidade");
			
		}
		
		
		
		
	}
	
}
