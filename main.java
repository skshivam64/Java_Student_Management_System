import java.io.*;
import java.util.*;

class java_learning
{
  public static void main(String[] args)
  {
    final Scanner x;

    Scanner data = new Scanner(System.in);

    System.out.print("Please enter the name of the student: ");

    String fname = data.nextLine();

    boolean search_return = false;

    String list[] = {"First Name: ", "Last Name: ", "Admission No.: ", "Age: ", "Branch: ", "Semester: "};

    try
    {
        x = new Scanner(new File("data.txt"));

        System.out.print("----------------------------------------------------------\n ");

        while(x.hasNext())
        {
          String data_xtract = x.nextLine();
          if(data_xtract.startsWith("\"" + fname))
          {
                        int i = 0;

                        boolean check = true;

                        int len = data_xtract.length();

                        for(int j = 0; j < len; j++)
                        {
                                    if(data_xtract.charAt(j) == data_xtract.charAt(0))
                                    {
                                      if(check)
                                      {
                                        System.out.print(list[i]);
                                        i++;
                                        check = false;
                                      }
                                      else
                                      {
                                        System.out.println();
                                        check = true;
                                      }

                                    }
                                    else
                                      System.out.print(data_xtract.charAt(j));

                        }
                        search_return  = true;
                        break;
                      }

        }

        if(search_return == false) System.out.println("Name not found!!!");
    }
    catch(Exception e)
    {
        System.out.println("Error Occured: " + e.toString());
    }

    System.out.print("----------------------------------------------------------\n");
    
  }
}
