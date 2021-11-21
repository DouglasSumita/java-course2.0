package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Exercicio_Pensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int numberRooms = sc.nextInt();
		Room[] rooms = new Room[10];

		for (int i = 0; i < numberRooms; i++) {

			sc.nextLine();
			System.out.println();
			System.out.println("Rent #" + (i + 1) + ":");

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Room: ");
			int room = sc.nextInt();
			rooms[room] = new Room(name, email, room);
		}
        
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(rooms[i].toString());
			}
		}
		sc.close();

	}

}