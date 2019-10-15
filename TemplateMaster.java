
package template;

import java.util.ArrayList;
import java.util.List;
// rang buoc phai ke thua tu Template
public class TemplateMaster<T extends Template> {
    private List<T> obs = new ArrayList<>();
    
    public void addOb(T t){
        obs.add(t);
    }
    
    public List<T> getObs(){
        return obs;
    }
    
    public void inall(){
        for(int i = 0; i<obs.size(); i++){
            T t = obs.get(i);
            t.inTT();
        }
    }
    
}
