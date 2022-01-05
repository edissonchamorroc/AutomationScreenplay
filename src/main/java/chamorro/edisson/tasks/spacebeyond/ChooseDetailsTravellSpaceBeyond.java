package chamorro.edisson.tasks.spacebeyond;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;

import static chamorro.edisson.userinterfaces.spacebeyond.PageSpaceBeyond.*;

import java.util.Map;

public class ChooseDetailsTravellSpaceBeyond implements Task {

    public DataTable travellData;
    public Map<String, String> data;

    public ChooseDetailsTravellSpaceBeyond(DataTable travellData) {
        this.travellData = travellData;
        data = travellData.asMap(String.class, String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DATE_GO_CLIK),
                SelectDateSpaceBeyond.with(travellData, "FechaIda", CALENDAR_MONTH, DATE_NEXT, BUTTON_OK),
                Click.on(DATE_BACK_CLIK),
                SelectDateSpaceBeyond.with(travellData, "FechaRegreso", CALENDAR_MONTH, DATE_NEXT, BUTTON_OK),
                Click.on(ADULTS_NUMBER_CLICK), Click.on(NUMBER_ADULTS.of(data.get("NumeroAdultos"))),
                Click.on(CHILD_NUMBER_CLICK), Click.on(NUMBER_CHILDREN.of(data.get("NumeroNinos"))),
                Enter.theValue(data.get("Precio")).into(TRAVELL_PRICE), Click.on(BOOK_PLANET.of(data.get("Planeta"))), Click.on(BOOK_PLANET.of(data.get("Planeta"))));


    }

    public static ChooseDetailsTravellSpaceBeyond toPlanet(DataTable travellData) {
        return Tasks.instrumented(ChooseDetailsTravellSpaceBeyond.class, travellData);
    }

}







































