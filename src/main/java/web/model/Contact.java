package web.model;

import lombok.Getter;
import lombok.Setter;

public class Contact {
	
	private @Getter @Setter String subject;
    private @Getter @Setter String body;
    private @Getter @Setter String sender;
    private @Getter @Setter String email;
	
	@Override
	public String toString() {
		return "Message --> Subject: " + subject + " / Body: " + body + " / Sender: " + sender + " / Email: " + email;
	}
}
