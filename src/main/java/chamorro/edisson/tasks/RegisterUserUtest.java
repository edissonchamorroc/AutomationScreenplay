package chamorro.edisson.tasks;

import static com.sophossolutions.tasks.RegisterData.register;
import static com.sophossolutions.userinterfaces.PageAddressUserUtest.getTargetsAddressUtest;
import static com.sophossolutions.userinterfaces.PageDevicesUserUtest.getTargetsDevicesUtest;
import static com.sophossolutions.userinterfaces.PagePasswordUserUtest.CHECKBOX_PRIVACY;
import static com.sophossolutions.userinterfaces.PagePasswordUserUtest.CHECKBOX_TERMS;
import static com.sophossolutions.userinterfaces.PagePasswordUserUtest.getTargetsPasswordUtest;
import static com.sophossolutions.userinterfaces.PagePersonalDataUserUtest.getTargetsPersonalUtest;
import static com.sophossolutions.utilities.SplitLists.splitListList;
import static com.sophossolutions.userinterfaces.PageAddressUserUtest.BUTTON_NEXT;

import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RegisterUserUtest implements Task {

	private List<List<String>> dataTable;

	public RegisterUserUtest(List<List<String>> dataTable) {

		this.dataTable = dataTable;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(register(splitListList(dataTable, 14, dataTable.get(0).size()), getTargetsPersonalUtest()),
				register(splitListList(dataTable, 0, 6), getTargetsPersonalUtest()),
				register(splitListList(dataTable, 6, 9), getTargetsAddressUtest()),
				register(splitListList(dataTable, 9, 12), getTargetsDevicesUtest()), Click.on(CHECKBOX_PRIVACY),
				Click.on(CHECKBOX_TERMS), register(splitListList(dataTable, 12, 14), getTargetsPasswordUtest()));

	}

	public static RegisterUserUtest registerUserUtest(List<List<String>> dataTable) {

		return Tasks.instrumented(RegisterUserUtest.class, dataTable);
	}

}
