package chamorro.edisson.tasks.guru;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUser implements Task {

	private String user;
	private String password;
	private Target targetUser;
	private Target targetPassword;
	private Target targetLogin;

	public LoginUser(String user, String password, Target targetUser, Target targetPassword, Target Login) {
		this.user = user;
		this.password = password;
		this.targetUser = targetUser;
		this.targetPassword = targetPassword;
		this.targetLogin = Login;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub

		actor.attemptsTo(Enter.theValue(user).into(targetUser), Enter.theValue(password).into(targetPassword),
				Click.on(targetLogin));

	}

	public static LoginUser login(String user, String password, Target targetUser, Target targetPassword,
			Target Login) {

		return Tasks.instrumented(LoginUser.class, user, password, targetUser, targetPassword, Login);
	}

}
