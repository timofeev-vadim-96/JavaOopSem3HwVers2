package models;

import java.util.*;

public class CatBox implements Iterable<Cat> {
    ArrayList<Cat> catBox;
    int index;

    public CatBox() {
        catBox = new ArrayList<>();
        index=0;
    }

    public CatBox addCat(Cat cat){
        catBox.add(cat);
        return this;
    }

    public CatBox removeCat(int index){
        catBox.remove(index);
        return this;
    }

    @Override
    public Iterator<Cat> iterator() {
        return new BoxIterator<>(catBox);
    }

    public void sort(){
        Collections.sort(catBox);
    }

    public void sort(Comparator comparator){
        catBox.sort(comparator);
    }

    @Override
    public String toString() {
        return Arrays.toString(catBox.toArray());
    }

    public int size(){
        return catBox.size();
    }
}
