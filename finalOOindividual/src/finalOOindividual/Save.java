package finalOOindividual;

import java.io.File;

public class Save {
	public static Boolean exists() {
		File file = new File("save.txt");
	    boolean exist = file.exists();
		return exist;
	}
}
