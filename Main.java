
import Model.InputReader;
import Model.MRT;
import Model.Ticket;

public class Main{
    
    public static void main(String[] args) {
       //String[] s = InputReader.readInput();
       String[] s = {"南港展覽館", "東湖"};
        MRT myMrt = new MRT();
        for (int i = 0; i < myMrt.myData.size(); i++) {
            if ((myMrt.myData.get(i).getStart().equals(s[0]) && myMrt.myData.get(i).getEnd().equals(s[1])) || (myMrt.myData.get(i).getStart().equals(s[1]) && myMrt.myData.get(i).getEnd().equals(s[0])) ) {
                System.out.println(myMrt.myData.get(i));
                return;
            }
        }
        
    }    
}
