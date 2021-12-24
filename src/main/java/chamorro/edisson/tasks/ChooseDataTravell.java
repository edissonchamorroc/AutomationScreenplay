package chamorro.edisson.tasks;

import java.util.List;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ChooseDataTravell implements Task {

	private List<List<String>> travellData;

	public ChooseDataTravell(DataTable travellData) {
		this.travellData = travellData.asLists(String.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		


	}

	public static ChooseDataTravell toPlanet(DataTable travellData) {
		return Tasks.instrumented(ChooseDataTravell.class, travellData);
	}

}
