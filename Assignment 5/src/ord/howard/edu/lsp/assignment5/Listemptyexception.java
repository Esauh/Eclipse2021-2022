package ord.howard.edu.lsp.assignment5;
public class Listemptyexception extends Exception {
	/**
	 * Created exception class which is utilized when lists are empty
	 */
	private static final long serialVersionUID = 1L;

	public Listemptyexception() {
		super("The list needs to hold at least one value");
	}

}