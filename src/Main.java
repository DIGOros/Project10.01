// ReferenceDemo class to demonstrate reference assignments and reference method arguments
class ReferenceDemo {
    // Properties of the class
    int property;

    // Constructor to initialize the property
    ReferenceDemo(int property) {
        this.property = property;
    }

    // Method to change the object property
    void modifyProperty(ReferenceDemo obj, int newValue) {
        obj.property = newValue;
    }

    public static void main(String[] args) {
        // Reference Assignments
        // Creating an object of ReferenceDemo class
        ReferenceDemo obj = new ReferenceDemo(5);

        // Assigning the reference of the object to two different variables
        ReferenceDemo var1 = obj;
        ReferenceDemo var2 = obj;

        // Changing the object properties using var1 and var2
        var1.property = 10;
        var2.property = 20;

        // Monitoring the properties to ensure changes influence both variables
        System.out.println("Property after using var1: " + obj.property); // Output: Property after using var1: 20
        System.out.println("Property after using var2: " + obj.property); // Output: Property after using var2: 20

        // Reference Method Arguments
        // Creating an object of ReferenceDemo class
        ReferenceDemo obj2 = new ReferenceDemo(5);

        // Creating an object of the class to access the method
        ReferenceDemo modifier = new ReferenceDemo(0);

        // Passing the object into the method as an argument and changing the property
        modifier.modifyProperty(obj2, 15);

        // Checking the object property outside the method to ensure the change influenced the original variable
        System.out.println("Property after modification: " + obj2.property); // Output: Property after modification: 15
    }
}
