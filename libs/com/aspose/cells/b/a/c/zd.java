package com.aspose.cells.b.a.c;

import java.util.Locale;

public class zd
{
  private Locale a;
  
  public zd(Locale paramLocale)
  {
    this.a = paramLocale;
  }
  
  public static zd a()
  {
    return new zd(Locale.getDefault());
  }
  
  public String b()
  {
    return this.a.getISO3Country();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/c/zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */