package de.ragedev.example.jaxrs.client;

import java.io.InputStream;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class JaxRSCaller {
	private static String example = "{\"ExampleValue\":{\"name\":\"Raphael\"}}";

	public static void main(String[] args) {
		HttpClient httpClient = HttpClientBuilder.create().build(); 

		try {

			HttpPost request = new HttpPost("http://127.0.0.1:7777/services/hello");
			StringEntity params = new StringEntity(example);
			request.addHeader("content-type", "application/json");
			request.setEntity(params);
			HttpResponse response = httpClient.execute(request);
			System.out.println("<--: " + convertStreamToString(response.getEntity().getContent()));

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
		}
	}

	static String convertStreamToString(InputStream is) {
		Scanner scanner = new Scanner(is);
		java.util.Scanner s = scanner.useDelimiter("\\A");
		String result = s.hasNext() ? s.next() : "";
		scanner.close();
		return result;
	}
}
