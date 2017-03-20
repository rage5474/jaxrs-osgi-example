package de.ragedev.example.jaxrs.service;

import java.util.concurrent.CountDownLatch;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class Application implements IApplication {

	private CountDownLatch latch = new CountDownLatch(1);
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.err.println("Type 'X' for exit.");
		int read = -1;
		while((read = System.in.read()) != 'X')
			System.out.println("Type 'X' for exit.");
		

		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {

	}

}
