
public class Admin extends Employree{
	// Fields
	private String position;
	private int extension;
	
	// Methods
	public String get_position() {
		return position;
	}
	public int get_extension() {
		return extension;
	}
	
	// Constructor Method
	public Admin (String f, String l, int e, double s, String d, int h)
	{
		super(f, l, e, s);
		position = d;
		extension = h;
	}
}
