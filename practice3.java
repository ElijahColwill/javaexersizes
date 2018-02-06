import java.util.Scanner;

class PhoneEntry
{
  private String firstName;
  private String lastName;
  private String phone;

  public PhoneEntry( String fn, String ln, String p )
  {
    firstName = fn; lastName = ln; phone = p;
  }
  
  public String getName()       {return firstName + " " + lastName;}
  public String getFirstName()  {return firstName;}
  public String getLastName()   {return lastName;}
  public String getPhone()      {return phone;}
  public void setFirstName(String newFN)    {firstName = newFN;}
  public void setLastName(String newLN)    {lastName = newLN;}
  public void setNumber(String newNum)    {phone = newNum;}
}

class PhoneBook
{ 
  private PhoneEntry[] phoneBook; 

  public PhoneBook()
  {
    phoneBook = new PhoneEntry[ 6 ] ;

    phoneBook[0] = new PhoneEntry( "James", "Barclay", "(418) 665-1223" );
    phoneBook[1] = new PhoneEntry( "Grace", "Smith", "(860) 399-3044" );
    phoneBook[2] = new PhoneEntry( "Paul", "Kratides", "(815) 439-9271" );
    phoneBook[3] = new PhoneEntry( "Violet", "Smith", "(312) 223-1937" );
    phoneBook[4] = new PhoneEntry( "John", "Wood", "(913) 883-2874" );

  }

  public void deleteNumber(String targetName) {
    int index = 0;
    for ( int j=0; j < phoneBook.length; j++ ) {
        if ( phoneBook[ j] != null && phoneBook[ j ].getName().toLowerCase().equals( targetName.toLowerCase() ) ) {
          index = j;
        }
      }
    System.out.println(phoneBook[index]);
    phoneBook[index] = null;
    System.out.println(phoneBook[index]);
    }

  public void addNumber(String firstName, String lastName, String number) {
    phoneBook[5] = new PhoneEntry(firstName, lastName, number);
    System.out.println(phoneBook[5].getName());
  }

  public PhoneEntry search(String targetName )  {
    for ( int j=0; j < phoneBook.length; j++ ) {
        if ( phoneBook[ j] != null && phoneBook[ j ].getName().toLowerCase().equals( targetName.toLowerCase() ) ) {
          return phoneBook[ j ];
        }
      }
      return null;
    }

  public PhoneEntry[] search(String targetLastName, String targetFirstName) {
    PhoneEntry[] entries = new PhoneEntry[phoneBook.length-1];
    for (int j=0; j < phoneBook.length; j++) {
      if ( phoneBook[j] != null) {
        if (phoneBook[ j ].getLastName().toLowerCase().equals( targetLastName.toLowerCase() ) ) {
           entries[j] = phoneBook[ j ];
         }
        }
         
    }
    if (entries.length > 0) {
      return entries;
    }
    return null;
  }
}

class PhoneBookTester
{
  public static void main ( String[] args )
  {
    PhoneBook pb = new PhoneBook();  
    PhoneEntry entry = new PhoneEntry("X", "Y", "911");
    PhoneEntry[] entries = new PhoneEntry[6];
    boolean completed = false;
    Scanner input = new Scanner(System.in);
    System.out.println("Search (1), Add (2), or Delete (3)?");
    String input2 = input.nextLine();
    System.out.println("Last Name?");
    String lastNameInput = input.nextLine();
    System.out.println("First Name?");
    String firstNameInput = input.nextLine();
    String combinedName = firstNameInput + " " + lastNameInput;
    if (input2.equals("1")) {
      if ("".equals(firstNameInput)) {
       entries = pb.search(lastNameInput, firstNameInput);
       completed = true; 
      } else {   
        entry = pb.search(combinedName); 
      }
      if (completed) {
        for (int i = 0; i < entries.length; i++) {
          if (entries[i] != null) {
          System.out.println(entries[i].getName() + ": "+ entries[i].getPhone());
          completed = true; }
        }
      } else if (completed == false) {
        System.out.println("The number is: " + entry.getPhone());
      } else {
        System.out.println("Name not found" );
      }
    } else if (input2.equals("2")) {
      System.out.println("Number?");
      String numberInput = input.nextLine();
      pb.addNumber(firstNameInput, lastNameInput, numberInput);
      System.out.println("Number Added.");

    } else if (input2.equals("3")) {
      pb.deleteNumber(combinedName);
      System.out.println("Number Deleted.");

      }
    }
    
  }
