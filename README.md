#### java-basics-cheat_sheet

#### java variables 
```java
public class Fun {

            public static void main(String[] args){

                //variables store data

                int x; //variable declarations
                x = 123; //assignment
                System.out.println(x);

                int xy = 303; //initialization
                System.out.println(xy);

                float y = 3.14f; //floating precision

                double z=3.340904930; //double;

                long LONG_too = 2409890489084908L; //long

                byte xl = 100;  //byte for small numbers

                boolean z123 = false; //boolean value

                char symbol = '@'; //single charater

                String name = "coollkkl"; //string
                //all reference data type in java starts with captial letter


            }
}
```
##### program to swap variable data
```java

public class Fun {

            public static void main(String[] args){

              String x = "water";
              String y = "porsche";

              String temp ;
              temp=x;
              x=y;
              y=temp;
              System.out.println(" x : " +x);
              System.out.println(" y : " +y);

            }
}


```
#### input using java Scanner class

```java
import java.util.Scanner;
//importing scanner class

public class Fun {

            public static void main(String[] args){

             Scanner input_obj = new Scanner(System.in); //initiating a scanner objectc
             System.out.println("please enter something");

             String test_string = input_obj.nextLine(); //nextLine -> string

             System.out.println("please enter a number");
             int x = input_obj.nextInt(); //nextInt() -> for integer

             System.out.println(test_string);
             System.out.println(x);

            }
}

``` 
##### operators in java 
```java
public class Fun {

            public static void main(String[] args){
            //expression = operand & operators
            //operands = values,variables,numbers,quantity
            //operator = +,-,*,/,%
            int friends  = 10;
            friends = ++friends; //++x
            System.out.println(friends); // output-> 11

            friends=friends+friends+1;
            System.out.println(friends); // output ->23

            friends++;  //x++
            System.out.println(friends); // output -> 24

            friends=friends%friends+7;
            System.out.println(friends); // output -> 7

            //% divides the expression returns thr remainder

            int x;
            int y=x=10;
            System.out.println(x); //output -> 10
            System.out.println(y); //output -> 10

            int xs=90;
            double  xsm = (double) xs/3; //type convertions
            System.out.println(xsm); //output -> 30.0


            }
}
```
##### simple java gui program 
```java 
import javax.swing.JOptionPane;

public class Fun {

    public static void main(String[] args) {
        while (true) {
            //shows input dialog box
            //JOptionPane.showInputDialog("string");
            String name = JOptionPane.showInputDialog("enter your name");
            int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age")); //parseInt() //parse input data(usually strinh) into Integer
            double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height")); //parseDouble() // for double number

            //shows output dialog box
            //JOptionPane.showMessageDialog(null,data_variableName);
            JOptionPane.showMessageDialog(null, "hello " + name);
            JOptionPane.showMessageDialog(null, "you are " + age + "years");
            JOptionPane.showMessageDialog(null, "you are" + height + "tall");
        }
    }
}
```
#### basic math methods
```java
   public class Fun {

    public static void main(String[] args) {
      double x = 3.14;
      double y = 10.390;

      double z = Math.min(x,y);
      System.out.println(z);//3.14

      z = Math.min(x,y);
        System.out.println(z);//3.14

      z = Math.abs(y);
      System.out.println(z);//10.39

      z = Math.sqrt(y);
      System.out.println(z);//3.2233522922572395

      z = Math.round(y);
      System.out.println(z); //10.0

      z = Math.ceil(y);
      System.out.println(z); //11.0

      z = Math.floor(y);
      System.out.println(z); //10.0
    }
}



```

#### print hypotenuse

```java
import java.util.*;


public class Fun {

    public static void main(String[] args) {
    Scanner input_1 = new Scanner(System.in);

    System.out.println("enter side x:");
    Double x=input_1.nextDouble();

    System.out.println("enter side z:");
    Double y=input_1.nextDouble();

    Double z = (Double) Math.sqrt((x*y)+(y*y));

    System.out.println("the hypotenuse is :"+z);

    }
}
```
##### random class for random number generator
```java
import java.util.Random;

public class Fun {

    public static void main(String[] args) {


        Random random_gen = new Random();  //psuedo random number initaiting Random class

        int x = random_gen.nextInt(); //output -> scale between -2billion to 2billion
        System.out.println(x);

        System.out.println(random_gen.nextInt(6)+1); //this only generated 0 to 5 so add +1 or something to it
        
    }
}
```
##### if else statement 
```java
public class Fun {

    public static void main(String[] args) {

        //if statement
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age ");

        int age = sc.nextInt();
        if (age == 50){
          System.out.println("damn your kinda old");
        }
        else if (age >= 75){
            System.out.println("hello boomer");
        }
        else if(age <= 18){
            System.out.println("hi young teenager");
        }
        else if (age > 18){
            System.out.println("hi young guy");
        }
        else{
            System.out.println("still dont know your age");
        }
    }
}

```


