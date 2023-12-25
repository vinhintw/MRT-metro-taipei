package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MRT {
    public ArrayList<Ticket> myData;
    
    public MRT() {
        loadData();
    }
    public void loadData(){
        myData = new ArrayList<>();
         for (int i = 1; i <= 103; i++) {
                String csvFilePath = (i <= 9) ? "./MRT-metro-taipei/mrt/mrt0" + i + ".csv" : "./MRT-metro-taipei/mrt/mrt" + i + ".csv";
                try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
                    String line = br.readLine();
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
