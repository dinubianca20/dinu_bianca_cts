package facade.main;

import facade.model.Autobuz;
import facade.model.AutobuzSimplificat;

public class Main {

	public static void main(String[] args) {
		 Autobuz autobuz=new Autobuz("PH01BUS");
		
//		 autobuz.deschideUsaFata();
//		 autobuz.deschideUsaMijloc();
//		 autobuz.deschideUsaSpate();
		 
		 AutobuzSimplificat autobuzSimplificat = new AutobuzSimplificat(autobuz);
		 autobuzSimplificat.deschideUsile();
		 autobuzSimplificat.ramanDeschise();
	}

}
