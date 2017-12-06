package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zt;

public class zcy
{
  public static zb a(zl paramzl, zhb paramzhb)
    throws Exception
  {
    zas localzas = new zas(paramzl.d());
    return a(localzas, paramzl.b(), paramzl.c(), paramzhb);
  }
  
  public static zb a(zas paramzas, zo paramzo, zt paramzt, zhb paramzhb)
    throws Exception
  {
    zcs localzcs = new zcs(paramzas);
    zde localzde = new zde(localzcs, paramzhb);
    Object localObject;
    if ((paramzas.b()) || (paramzas.d()) || (paramzas.e()))
    {
      localObject = new zcu(localzcs, localzde);
      ((zcv)localObject).a(paramzo, paramzt);
    }
    else
    {
      localObject = new zdc(localzcs, localzde);
      ((zdc)localObject).a(paramzo, paramzt);
    }
    return localzde.e();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zcy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */