package com.qa.util;

import java.net.HttpURLConnection;
import java.net.URL;

public class Utility {
	
	public static String verifyLinksActive(String linkURL) {
		String responseMessage = "";
		
		try {
			URL url = new URL(linkURL);
			HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(3000);
			httpURLConnect.connect();
			
			if(httpURLConnect.getResponseCode() == 200) {
				responseMessage = httpURLConnect.getResponseMessage();
			}
			
			if(httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				responseMessage = httpURLConnect.getResponseMessage();
			}
			
		} catch(Exception e) {			

		}		
		return responseMessage;
	}

}
