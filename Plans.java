import java.util.Arraylist;

public class Plans {
    char plan_code;
    int no_of_washes;
    float max_weight;
    float cost;


private static ArrayList<Plans> plans = new ArrayList<Plans>();
    
public static ArrayList<Plans> getPlans() {
    return plans;
}
}