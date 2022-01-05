package chamorro.edisson.tasks.spacebeyond;

import static chamorro.edisson.userinterfaces.spacebeyond.PageSpaceBeyond.BUTTON_LOAD_MORE;
import static chamorro.edisson.userinterfaces.spacebeyond.PageSpaceBeyond.CHECK_TERMS;
import static chamorro.edisson.userinterfaces.spacebeyond.PageSpaceBeyond.USER_DOCUMENT;
import static chamorro.edisson.userinterfaces.spacebeyond.PageSpaceBeyond.USER_EMAIL;
import static chamorro.edisson.userinterfaces.spacebeyond.PageSpaceBeyond.USER_NAME;
import static chamorro.edisson.userinterfaces.spacebeyond.PageSpaceBeyond.USER_PHONE;
import static chamorro.edisson.userinterfaces.spacebeyond.PageSpaceBeyond.USER_SECURITY_NUMBER;

import java.io.File;
import java.util.Map;

import org.yaml.snakeyaml.events.DocumentStartEvent;

import chamorro.edisson.utilities.Document;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;

public class InsertDataTravellSpaceBeyond implements Task {
	private Map<String, String> dataToPay;

	public InsertDataTravellSpaceBeyond(DataTable dataToPay) {
		this.dataToPay = dataToPay.asMap(String.class, String.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(BUTTON_LOAD_MORE), Enter.theValue(dataToPay.get("Nombre")).into(USER_NAME),
				Enter.theValue(dataToPay.get("Email")).into(USER_EMAIL),
				Enter.theValue(dataToPay.get("NumeroSeguridad")).into(USER_SECURITY_NUMBER),
				Enter.theValue(dataToPay.get("Celular")).into(USER_PHONE),
				SendKeys.of(Document.getPath(dataToPay.get("Documento"))).into(USER_DOCUMENT), Click.on(CHECK_TERMS));
	}

	public static InsertDataTravellSpaceBeyond toPay(DataTable dataToPay) {
		return Tasks.instrumented(InsertDataTravellSpaceBeyond.class, dataToPay);
	}

}
