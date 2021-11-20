package chamorro.edisson.tasks;

import java.util.List;
import java.util.Map;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SelectQualities implements Task {

	private List<List<String>> qualitiesData;

	private Map<String, Target> dataTargets;

	public SelectQualities(List<List<String>> qualitiesData, Map<String, Target> dataTargets) {
		this.qualitiesData = qualitiesData;
		this.dataTargets = dataTargets;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		for (int i = 0; i < qualitiesData.get(0).size(); i++) {

			if (qualitiesData.get(0).get(i).equalsIgnoreCase("Quantity")) {

				actor.attemptsTo(Clear.field(dataTargets.get(qualitiesData.get(0).get(i))), Enter
						.keyValues(qualitiesData.get(1).get(i)).into(dataTargets.get(qualitiesData.get(0).get(i))));

			} else {

				actor.attemptsTo(
						Click.on(dataTargets.get(qualitiesData.get(0).get(i)).of(qualitiesData.get(1).get(i))));
			}
		}

	}

	public static SelectQualities selectQualities(List<List<String>> qualitiesData, Map<String, Target> dataTargets) {

		return Tasks.instrumented(SelectQualities.class, qualitiesData, dataTargets);

	}

}
