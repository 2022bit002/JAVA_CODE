



import javax.swing.JFrame;
import javax.swing.JLabel;

class Clock {
    private JFrame jf;
    private JLabel jl;

    Clock() {
        jf = new JFrame("DigiClock");
        jl = new JLabel();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(jl);
        jf.setVisible(true);
        jf.setSize(400, 200);
        time();
    }

    void time() {
        while (true) {

           

            long currentTimeMillis = System.currentTimeMillis();

            // Convert milliseconds to seconds
            long totalSeconds = currentTimeMillis / 1000;

            // Calculate seconds
            long seconds = totalSeconds % 60;

            // Calculate total minutes
            long totalMinutes = totalSeconds / 60;

            // Calculate minutes
            long minutes = (totalMinutes + 30) % 60;

            // Calculate total hours
            long totalHours = totalMinutes / 60;

            // Calculate hours (taking into account the time zone offset)
            long hours = (totalHours + 6) % 24; // Assuming your local time is 5 hours ahead of GMT

            // Print the current time in hours, minutes, and seconds format
            System.out.println("Current time: " + hours + " hours, " + minutes + "minutes, " + seconds + " seconds");
            String t = hours + ":" + minutes + ":" + seconds;
            jl.setText(t);
        }

    }
    
     public static void main(String[] args) {
        // Get the current time in milliseconds
        new Clock();

    }
}


