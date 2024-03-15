
class java2_1 {

	public static void main (String[] args) {
		
		int a = 100 ;
		double b = 1.5 ;
		String c = "7" ;
		double d = 1.2 ;
//		少数が整数にキャストされてる->a + b = 100+1.5==101.5ではなく101となる。-> Integer.parseIntなので"7"が数字の7になる
		System.out.println( Integer.parseInt( ( int )( a + b ) + c ) + d );
		}
	}

