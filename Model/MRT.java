package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MRT {
    public ArrayList<Ticket> myData;
    
    public MRT() {
        //loadData();
    }
    public Ticket getTicket(String start, String end){
        String[] row = getRow(start, end);
        return new Ticket(start, end, Integer.valueOf(row[2]), Integer.valueOf(row[3]), Integer.valueOf(row[4]), Integer.valueOf(row[5]));
    }
    private String[] getRow(String start, String end){
        for (int i = 1; i <= 103; i++) {
            if (i<=9) {
                String csvFilePath = "mrt/mrt0"+ i +".csv";
                try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] row = line.split(",");

                        if ((start.equals(row[0]) && end.equals(row[1])) || (start.equals(row[1]) && end.equals(row[0]))) {
                            return row;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                String csvFilePath = "./mrt/mrt"+ i +".csv";
                try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] row = line.split(",");

                        if ((start.equals(row[0]) && end.equals(row[1])) || (start.equals(row[1]) && end.equals(row[0]))) {
                            return row;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
    public void loadData(){
        myData = new ArrayList<>();
         String csvFilePath = "mrt/mrt0"+ 1 +".csv";
         for (int i = 1; i <= 103; i++) {
            if (i<=9) {
                try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
                    String line;
                    line = br.readLine();
                    while ((line = br.readLine()) != null) {
                        String[] row = line.split(",");
                        myData.add(new Ticket(row[0], row[1], Integer.valueOf(row[2]), Integer.valueOf(row[3]), Integer.valueOf(row[4]), Integer.valueOf(row[5])));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else{
                try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
                    String line;
                    line = br.readLine();
                    while ((line = br.readLine()) != null) {
                        String[] row = line.split(",");
                        myData.add(new Ticket(row[0], row[1], Integer.valueOf(row[2]), Integer.valueOf(row[3]), Integer.valueOf(row[4]), Integer.valueOf(row[5])));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}