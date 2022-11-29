public class User
{
    String name;
    String ID;
    String passkey;
    String bhawan;
    Plans plan;
    long ph_no;
    int washes_remaining;
    float total_expense;
    


    String status(User obj, Plan cost) {
        
        return "Total expense " + (this.plan.no_of_washes-this.washes_remaining)*this.plan.cost + " Washes remaining " +  this.washes_remaining; 
        
    }

   
	public String getName() {
		return name;
	}
	
	
	public String getID() {
		return ID;
	}

    public String getBhawan() {
		return bhawan ;
	} 
	

	public void setHostel(String bhawan) {
		this.bhawan = bhawan;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void ID(String ID) {
		this.ID = ID;
	}
	public void selectPlan(int index) {
		this.plan = Plans.getPlans().get(index);
		washes_remaining -= plan.no_of_washes;
	}
	
	public String clothesGiven(double weight) {
		laundryList.add(new wash(weight));
		if(washes_remaining == 0) {
			return "No washes remaining, please recharge";
		}
		else {
			washes_remaining -= 1;
            return "Wash Accepted";
		}
		
		
	}
}


    /*  User gets function {
        return User details;
    } */
    

}










