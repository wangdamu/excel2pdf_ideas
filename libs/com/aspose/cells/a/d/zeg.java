package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;

public class zeg
  extends zef
{
  private int a;
  
  public zeg(int paramInt)
  {
    this.a = paramInt;
  }
  
  public zh a(zh paramzh)
  {
    return paramzh;
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    super.a(paramzez);
    paramzez.c("/DecodeParms <<");
    paramzez.a("/K", b());
    paramzez.a("/Columns", 173);
    paramzez.c(">>");
  }
  
  protected zel a(zm paramzm)
  {
    return null;
  }
  
  private int b()
    throws Exception
  {
    switch (this.a)
    {
    case 5: 
      return 0;
    case 6: 
      return -1;
    }
    throw new Exception("Unexpected compression.");
  }
  
  protected String a()
  {
    return "CCITTFaxDecode";
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zeg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */