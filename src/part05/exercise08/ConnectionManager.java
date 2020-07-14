package part05.exercise08;

import java.util.Queue;

public class ConnectionManager{
	final static Connection[] connections = {new Connection(), new Connection()};
	private static int countdown = connections.length;
	
	public static Connection pollConnection() {
		if(countdown<1) return null;		
		return connections[countdown -=1];
	}
}