import java.net.*;
import java.io.*;
import java.util.*;

class Packet {
	
	private Map<Integer,Integer> val;
	private String IP;

	Packet(){
		val = new HashMap<>();
		this.IP = "192.168.134.65"; 
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

	public String getIP(){
		return this.IP;
	}
}

class Client {
	
	private Packet packet;
	
	Client()throws IOException{
		
		packet = new Packet();
		packet.setPort(4000);
		
		Socket socket = new Socket(packet.getIP(),packet.getPort(4000));
		
		PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		output.println("Hello from Client");

		String response = input.readLine();
		System.out.println("Received from server:" + response);

		input.close();
		output.close();
	}

	public static void main(String[] args)throws IOException{
		Client obj = new Client();
	}
}

