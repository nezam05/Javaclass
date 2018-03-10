/*Submitted by: Lance Peter P. Muñoz*/
 
public class passbyValue
{
    //Methods to change the current values
   
    public static void changeInt(int value)
    {
        value = 55;
    }
   
    public static void changeObjectRef(Person ref)
    {
        ref = new Person("Pedro", 30);
    }
   
    public static void changeObjectAttr(Person ref)
    {
        ref.setAge(30);
    }
   
    public static void main(String[] args)
    {
        Person per;
        int val;
       
        // Assign the int
        val = 11;
        // Try to change it
        changeInt(val);
        //What is the current value?
        System.out.println("Int value is " + val);
        /*Explain why*/
        // Assign the person
        per = new Person("Jose", 20);
        /*Explain why:
       
        */
        //Try to change it
        changeObjectRef(per);
        //What is the current value?
        System.out.println("Person: " + per);
        /*Explain why*/
        //Now change the day attribute
        //through the object reference
        changeObjectAttr(per);
        //What is the current value?
        System.out.println("Person: " + per);
    }
}