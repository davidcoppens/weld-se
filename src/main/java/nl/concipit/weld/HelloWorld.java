package nl.concipit.weld;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.jboss.weld.environment.se.bindings.Parameters;
import org.jboss.weld.environment.se.events.ContainerInitialized;

@ApplicationScoped
public class HelloWorld {
   @Inject @Parameters List<String> parameters;
   
   @Inject
   HelloWho d;
   
   public void printHello(@Observes ContainerInitialized event) {
       System.out.println("Hello " + d.greet());
   }
}