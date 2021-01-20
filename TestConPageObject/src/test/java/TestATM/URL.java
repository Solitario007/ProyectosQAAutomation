package TestATM;

import java.io.IOException;

import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.Response;

public class URL implements CommandExecutor {

	public URL(String url) {
		String USERNAME = null;
		String AUTOMATE_KEY = null;
		// TODO Auto-generated constructor stub
		url = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	}

	public Response execute(Command command) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
