package by.bsu.playroom.playroom;

import by.bsu.playroom.entity.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayRoom {
    private List<Toy> toyList;
    private int countMoney;

    public PlayRoom(List<Toy> toyList, int countMoney) {
        this.toyList = toyList;
        this.countMoney = countMoney;
    }

    public List<Toy> getToyList() {
        return this.toyList;
    }

    public void setToyList(List<Toy> toyList) {
        this.toyList = toyList;
    }

    public int getCountMoney() {
        return this.countMoney;
    }

    public void setCountMoney(int countMoney) {
        this.countMoney = countMoney;
    }

    public List<Toy> createPlayRoom() {
        Scanner scanner = new Scanner(System.in);
        List<Toy> listOfToysInPlayRoom = new ArrayList<>();
        while (countMoney >= 0) {
            System.out.println("You have " + getCountMoney() + "$ "
                    + "Choose from the list of toys that you want to purchase "
                    + "or write to the console \"exit\""
                    + "to finish the purchase. "
                    + "(it is necessary to write the name of the toy)");
            System.out.println("----------------------------------------------");
            toyList.forEach(System.out::println);
            System.out.println("----------------------------------------------");
            String nameOfToy = scanner.nextLine();
            if (nameOfToy.equalsIgnoreCase("exit"))
                break;
            for (Toy toy : toyList) {
                if (toy.getName().equalsIgnoreCase(nameOfToy)) {
                    if (countMoney >= toy.getCost()) {
                        listOfToysInPlayRoom.add(toy);
                        countMoney -= toy.getCost();
                        toyList.remove(toy);
                    }
                    else {
                        System.out.println("You don't have enough money");
                        break;
                    }
                    break;
                }
            }
        }
        return listOfToysInPlayRoom;
    }
}
