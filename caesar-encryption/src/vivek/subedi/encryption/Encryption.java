/**
 * 
 */
package vivek.subedi.encryption;

import javax.swing.JOptionPane;

/**
 * Encrypt and decrypt message depending on the user's choice using Caesar cipher algorithm
 * 
 * @author shree665
 *
 */
public class Encryption {
	public static void main(String[] args) {
		do{
			Caesar cipher = new Caesar();
			Integer choose = menu();
			if(choose != 1 && choose != 2){
				menu();
			}
			else{
				switch(choose){
				case 1: 
					String secret = JOptionPane.showInputDialog("Please enter your text to encrypt.");
					String encryptMessage = cipher.encrypt(secret.toUpperCase());
					System.out.println("The encrypted message is: "+encryptMessage);
					JOptionPane.showMessageDialog(null,"Your ecrypted message is: \n"+encryptMessage +"\n\nYour Original Message is: "+secret);
					break;
				case 2:
					String secret2 = JOptionPane.showInputDialog("Please enter your text to decrypt.");
					String decryptMessage = cipher.decrypt(secret2.toUpperCase());
					System.out.println("The Decrypted message is: "+decryptMessage);
					JOptionPane.showMessageDialog(null,"Your decrypted message is: \n"+decryptMessage);
				}
			}
			System.out.println(cipher.getEncrypt());
			System.out.println(cipher.getDecrypt());
		}while(JOptionPane.showConfirmDialog(null, "Would you like to do it again !") == JOptionPane.YES_OPTION);
		

	}

	private static Integer menu() {
		String menu = "Please choose: \n1. Encrypt \n2. Decrypt";
		Integer choose = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		return choose;
	}

}
