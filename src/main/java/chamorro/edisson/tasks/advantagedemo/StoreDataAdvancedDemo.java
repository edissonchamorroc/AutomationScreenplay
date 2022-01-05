package chamorro.edisson.tasks.advantagedemo;

import chamorro.edisson.questions.GetText;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;

public class StoreDataAdvancedDemo implements Task {

	private Target target;

	private String keyData;

	public StoreDataAdvancedDemo(Target target, String keyData) {
		this.target = target;
		this.keyData = keyData;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		Wait.until(GetText.ofField(target), WebElementStateMatchers.isVisible());

		actor.remember(keyData, GetText.ofField(target));

	}

	public static StoreDataAdvancedDemo storeData(Target target, String keyData) {

		return Tasks.instrumented(StoreDataAdvancedDemo.class, target, keyData);

	}

}
