package by.bsu.playroom.test;

import by.bsu.playroom.entity.*;
import by.bsu.playroom.playroom.PlayRoom;
import by.bsu.playroom.typeoftoy.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Runner {
    private static final int countMoney = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Toy> toyList = new ArrayList<>();
        Collections.addAll(toyList,
                new Ball("Star", 15, ToySize.AVERAGE, TypeOfBall.FOOTBALL),
                new Ball("NBA", 20, ToySize.BIG, TypeOfBall.BASKETBALL),
                new Doll("Barbie", 25, ToySize.SMALL, TypeOfDoll.PLASTIC),
                new Doll("Alena", 10, ToySize.AVERAGE, TypeOfDoll.WOODEN),
                new ElectricCar("Subaru", 35, ToySize.AVERAGE, CarMaterial.PLASTIC, 15),
                new MechanicalCar("BMW", 40, ToySize.SMALL, CarMaterial.METAL, MechanicalCarModel.PASSENGER));

        PlayRoom playRoom = new PlayRoom(toyList, countMoney);
        List<Toy> listOfToysInPlayRoom = playRoom.createPlayRoom();

        System.out.println("Your playroom is ready. Have a nice game!");
        listOfToysInPlayRoom.sort((t1, t2) -> t2.getCost() - t1.getCost());
        listOfToysInPlayRoom.forEach(System.out::println);

        System.out.println("\nEnter a range to find a toy with a certain cost:");
        try {
            int firstRangeOfCost = scanner.nextInt();
            int secondRangeOfCost = scanner.nextInt();
            for (Toy toy : listOfToysInPlayRoom) {
                if (toy.getCost() >= firstRangeOfCost && toy.getCost() <= secondRangeOfCost) {
                    System.out.println(toy.getName() + ": " + toy.getCost() + "$");
                }
            }
        }
        catch (Exception e) {
            System.out.println("Oh, something happened " + e);
        }
    }
}
