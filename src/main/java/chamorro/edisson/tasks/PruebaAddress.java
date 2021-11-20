package chamorro.edisson.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class PruebaAddress implements Task {
	private Target target;
	public PruebaAddress(Target target) {
		this.target=target;
	}
	
	public static PruebaAddress prueba(Target target) {
		return Tasks.instrumented(PruebaAddress.class,target);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(target),Enter.theValue("Argentina").into(target));
	}
}
