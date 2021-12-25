package chamorro.edisson.inteactions;

import chamorro.edisson.questions.GetText;
import chamorro.edisson.questions.IsEqual;
import chamorro.edisson.utilities.NumberMonth;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectDateCalendar implements Interaction {

	public Target targetText;
	public Target targetClick;
	public String month;
	public String year;
	public boolean isEnable = true;

	public SelectDateCalendar(Target targetText, Target targetClick, String month, String year) {
		this.targetClick = targetClick;
		this.targetText = targetText;
		this.month = month;
		this.year = year;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		while (isEnable) {
			if (actor.asksFor(IsEqual.toText(targetText, NumberMonth.toString(month).concat(" ").concat(year)))) {
				break;
			} else {
				actor.attemptsTo(Click.on(targetClick));
			}
		}
	}

	public static SelectDateCalendar ultilMonth(Target targetText, Target targetClick, String month, String year) {
		return Tasks.instrumented(SelectDateCalendar.class, targetText, targetClick, month, year);
	}

}
