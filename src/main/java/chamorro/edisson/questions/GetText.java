package chamorro.edisson.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class GetText implements Question<String> {

	private Target target;

	public GetText(Target target) {
		this.target = target;
	} 
  
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(target).viewedBy(actor).asString();
	}
  
	public static GetText ofField(Target target) {
		return new GetText(target);
	}

}
