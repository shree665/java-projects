/**
 * 
 */
package reverseArray;

/**
 * @author shree665
 *
 */
public class ReverseArray {

	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5,6,7,8,9};
		System.out.println("Regular Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		Integer[] b = reverseArray(a);
		System.out.println("Reversed Array:");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

	private static Integer[] reverseArray(Integer[] a) {
		Integer[] b = new Integer[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[a.length-i-1];
		}
		return b;
	}

}
