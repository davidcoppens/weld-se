package nl.concipit.weld;

import javax.inject.Inject;

public class HelloWho {
	@Inject 
	HelloDavid helloDavid;
	
	public String greet() {
		return "Hello Who? " + "Hello " + helloDavid.greet();
	}
}
