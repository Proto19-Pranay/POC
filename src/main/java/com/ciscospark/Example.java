package com.ciscospark;

import java.net.URI;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String accessToken = "ZTNhNGQ5ZTItMzNmYi00NTMyLWJkNDQtZTRiNmE2ZGRjZTNlOWUzZmRmNzAtNjFi_P0A1_5ca35974-f1f2-4dc7-8dd1-01e03795ca2b";

		//Init the client
		Spark spark = Spark.builder()
				.baseUrl(URI.create("https://webexapis.com/v1"))
				.accessToken(accessToken)
				.build();
		
		//Create a new room
		Room room = new Room();
		room.setTitle("First meet");
		room = spark.rooms().post(room);
		
		//Post a message to the room
		Message message = new Message();
		message.setRoomId(room.getId());
		message.setText("Hello People!");
		spark.messages().post(message);
		System.out.println("Execution Complete");
	}

}
