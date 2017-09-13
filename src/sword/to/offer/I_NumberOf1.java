package sword.to.offer;

public class I_NumberOf1 {
	//给定整数二进制中1的个数
	public static int NumberOf1(int n) {
		char[] arr=Integer.toBinaryString(n).toCharArray();
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (arr[i]=='1') {
				sum++;
			}
		}
		return sum;
    }
	
	public static void main(String[] args) {
		System.out.println("sum: "+NumberOf1(40));
		System.out.println("sum: "+NumberOf1(-40));
	}
}
