// Taken from Computer Networking by Kurose and Ross

import java.io.*;
import java.net.*;
class TCPServer
{
    public static void main(String argv[]) throws Exception
    {
	String clientSentence;
	String capitalizedSentence;
	ServerSocket welcomeSocket = new ServerSocket(6789);
	while(true)
	    {
		Socket connectionSocket = welcomeSocket.accept();
		BufferedReader inFromClient = new BufferedReader
		    (new InputStreamReader(connectionSocket.getInputStream()));
		DataOutputStream OuttoClient = new DataOutputStream
		    (connectionSocket.getOutputStream());
		clientSentence = inFromClient.readLine();
		capitalizedSentence = clientSentence.toUpperCase() + '\n';
		OuttoClient.writeBytes(capitalizedSentence);
	    }
    }
}
