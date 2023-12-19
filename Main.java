
import Model.InputReader;
import Model.MRT;
import Model.Ticket;

public class Main{
    
    public static void main(String[] args) {
       //String[] searchData = InputReader.readInput();
       String[] s = {"亞東醫院", "復興崗"};
        long startTime = System.currentTimeMillis();
        MRT myMrt = new MRT();
        //myMrt.loadData();
        // for (int i = 0; i < myMrt.myData.size(); i++) {
        //     if ((myMrt.myData.get(i).getStart() == s[0] && myMrt.myData.get(i).getEnd() == s[1]) || (myMrt.myData.get(i).getStart() == s[1] && myMrt.myData.get(i).getEnd() == s[0]) ) {
        //         System.out.println(myMrt.myData.get(i));
        //     }
            
        // }
        Ticket myTicket = myMrt.getTicket(s[0], s[1]);
        //System.out.println("Your Ticket info: ");
        System.out.println(myTicket.toString());

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Runtime: " + executionTime + " ms");
        
    }    
    
    
}