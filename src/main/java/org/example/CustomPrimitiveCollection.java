package org.example;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class CustomPrimitiveCollection<T > {
        private List<T> orderedList;
        private Set<T> uniqueSet;

        public CustomPrimitiveCollection() {
            orderedList = new ArrayList<>();
            uniqueSet = new HashSet<>();
        }

        public void addToOrdered(T value) {
            orderedList.add(value);
        }

        public void addToSet(T value) {
            if (!uniqueSet.contains(value)) {
                uniqueSet.add(value);
            }
        }

        public List<T> getOrderedValues() {
            return new ArrayList<>(orderedList);
        }

        public Set<T> getUniqueValues() {
            return new HashSet<>(uniqueSet);
        }

        public static void main(String[] args) {
            CustomPrimitiveCollection<Integer> customCollection = new CustomPrimitiveCollection<>();

            customCollection.addToOrdered(3);
            customCollection.addToOrdered(1);
            customCollection.addToOrdered(2);
            customCollection.addToOrdered(3); // Duplicates are allowed in the list

            customCollection.addToSet(3);
            customCollection.addToSet(1);
            customCollection.addToSet(2);
            customCollection.addToSet(10); // Duplicates are ignored in the set

            List<Integer> orderedValues = customCollection.getOrderedValues();
            Set<Integer> uniqueValues = customCollection.getUniqueValues();

            System.out.println("Ordered Values: " + orderedValues);
            System.out.println("Unique Values: " + uniqueValues);
        }

    }


