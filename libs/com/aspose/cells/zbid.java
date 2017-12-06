package com.aspose.cells;

import com.aspose.cells.a.d.zb;

class zbid
{
  static zb a(Shape paramShape)
    throws Exception
  {
    zbic localzbic = b(paramShape);
    return a(localzbic);
  }
  
  private static zbic b(Shape paramShape)
    throws Exception
  {
    if ((paramShape.P().p().g()) || (paramShape.C()))
    {
      if ((paramShape.o != null) && (!"".equals(paramShape.o)))
      {
        localObject = zalq.a(paramShape);
        if (localObject != null) {
          paramShape = (Shape)localObject;
        }
      }
      localObject = new zbni(zbor.c(paramShape.getMsoDrawingType()));
      zbor.a(paramShape, (zbni)localObject, false);
      if (!((zbni)localObject).f)
      {
        ((zbni)localObject).e(0.0F);
        ((zbni)localObject).f(0.0F);
      }
      return (zbic)localObject;
    }
    Object localObject = new zbnh(zboq.c(paramShape.getMsoDrawingType()));
    zboq.a(paramShape, (zbnh)localObject);
    if (!((zbnh)localObject).d)
    {
      ((zbnh)localObject).c(0.0F);
      ((zbnh)localObject).d(0.0F);
    }
    return (zbic)localObject;
  }
  
  private static zb a(zbic paramzbic)
    throws Exception
  {
    int i = zaed.b;
    zav localzav = (zav)zaed.a(i, 1, 1, ImageFormat.getBmp(), null, null, paramzbic, new zis());
    return localzav.n();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */