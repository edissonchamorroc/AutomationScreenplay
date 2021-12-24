package chamorro.edisson.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PageSpaceBeyond {

    public static final Target CALENDAR_MONTH = Target.the("Mes de calendario").locatedBy("//span[@class='theme__title___2Ue3-']");

    public static final Target DATE_GO_CLIK = Target.the("fecha de ida").locatedBy("(//div[@data-react-toolbox='date-picker']//input)[1]");
    public static final Target DATE_GO_NEXT = Target.the("Boton siguiente mes").locatedBy("//button[@id='right']");
    public static final Target DATE_GO_DAY = Target.the("Dia de ida en el").locatedBy("//div[@data-react-toolbox='day' and contains(.,'{0}')]");
    public static final Target BUTTON_OK = Target.the("Boton ok").locatedBy("//button[contains(.,'Ok')]");
    public static final Target DATE_BACK_CLIK = Target.the("fecha de regreso").locatedBy("(//div[@data-react-toolbox='date-picker'])[2]");
    public static final Target DATE_BACK_DAY = Target.the("Dia de regreso en el").locatedBy("(//div[@data-react-toolbox='date-picker'])[1]");

    public static final Target ADULTS_NUMBER = Target.the("Numeros de adultos").locatedBy("//*[text()='Adults (18+)']//ancestor::div[@class='theme__input___qUQeP theme__value___mflIw WhiteDropDown__value___34-D5']");
    public static final Target CHILD_NUMBER = Target.the("Numeros de ninos").locatedBy("(//div[@class='theme__input___qUQeP theme__value___mflIw WhiteDropDown__value___34-D5'])[2]");





}
