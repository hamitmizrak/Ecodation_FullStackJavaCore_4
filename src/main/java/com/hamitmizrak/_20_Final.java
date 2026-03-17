package com.hamitmizrak;

/*
* Final 3 şekilde kullanıyoeuz
* 1- değişkende => sabit olmasını sağlıyor
* 2- class      => kalıtıma izin vermez
* 3- method     => override izin vermez
*  */

public final class  _20_Final { // inheritance  yapamazsın

    // Field değiştiremezsin
    private static final String CONNECTION_DATA="c:\\data";

    // OVerride izin vermez
    public final void dataMethod(){}

} // end dış class

