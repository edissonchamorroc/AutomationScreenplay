package chamorro.edisson.utilities;

import net.serenitybdd.screenplay.targets.Target;

public class Constant {

    public static final String ACTOR_NAME = "Practicante";
    public static final String QUANTITY_ONE = "1";
    public static final String GENERIC_TEXT = "//*[text()='{0}']";
    public static final String GENERIC_LABEL_CONTAINS = "//label[contains(.,'{0}')]";
    public static final String GENERIC_INPUT_NAME = "//*[@name='{0}']";
    public static final String GENERIC_INPUT_VALUE = "//*[@value='{0}']";
    public static final String GENERIC_INPUT_TYPE = "//*[@type='{0}']";
    public static final String GENERIC_BACK_IMG = "//*[@a-sec-back-img='{0}']";
    public static final String GENERIC_DIV_SHOW_TITLE = "//div[@ng-show='firstImageToShow']//*[@title='{0}']";
    public static final String GENERIC_OPTION_LABEL = "//option[@label='{0}']";
    public static final Target SELECT_VALUE = Target.the("Valor de select").locatedBy(Constant.GENERIC_OPTION_LABEL);
    
} 
