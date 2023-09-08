package org.launchcode;

import jdk.jfr.Category;

public class Restaurant {
    public static void main(String[] args) {

    }
    public class Menu {
        //public class Menu. Methods are appetizer(), mainCourse(), desserts () and drinks ()
        public static String appetizer() {

        }

        public static String mainCourse() {

        }

        public static String desserts() {

        }

        public static String drinks() {

        }
    }

    public class MenuItem {
        private double price;
        private String description; //description of the menu item
        public String category; //what category of the menu: appetizer, main course, dessert or a drink
        private date; //what date was the menu last updated
        private boolean newItem; //is the menu item new?

        //Category Method
        //appetizer calamari/ hummus
        //main course fish & chips/ pepper steak
        //dessert cheesecake/ sweet potato cake
        //drinks water/lemonade/coca-cola

        //TO DOs
        //Instance methods:
        //TO DO: A way to add and remove menu items from the menu.
        //TO DO: A way to tell if a menu item is new.
        // TO DO: A way to tell when the menu was last updated.
        //TO DO: A way to print out both a single menu item as well as the entire menu.
        //TO DO: A way to determine whether or not two menu items are equal.
    }
}