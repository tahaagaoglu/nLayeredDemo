package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String massage) {
		
		JLoggerManager manager=new JLoggerManager();	
		manager.log(massage);
		
	}

}
