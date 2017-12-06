package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;

public class zdt
  extends zey
{
  private int a = -1;
  private zq b;
  private boolean c;
  private String d;
  private zed f;
  
  public zdt(zdz paramzdz, zq paramzq, String paramString, boolean paramBoolean)
  {
    super(paramzdz);
    this.b = paramzq;
    int i = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    if (paramBoolean)
    {
      String[] arrayOfString = zw.d(paramString, '_');
      if (arrayOfString.length >= 3) {
        try
        {
          i = zp.a(arrayOfString[0]);
          f1 = Float.parseFloat(arrayOfString[1]);
          f2 = Float.parseFloat(arrayOfString[2]);
        }
        catch (Exception localException) {}
      }
    }
    this.d = paramString;
    this.c = paramBoolean;
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    if (this.e.k() != null)
    {
      this.e.k().a(this);
      paramzez.a(this.e.k());
    }
    paramzez.a("/Type/Annot");
    paramzez.a("/Subtype/Link");
    paramzez.a("/Rect", this.b);
    if (this.e.b().u())
    {
      paramzez.a("/F", 28);
      if ((this.e.b().v()) && (this.a >= 0)) {
        paramzez.a("/StructParent", this.a);
      }
    }
    if (!this.e.b().i()) {
      paramzez.a("/BS", "<</Type/Border/S/S/W 0>>");
    }
    if (this.c)
    {
      if (this.f != null) {
        paramzez.a("/A", this.f.o());
      }
    }
    else
    {
      paramzez.a("/A");
      paramzez.g();
      paramzez.a("/Type/Action");
      paramzez.a("/S/URI");
      paramzez.b("/URI", this.d);
      paramzez.h();
    }
    paramzez.h();
    paramzez.b();
  }
  
  public zed a()
  {
    return this.f;
  }
  
  public void a(zed paramzed)
  {
    this.f = paramzed;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public boolean c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zdt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */