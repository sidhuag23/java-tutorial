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

```
#### simple sum of 2D matrix alogrthim
```java 
  public class matrices {

     public static void main(String[] args){
          int [][]a={
                  {12,34,55},
                  {34,45,56},
                  {45,66,88}
          };

          for(int i=0; i<a.length;i++){
               System.out.println();
               for(int j=0; j<a[i].length;j++){
                    System.out.print(" ["+a[i][j]+"] ");
               }
          }

          int [][]b={
                  {1,2,1},
                  {2,1,2},
                  {1,2,1}
          };

          for(int i=0; i<b.length;i++){
               System.out.println();
               for(int j=0; j<b[i].length;j++){
                    System.out.print(" ["+b[i][j]+"] ");
               }
          }

          int [][]sum = new int[3][3];

          for(int i=0; i<sum.length ; i++){
               for(int j=0; j<sum[i].length; j++)
                    sum[i][j]=a[i][j]+b[i][j];
          }

          for(int i=0; i<sum.length ; i++){
               System.out.println();
               for(int j=0; j<sum[i].length; j++)
                    System.out.print(" ["+sum[i][j]+"] ");
          }
     }
}
```
```output
[12]  [34]  [55] 
 [34]  [45]  [56] 
 [45]  [66]  [88] 
 [1]  [2]  [1] 
 [2]  [1]  [2] 
 [1]  [2]  [1] 
 [13]  [36]  [56] 
 [36]  [46]  [58] 
 [46]  [68]  [89] 
```
#### static keyword
```java 
class Test_this{

    //static -> modifier . A single copy of a variable/method is created and shared The class "owns " the static members
    // anything that class owns shared by all instances(object) of the class because there is only one copy

   static int test=10;
   static int test2 = 90;

   public static void print_these(){
       System.out.println(test2+1);
   }

    }
class Testfun{
    public static void main(String[] args){

        //you dont need to create an object for static method you can just access them by {class_name.member}
         System.out.println(Test_this.test);
         Test_this.print_these();

    }
}
```
```output 
10
91
```
```java 
//static member example 2
class Test_this{
    String name;
    static int numberOfCars=0;

    Test_this(String name) {
         this.name = name;
         numberOfCars++;
   }
}

class Testfun{
    public static void main(String[] args){

        Test_this Car = new Test_this("porsche cayenne");
        Test_this Car1 = new Test_this("maserati quattraporte");
        Test_this Car2 = new Test_this("BMW");


        System.out.println(Test_this.numberOfCars); //output-> 3
        // all 3 objects share the same static members

        System.out.println(Car.numberOfCars); //output -> 3
        System.out.println(Car1.numberOfCars); //output -> 3
        System.out.println(Car2.numberOfCars); //output -> 3
    }
}
```
```java 
//static method 
class Test_this{
    String name;
    static int numberOfCars=0;

    Test_this(String name) {
         this.name = name;
         numberOfCars++;
   }
   //static method
   static void displayFriends(){
        System.out.println("your cars are "+numberOfCars);
   }

}

class Testfun{
    public static void main(String[] args){

        Test_this Car = new Test_this("porsche cayenne");
        Test_this Car1 = new Test_this("maserati quattraporte");
        Test_this Car2 = new Test_this("BMW");

        //calling static method
        Test_this.displayFriends(); //output -> your car are 3
    }
}
```
```java 
//static method with fake main method 

class New_main{
    public static void main(){ //fake main method
        System.out.print("hello world");
        for(int i=0,n=5; i<n; i++){
            System.out.println("hello world");
        }
    }

}
class Testfun{
    public static void main(String[] args){ //original main method
       New_main.main(); //because of static method we can call via classname.method_name
    }
}
```

#### Inhertiance in jave 
```java 
class Vehicle{ //parent class

    double speed;

     void go(){
       System.out.println("This vechile is moving");
     }
     void stop(){
         System.out.print("this vechile is stopped");
     }

}
class Car extends Vehicle{ //child class -> parent vehicle

     void display(){
         System.out.println("yes its a car");
     }

}
class Motorcycle extends Vehicle{ //child class -> parent vehicle
    void display(){
        speed =3.3;
        System.out.println("yes this is a Motorcycle"+speed);
    }

}
class Testfun{
    public static void main(String[] args){

        Car myCar = new Car();
        myCar.go(); //inhertied method
        myCar.display();


        Motorcycle Bike = new Motorcycle();
        Bike.go(); //inhertied method
        Bike.display();

    }
}
```
```output 
This vechile is moving
yes its a car
This vechile is moving
yes this is a Motorcycle3.3
```
#### method overloading 
```java 
class Vehicle{ //parent class
    void go(){
        System.out.println("the tries to start");
    }
}
class Car extends Vehicle{
    void go(){
        System.out.println("the car just starts");
    }
    void go(int x) {
        System.out.println("your car speed is "+x);
    }

}
class Motorcycle extends Vehicle{
    void go() {  //method overriding
        System.out.println("your bike starts");
    }
    void go(int x){
        System.out.println("your bike speed is "+x);
    }
}

