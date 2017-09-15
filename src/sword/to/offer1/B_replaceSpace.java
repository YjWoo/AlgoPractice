package sword.to.offer1;

public class B_replaceSpace {
	// 替换空格
	public static String replaceSpace(StringBuffer str) {
		int n;
		while (str.indexOf(" ") != -1) {
			n = str.indexOf(" ");
			str.replace(n, n + 1, "*");
		}
		return str.toString();
	}
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("You are the apple of my eyes");
		
		System.out.println(replaceSpace(sb));
	}
}
