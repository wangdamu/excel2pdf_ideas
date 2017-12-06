package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;

public abstract class zef
{
  public zh a(zh paramzh)
    throws Exception
  {
    zh localzh1 = new zh();
    zel localzel = a(localzh1);
    paramzh.a(localzel);
    zh localzh2 = new zh(localzh1.m(), 0, (int)localzh1.h());
    localzel.a();
    return localzh2;
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    paramzez.a("/Filter", "/" + a());
  }
  
  public static zef a(int paramInt1, int paramInt2)
    throws Exception
  {
    switch (paramInt1)
    {
    case 0: 
      return null;
    case 5: 
      return new zek();
    case 3: 
      return new zej();
    case 4: 
      return new zei();
    case 8: 
      return new zeh();
    case 6: 
      return new zeg(paramInt2);
    }
    throw new Exception("Unknown filter type.");
  }
  
  protected abstract zel a(zm paramzm)
    throws Exception;
  
  protected abstract String a();
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */