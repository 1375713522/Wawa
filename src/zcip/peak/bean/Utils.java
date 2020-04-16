package zcip.peak.bean;

import java.sql.Connection;
import java.util.Properties;
import java.util.UUID;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Utils {
		
		@Test
		public static String getUUID(){
			return UUID.randomUUID().toString().replaceAll("-", "");
		}
		
		
		
		private static ComboPooledDataSource dataSource;
		static{
			dataSource = new ComboPooledDataSource();

		}
		public static Connection getConnection() throws Exception{
				return dataSource.getConnection();
		}
		
		public static void Letter(final String from,final String password,String to,String subject ,String content) throws Exception {
			Properties props = new Properties();
			props.setProperty("mail.host", "smtp.163.com");
			props.setProperty("mail.smtp.auth", "true");
			
			Authenticator auth = new Authenticator(){
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(from, password);
				}
			};
			
			Session session = Session.getInstance(props,auth);
			
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			msg.setRecipients(RecipientType.TO,to);
			
			msg.setSubject(subject);
			msg.setContent(content,"text/html;charset=utf-8");
			
			Transport.send(msg);
			
		}

}
