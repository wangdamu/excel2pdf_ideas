package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class zsc
{
  private zsb a;
  private zlj b;
  private zse c;
  private ShapeCollection d;
  
  zsc(ShapeCollection paramShapeCollection, zse paramzse, int paramInt)
  {
    this.c = paramzse;
    this.d = paramShapeCollection;
    this.a = new zsb(paramInt);
  }
  
  zsc(ShapeCollection paramShapeCollection, zse paramzse, int paramInt1, int paramInt2)
  {
    this.c = paramzse;
    this.d = paramShapeCollection;
    this.a = new zsb(paramInt1, paramInt2);
  }
  
  zse a()
  {
    return this.c;
  }
  
  WorksheetCollection b()
  {
    return this.d.j();
  }
  
  int a(Shape paramShape, byte[] paramArrayOfByte)
  {
    c().a(a(), 1);
    paramShape.R().j().c(c().c());
    if (paramArrayOfByte != null) {
      return this.c.a(paramArrayOfByte);
    }
    return 0;
  }
  
  void a(Shape paramShape)
  {
    c().a(a(), 1);
    paramShape.R().j().c(c().c());
  }
  
  zsb c()
  {
    return this.a;
  }
  
  zlj d()
  {
    if (this.b == null) {
      this.b = new zlj();
    }
    return this.b;
  }
  
  long e()
  {
    long l = 48L;
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      if (localShape.Y()) {
        switch (localShape.getMsoDrawingType())
        {
        case 20: 
          Object localObject = ((ComboBox)localShape).a();
          if ((localObject instanceof AutoFilter))
          {
            l += ((AutoFilter)localObject).f() * 90;
          }
          else if ((localObject instanceof PivotTable))
          {
            PivotTable localPivotTable = (PivotTable)localObject;
            l += localPivotTable.getPageFields().getCount() * 90;
          }
          else
          {
            l += 90L;
          }
          break;
        default: 
          l += 90L;
          break;
        }
      } else {
        l += localShape.X();
      }
    }
    return l;
  }
  
  int f()
  {
    int i = c().d() + 8 + 8;
    if (this.b != null) {
      i += this.b.a();
    }
    return i;
  }
  
  int g()
  {
    ArrayList localArrayList = this.c.d().c();
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zwy localzwy = (zwy)localArrayList.get(i);
      if (localzwy.a == (c().a() & 0xFFFF)) {
        return (i + 1) * 1024;
      }
    }
    return 1024;
  }
  
  int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    paramArrayOfByte[paramInt1] = 15;
    paramArrayOfByte[(paramInt1 + 2)] = 2;
    paramArrayOfByte[(paramInt1 + 3)] = -16;
    System.arraycopy(zc.a(paramInt2), 0, paramArrayOfByte, paramInt1 + 4, 4);
    paramInt1 += 8;
    int i = 0;
    i |= c().a() << 4;
    System.arraycopy(zc.a(i), 0, paramArrayOfByte, paramInt1, 2);
    paramArrayOfByte[(paramInt1 + 2)] = 8;
    paramArrayOfByte[(paramInt1 + 3)] = -16;
    paramArrayOfByte[(paramInt1 + 4)] = 8;
    paramInt1 += 8;
    System.arraycopy(zc.a(c().b()), 0, paramArrayOfByte, paramInt1, 4);
    System.arraycopy(zc.a(c().c()), 0, paramArrayOfByte, paramInt1 + 4, 4);
    paramInt1 += 8;
    paramArrayOfByte[paramInt1] = 15;
    paramArrayOfByte[(paramInt1 + 2)] = 3;
    paramArrayOfByte[(paramInt1 + 3)] = -16;
    System.arraycopy(zc.a(paramInt3), 0, paramArrayOfByte, paramInt1 + 4, 4);
    paramInt1 += 8;
    paramArrayOfByte[paramInt1] = 15;
    paramArrayOfByte[(paramInt1 + 2)] = 4;
    paramArrayOfByte[(paramInt1 + 3)] = -16;
    paramArrayOfByte[(paramInt1 + 4)] = 40;
    paramInt1 += 8;
    paramArrayOfByte[paramInt1] = 1;
    paramArrayOfByte[(paramInt1 + 2)] = 9;
    paramArrayOfByte[(paramInt1 + 3)] = -16;
    paramArrayOfByte[(paramInt1 + 4)] = 16;
    paramInt1 += 24;
    paramArrayOfByte[paramInt1] = 2;
    paramArrayOfByte[(paramInt1 + 2)] = 10;
    paramArrayOfByte[(paramInt1 + 3)] = -16;
    paramArrayOfByte[(paramInt1 + 4)] = 8;
    paramInt1 += 8;
    System.arraycopy(zc.a(g()), 0, paramArrayOfByte, paramInt1, 4);
    paramArrayOfByte[(paramInt1 + 4)] = 5;
    paramInt1 += 8;
    return paramInt1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */