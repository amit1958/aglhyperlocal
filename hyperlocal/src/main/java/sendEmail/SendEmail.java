package sendEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public  void sendAnEmail(String bodyText, String subjectText) throws EmailException{
		Email email= new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("amit.sharma.eng14805@gmail.com", "Amit@1985"));
		email.setSSL(true);
		email.setFrom("amit.kumar1@adglobal360.com");
		//email.setSubject("Selenium Testing");
		email.setSubject(subjectText);
		//email.setMsg("Body of the email");
		email.setMsg(bodyText);
		email.addTo("amit.sharma.eng14805@gmail.com");
		email.send();
		
		System.out.println("=============Email Sent============");
	}
		
		public  void sendAnEmailwithAttachement(String bodyText, String subjectText) throws EmailException{
			EmailAttachment emailAt= new EmailAttachment();
			emailAt.setPath("C:/Users/AGL/git/aglhyperlocal/hyperlocal/test-output/emailable-report.html");
			emailAt.setDisposition(EmailAttachment.ATTACHMENT);
			emailAt.setDescription("Sanity Check");
			emailAt.setName("Testsuite Status");
			
			MultiPartEmail email= new MultiPartEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("amit.sharma.eng14805@gmail.com", "Amit@1985"));
			email.setSSL(true);
			email.setFrom("amit.kumar1@adglobal360.com");
			//email.setSubject("Selenium Testing");
			email.setSubject(subjectText);
			//email.setMsg("Body of the email");
			email.setMsg(bodyText);
			email.addTo("amit.kumar1@adglobal360.com");
			email.addCc("vishnu.dass@adglobal360.com");
			email.addTo("mridul.dhiman@adglobal360.com");
//			email.addBcc("amit.sharma.eng14805@gmail.com");
			email.attach(emailAt);
			email.send();
			
			System.out.println("=============Email Sent============");
	}
}

