package app;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class JavaClass1 {
	public static void main(String[] args) throws FileNotFoundException {
		String str = "123";
		System.out.println(Integer.parseInt(str));
		File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");
		FileInputStream fis = new FileInputStream("src/newFile.txt");
		BufferedInputStream br = new BufferedInputStream(fis);
		String st;
		try {
			BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream("src/newFile.txt")));
			while ((st = br1.readLine()) != null) {
				System.out.println(st);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<String> strList = new ArrayList<String>();
		Circle myCircle = new Circle(23, 45);
		System.out.println("Before myCCircle.x:" + myCircle.getX() + ":mycicle.y:" + myCircle.getY());
		moveCircle(myCircle, 5, 6);
		System.out.println(".... mycircle.x:" + myCircle.getX() + ":mycircle.y:" + myCircle.getY());

	}

	public static void moveCircle(Circle circle, int deltaX, int deltaY) {
		// code to move origin of circle to x+deltaX, y+deltaY
		circle.setX(circle.getX() + deltaX);
		circle.setY(circle.getY() + deltaY);

		// code to assign a new reference to circle
		circle = new Circle(0, 0);
	}
}
