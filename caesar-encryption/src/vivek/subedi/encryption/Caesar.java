/**
 * 
 */
package vivek.subedi.encryption;

/**
 * Class to encrypt and decrypt the given message using Caesar cipher algorithm by by shifting by 3 character
 * 
 * @author shree665
 *
 */
public class Caesar {
	//accepted alpha size
	public static final int ALPHASIZE = 26;
	//all alpha that we expect in the message
	public static final char[] alpha = {'A', 'B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W'
		,'X','Y','Z'};
	//holds the message that were encrypted
	private char[] encrypt = new char[ALPHASIZE];
	//holds the message that were decrypted
	private char[] decrypt = new char[ALPHASIZE];
	
	/**
	 * Constructor to encrypt and decrypt the alpha before hand so that it is very easy
	 * to just pick the char of that position and replace it depending on encrypt or decrypt
	 */
	public Caesar(){
		for (int i = 0; i < ALPHASIZE; i++) {
			encrypt[i] = alpha[(i+3) % ALPHASIZE];
		}
		for (int i = 0; i < ALPHASIZE; i++) {
			decrypt[encrypt[i] - 'A'] = alpha[i];
		}
	}
	
	/**
	 * @param secret - message that needs needs to encrypt
	 * @return string of encrypted message
	 */
	public String encrypt(String secret){
		char[] mess = secret.toCharArray();
		for (int i = 0; i < mess.length; i++) {
			if (Character.isUpperCase(mess[i])) {
				mess[i] = encrypt[mess[i] - 'A'];
			}
		}
		return new String(mess);
	}
	
	/**
	 * @param secret - encrypted message
	 * @return decrypted message
	 */
	public String decrypt(String secret){
		char[] mess = secret.toCharArray();
		for (int i = 0; i < mess.length; i++) {
			if (Character.isUpperCase(mess[i])) {
				mess[i] = decrypt[mess[i] - 'A'];
			}
		}
		return new String(mess);
	}

	public char[] getEncrypt() {
		return encrypt;
	}

	public void setEncrypt(char[] encrypt) {
		this.encrypt = encrypt;
	}

	public char[] getDecrypt() {
		return decrypt;
	}

	public void setDecrypt(char[] decrypt) {
		this.decrypt = decrypt;
	}
}
