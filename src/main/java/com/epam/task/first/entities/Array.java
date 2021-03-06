package com.epam.task.first.entities;

import java.util.*;

public class Array {

    private List<Integer> elements;

    public Array(Integer... elements){
        this.elements = new ArrayList<Integer>();
        this.elements.addAll(Arrays.asList(elements));
    }

    public Array(List<Integer> elements) {
        this.elements = elements;
        this.elements = Collections.unmodifiableList(elements);
    }

    public List<Integer> getElements() {
        return elements;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Array)) {
            return false;
        }
        for(int i=0; i<elements.size(); ++i){
            if(!elements.get(i).equals(((Array) obj).elements.get(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements);
    }
}
