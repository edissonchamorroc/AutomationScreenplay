package chamorro.edisson.tasks;

import java.util.List;
import java.util.Map;

import chamorro.edisson.utilities.GenericEmail;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterData implements Task {

	private List<List<String>> dataUserToRegister;
	private Map<String, Target> dataTargets;

	public RegisterData(List<List<String>> dataUserToRegister, Map<String, Target> dataTargets) {

		this.dataUserToRegister = dataUserToRegister;
		this.dataTargets = dataTargets;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
 
		for (int i = 0; i < dataUserToRegister.get(0).size(); i++) {
		
			if (dataUserToRegister.get(0).get(i).contains("Radio")) {

				actor.attemptsTo(Click
						.on(dataTargets.get(dataUserToRegister.get(0).get(i)).of(dataUserToRegister.get(1).get(i))));

			} else if (dataUserToRegister.get(0).get(i).startsWith("Select")) {

				actor.attemptsTo(Click.on(dataTargets.get(dataUserToRegister.get(0).get(i))),
						Click.on(dataTargets.get("Value").of(dataUserToRegister.get(1).get(i))));

			} else if (dataUserToRegister.get(0).get(i).startsWith("Box")) {

				actor.attemptsTo(Clear.field(dataTargets.get(dataUserToRegister.get(0).get(i))),
						Enter.keyValues(dataUserToRegister.get(1).get(i))
								.into(dataTargets.get(dataUserToRegister.get(0).get(i))),
						Click.on(dataTargets.get("Value box").of(dataUserToRegister.get(1).get(i))));

			} else if (dataUserToRegister.get(0).get(i).equalsIgnoreCase("Email")) {

				actor.attemptsTo(Enter.keyValues(GenericEmail.genericEmail(dataUserToRegister.get(1).get(i)))
						.into(dataTargets.get(dataUserToRegister.get(0).get(i))));

			} else {

				actor.attemptsTo(Clear.field(dataTargets.get(dataUserToRegister.get(0).get(i))),
						Enter.keyValues(dataUserToRegister.get(1).get(i))
								.into(dataTargets.get(dataUserToRegister.get(0).get(i))));

			}

		}

		actor.attemptsTo(Click.on(dataTargets.get("Submit")));

	}

	public static RegisterData register(List<List<String>> dataUserToRegister, Map<String, Target> dataTargets) {

		return Tasks.instrumented(RegisterData.class, dataUserToRegister, dataTargets);
	}

}
