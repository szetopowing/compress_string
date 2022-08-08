package cloudpayexercise;

public class Solution {

	public String compress(String str) {

		char[] chars = str.toCharArray();

		StringBuilder sb = new StringBuilder();
		int lo = 0, hi = 0;
		while (hi < chars.length && lo <= hi) {
			char ch = chars[lo];
			hi++;
			if ((hi < chars.length) && ch == chars[hi]) {
				continue;
			} else {
				int len = hi - lo;
				sb.append(ch);
				if (len >= 1) {
					sb.append(len);
				}
				lo = hi;
			}
		}

		return sb.toString();

	}

	public String decompress(String str) {

		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		int even = 0;

		for (int i = 1; i < chars.length; i = i + 2) {
			even = Integer.parseInt(String.valueOf(chars[i]));
			for (int j = 0; j < even; j++) {
				sb.append(chars[i - 1]);
			}
		}

		return sb.toString();
	}

}