class Testfun{
    public static void main(String[] args){
      //method overriding
        //declaring a method in sub class,which is already present in parent class
        //done so that a child class can give its own implementation
      Motorcycle New_moto = new Motorcycle();
      New_moto.go();
      New_moto.go(34);

      Car New_car = new Car();
      New_car.go();
      New_car.go(4030);

    }
}
```
#### super keyword
```java 
//super = keyword refers to the superclass(parent) of an object very similar to this keyword
/The super keyword in java is a reference variable that is used to refer parent class object

class new_test {
    void details(int x,int y){
        System.out.println("the x is ->"+x+"the y is ->"+y);
    }
}
class test extends new_test{
     void new_details(){
         super.details(10,30); //super keyword invoking method of the parent class
         System.out.println("another details");
         super.details(20,30);//super keyword invoking method of the parent class
     }
}
class Main{
    public static void main(String [] args){
        test xc = new test();
        xc.new_details();
    }
}
```
```output 
the x is ->10the y is ->30
another details
the x is ->20the y is ->30
```
super using constructor
```
class new_test {
    int name;
    int age;
    new_test(int name,int age){
          this.name = name;
          this.age = age;
          System.out.println("constructor started");
    }
}
class test extends new_test{
    int power;
    test(int name, int age,int power) {
        super(name, age); // super keyword invoking constructor or the parent class
        this.power=power;
       System.out.println("name -> "+name+"age -> "+age);
       System.out.println("dude power -> "+power);
    }
}

class Main{
    public static void main(String [] args){
        test xc = new test(23,434,33);
    }
}

```

#### abstract class and method
```java 
//abstract class = abstract classes cannot be instantiated , but they can have a subclass
// abstract method are declared without an implementation
//only an abstract class can contain abstarct method
 abstract class new_test {  //to create an instance/object for abstract class we want to inhert from a subclass otherwise we cant
      abstract void go(int x); //abstract method
 }

class test extends new_test{ //inherted from abstract class
     void go(int x){  //abstract method body is implemented inside the subclass
         System.out.println(x);
     }
}

class Main{
    public static void main(String [] args){
        test xc = new test();  
        xc.go(10);  //output -> 10
    }
}
```
#### access modifers 
As the name suggests access modifiers in Java helps to restrict the scope of a class, constructor, variable, method, or data member. There are four types of access modifiers available in java                      

    Default – No keyword required
    
    Private
    
    Protected
    
    Public
 
 For classes, you can use either public or default
 
 <b>public</b>   ->	The class is accessible by any other class 
 
<b>default</b>   -> 	The class is only accessible by classes in the same package. This is used when you don't specify a modifier. 

For attributes, methods and constructors, you can use the one of the following
<b>public</b>    ->	The code is accessible for all classes

<b>private</b>    ->	The code is only accessible within the declared class 	

<b>default</b>    ->	The code is only accessible in the same package. This is used when you don't specify a modifier.	

<b>protected</b>   ->	The code is accessible in the same package and subclasses

#### Non access modifers 
For classes, you can use either final or abstract

<b>final</b>   ->	The class cannot be inherited by other classes
	
<b>abstract</b>  ->	The class cannot be used to create objects (To access an abstract class, it must be inherited from another class

For attributes and methods, you can use the one of the following

<b>final</b>  ->   	Attributes and methods cannot be overridden/modified

<b>static</b>  ->	Attributes and methods belongs to the class, rather than an object

<b>abstract</b> ->	Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from).

<b>transient</b>  -> 	Attributes and methods are skipped when serializing the object containing them

<b>synchronized</b>   -> 	Methods can only be accessed by one thread at a time

<b>volatile</b>   ->   	The value of an attribute is not cached thread-locally, and is always read from the "main memory"

#### access speficers 
<b>public</b>  -> anything using public keyword is visible throughout the entire program 

<b>default</b> -> anything using default access modifers is only visible to anything with in the same package 

<b>protected</b> -> protected is accessible whether its in different class or in different package as long as that class is a subclass of whatever class containing protected members 

<b>private</b>  -> only accessible inside that class that it contain a private members only class can access private members other can't
![image](https://user-images.githubusercontent.com/60841101/173698552-b54ec061-ea64-42b5-941d-ce779ed2feac.png)

##### encapsulation
```java 

//Encapsulation is defined as the wrapping up of data under a single unit.
// It is the mechanism that binds together code and the data it manipulates.
// Another way to think about encapsulation is,
// that it is a protective shield that prevents the data from being accessed by the code outside this shield

//attributes of a class will be hidden/private
//can be accessed only through methods (getters and setters)
//you should make attributes private if you dont have a reason to make  them public/protected
class Car{
    private String make;
    private String model;
    private int year;

     Car(String make ,String model,int year ) {
         this.setMake(make);
         this.setModel(model);
         this.setYear(year);
     }
    //setter
    public void setYear(int year){
         this.year=year;
    }
    public void setMake(String make){
         this.make=make;
    }
    public void setModel(String model){
         this.model =model;
    }
    //inorder to access those attributes we need to create getter and setter
    //getter
    public String getMake(){
         return  make;
    }
    public String getModel(){
         return model;
    }
    public int getYear(){
         return year;
    }



}

class Main{
    public static void main(String [] args){
        Car new_car = new Car("porsche","cayenne",1980);

        new_car.setYear(2021);
	
        System.out.println(new_car.getYear()); 2021
        System.out.println(new_car.getMake()); porsche

    }
}
```
#### copy objects
```java 
//copy objects in java
class Car {
    String make;
    String model;
    int year;
    Car(String make,String model, int year){
        this.Setmodel(model);
        this.Setmake(make);
        this.Setyear(year);
    }
    public void Setmake(String make){
         this.make=make;
    }
    public void Setmodel(String model){
        this.model=model;
    }
    public void Setyear(int  year){
        this.year =year;
    }

    public String getModel(){
        return model;
    }

    public String getMake(){
        return make;
    }

    public int getYear(){
        return year;
    }

//copy object method
   public void copy(Car new_obj){
       this.Setmodel(new_obj.getMake());
       this.Setmake(new_obj.getModel());
       this.Setyear(new_obj.getYear());
   }
   //copy constructor
 Car(Car new_obj){
        this.copy(new_obj);
 }

}
class Main{
    public static void main(String [] args){
        Car x = new Car("porsche","macan",1989);
      //  Car z = new Car("lamborghini","aventadir",2021);
     
        //z.copy(x);


        System.out.println(x); //Car@6d03e736  //object x's location
        System.out.println(z); //Car@568db2f2  //object z's location

    }
}

```

#####  interface and implements 
```java 
interface test{
    public void testing();
}

interface  Vehicle extends test{
    public void carSound();
}
interface Bike {
    public void bikeSound();
}
class Car implements  Vehicle,Bike {

    public void carSound(){
        System.out.println("Starting");
    }

    public void bikeSound() {
      System.out.println("bike startes");
    }

    public void testing(){
        System.out.println("this is just testing");
    }
}
class Main{
    public static void main(String [] args){

         Car xc = new Car();
         xc.bikeSound(); //bike startes
         xc.testing();//this is just testing

    }
}

```
#### polymorphism
```java 
//polymorphism = greek word for poly -> "many" ,morph ->"forms"
//The ability of an object to identify as more than one type
class Vehicle{
        void go(){
            System.out.println("vehicle");
        }
}
class Car extends Vehicle{
         void go(){
             System.out.println("car");
         }
}
class Bike extends Vehicle{
    void go(){
        System.out.println("Bike");
    }
}

class Truck extends Vehicle{
    void go(){
        System.out.println("Truck");
    }
}

class Main{
    public static void main(String [] args){
      Car carx = new Car();
      Bike bikex = new Bike();
      Truck truckx = new Truck();

      //Vechicle represnts these objects in many forms
      Vehicle[] racers = {carx,bikex,truckx};

      for(Vehicle i : racers ){
          i.go();
      }

    }
}
```
```output 
car
Bike
Truck
```
```java
class Vehicle{
        void go(){
            System.out.println("vehicle");
        }
}
class Car extends Vehicle{
         void go(){
             System.out.println("car");
         }
}
class Bike extends Vehicle{
    void go(){
        System.out.println("Bike");
    }
}

class Truck extends Vehicle{
    void go(){
        System.out.println("Truck");
    }
}

class Main{
    public static void main(String [] args){
      Vehicle x = new Car(); //since car is inherited 
      x.go();  //output -> car
      }

    }

```
#### dynamic polymorphism 
```java 
import java.util.*;
//polymorphism = greek word for poly -> "many" ,morph ->"forms"
//The ability of an object to identify as more than one type
//dynamic = after compilation(during runtime )
//ex : an iphone identities as an ios devices , as an smartphone , as an electronic device , as an object
class Vehicle{
        void go(){
            System.out.println("default");
        }
}
class Car extends Vehicle{
         void go(){
             System.out.println("car");
         }
}
class Bike extends Vehicle{

    @Override
    void go(){
        System.out.println("Bike");
    }
}

class Truck extends Vehicle{
    @Override
    void go(){
        System.out.println("Truck");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
	Vehicle newVehicle; 
	
        while (true) {
            System.out.println("enter your choice?");
            System.out.println("choices -> 1,2,3");
            int choice = scanner.nextInt();

            if (choice == 1) {
                newVehicle = new Bike();
                newVehicle.go();
            } else if (choice == 2) {
                newVehicle = new Car();
                newVehicle.go();
            } else if (choice == 3) {
                newVehicle = new Truck();
                newVehicle.go();
            } else {
                newVehicle = new Vehicle();
                newVehicle.go();
            }
        }
    }
}
```
```output
enter your choice?
choices -> 1,2,3
2
car
enter your choice?
choices -> 1,2,3
3
Truck
enter your choice?
choices -> 1,2,3
9
default
enter your choice?
choices -> 1,2,3
```
#### Exception handling
```java 
import java.util.*;
//exception = an event occurs during the execution of a program that,
//disrupts the normal flow of instructions
//we use try and catch blocks to avoid disruption and unecessary error
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       try {
           System.out.println("enter a number");
           int x = sc.nextInt();
           System.out.println("enter another number");
           int y = sc.nextInt();

           int c = x / y;
           System.out.println(c);
       }catch (ArithmeticException z) {
           System.out.println("dont divide by zero" + z);
       }catch(InputMismatchException a){
           System.out.println("dude thats an error "+a);
       }catch(Exception  s){ //catches all types of exception
           System.out.println("soemthing went wrong "+s);
       }finally { //finally will always run no matter what happened
                   //also finally used to close things like file scanner class and other memory file management things
           sc.close();
           System.out.println("this will always run ");
       }
    }
}
```
```output
enter a number
5
enter another number
jhmjklk;;
dude thats an error java.util.InputMismatchException
this will always run 

Process finished with exit code 0
```
#### file in java 
```java 
import java.io.*;
//file = An abstract representation of file and directory path names
class Main {
    public static void main(String[] args) {

         File file = new File("C:\\Users\\91944\\Desktop\\test.txt");
         //.exists() to check whether the file exist or not
         if(file.exists()){
             System.out.println("That file exists !");
             System.out.println(file.getPath()); //gets the path
             System.out.println(file.getAbsolutePath()); //gets full file location
             System.out.println(file.isFile()); //checks whether a file is a file or not 
             file.delete(); //will delete file
         }else{
            System.out.println("That file doesnt exist");
         }
    }
}

```
#### writing to a file
```java
import java.io.*;
//writing to a file 
class Main {
    public static void main(String[] args) {

        try{
            FileWriter write_into = new FileWriter("C:\\Users\\91944\\Desktop\\test.txt"); //FileWriter constructor
            write_into.write("this is just a test\n kewjflkewjfkl\neffllkjfkl"); // will write text to the file
            write_into.append("ewfje\neflkl"); //will add text  at the end
            write_into.close();
        }catch(Exception z){
            System.out.println("some issue "+z);
        }

    }
}
```
#### Reading a existing file
```java 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws FileNotFoundException {

         //FileReader = read the contents of a file as a stream of characters . One by One
        // read() -> returns an int value which contains -> byte value
        // when read() returns -1 , there is no more data to be read
try {
    FileReader reader = new FileReader("C:\\Users\\91944\\Desktop\\test.txt"); //Reader class instance
    int data = reader.read(); //read method
    System.out.println("this is a thing "+data);
    while(data != -1){
        System.out.print((char)data); //type  casting as character values
        data = reader.read();
    }
    reader.close(); //close method
}catch(FileNotFoundException x){
    System.out.println("this is an error"+x);
} catch (IOException e) {  //instance
    System.out.println("this is another error read "+e);
}
    }
}
```
#audio file in java 
```java 
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// audio in java

class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

         File file_data = new File("C:\\Users\\91944\\Desktop\\BabyElephantWalk60.wav"); //normal file instance
         AudioInputStream audioStreamTest = AudioSystem.getAudioInputStream(file_data); //putting audio file in AudioInputStream's instance

         Clip my_audio = AudioSystem.getClip(); 
         my_audio.open(audioStreamTest); //opens the audio file 

         String response="";
         Scanner sc = new Scanner(System.in);
         while(!response.equals("Q")){
             System.out.println("enter the choice  Q=quit P=play S=stop R=reset E=exit");
             response = sc.next();

               switch(response){
                   case "P" :my_audio.start();   //.start() -> starts audio
                              break;
                   case "S":my_audio.stop();  //.stop() -> stop audio
                                break;
                   case "R":my_audio.setMicrosecondPosition(0); //.setMicrosecondPosition -> set positon of the track
                                break;
                   case "Q":my_audio.close();//.close() -> closes the file 
                                break;
                   default : System.out.println("Not a valid response");
             }
             System.out.println("the audio  has been closed");
        }
    }
}
```