##### switch statement 
```java

public class Fun {
// switch statements that allows a variable to be treated for equality against a list of values
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        System.out.println("enter a valid day");
        String day =  x.nextLine();

       switch(day){
           case "sunday": for(int i=0; i<3; i++){
               System.out.println("holiday");
           }
                break;
           case "monday": System.out.println("its monday");
                break;
           case "Tuesday": System.out.println("its tuesday");
                break;
           case "wednesday": System.out.println("its wednesday");
                break;
           case "thurday": System.out.println("its thurday");
                break;
           case "friday": System.out.println("its friday");
                break;
           case "saturday": System.out.println("its saturday");
                break;
           default : for(int i=0; i<3; i++){
               System.out.println("error");
           }
                break;
       }

    }
}
```

##### OR ,AND , NOT

```java
public class Fun {
    
// logical operator = used to connect two or more expressions
    // && AND logical -> both true
    // || OR logical -> anyone of them true
    // ! NOT logical  -> reverse the state means true becomes false , false become true wise versa
    
    public static void main(String[] args) {
     Scanner x = new Scanner(System.in);
       System.out.println("enter a number");
        int temp = x.nextInt();

        if(temp >= 30){
            System.out.println("it is hot outside ");
        }else if(temp>=20 && temp<=30){
            System.out.println("its is warm outside ");
        }else {
            System.out.println("its is cold outside ");
        }

        System.out.print("\nenter you wanna quit (q) or (Q)");
        Scanner y = new Scanner(System.in);
        String enter = y.nextLine();
        
        //.equals() //helps to check string are equal or not 
        if(enter.equals("q")|| enter.equals("Q"))  {
            System.out.print("so you quit");
        } else {
            System.out.print("you dont quit im i right ");
        }

    }
}
```
or (!)
```java 
public class Fun {
// logical operator = used to connect two or more expressions
    // && AND logical -> both true
    // || OR logical -> anyone of them true
    // ! NOT logical  -> reverse the state means true becomes false , false become true wise versa
    public static void main(String[] args) {
     Scanner x = new Scanner(System.in);
       System.out.println("enter a number");
        int temp = x.nextInt();

        if(temp >= 30){
            System.out.println("it is hot outside ");
        }else if(temp>=20 && temp<=30){
            System.out.println("its is warm outside ");
        }else {
            System.out.println("its is cold outside ");
        }

        System.out.print("\nenter you wanna quit (q) or (Q)");
        Scanner y = new Scanner(System.in);
        String enter = y.nextLine();

        //.equals() //helps to check string are equal or not
        if( !enter.equals("q") && !enter.equals("Q"))  {
            System.out.print("so you quit");
        } else {
            System.out.print("you dont quit im i right ");
        }

    }
}
```

##### while loop
```java 

public class Fun {
    public static void main(String[] args) {
   //while loop ->executes a block of code as long as its conditions remains true
        String name="";
        Scanner x = new Scanner(System.in);
        while(name.isBlank()) { //.isBlank -> check whether it is blank or not
              System.out.println("enter your name ");
              name=x.nextLine();
              System.out.println("hello "+name);
        }
    }
}
```
do while loop
```java
public class Fun {
    public static void main(String[] args) {
   //do while loop -
        String name="";
        Scanner x = new Scanner(System.in);
        do{
              System.out.println("enter your name ");
              name=x.nextLine();
              System.out.println("hello "+name);
        }while(name.isBlank()); //.isBlank -> check whether it is blank or not
    }
}
```
##### for loop
```java
public class Fun {
    public static void main(String[] args) {
       //for loop = executes a block of code a limited amount of items
       for(int i=0; i<10; i++){
            System.out.println(i);
       }
       System.out.println("-----------------");
       for(int i=10; i>0 ; i--){
           System.out.println(i);
       }
    }
}
```
#### nested for loop
```java
public class Fun {
    public static void main(String[] args) {
         Scanner x = new Scanner(System.in);

         int rows;
         int columns;
         String symbols;

         System.out.println("enter no of rows");
         rows = x.nextInt();

         System.out.println("enter no of rows");
         columns = x.nextInt();

         System.out.println("enter shape");
         Scanner y = new Scanner(System.in);
         symbols = y.nextLine();

         for(int i=0; i<=rows; i++){
              System.out.println("*");
              for(int j=0; j<=columns; j++){
                   System.out.print(symbols);
              }
         }
    }
}
```
#### array in java 
```java
public class Fun {
    public static void main(String[] args) {
       String [] cars ={"porsche","BMW","tesla","lamborghini","porsche"};

       cars[0]="MUstang";

       for(int i=0; i< cars.length; i++){
            System.out.println(cars[i]);
       }
    }
}
```
giving size of an array

```java
public class Fun {
    public static void main(String[] args) {
       String [] cars = new  String[3];//giving size of array

        cars[0]="camaro";
        cars[1]="corvette";
        cars[2]="macan";
        
       for(int i=0; i< cars.length; i++){
            System.out.println(cars[i]);
       }
    }
}
```
```java

public class Fun {
    public static void main(String[] args) {
     //2D array of arrays  losley based on column and row like architecture

        String [][] cars = new String [3][3];
        
        cars[0][0] = "camaro";
        cars[0][1] = "corvette";
        cars[0][2] = "porsche";
        cars[1][0] = "cummins";
        cars[1][1] = "Dodge SRT";
        cars[1][2] = "lamborgini";
        cars[2][0] = "pacfica";
        cars[2][1] = "skoda";
        cars[2][2] = "maserati"
     
    for(int i=0; i<cars.length; i++){
        for(int j=0; j<cars[i].length; j++){
            System.out.println(cars[i][j]);
        }
    }
    }
}
```

```java

public class Fun {
    public static void main(String[] args) {
     //2D array of arrays  losley based on column and row like architecture

        String [][] cars ={ // 1       2
                          {"porsche","cayenne" }, //0
                          {"bentley","mulsanne" }, //1
                          { "macan","aventador" }  //2
                          };
        
    for(int i=0; i<cars.length; i++){
        for(int j=0; j<cars[i].length; j++){
            System.out.println(cars[i][j]);
        }
    }
    }
}
```

##### strings extra methods
```java

public class Fun {
    public static void main(String[] args) {
     //String = a reference data type can store one or more characters references data type have access to useful method
        String name ="Bro";

        boolean results =  name.equals("Bro"); //.equals() -> check whether the strings equal or not returns a boolean values
        System.out.println(results); //output -> true

        boolean result2 = name.equalsIgnoreCase("brok"); //.equalsIgnoreCase() -> check string equal or not but ignores case sensitivity
        System.out.println(result2);//output -> false

        String name1 = "Bro_cool";

        int result_t = name1.length(); //.length() -> returns length of the string
        System.out.println(result_t);//output -> 8

        char result_9 = name1.charAt(2); //.charAt() -> returns a charater based on the index position
        System.out.println(result_9); //output ->  o

        int resultxxx = name1.indexOf("c"); //.indexOf()-> returns the index position of a particular character
        System.out.println(resultxxx); //output -> 4

        boolean xxx_check = name1.isEmpty(); //.isEmpty() -> check whether string exist or not returns boolean value
        System.out.println(xxx_check);//output -> false

        String upper_case_letters = name1.toUpperCase(); // .toUpperCase() -> converts to upper case
        System.out.println(upper_case_letters);//output -> BRO_COOL

        String lower_case_letters = name1.toLowerCase(); //..toLowerCase() converts to lower case
        System.out.println(lower_case_letters);//output -> bro_cool

        String name_trim = " co  ol   ";
        String trim_it= name_trim.trim(); //.trim() ignores empty space before and after the character
        System.out.println(trim_it);//output -> co  ol

        String fun_name = name1.replace("o","a"); //.replace("o","a") replace string
        System.out.println(fun_name);//output -> Bra_caal


    }
}
```

##### wrapper class 
```java
public class Fun {
    public static void main(String[] args) {
     /*
     wrapper class = provides a way to use primitive data types as references
     data types, references data types contain useful methods can be used
     with collection (ex.ArrayList)
      */

        //primitive      //wrapper
        //-------        //-------
        //boolean        //Boolean
        //char           //Character
        //int            //Integer
        //double         //Double
                         //String

        //autoboxing = the automatic conversion that the java compiler makes between the primitive types and their corresponding object wrapper classes
        //unboxing , automatic conversion of wrapper class to primitive value
        Boolean a = true; // we basically converts the primitive value to the corresponding wrapper class thats what is an autoboxing is
        Character b ='@';
        Integer c = 134;
        Double d = 3.14;
        String e = "bro";

          //in unboxing we can treat reference datatype variables just like a primitive datatypes
        if(b=='@'){
           System.out.println(b); //still behaves like a primitive data types
        }

    }
}

```

##### ArrayList


```java
import java.util.*;

public class Fun {
    public static void main(String[] args) {
        //ArrayList<WrapperClass>var_name = new Arraylist<String>();
        //Elements can be added and removed after compilations phase
        //stores references data types
        ArrayList<String> food = new ArrayList<String>();

            food.add("pizza");
            food.add("hamburger");
            food.add("hotdog");

            food.set(0, "sushi"); //replaced using index values


            for(int i=0; i<food.size(); i++){
                System.out.println(food.get(i));
            }

             food.remove(2); // remove elements via index value
             food.clear(); //clear all of them

    }
}
```


```java
import java.util.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class Fun {
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<String>();
        Scanner xc = new Scanner(System.in);

      for(int i=0; i<5; i++){
          System.out.println("enter the name of the cars");
          String x= xc.nextLine();
          test.add(x);
      }

      for(int i=0; i<test.size();i++){
          System.out.println(test.get(i));
      }

    }
}
```

```java
import java.util.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class Fun {
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<String>();
        Scanner xc = new Scanner(System.in);

      for(int i=0; i<5; i++){
          System.out.println("enter the name of the cars");
          String x= xc.nextLine();
          test.add(x);
      }

      for(int i=0; i<test.size();i++){
          System.out.println(test.get(i));
      }

    }
}



```

##### 2D array list

```java 
import java.util.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class Fun {
    public static void main(String[] args) {
    //2d ArrayList
        ArrayList<ArrayList<String>> automotive = new ArrayList();
        Scanner xc = new Scanner(System.in);

        ArrayList<String> cars = new ArrayList();
         for(int i=0; i<3; i++){
              System.out.println("enter the name of the cars");
              String x = xc.nextLine();
              cars.add(x);
          }

        ArrayList<String> bike = new ArrayList();
         for(int i=0; i<3; i++){
             System.out.println("enter the name of the bike");
             String x = xc.nextLine();
             bike.add(x);
        }

        ArrayList<String> sportscars = new ArrayList();
         for(int i=0; i<3; i++){
            System.out.println("enter the name of the sportscar");
            String x = xc.nextLine();
             sportscars.add(x);
        }

         //adding to the  main list
        automotive.add(sportscars);
        automotive.add(bike);
        automotive.add(cars);

        System.out.println(automotive);

        System.out.println(automotive.get(1));

        System.out.println(automotive.get(2).get(1));

        //
        for(int i=0; i<automotive.size(); i++){
                System.out.println("print"+automotive.get(i));
        }
        //prints everything
        for(int i=0; i<automotive.size(); i++){
            for(int j=0; j<automotive.get(i).size(); j++){
                System.out.println("print each one "+automotive.get(i).get(j));
            }
        }
    }

}

```

#### Java for each loop

