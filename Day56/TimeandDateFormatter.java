import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class TimeandDateFormatter {
    
    public static void main(String args[]) {
    
        LocalDateTime datetime=LocalDateTime.now();
        
        DateTimeFormatter formatDatetime=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
        
        String formattedDate=datetime.format(formatDatetime);
        
        System.out.println("After formatting: "+formattedDate);
        
    }

}    
