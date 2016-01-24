package ClassPrinter;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Michi on 24.01.2016.
 */
public class ClassPrinter {

    public static void main(String [] args){
//        ClassPrinter cp = new ClassPrinter("java.util.LinkedHashMap");
        ClassPrinter cp = new ClassPrinter("ClassPrinter.ClassPrinter");
        cp.printClass();
    }

    public Class<?> clazz;
    private static final int fuck = 5;
    private boolean dang = true;

    public ClassPrinter ( String classname){
        try {
            this.clazz = Class.forName(classname);
//            System.out.println(clazz.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printClass(){
        printInheritance();
        printFields();


    }

    private void printInheritance(){
        List <String> list = new ArrayList<>();
        String curClass;
        Class dummy = clazz;
        while (dummy != null){
            curClass = dummy.toString();
            curClass = curClass.substring(6);
            list.add(curClass);
            dummy = dummy.getSuperclass();
        }

        System.out.println("Inheritance tree: ");
        for(int i = list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
    }

    private void printFields(){
        ArrayList<Field> fields = new ArrayList<>(Arrays.asList(clazz.getDeclaredFields()));
        for(Field field : fields){

            System.out.print(field.getType().getSimpleName()+" ");
            System.out.print(field.getName()+" ");
            if(Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    field.setAccessible(true);
                    System.out.println("= "+field.get(null).toString());
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                    System.out.println("<ERROR READING>");
                }
            }else{
                System.out.println();
            }
        }
    }
}
