class IntToRoman {
	public static String IntToRoman(int num) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "I"); 
		map.put(5, "V"); 
		map.put(10, "X");
		map.put(50, "L"); 
		map.put(100, "C"); 
		map.put(500, "D"); 
		map.put(1000, "M");
		map.put(4, "IV"); 
		map.put(9, "IX"); 
		map.put(40, "XL"); 
		map.put(90, "XC");
		map.put(400, "CD"); 
		map.put(900, "CM");

		int[] sequence = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

		StringBuffer sb = new StringBuffer();
		for (int i=0; i<sequence.length; i++) {
			int base = sequence[i];
			while (num >= base) {
			sb.append(map.get(base));//利用StringBuffer資料結構的特性，可以呼叫append（）方法
			num -= base;
			}
		}
		return sb.toString();//StringBuffer的函數方法
	}

	public static void main(String[] args){
		System.out.print(IntToRoman(34));
	}
}