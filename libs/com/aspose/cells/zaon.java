package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class zaon
  extends zcd
{
  zapv a;
  int c;
  
  zaon(zapv paramzapv)
  {
    c(236);
    this.a = paramzapv;
  }
  
  void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.c = paramInt2;
    this.b = new byte[this.c];
    System.arraycopy(paramArrayOfByte, paramInt1, this.b, 0, paramInt2);
  }
  
  void a()
  {
    this.c = 8;
    this.b = new byte[8];
    this.b[2] = 13;
    this.b[3] = -16;
  }
  
  void a(ShapeCollection paramShapeCollection)
  {
    zsc localzsc = paramShapeCollection.d();
    int i = localzsc.f();
    int j = 48;
    for (int k = 0; k < paramShapeCollection.getCount(); k++) {
      j += 48 + paramShapeCollection.get(k).R().d().d();
    }
    k = i + j;
    if ((this.a != null) && (this.a.a != null)) {
      k += this.a.a.length;
    }
    this.c = (k + 8);
    this.b = new byte[this.c];
    int m = localzsc.a(this.b, 0, k, j);
    Iterator localIterator = paramShapeCollection.iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      Picture localPicture = (Picture)localShape;
      this.b[m] = 15;
      this.b[(m + 2)] = 4;
      this.b[(m + 3)] = -16;
      System.arraycopy(zc.a(40 + localPicture.R().d().d()), 0, this.b, m + 4, 4);
      m += 8;
      this.b[m] = -78;
      this.b[(m + 1)] = 4;
      this.b[(m + 2)] = 10;
      this.b[(m + 3)] = -16;
      this.b[(m + 4)] = 8;
      m += 8;
      System.arraycopy(zc.a(localPicture.R().j().c()), 0, this.b, m, 4);
      System.arraycopy(zc.a(localPicture.R().j().d()), 0, this.b, m + 4, 4);
      m += 8;
      m += localPicture.R().d().a(localShape, this.b, m, false);
      this.b[(m + 2)] = 16;
      this.b[(m + 3)] = -16;
      this.b[(m + 4)] = 8;
      m += 8;
      System.arraycopy(zc.a(localPicture.getWidth()), 0, this.b, m, 4);
      System.arraycopy(zc.a(localPicture.getHeight()), 0, this.b, m + 4, 4);
      m += 8;
    }
    if ((this.a != null) && (this.a.a != null)) {
      System.arraycopy(this.a.a, 0, this.b, m, this.a.a.length);
    }
  }
  
  int a(ShapeCollection paramShapeCollection, Shape paramShape)
  {
    zsc localzsc = paramShapeCollection.d();
    int i = localzsc.f();
    this.c = (i + 8 + 48);
    if (paramShapeCollection.getCount() != 0)
    {
      this.c += paramShape.X();
      if (paramShape.F()) {
        this.c -= 8;
      }
    }
    this.b = new byte[this.c];
    int j = 0;
    int k = (int)(localzsc.e() & 0xFFFFFFFF);
    int m = i + k;
    if ((this.a != null) && (this.a.a != null)) {
      m += this.a.a.length;
    }
    j = localzsc.a(this.b, j, m, k);
    return j;
  }
  
  void a(int paramInt, Shape paramShape)
  {
    byte[] arrayOfByte = { 15, 0, 4, -16, 82, 0, 0, 0, -110, 12, 10, -16, 8, 0, 0, 0, 5, 8, 0, 0, 0, 10, 0, 0, 67, 0, 11, -16, 24, 0, 0, 0, Byte.MAX_VALUE, 0, 4, 1, 4, 1, -65, 0, 8, 0, 8, 0, -1, 1, 0, 0, 8, 0, -65, 3, 0, 0, 2, 0, 0, 0, 16, -16, 18, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 17, -16, 0, 0, 0, 0 };
    System.arraycopy(zc.a(paramShape.R().j().c()), 0, arrayOfByte, 16, 4);
    if (paramInt == 0)
    {
      this.c = arrayOfByte.length;
      this.b = arrayOfByte;
    }
    else
    {
      System.arraycopy(arrayOfByte, 0, this.b, paramInt, arrayOfByte.length);
    }
  }
  
  void a(Shape paramShape, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt1 != 0) {
      a(paramInt1, paramShape);
    } else if ((this.c > 90) || (this.b == null)) {
      a(0, paramShape);
    } else {
      System.arraycopy(zc.a(paramShape.R().j().c()), 0, this.b, 16, 4);
    }
    paramInt1 = this.c - 24;
    this.b[paramInt1] = ((byte)paramInt3);
    if (paramInt4 > 255) {
      this.b[9] = 1;
    } else {
      this.b[(paramInt1 + 8)] = ((byte)paramInt4);
    }
    System.arraycopy(zc.a(paramInt2), 0, this.b, paramInt1 + 4, 2);
    System.arraycopy(zc.a((paramInt2 & 0xFFFF) + 1), 0, this.b, paramInt1 + 12, 2);
  }
  
  void a(Shape paramShape, int paramInt1, int paramInt2, byte paramByte)
  {
    a(paramInt1, paramShape);
    paramInt1 = this.c - 24;
    this.b[paramInt1] = paramByte;
    this.b[(paramInt1 + 8)] = ((byte)((paramByte & 0xFF) + 1));
    this.b[(paramInt1 + 11)] = 1;
    System.arraycopy(zc.a(paramInt2), 0, this.b, paramInt1 + 4, 2);
    System.arraycopy(zc.a(paramInt2 + 1), 0, this.b, paramInt1 + 12, 2);
  }
  
  void a(Shape paramShape, int paramInt, ArrayList paramArrayList)
  {
    if (this.b == null)
    {
      this.c = paramShape.X();
      if (paramShape.F()) {
        this.c -= 8;
      }
      this.b = new byte[this.c];
      paramInt = 0;
    }
    zbrf localzbrf = null;
    if (paramShape.isGroup())
    {
      this.b[paramInt] = 15;
      this.b[(paramInt + 2)] = 3;
      this.b[(paramInt + 3)] = -16;
      System.arraycopy(zc.a(((GroupShape)paramShape).c()), 0, this.b, paramInt + 4, 4);
      paramInt += 8;
      localzbrf = ((GroupShape)paramShape).a();
      zf.a(paramArrayList, localzbrf);
    }
    paramInt = paramShape.R().a(this.b, paramInt, localzbrf);
    if (paramShape.W())
    {
      if (paramShape.isGroup()) {
        localzbrf = (zbrf)paramArrayList.get(paramArrayList.size() - 2);
      } else {
        localzbrf = (zbrf)paramArrayList.get(paramArrayList.size() - 1);
      }
      paramInt += paramShape.a(this.b, paramInt, localzbrf);
    }
    else
    {
      paramInt += paramShape.a(this.b, paramInt);
    }
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    byte[] arrayOfByte = new byte[4];
    System.arraycopy(zc.a(f()), 0, arrayOfByte, 0, 2);
    if (this.c < 8224)
    {
      System.arraycopy(zc.a(this.c), 0, arrayOfByte, 2, 2);
      paramzrg.a(arrayOfByte);
      if ((this.b != null) && (this.b.length != 0)) {
        paramzrg.a(this.b);
      }
    }
    else
    {
      System.arraycopy(zc.a((short)8224), 0, arrayOfByte, 2, 2);
      paramzrg.a(arrayOfByte);
      paramzrg.a(this.b, 0, 8224);
      int i = this.c - 8224;
      int j = 8224;
      System.arraycopy(zc.a(60), 0, arrayOfByte, 0, 2);
      for (;;)
      {
        if (i < 8224)
        {
          System.arraycopy(zc.a(i), 0, arrayOfByte, 2, 2);
          paramzrg.a(arrayOfByte);
          paramzrg.a(this.b, j, i);
          break;
        }
        paramzrg.a(arrayOfByte);
        paramzrg.a(this.b, j, 8224);
        j += 8224;
        i -= 8224;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */