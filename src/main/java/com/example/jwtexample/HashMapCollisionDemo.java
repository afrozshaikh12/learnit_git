package com.example.jwtexample;

import java.util.HashMap;
import java.util.Map;

import java.util.Objects;

public class HashMapCollisionDemo {
    public static void main(String[] args) {
        // Create a HashMap
        Map<CustomKey, String> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put(new CustomKey(1, "One"), "Value1");
        map.put(new CustomKey(1, "Two"), "Value2"); // Collision will occur here

        // Display the HashMap
        System.out.println("HashMap contents:");
        for (Map.Entry<CustomKey, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Demonstrate collision handling by retrieving values
        String value1 = map.get(new CustomKey(1, "One"));
        String value2 = map.get(new CustomKey(1, "Two"));
        System.out.println("Retrieved value for key (1, One): " + value1);
        System.out.println("Retrieved value for key (1, Two): " + value2);
    }
}

class CustomKey {
    private final int id;
    private final String name;

    public CustomKey(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override hashCode to produce the same hash code for all keys with the same id
    @Override
    public int hashCode() {
        return Objects.hash(id); // Only id is used for hash code, leading to collisions
    }

    // Override equals to compare based on both id and name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CustomKey other = (CustomKey) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return "CustomKey{id=" + id + ", name='" + name + "'}";
    }
}
