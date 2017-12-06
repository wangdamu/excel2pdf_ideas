package com.aspose.cells.a.d;

import com.aspose.cells.a.c.zw;

public class zea
  extends zey
{
  private static byte[] a = ;
  
  public zea(zdz paramzdz)
  {
    super(paramzdz);
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    paramzez.a("/Filter", "/FlateDecode");
    paramzez.a("/N", 3);
    paramzez.a("/Length", a.length);
    paramzez.h();
    paramzez.a("stream\r\n");
    paramzez.a(a, 0, a.length);
    paramzez.a("\r\nendstream\r\n");
    paramzez.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */