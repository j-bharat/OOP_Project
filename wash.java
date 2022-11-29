import java.util.*;
import Project.Plans.*;

public class wash extends Plans {
    String status; //in wash, in drying, in ironing, not dropped
    public Date date; //fix datatype
    float weight;

    public wash(float weight) {
		this.weight = weight;
		Date date = new Date();
        this.date= date;
	}
    
    public String getStatus(String status){
        return status;
    }

    public String setStatus(String status){
        this.status= status;
        return status;
    }
} 
