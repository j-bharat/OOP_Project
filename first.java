class User
{
    String name;
    String ID;
    String hostel;
    Plan wash_plan;
    long ph_no;
    int washes_completed;
    float total_expense;
    
    


    float status(User obj, Plan cost) {
        return "Total expense " + obj.washes_completed*Plan.cost + " Washes remaining " + Plan.no_of_Washes - User.washes_completed; 
        
    }

    /*  User gets function {
        return User details;
    } */
    

}



class Plan {
    char plan_code;
    int no_of_Washes;
    float max_weight;
    float cost;
}


class Wash extends Plan {
    String status; //in wash, in drying, in ironing, not dropped
    date Date; //fix datatype
    float weight;

    /* setter method to update status from admin */
} 



class Admin {
    String username;
    String password;


    Datatype login(){
        /* if (username -> database); login = true; redirect to admin homepage

         else -> System.out.println("Invalid creds"); login = false; redirect to login creds + error mesaage;

         return login;

              for(user : User )
                 print User; */

    }

 

}