```java
public class Fun {
    public static void main(String[] args) {
        //for each =  traversing technique to iterate though the elements in an array/collection
        //            less steps , more readable
        //            less flexible

        String[] animals = {"cat", "dog", "rat", "bird"};

        for (String i : animals) {
            System.out.println(i);
        }

        //for each loop using normal array
        int[] x = {1, 2, 3, 4, 5};
        for (int y : x) {
            System.out.println(y);
        }

        //for each loop using 2d array
        int[][] x1 = {{1, 2, 3}, {4, 5, 6, 390}, {23, 32, 33}};
        for (int[] innerarray : x1) {
            for (int val : innerarray) {
                System.out.println(val);
            }
        }
        //using array collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("porsche");
        cars.add("quattropotre");
        cars.add("masearti");
        cars.add("ferrai");

        for (String xy1 : cars) {
            System.out.println(xy1);
        }

        //2d array list
        ArrayList<ArrayList<String>> automotive = new ArrayList();
        ArrayList<String> cars1 = new ArrayList<String>();
        cars1.add("porsche");
        cars1.add("quattropotre");
        cars1.add("masearti");

        ArrayList<String> bike1 = new ArrayList<String>();
        bike1.add("porsche");
        bike1.add("quattropotre");
        bike1.add("masearti");

        automotive.add(cars1);
        automotive.add(bike1);

        //for each loop in 2d array
        for (ArrayList<String> i  : automotive) {
            for (String xi : i) {
                System.out.println("print each one " + xi);
            }
        }
    }
}

```
##### method overloading
```java
public class Fun {
    public static void main(String[] args) {

        //overloaded methods -> methods thats share the same name but have different parameters
        // method name + parameters = method signature
        //
        int x=add(1,5);
        int y=add(1,2,4);
        System.out.println(x+y);

        System.out.println(add(10.6,90.0));
    }

    static int add(int a, int b) {
        System.out.println("this is overloaded method");
          return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }

    static int add(int a,int b, int c){
        System.out.println("this is overloaded method 2");
        return a+b+c;
    }

    static int add(int a,int b,int c, int d){
        System.out.println("this is overloaded method 3");
        return a+b+c+d;
    }


}
```
##### format string
```java

public class Fun {
    public static void main(String[] args) {
        //printf() -> an optional method to control format and display text to the console window
        //         two arguments = format string + (Object/variables/value)
        //        %[flag] [precision] [width] [conversion-character]
    boolean myBoolean = true;
    char myChar  = '@';
    String myString = "Bro";
    int myInt = 50;
    double myDouble = 1000;

        System.out.printf("%b \n",myBoolean);
        System.out.printf("%c \n",myChar);
        System.out.printf("%s \n",myString);
        System.out.printf("%d \n",myInt);
        System.out.printf("%f \n",myDouble);

    }
}
```
more on format strings

```java
public class Fun {
    public static void main(String[] args) {
        //printf() -> an optional method to control format and display text to the console window
        //         two arguments = format string + (Object/variables/value)
        //        %[flag] [precision] [width] [conversion-character]
    boolean myBoolean = true;
    char myChar  = '@';
    String myString ="bro";
    int myInt = 50;
    double myDouble = 1000;

        System.out.printf("%b \n",myBoolean);
        System.out.printf("%c \n",myChar);
        System.out.printf("%s \n",myString);
        System.out.printf("%d \n",myInt);
        System.out.printf("%f \n",myDouble);

        //width
        //minimum numbers of characters to be written as output
        System.out.printf("hello %10s \n",myString);
        System.out.printf("hello %-10s",myString);

        //precision
        //sets numbers of digits of precision when outputting floating-point values
        System.out.printf("you have this much money %.5f",myDouble);

        //flags
        //adds an effect to outputs based on the flag added to format specifier
        // - : left-justify
        // + : output a plus (+) minus (-) sign for a numeric values
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

       System.out.printf("\n you need this much money %20f ",myDouble);
       System.out.printf("\n you need this much money %+f ",myDouble);
       System.out.printf("\n you have this much money %020f",myDouble);
       System.out.printf("\n you have this much money %,f",myDouble);

        
    }
}

```
#### final keyword 

```java 
public class Fun {
    public static void main(String[] args) {

        //final keyword in java
        //final keyword wont able to change the value it or reassign them 
        //final is similar to a constant variable-?> dont change there value because you are noo able to reassign once declared 
        final double pi =3.32039;
        System.out.println(pi);

    }
}


```

#### Java class and object

```java 
class car{      //class car

    String make = "chevorlot";
    String models = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 5000.00;

    void drive(){
        System.out.println("you drive the car");
    }
    void brake(){
        System.out.println("you step on the brakes");
    }

}

public class Fun {
    public static void main(String[] args){
    //objects = an instance of a class that may contain attributes and method
    //examples :(phone ,desk,computer,coffee,cup)

        //new object instance //creating a method
        car myCar = new car(); //creating new object
        System.out.println(myCar.make="porsche"); //accessing class attributes (using_object_name.attribute_name)
        System.out.println(myCar.models);
        System.out.println(myCar.year);

        myCar.drive();  //accessing class methods (using_object_name.method_name())
        myCar.brake();

        //new object instance //creating a method 
        car myCar2 = new car(); //creating new object
        System.out.println(myCar2.make="porsche"); //accessing class attributes (using_object_name.attribute_name)
        System.out.println(myCar2.models);
        System.out.println(myCar2.year);

        myCar2.drive();  //accessing class methods (using_object_name.method_name())
        myCar2.brake();



    }

}

```

