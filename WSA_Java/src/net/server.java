import java.net.*;
import java.io.*;
import java.util.*;


class Port {
	
	private Map<Integer,Integer> val;

	Port(){
		val = new HashMap<>();
	}

	public int getPort(int port){
		return this.val.get(port);
	}

	public boolean setPort(int port){

		if (!this.val.containsKey(port)) {
			this.val.put(port, 5000);
		}
		else {
			return false;
		}
		return true;
	}
}

enum ServerMessages {
	SERVER_STR("Server started. Waiting for connection..."),
	CLIENT_CON("Client connected: "),
	RECV_MSG("Received from client: "),
	RES_SENT("Response sent to client."),
	SERVER_ERR("Server encountered an error!"),
	SERVER_INIT_MSG("Hi! Client");

	private final String message;
	
	ServerMessages(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public String format(Object... args){
		return String.format(message, args);
	}
}

class ClientMessage{
	
	public String message;
}

class Server {

	private Port port;	

	Server()throws IOException{
		port = new Port();
		port.setPort(4000);

		ServerSocket srv = new ServerSocket(port.getPort(4000));
		System.out.println(ServerMessages.SERVER_STR.getMessage());

		Socket socket = srv.accept();
		System.out.println(ServerMessages.CLIENT_CON.getMessage() + socket.getInetAddress());

		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

		ClientMessage con = new ClientMessage();
		con.message = input.readLine();

		System.out.println(ServerMessages.RECV_MSG.getMessage() + con.message);
		output.println(ServerMessages.SERVER_INIT_MSG.getMessage());

		System.out.println(ServerMessages.RES_SENT.getMessage());

		input.close();
		output.close();
		socket.close();
		 				
	}

	public static void main(String[] args)throws IOException{
		Server obj = new Server();
	}
}

