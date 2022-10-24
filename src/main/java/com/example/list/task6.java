package com.example.list;


import java.util.ArrayList;

class House {
    int id;
    int number;
    int area;
    int floor;
    int rooms;
    String street;
    String buildingType;
    int serviceLife;

    public House(int id, int number, int area, int floor, int rooms, String street, String buildingType, int serviceLife) {
        this.id = id;
        this.number = number;
        this.area = area;
        this.floor = floor;
        this.rooms = rooms;
        this.street = street;
        this.buildingType = buildingType;
        this.serviceLife = serviceLife;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String buildingType() {
        return buildingType;
    }

    public void setTypeOfBuilding(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getServiceLife() {
        return serviceLife;
    }

    public void setServiceLife(int serviceLife) {
        this.serviceLife = serviceLife;
    }


    public class task6 {
        public String main(String[] args) {
            ArrayList<House> houseArrayList = new ArrayList<>();
            House house1 = new House(1, 4, 65, 9, 5, "Karasu", "flat", 80);
            House house2 = new House(2, 33, 48, 6, 4, "ProspectZhambyla", "house", 100);
            House house3 = new House(3, 25, 69, 7, 3, "B.Momyshuly", "flat", 100);
            House house4 = new House(4, 56, 87, 2, 2, "Baker", "house", 90);
            House house5 = new House(5, 70, 120, 1, 1, "Wolf", "flat", 50);

            houseArrayList.add(house1);
            houseArrayList.add(house2);
            houseArrayList.add(house3);
            houseArrayList.add(house4);
            houseArrayList.add(house5);


            public String toString() {
                return "House{" +
                        "id=" + id +
                        ", number=" + number +
                        ", area=" + area +
                        ", floor=" + floor +
                        ", rooms=" + rooms +
                        ", street='" + street + '\'' +
                        ", buildingType='" + buildingType + '\'' +
                        ", serviceLife=" + serviceLife +
                        '}';
            }

            for (House s : houseArrayList){
                if (s.getRooms() == 2){
                    System.out.println(s.number + " " + s.getRooms() + " rooms");
                }
            }

            for (House s : houseArrayList){
                if (s.getRooms() == 2){
                    if (s.getFloor() > 1 && s.getFloor() < 5){
                        System.out.println(s);
                    }
                }
            }

            for (House s : houseArrayList){
                if (s.area > 60){
                    System.out.println(s.number + " area: " + s.area);
                }
            }
        }
    }
        }
    }
}
