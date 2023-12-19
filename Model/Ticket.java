package Model;

public class Ticket {
    private String start;
    private String end;
    private int oneWayTicket;
    private int easyCard;
    private int discountTicket;
    private int travelTime;
    

    public Ticket(String start, String end, int oneWayTicket, int easyCard, int discountTicket, int travelTime) {
        this.start = start;
        this.end = end;
        this.oneWayTicket = oneWayTicket;
        this.easyCard = easyCard;
        this.discountTicket = discountTicket;
        this.travelTime = travelTime;
    }
    public String getStart() {
        return start;
    }
    public void setStart(String start) {
        this.start = start;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }
    public int getOneWayTicket() {
        return oneWayTicket;
    }
    public void setOneWayTicket(int oneWayTicket) {
        this.oneWayTicket = oneWayTicket;
    }
    public int getEasyCard() {
        return easyCard;
    }
    public void setEasyCard(int easyCard) {
        this.easyCard = easyCard;
    }
    public int getDiscountTicket() {
        return discountTicket;
    }
    public void setDiscountTicket(int discountTicket) {
        this.discountTicket = discountTicket;
    }
        public int getTravelTime() {
        return travelTime;
    }
    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }
    @Override
    public String toString() {
        return "Ticket [start=" + start + ", end=" + end + ", oneWayTicket=" + oneWayTicket + " dollar, easyCard=" + easyCard
                + " dollar, discountTicket=" + discountTicket + " dollar, travelTime=" + travelTime + " min]";
    }
}
