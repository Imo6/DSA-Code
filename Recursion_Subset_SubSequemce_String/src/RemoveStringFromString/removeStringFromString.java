package RemoveStringFromString;
//
//public class removeStringFromString {
//
//	public static void main(String[] args) {
//		String str="baccmbapplead";
//		String res=skip(str);
//		System.out.println(res);
//
//	}
//	public static String skip(String up) {
//		if(up.isEmpty()) {
//			return "";
//		}
//		if(up.startsWith("apple")) {
//			return skip(up.substring(5));
//		}else {
//			return up.charAt(0)+skip(up.substring(1));
//		}
//	}
//
//}





public class removeStringFromString {

	public static void main(String[] args) {
		String str="baccmbappead";
		String res=skip(str);
		System.out.println(res);

	}
	public static String skip(String up) {
		if(up.isEmpty()) {
			return "";
		}
		if(up.startsWith("app") && !up.startsWith("apple")) {
			return skip(up.substring(5));
		}else {
			return up.charAt(0)+skip(up.substring(1));
		}
	}

}
