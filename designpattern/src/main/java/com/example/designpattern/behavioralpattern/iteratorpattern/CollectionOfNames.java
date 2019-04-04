package com.example.designpattern.behavioralpattern.iteratorpattern;

public class CollectionOfNames implements Container {

    public String name[]={"Moktar Hossain", "Raju Ahmed","Abdur Razzak","Mamun Rashid","Md Joy"};

    @Override
    public Iterator getIterator() {
        return new CollectionOfNamesIterate();
    }

    private class CollectionOfNamesIterate implements Iterator {
        private int i;

        @Override
        public boolean hasNext() {
            if (i < name.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return name[i++];
            }
            return null;
        }
    }
}
