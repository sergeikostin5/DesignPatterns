package abstractFactoryPattern;

/**
 * Created by sergeikostin on 7/28/16.
 */
// Any part that implements the interface ESEngine
// can replace that part in any ship

public interface ESEngine{

    // User is forced to implement this method
    // It outputs the string returned when the
    // object is printed

    public String toString();

}
