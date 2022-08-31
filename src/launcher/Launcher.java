package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student Barbara = new Student(111288,"Mantovani","Barbara","barbaramantt@gmail.com","https://github.com/barbaramant","file://C:\\Users\\barbi\\Desktop\\UNS\\TDP\\Proyecto 1\\proyecto-1\\src\\images");
            	SimplePresentationScreen ventana = new SimplePresentationScreen(Barbara);
            	ventana.setVisible(true);
            }
        });
    }
}