package com.hamitmizrak.course_1;

/*
* InnerClass
* Javada 1- tane public class vardır(inner class haric)
* Javada class static olamaz (inner class haric)
*  */

public class _19_InnerClass {

    private  String message="Dış class";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /// //////////////////////////////
    // INNER
    public static class IcClass{

        private String data="iç class verisi";

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    } // end ic class


    static void main() {
        _19_InnerClass disClass= new _19_InnerClass();
        System.out.println(disClass.getMessage());

        IcClass icClass= new IcClass();
        System.out.println(icClass.getData());
    }
} // end dış class

