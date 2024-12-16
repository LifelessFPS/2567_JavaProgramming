import javax.swing.*;
public class Lab303_1 {

	public static void main(String[] args) {
		String sentence;
        int countWords = 0;


        sentence = JOptionPane.showInputDialog(null, "Input the sentence : ", "Input", JOptionPane.QUESTION_MESSAGE);
        
        
        

        
        while (!sentence.endsWith(".")) {
            sentence = JOptionPane.showInputDialog(null, "Input the sentence, again : ", "Input", JOptionPane.QUESTION_MESSAGE);
            
        }

        
        int spaceCount = sentence.split(" ").length - 1;

        for(int i=0;i < sentence.length();i++) {
			countWords = sentence.split(" ").length;
			
			break;
		}
        
        
        

        
        JOptionPane.showMessageDialog(null,"This sentence has " + spaceCount +" spacebar." + 
        "\nThis sentence has "+ countWords +" word.","Message", JOptionPane.INFORMATION_MESSAGE);

	}

}
