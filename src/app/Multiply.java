package app;

import java.util.StringTokenizer;

public class Multiply {
	public static void main(String[] args) {
		// toCamelCase("The-Stealth-Warrior");
		int a = 1;
		int b = 2;
		int c = 2;
		int max = Math.max(Math.max(a, b), c);
		System.out.println(max);
		int sumOfall = a + b + c;
		System.out.println(sumOfall);
		float d = (float) (sumOfall / 2.0);
		System.out.println(d);
		System.out.println(((float) (sumOfall / 2.0) > max) ? true : false);

	}

	static String toCamelCase(String s) {

		StringTokenizer strTokens = new StringTokenizer(s, "_-");
		StringBuffer sbff = new StringBuffer();
		boolean isFirstTkn = true;
		String stringToken;
		while (strTokens.hasMoreTokens()) {
			stringToken = strTokens.nextToken();
			if (isFirstTkn) {
				sbff.append(stringToken);
				isFirstTkn = false;
			} else {
				sbff.append(Character.toUpperCase(stringToken.charAt(0)) + stringToken.substring(1));
			}
		}
		return sbff.toString();
	}

}
