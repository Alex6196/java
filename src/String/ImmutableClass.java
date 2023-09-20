package String;

//Declare the class as final to prevent subclassing
public final class ImmutableClass {
//    Declare private final fields to make them immutable
    private final int field1;
    private final String field2;

//Create a constructor to initialize the fields upon object creation.
    public ImmutableClass(int field1, String field2) {
//        Initialize field1 with the provided value.
        this.field1 = field1;
//        Initialize field2 with the provided value.
        this.field2 = field2;
    }

//    provide getter method for field1 to allow read only access.
    public int getField1(){
        return field1;
    }
    //    provide getter method for field1 to allow read only access.
    public String getField2(){
        return field2;
    }
}