##### constructor

```java

class Car{
    //constructor = special method that is called when an object is instantiated (created)
    String name;
    int age;
    double weight;
    Car(String nameX,int ageX,double weightX,String test_var){   //constructor with parameter

           name=nameX;
           age=ageX;
           weight=weightX;

           for(int i=0; i<5; i++){
              System.out.println("the constructor has been instiated"+age++);
           }
              System.out.println(test_var);

              System.out.println(weight);
        }

    void eat(){
         System.out.println(name+"is eating");
    }

}

public class Fun {
    public static void main(String[] args){
        Car x = new Car("kick",78,90.0,"this is cool");
         x.eat();
    }
}

```
constructor using this keyword

```java
class Car{
    //constructor = special method that is called when an object is instantiated (created)
    String name;
    int age;
    double weight;
    Car(String name,int age,double weight) {   //constructor with parameter

        //using this keyword
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat(){
         System.out.println(this.name+"is eating");
    }

}

public class Fun {
    public static void main(String[] args){
        Car x = new Car("porsche",12,12.0);
        x.eat();
        System.out.println(x.name);
    }
}


```
#### with out this keyword
```java

class Car{
    //constructor = special method that is called when an object is instantiated (created)
    String name;
    int age;
    double weight;
    Car(String nameX,int ageX,double weightX) {   //constructor with parameter

        //using this keyword
        name = nameX;
        age = ageX;
        weight = weightX;
    }

    void eat(){
         System.out.println(this.name+"is eating");
    }

}

public class Fun {
    public static void main(String[] args){
        Car x = new Car("porsche",12,12.0);
        x.eat();
        System.out.println(x.name);
        System.out.println(x.age);
    }
}

```

##### about this keyword 
the <b> this </b> keyword refers to the current object in a method or constructor
The most common use of the this keyword is to <b> eliminate the confusion </b> between <b>class attributes and parameters with the same name</b> because a class attribute is shadowed by a method or constructor parameter

<b>this</b> can be used to

 -> Invoke current class constructor <br>
 -> Invoke current class method <br>
 -> Return the current class object <br>
 -> Pass an argument in the method call <br>
 -> Pass an argument in the constructor call <br>

```java 
   public class Main {
  int x;

  // Constructor with a parameter
  public Main(int x) {
    this.x = x;  //this.x refers to the x attribute 
      /* Each argument to the constructor shadows one of the object's fields — inside the constructor x is a local copy of the constructor's first argument. To refer to the Point field x, the constructor must use this.x.
      */
  }

  // Call the constructor
  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println("Value of x = " + myObj.x);
  }
}

```
#### using this we can use explicit constructor invocation
we can use this keyword to call another constructor in the same class 
```java

class Test{
    int a;
    int b;

    int x;

    //default constructor
    Test(){
        this(10,20,4040);
        System.out.println("Inside default constructor "+a+" "+b);
        System.out.println("Inside default constructor this "+this.a+" "+this.b);
        System.out.println("specially added cool one "+this.x+" "+x);
    }
    Test(int a,int b,int x){
        this.a=a;
        this.b=b;
        this.x=x;
        System.out.println("Inside parameterised constructor "+a+" "+b);
        System.out.println("Inside parameterised constructor this "+this.a+" "+this.b);
        System.out.println("specially added cool one "+this.x+" "+x);
        System.out.println("specially added cool one "+this.x+" "+x);
    }

}


public class Fun {
    public static void main(String[] args) {

        Test object = new Test();
        System.out.println("-----------------");
        Test object1 = new Test(90,30,90);


    }
}
```
```output
output

Inside parameterised constructor 10 20
Inside parameterised constructor this 10 20
specially added cool one 4040 4040
specially added cool one 4040 4040
Inside default constructor 10 20
Inside default constructor this 10 20
specially added cool one 4040 4040
-----------------
Inside parameterised constructor 90 30
Inside parameterised constructor this 90 30
specially added cool one 90 90
specially added cool one 90 90

```
```java 
class Rectangle {
    int x, y;
    int width, height;

    public Rectangle() {
        this(25,25, 90, 4590);
        System.out.println("morning");
        System.out.println(this.x+" "+x);
        System.out.println(this.y+" "+y);
        System.out.println(this.width+" "+width);
        System.out.println(this.height+" "+height);
    }
    public Rectangle(int width, int height) {
        this(9090, 9090, width, height);
        System.out.println("test");
        System.out.println(this.x+" "+x);
        System.out.println(this.y+" "+y);
        System.out.println(this.width+" "+width);
        System.out.println(this.height+" "+height);
    }
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        System.out.println("fine");
        System.out.println(this.x+" "+x);
        System.out.println(this.y+" "+y);
        System.out.println(this.width+" "+width);
        System.out.println(this.height+" "+height);
    }
}
public class Testfun{

    public static void main(String [] args){
      Rectangle y = new Rectangle();
      System.out.println("------------");
      Rectangle x = new Rectangle(12,34);
      System.out.println("------------");
      Rectangle z = new Rectangle(12,34,556,67);

    }
}

```
```output
output

fine
25 25
25 25
90 90
4590 4590
morning
25 25
25 25
90 90
4590 4590
------------
fine
9090 9090
9090 9090
12 12
34 34
test
9090 9090
9090 9090
12 12
34 34
------------
fine
12 12
34 34
556 556
67 67

```

