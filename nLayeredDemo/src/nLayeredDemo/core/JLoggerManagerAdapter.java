package nLayeredDemo.core;

import nLayeredDemo.JLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		// TODO Auto-generated method stub
		JLoggerManager jLogManager = new JLoggerManager();
		jLogManager.log(message);
		
	}

}
