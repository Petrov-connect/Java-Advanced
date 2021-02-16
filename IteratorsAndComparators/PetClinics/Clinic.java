package IteratorsAndComparators.PetClinics;
//created by J.M.

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Clinic implements Iterable<Pet> {

    private Pet[] rooms;

    public Clinic(int countRooms) {
        chek(countRooms);
    }

    private void chek(int countRooms) {
        if (countRooms % 2 == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        this.rooms = new Pet[countRooms];
    }

    public boolean addPet(Pet pet) {
        int room = this.rooms.length / 2;
        for (int i = 0; i < this.rooms.length; i++) {
            if (i % 2 == 0) {
                room += i;
            } else {
                room -= i;
            }
            if (this.rooms[room] == null) {
                this.rooms[room] = pet;
                return true;
            }
        }
        return false;
    }

    public boolean release() {
        int start = this.rooms.length / 2;
        for (int i = start; i < this.rooms.length; i++) {
            if (this.rooms[i] != null) {
                this.rooms[i] = null;
                return true;
            }
        }
        for (int i = 0; i < start; i++) {
            if (this.rooms[i] != null) {
                this.rooms[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean hasEmptyRooms() {
        return Arrays.stream(this.rooms).anyMatch(Objects::isNull);
    }

    public void print(int room) {
        System.out.println(this.rooms[room - 1] == null ? "Room empty" : rooms[room - 1].toString());
    }

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < rooms.length;
            }

            @Override
            public Pet next() {
                return rooms[index++];
            }
        };
    }

    public Pet[] getRooms() {
        return rooms;
    }
}