#### generating a random number 1 to 6 

```java 

import java.util.Random;

public class Fun {
    //generating a random number 1 to 6
    public static void main(String[] args) {

        Random test = new Random();
        cool(test,1);

    }
    public static void cool(Random cool_num,int number){
       number = cool_num.nextInt(6)+1;
       System.out.println(number);

    }
}
```
##### local and global scope variables 
```java 
import java.util.Random;
class TheClass{

    Random z; //global scope
    int number;

    TheClass(){
        z = new Random(); //Random class is accessible because it has a global scope
        roll();
        //anything inside this is locol to this constructor
    }
    void roll(){
        number = z.nextInt(6)+1; //number method is accessible because it has a global scope
        System.out.println(number);
        //anything inside this is local to roll() method
    }
}

public class Fun {

    public static void main(String[] args) {

        //local = declared inside a method visible only to that method
        //global = declared outside a method but within a class visible to all parts of a class
        
        TheClass xy = new TheClass();

    }
}

```
#### constructor overloading 
```java 

class TheClass{
        
        //overloading constructor 
       TheClass(int x,int y){
          int sum = x+y;
          System.out.printf("%d\n",sum);
       }
       TheClass(int x,int y,int z)
       {
           int sum = x+y+z;
           System.out.printf("%d\n",sum);
      }
       TheClass(int x,int y,int w,String z ){
           int sum = x+y+w;
           System.out.printf("%d %s\n",sum,z);
       }
}

public class Fun {


    public static void main(String[] args) {

        TheClass xy = new TheClass(5,5,5);
        TheClass xyz = new TheClass(0,20,10,"someString");

    }
}

```

#### toString()
```java 

class Rectangle {
  int height =10;
  int width =5;

}

public class Testfun{

    public static void main(String [] args){
        Rectangle x = new Rectangle();

        System.out.println(x); // output -> Rectangle@6d03e736
         /*
         toString() = special method that all object inherit ,
                      that returns a string that "textually represents " an object.
                      can be used both implicitly and explicitly
                      
                      Returns a string representation of the object. 
                      In general, the toString method returns a string 
                      that "textually represents" this object. 
                      The result should be a concise but informative representation that is easy for a person to read. 
                      It is recommended that all subclasses override this method.
          */
        System.out.println("address/location of object "+x.toString());
        
    }
}

```

```java
class TheClass{
    String make = "ford";
    String model = "Mustang";
    String color = "red";
    int year = 2022;

    //toString() //meaning

    public String toString(){
        return make+"\n"+model+"\n"+color+"\n"+"cool";
    }
}
public class Fun {

    public static void main(String[] args) {

        TheClass x = new TheClass();
        System.out.println(x);

        System.out.println("cool :"+x.getClass().getSimpleName());
    }
}

```
```output
ford
Mustang
red
cool
cool :TheClass
```


