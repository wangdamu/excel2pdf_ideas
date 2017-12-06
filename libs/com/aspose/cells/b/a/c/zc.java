package com.aspose.cells.b.a.c;

import java.text.DecimalFormatSymbols;

public class zc
{
  private za a;
  private String b;
  private String c;
  private String d;
  private String e;
  private boolean f = false;
  
  public zc(za paramza, boolean paramBoolean)
  {
    this.a = paramza;
    this.f = paramBoolean;
    DecimalFormatSymbols localDecimalFormatSymbols = new DecimalFormatSymbols(paramza.h());
    this.b = localDecimalFormatSymbols.getCurrencySymbol();
    this.c = String.valueOf(localDecimalFormatSymbols.getPercent());
    this.e = String.valueOf(localDecimalFormatSymbols.getDecimalSeparator());
    this.d = String.valueOf(localDecimalFormatSymbols.getGroupingSeparator());
  }
  
  public static zc a()
  {
    return za.a().d();
  }
  
  public String b()
  {
    return this.d;
  }
  
  public String c()
  {
    return this.e;
  }
  
  public String d()
  {
    return this.b;
  }
  
  public String e()
  {
    return this.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/c/zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */