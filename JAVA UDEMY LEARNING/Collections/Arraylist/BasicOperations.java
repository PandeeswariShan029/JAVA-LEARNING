import java.util.*;

//create main class

public class BasicOperations{

// create the arraylist in the main class

static ArrayList<String>listnames = new ArrayList<>();

//create the main function

public static void main(String[] args)

{

//adding names in the created arraylist

listnames.add("Pandeeswari");

listnames.add("Kathir");

listnames.add("Vikranth");

listnames.add("Santhi");

listnames.add("Suriya");

listnames.add("Parkavi");

listnames.add("Pallavi");

// creating object for the class to access its member functions

BasicOperations m = new BasicOperations ();

m.displaynames(listnames);

m.removenamebyposition(0);

m.displaynames(listnames);

System.out.println("**********");

m.removenamebystring("Pallavi");

m.displaynames(listnames);

System.out.println("**********");

m.getnamebyindex(2);
}

// create display function for displaying names in the list

void displaynames(ArrayList <String> Names)

{

for(String n :Names ){

System.out.println(n); }

}

// creating remove function for removing names by position 

void removenamebyposition(int pos)

{

listnames.remove(pos);

}

// creating remove function for removing names by string

void removenamebystring(String stringtoremove)

{

listnames.remove(stringtoremove); 

}

// creating function to get the name by index

void getnamebyindex(int inx)

{

System.out.println(listnames.get(inx));

}
} 

