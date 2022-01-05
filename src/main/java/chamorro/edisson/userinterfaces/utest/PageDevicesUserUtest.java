package chamorro.edisson.userinterfaces.utest;

import java.util.HashMap;
import java.util.Map;

import chamorro.edisson.utilities.Constant;

import net.serenitybdd.screenplay.targets.Target;

public class PageDevicesUserUtest {
	
	public static final Target MOBIL_DEVICE = Target.the("Campo mobil").locatedBy("//*[@id='mobile-device']//*[@name='handsetMakerId']");
	public static final Target MODEL = Target.the("Campo modelo").locatedBy("//*[@id='mobile-device']//*[@name='handsetModelId']");
	public static final Target OPERATING_SYSTEM = Target.the("Campo sistema operativo").locatedBy("//*[@id='mobile-device']//*[@name='handsetOSId']");
	public static final Target VALUE = Target.the("Valor a buscar").locatedBy(Constant.GENERIC_TEXT);
	public static final Target BUTTON_NEXT = Target.the("Boton Next").locatedBy(Constant.GENERIC_TEXT)
			.of("Next: Last Step");  

	public static Map<String, Target> getTargetsDevicesUtest() {
		   
		Map<String, Target> lista = new HashMap<String, Target>();

		lista.put("Select Device", MOBIL_DEVICE);

		lista.put("Select Reference", MODEL);

		lista.put("Select System", OPERATING_SYSTEM);

		lista.put("Value", VALUE);
		
		lista.put("Submit", BUTTON_NEXT);

		return lista;
	}

}
