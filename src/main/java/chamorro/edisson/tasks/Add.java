package chamorro.edisson.tasks;

import chamorro.edisson.userinterfaces.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class Add implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(MoveMouse.to(EveningDresses.RESULT_DRESS), Click.on(EveningDresses.BUTTON_ADD));
	}

	public static Add dressToCart() {
		return Tasks.instrumented(Add.class);
	} 

}
