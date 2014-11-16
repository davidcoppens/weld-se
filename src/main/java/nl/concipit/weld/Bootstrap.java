package nl.concipit.weld;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Bootstrap {
	public static void main(String... args) {
		WeldContainer weld = new Weld().initialize();
		HelloDavid t = weld.instance().select(HelloDavid.class).get();
		System.out.println(t.greet());
	}
}
