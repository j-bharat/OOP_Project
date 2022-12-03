import .Plans;


public class User 
{
    String name;
    String ID;
    long ph_no;
    //String password;
    Bhawan bhawan;
    Plans plan;
    
    
    int washes_count;
    float total_expense;
    
    public User (String name, String ID, long ph_no, Bhawan bhawan, Plans plan) {
//    	super(bhawan_name);
    
    	this.ID = ID;
		this.name = name;
		this.ph_no = ph_no;
		this.plan = plan;
		this.bhawan = bhawan;
		
		this.washes_count = 0;
	    float total_expense = 0;
	    
	    
    }
    
    public Plans getPlan() {
		return plan;
	}

	public void setPlan(Plans plan) {
		this.plan = plan;
	}
    
	
    String status(Plans cost) {
        
        return "Total expense " + plan.get_cost() + " Washes remaining " +  this.washes_count; 
        
    }

   
	public String getName() {
		return name;
	}
	
	
	public String getID() {
		return ID;
	}

    public String getBhawan() {
		
    	return bhawan.name;
	} 
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void ID(String ID) {
		this.ID = ID;
	}
	
//	public void selectPlan(int index) {
//		this.plan = Plans.getPlans().get(index);
//		washes_remaining -= plan.get_no_of_washes();
//	}
//	
//	public String clothesGiven(double weight) {
//		laundryList.add(new wash(weight));
//		if(washes_remaining == 0) {
//			return "No washes remaining, please recharge";
//		}
//		else {
//			washes_remaining -= 1;
//            return "Wash Accepted";
//		}
//		
		
	}
}


    /*  User gets function {
        return User details;
    } */
    

}










