package chamorro.edisson.tasks.spacebeyond;

import chamorro.edisson.inteactions.SelectDateCalendar;
import chamorro.edisson.utilities.SplitDate;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static chamorro.edisson.userinterfaces.spacebeyond.PageSpaceBeyond.DATE_DAY;

import java.util.Map;

public class SelectDateSpaceBeyond implements Task {

	public Map<String, String> travellData;
	public Target clickNext;
	public Target dateOnScreen;
	public Target ok;
	public String key;

	public SelectDateSpaceBeyond(DataTable travellData, String key, Target dateOnScreen, Target clickNext, Target ok) {
		this.travellData = travellData.asMap(String.class, String.class);
		this.clickNext = clickNext;
		this.dateOnScreen = dateOnScreen;
		this.ok = ok;
		this.key = key;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				SelectDateCalendar.ultilMonth(dateOnScreen, clickNext, SplitDate.getMonth(travellData.get(key)),
						SplitDate.getYear(travellData.get(key))),
				Click.on(DATE_DAY.of(SplitDate.getDay(travellData.get(key)))), Click.on(ok));

	}

	public static SelectDateSpaceBeyond with(DataTable travellData, String key, Target dateOnScreen, Target clickNext,
			Target ok) {
		return Tasks.instrumented(SelectDateSpaceBeyond.class, travellData, key, dateOnScreen, clickNext, ok);
	}
}
