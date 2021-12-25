package chamorro.edisson.tasks;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static chamorro.edisson.userinterfaces.PageSpaceBeyond.*;
import java.util.Map;

public class InsertDataTravellSpaceBeyond implements Task {
    private Map<String,String> dataToPay;
    public InsertDataTravellSpaceBeyond(DataTable dataToPay){
        this.dataToPay=dataToPay.asMap(String.class,String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_LOAD_MORE),Enter.theValue(dataToPay.get("Nombre")).into(USER_NAME),
                Enter.theValue(dataToPay.get("Email")).into(USER_EMAIL),Enter.theValue(dataToPay.get("NumeroSeguridad")).into(USER_SECURITY_NUMBER),
                Enter.theValue(dataToPay.get("Celular")).into(USER_PHONE));
    }

    public static InsertDataTravellSpaceBeyond toPay(DataTable dataToPay){
        return Tasks.instrumented(InsertDataTravellSpaceBeyond.class, dataToPay);
    }

}
