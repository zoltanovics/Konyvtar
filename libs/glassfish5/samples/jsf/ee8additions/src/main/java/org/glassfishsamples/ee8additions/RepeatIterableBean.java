package org.glassfishsamples.ee8additions;

import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("repeatIterableBean")
@SessionScoped
public class RepeatIterableBean implements Serializable {

    public Iterable getValues() {
        ArrayList result = new ArrayList();
        result.add("1");
        result.add("2");
        result.add("3");
        return result;
    }
}
