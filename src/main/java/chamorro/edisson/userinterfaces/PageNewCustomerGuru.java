package chamorro.edisson.userinterfaces;

import java.util.HashMap;
import java.util.Map;

import chamorro.edisson.utilities.Constant;

import net.serenitybdd.screenplay.targets.Target;

public class PageNewCustomerGuru {
	
	
	public static Target OPTION_GURU=Target.the("Opcion New Customer").locatedBy(Constant.GENERIC_TEXT);
	public static Target INPUT_GENDER=Target.the("Opcion genero").locatedBy(Constant.GENERIC_INPUT_VALUE);
	public static Target INPUT_NAME =Target.the("Opcion Nombre").locatedBy("name:name") ;
	public static Target INPUT_DATE_BIRTH =Target.the("Opcion fecha de nacimiento").locatedBy("name:dob") ;
	public static Target INPUT_ADDRES =Target.the("Opcion direccion").locatedBy("name:addr") ;
	public static Target INPUT_CITY =Target.the("Opcion ciudad").locatedBy("name:city") ;
	public static Target INPUT_STATE =Target.the("Opcion Estado").locatedBy("name:state") ;
	public static Target INPUT_PIN =Target.the("Opcion Pin").locatedBy("name:pinno");
	public static Target INPUT_MOBIL_NUMBER =Target.the("Opcion Telefono").locatedBy("name:telephoneno") ;
	public static Target INPUT_EMAIL =Target.the("Opcion Email").locatedBy("name:emailid") ;
	public static Target INPUT_PASSWORD =Target.the("Opcion Password").locatedBy("name:password");
	public static Target INPUT_SUBMIT =Target.the("Boton Submit").locatedBy("name:sub");
	public static Target TEXTE_REGISTER_SUCCES=Target.the("Texto de registro").locatedBy(Constant.GENERIC_TEXT) ;
	   
	public static Map<String,Target> getTarget(){
		Map<String,Target> lista = new HashMap<String,Target>();
		lista.put("Gender Radio", INPUT_GENDER);
		lista.put("Name", INPUT_NAME);  
		lista.put("Datebirth", INPUT_DATE_BIRTH);
		lista.put("Address", INPUT_ADDRES);
		lista.put("City", INPUT_CITY);
		lista.put("State", INPUT_STATE);
		lista.put("Pin", INPUT_PIN);
		lista.put("Telephone", INPUT_MOBIL_NUMBER);
		lista.put("Email", INPUT_EMAIL);
		lista.put("Password", INPUT_PASSWORD);
		lista.put("Value", Constant.SELECT_VALUE);
		lista.put("Submit", INPUT_SUBMIT);		
		return lista;
	}
	
	
}
