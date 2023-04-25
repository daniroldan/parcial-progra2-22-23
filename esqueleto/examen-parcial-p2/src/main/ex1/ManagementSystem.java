package main.ex1;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;
    ArrayList<Client> allClients;



    public ManagementSystem() {
    }

    public void loadData(String path) {


        FileHandler readFile = new FileHandler();
        List<String> listRoutes;

        listRoutes = readFile.loadFileContent("parcial-progra2-22-23/esqueleto/examen-parcial-p2/data/clients.dat");

            //Load clients from fil

            //For each line in file
        for (String line: listRoutes) {


            String[] data = line.split(";");

            // Extract data from line and remove quotes
            String name = data[0].replaceAll("\"", "");
            String surname = data[1].replaceAll("\"", "");
            String address = data[2].replaceAll("\"", "");
            String phoneNumber = data[3].replaceAll("\"", "");

            Client client2;
            name = data[0];
            surname = data[1];
            address = data[2];
            phoneNumber = data[3];

            client2= new Client(name, surname, address,phoneNumber);
            allClients.add(client2);
        }

            // Create client and add to list


    }
    public void addAppointment(Appointment appointment, Client client) {
       // Add appointment to list
    }

}
