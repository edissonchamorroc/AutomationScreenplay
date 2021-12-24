package chamorro.edisson.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class IsEqual implements Question<Boolean> {
    private Target target;
    private String text;
    public IsEqual(Target target, String text){
        this.target=target;
        this.text=text;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean response=false;

        if(text.equalsIgnoreCase(Text.of(target).viewedBy(actor).asString())){
            response=true;
        }
        return response;
    }

    public static IsEqual toText(Target target,String text) {
       return new IsEqual(target, text);
     }

}
