package cse.cs;

public class Prime {

    public static void main(String[] args) {

        int num = 29;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
        System.out.println(num + "hrllo");
        //first commit in master branch
        //second commit in master branch
        //third commit in master branch
        //fourth commit in master branch
      //get again from stash commit in master branch
        //sixth commit in master branch
        //seven commit in master branch
      
    }
}