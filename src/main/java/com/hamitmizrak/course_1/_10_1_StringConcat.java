package com.hamitmizrak.course_1;

public class _10_1_StringConcat {

    static void main() {
        String name="Hamit",surname="Mızrak",data="Java";

        // 1.YOL
        String result1= name+surname+data;
        System.out.println(result1);

        // 2.YOL
        String result2= name.concat(surname).concat(data);
        System.out.println(result2);

        // 3.YOL
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(name).append(surname).append(data);
        String result3= stringBuilder.toString();
        System.out.println(result3);

    }
}
