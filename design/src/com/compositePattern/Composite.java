package com.compositePattern;

import java.util.ArrayList;

/**
 * Created by niuhonglei on 2017/9/11.
 */
public class Composite extends Component {
    private ArrayList<Component> components = new ArrayList<>();
    public void add(Component component){
        this.components.add(component);
    }
    public void remove(Component component){
        this.components.remove(component);
    }
    public ArrayList<Component> getChildren(){
        return this.components;
    }
}
