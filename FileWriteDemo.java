package com.selva;
import java.util.Scanner;


	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;

	public class FileWriteDemo {

		public static void main(String[] args) throws IOException {
			
			Scanner obj = new Scanner (System.in);
			String name = obj.next();
			String department = obj.next();
			int year = 2006;

			String studentDetails = name + "," + department + "," + year;

			byte[] content = studentDetails.getBytes();

			Path path = Paths.get("student.txt");

			Files.write(path, content);
		System.out.println("enter");

		}

	}


