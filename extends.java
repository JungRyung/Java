import java.util.Scanner;

class base{
	private int base_v1;
	public int base_v2;
	private void base_f1() {}
	public void base_f2() {}
}

class derived extends base{
	private int derived_v1;
	public int derived_v2;
	private void derived_f1() {
		this.base_v1 = 1;
		this.base_v2 = 1;
	}
	public void derived_f2() {
		this.base_f1();
		this.base_f2();
	}
}
public class example {
	public static void main(String[] arg) {
		derived d = new derived();
		d.base_v1 = 1;
		d.base_v2 = 1;
		d.derived_v1 = 1;
		d.derived_v2 = 1;
		d.base_f1();
		d.base_f2();
		d.derived_f1();
		d.derived_f2();
	}
}