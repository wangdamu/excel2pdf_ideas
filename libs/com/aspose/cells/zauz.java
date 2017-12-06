package com.aspose.cells;

import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zw;

public class zauz
{
  public static zcjm a(String paramString)
    throws Exception
  {
    return a(paramString, null, false);
  }
  
  public static zcjm a(String paramString, zcjv paramzcjv, boolean paramBoolean)
    throws Exception
  {
    zcjm localzcjm = new zcjm();
    localzcjm.a(paramString, paramBoolean, false);
    return localzcjm;
  }
  
  public static zcjm a(zm paramzm, zcjv paramzcjv, boolean paramBoolean)
    throws Exception
  {
    zcjm localzcjm = new zcjm();
    localzcjm.a = paramzcjv;
    localzcjm.a(paramzm, paramBoolean, false);
    return localzcjm;
  }
  
  public static zcjm a(zm paramzm)
    throws Exception
  {
    zcjm localzcjm = new zcjm();
    localzcjm.a(paramzm, false, false);
    return localzcjm;
  }
  
  public static boolean a(zcjn paramzcjn)
  {
    return paramzcjn.f();
  }
  
  public static zcju a(zcjn paramzcjn, String paramString1, String paramString2)
  {
    return paramzcjn.b(paramString1, paramString2);
  }
  
  public static zcjg a(zcjn paramzcjn, String paramString)
  {
    zcjh localzcjh = paramzcjn.e();
    for (int i = 0; i < localzcjh.getCount(); i++)
    {
      zcjg localzcjg = localzcjh.a(i);
      if (zw.b(localzcjg.g, paramString)) {
        return localzcjg;
      }
    }
    return null;
  }
  
  public static String a(zcjs paramzcjs, boolean paramBoolean)
    throws Exception
  {
    paramzcjs.j = paramBoolean;
    return paramzcjs.c();
  }
  
  public static String a(zcjs paramzcjs)
  {
    return paramzcjs.a();
  }
  
  public static boolean a(zcjy paramzcjy)
    throws Exception
  {
    for (;;)
    {
      switch (paramzcjy.s())
      {
      case 1: 
        return true;
      case 4: 
        paramzcjy.h();
        return false;
      case 0: 
        return false;
      }
      paramzcjy.a();
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zauz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */