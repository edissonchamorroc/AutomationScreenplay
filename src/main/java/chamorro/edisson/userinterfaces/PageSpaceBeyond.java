package chamorro.edisson.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PageSpaceBeyond {

    public static final Target CALENDAR_MONTH = Target.the("Mes de calendario").locatedBy("//span[@class='theme__title___2Ue3-']");

    public static final Target DATE_GO_CLIK = Target.the("fecha de ida").locatedBy("(//div[@data-react-toolbox='date-picker']//input)[1]");
    public static final Target DATE_NEXT = Target.the("Boton siguiente mes").locatedBy("//button[@id='right']");
    public static final Target DATE_DAY = Target.the("Dia de ida en el").locatedBy("//div[@data-react-toolbox='day' and contains(.,'{0}')]");
    public static final Target BUTTON_OK = Target.the("Boton ok").locatedBy("//button[contains(.,'Ok')]");
    public static final Target DATE_BACK_CLIK = Target.the("fecha de regreso").locatedBy("(//div[@data-react-toolbox='date-picker'])[2]");


    public static final Target ADULTS_NUMBER_CLICK = Target.the("Click a numeros de adultos").locatedBy("//input[@value='Adults (18+)']");
    public static final Target NUMBER_ADULTS = Target.the("Numeros de adultos").locatedBy("//*[text()='{0}']");
    public static final Target CHILD_NUMBER_CLICK = Target.the("Click a numeros de ninos").locatedBy("//input[@value='Children (0-7)']");
    public static final Target NUMBER_CHILDREN = Target.the("Numeros de ninos").locatedBy("(//*[text()='{0}'])[2]");

    public static final Target TRAVELL_PRICE = Target.the("Precio de viaje").locatedBy("(//input[@class='theme__inputElement___27dyY theme__filled___1UI7Z'])[2]");
    public static final Target PLANET = Target.the("Planeta a viajar").locatedBy("//div[@data-react-toolbox='card' and contains(.,'{0}')]//button");


    public static final Target BUTTON_LOAD_MORE = Target.the("Boton load more").locatedBy("//button[contains(.,'Load more')]");
    public static final Target USER_NAME = Target.the("Campo nombre de usuario a viajar").locatedBy("//div[@data-react-toolbox='input' and contains(.,'Name')]/input");
    public static final Target USER_EMAIL = Target.the("Campo email de usuario a viajar").locatedBy("//div[@data-react-toolbox='input' and contains(.,'Email Address')]/input");
    public static final Target USER_SECURITY_NUMBER = Target.the("Campo numero de seguridad social de usuario a viajar").locatedBy("//div[@data-react-toolbox='input' and contains(.,'Social Security Number')]/input");
    public static final Target USER_PHONE= Target.the("Planeta a telefono").locatedBy("//div[@data-react-toolbox='input' and contains(.,'Phone Number')]/input");
    public static final Target USER_DOCUMENT = Target.the("Planeta a document").locatedBy("//div[@data-react-toolbox='input' and contains(.,'Email Address')]/input");



}
