
 

 
/* FrameDemo.java requires no other files. */
public class DND { 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
//    	window open = new window();
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	
                window.createGUI();
                
            }
        });
    }
}
