package chamorro.edisson.tasks;

import chamorro.edisson.inteactions.SelectDateCalendar;
import chamorro.edisson.utilities.SplitDate;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.targets.Target;
import java.util.List;

import static chamorro.edisson.userinterfaces.PageSpaceBeyond.*;
import static chamorro.edisson.userinterfaces.PageSpaceBeyond.DATE_GO_DAY;

public class SelectDateInCalendars implements Task {

    public List<List<String>> travellData;
    public Target goClick;
    public Target goDate;
    public Target backClick;
    public Target backDate;
    public Target ok;
    public SelectDateInCalendars(DataTable dataTravell,Target goClick, Target goDate, Target backClick, Target backDate, Target ok){
        this.travellData =dataTravell.asLists(String.class);
        this.goClick=goClick;
        this.goDate=goDate;
        this.backClick=backClick;
        this.backDate=backDate;
        this.ok=ok;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {//falta modificar aqui
        actor.attemptsTo(SelectDateCalendar.ultilMonth(goDate, goClick,
                        SplitDate.getMonth(travellData.get(1).get(0)), SplitDate.getYear(travellData.get(1).get(0))),Click.on(DATE_GO_DAY.of(SplitDate.getDay(travellData.get(1).get(0)))),
                Click.on(DATE_BACK_CLIK),SelectDateCalendar.ultilMonth(CALENDAR_MONTH, DATE_GO_NEXT,SplitDate.getMonth(travellData.get(1).get(0)),
                        SplitDate.getYear(travellData.get(1).get(1))),Click.on(DATE_GO_DAY.of(SplitDate.getDay(travellData.get(1).get(1)))),Click.on(ok));
    }
    public static SelectDateInCalendars with(DataTable dataTravell,Target goClick, Target goDate, Target backClick, Target backDate, Target ok){
        return Tasks.instrumented(SelectDateInCalendars.class,dataTravell,goDate,goClick,backClick,backDate,ok);
    }
}
