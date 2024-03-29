package lecture5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest 
{
    public static void main(String[] args) throws ReflectiveOperationException
    {
        String name;
        name = "uw.cp510.assignments.assignment5.Crypto";
        Class cl = Class.forName(name);
        Class supercl = cl.getSuperclass();

        String modifiers = Modifier.toString(cl.getModifiers());
        if(modifiers.length() > 0) 
        {
            System.out.print(modifiers + " ");
        }

        System.out.print("class " + name);
        if(supercl != null && supercl != Object.class) 
        {
            System.out.print(" extends " + supercl.getName());
        }
        
        System.out.print("\n{\n");
        printConstructors(cl);
        System.out.println();
        printMethods(cl);
        System.out.println();
        printFields(cl);
        System.out.println();
    }
    
    /**
     * prints all constructors of a class
     * @param cl a class
     */
    public static void printConstructors(Class cl)
    {
        Constructor[] constructors = cl.getDeclaredConstructors();
        
        for(Constructor c : constructors) 
        {
            String name = c.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(c.getModifiers());
            
            if(modifiers.length() > 0) 
            {
                System.out.print(modifiers + " ");
            }
            
            System.out.print(name + "(");
            
            Class[] paramTypes = c.getParameterTypes();
            for(int i = 0; i < paramTypes.length; i++)
            {
                if (i > 0)
                {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(")");
        }
    }
    
    /**
     * Prints all methods of a class
     * @param cl a class
     */
    public static void printMethods(Class cl)
    {
        Method[] methods = cl.getDeclaredMethods();
        
        for(Method m : methods) 
        {
            Class returnType = m.getReturnType();
            String name = m.getName();
            
            System.out.print(" ");
            String modifiers = Modifier.toString(m.getModifiers());
            
            if(modifiers.length() > 0) 
            {
                System.out.print(modifiers + " ");
            }
            
            System.out.print(returnType.getName() + " " + name + "(");
            
            Class[] paramTypes = m.getParameterTypes();
            for(int i = 0; i < paramTypes.length; i++)
            {
                if (i > 0)
                {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }
    
    public static void printFields(Class cl)
    {
        Field fields[] = cl.getDeclaredFields();
        
        for(Field field : fields) 
        {
            Class type = field.getType();
            String name = field.getName();
            
            System.out.print(" ");
            String modifiers = Modifier.toString(field.getModifiers());
            
            if(modifiers.length() > 0) 
            {
                System.out.print(modifiers + " ");
            }
            
            System.out.println(type.getName() + " " + name + ";");
        }
    }

}
