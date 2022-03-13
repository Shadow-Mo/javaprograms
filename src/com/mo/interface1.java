package com.mo;

public interface interface1 {
    public void mymethod();
}
interface interface2{
    public void myothermethod();
}
class democlass implements interface1,interface2{
    @Override
    public void mymethod() {
        System.out.println("some text...");
    }

    @Override
    public void myothermethod() {
        System.out.println("some other text...");
    }
}
class Main6{
    public static void main(String[] args) {
        democlass myobj = new democlass();
        myobj.mymethod();
        myobj.myothermethod();
    }
}
