package dynamicallycreateobjects;

public class CreateObject {

    public static Object createObj(Class<?> clazz , String name , String course , int year){
        try{
            return clazz.getDeclaredConstructor(String.class,String.class,int.class).newInstance(name,course,year);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }return null;
    }
}
