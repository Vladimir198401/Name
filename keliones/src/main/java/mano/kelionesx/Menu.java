package mano.kelionesx;

/**
 * @author
 * by https://www.mkyong.com/java/java-enum-example/
 * by https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 * by https://www.geeksforgeeks.org/enum-in-java/
 */
public enum Menu {

	Miestai("/miestai")
	, Keliones("/keliones")
	, Pradžia("/");
	
	private final String itemurl;
	
	Menu( String url ) {
		this.itemurl = url;
	}
	
	public String itemurl() {
		return this.itemurl;
	}
	
}