##### array of object
```java
class TheClass {

    String name;
    TheClass(String name){
        this.name = name;
        System.out.println("assigned");
    }
    public void testprint(){
        System.out.println(this.name);
    }

}

public class Fun {

    public static void main(String[] args) {

        TheClass[] testOBJ = new TheClass[3];  //array of objects;

        TheClass obj1 = new TheClass("pizza");
        TheClass obj2 = new TheClass("hamburger");
        TheClass obj3 = new TheClass("hotdog");

        testOBJ[0]=obj1;
        testOBJ[1]=obj2;
        testOBJ[2]=obj3; 
        // or -> TheClass[] testObj={obj1,obj2,obj3};

        for(int i=0; i<testOBJ.length;i++){
            System.out.println("-----");
            testOBJ[i].testprint();
        }
    }
}

```
```output 
assigned
assigned
assigned
-----
pizza
-----
hamburger
-----
hotdog
```

```java 
import java.util.*;

class TheClass {
  private String name;
  private int marks;

 public void details(String n, int x){
     name = n;
     marks = x;
 }
 public void printAll(){
     System.out.println("your name is "+name);
     System.out.println("your age is "+marks);
 }

}

public class Fun {

    public static void main(String[] args) {

        TheClass[] xOBJ = new TheClass[5];
        Scanner input_x = new Scanner(System.in);
        Scanner input_y = new Scanner(System.in);

        for(int i=0; i<xOBJ.length; i++){
            System.out.println("student "+(i+1));

            System.out.println("enter the students name");
            String name = input_x.nextLine();

            System.out.println("enter the students age");
            int age = input_y.nextInt();

            xOBJ[i] = new TheClass();
            xOBJ[i].details(name,age);

        }

        for(int i=0; i< xOBJ.length; i++){
            xOBJ[i].printAll();
        }
         System.out.println("----------");
        xOBJ[2].printAll(); //onject returns something at position at [2]
    }
}

```
```
student 1
enter the students name
ew
enter the students age
23
student 2
enter the students name
fglfkl
enter the students age
32
student 3
enter the students name
fdgvd
enter the students age
323
student 4
enter the students name
fdsd
enter the students age
34
student 5
enter the students name
df
enter the students age
34
your name is ew
your age is 23
your name is fglfkl
your age is 32
your name is fdgvd
your age is 323
your name is fdsd
your age is 34
your name is df
your age is 34
----------
your name is fdgvd
your age is 323
df
```
```java 
import java.util.*;
import javax.swing.JOptionPane;
import java.util.Random;

class TheClass {
  private String name;
  private int marks;

TheClass(String name, int marks){
    System.out.println("enter student details ");
     this.name = name;
     this.marks = marks;
 }
 public void printAll(){
     System.out.println("your name is "+this.name);
     System.out.println("your age is "+this.marks);
 }

}

public class Fun {

    public static void main(String[] args) {

        TheClass[] xOBJ = new TheClass[5];
        Scanner input_x = new Scanner(System.in);
        Scanner input_y = new Scanner(System.in);

        for(int i=0; i<xOBJ.length; i++){

            System.out.println("enter the students name");
            String name = input_x.nextLine();

            System.out.println("enter the students age");
            int age = input_y.nextInt();

            xOBJ[i] = new TheClass(name,age); //invoking constructor

        }

        for(int i=0; i< xOBJ.length; i++){
            xOBJ[i].printAll();
        }
        System.out.println("----------");
        xOBJ[2].printAll(); //object returns something at position at [2]
    }
}
```
```
enter the students name
ewf
enter the students age
32
enter student details 
enter the students name
ef
enter the students age
23
enter student details 
enter the students name
ds
enter the students age
2
enter student details 
enter the students name
sd
enter the students age
2
enter student details 
enter the students name
d
enter the students age
3
enter student details 
your name is ewf
your age is 32
your name is ef
your age is 23
your name is ds
your age is 2
your name is sd
your age is 2
your name is d
your age is 3
----------
your name is ds
your age is 2

```

#####  object passing (sending object as a method parameter)

```java 

class TheClass {

    String name;

    TheClass(String name){
        this.name = name;
    }
}
class NewClass{  
     //passing object 
    void park(TheClass test1){
        System.out.println("the "+test1.name+"is parked");
    }
}

public class Fun {
    public static void main(String[] args) {

        NewClass new_class = new NewClass();

        TheClass the_class1 = new TheClass("BMW");
        TheClass the_class2 = new TheClass("tesla");

        new_class.park(the_class1);
        new_class.park(the_class2);
        
    }
}

##### static keyword 
```
#### static keyword 
