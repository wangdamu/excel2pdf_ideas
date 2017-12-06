package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class zbuh
  extends zcd
{
  private ArrayList a;
  
  zbuh()
  {
    c(181);
  }
  
  void a(ArrayList paramArrayList)
  {
    this.a = null;
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      b(8);
      this.b = new byte[d()];
      return;
    }
    int[] arrayOfInt1 = (int[])paramArrayList.get(0);
    int i = arrayOfInt1.length * 2;
    int j = 8224 / i;
    int k = 8224 % i;
    int m = 0;
    Object localObject;
    if (j >= paramArrayList.size())
    {
      a((short)(i * paramArrayList.size()));
      this.b = new byte[d()];
      localObject = paramArrayList.iterator();
      while (((Iterator)localObject).hasNext())
      {
        int[] arrayOfInt2 = (int[])((Iterator)localObject).next();
        a(arrayOfInt2, this.b, m);
        m += i;
      }
      return;
    }
    int n;
    int i3;
    if (k == 0)
    {
      this.a = new ArrayList();
      localObject = null;
      for (n = 0; n < paramArrayList.size(); n++)
      {
        if (n == 0)
        {
          a((short)(j * i));
          this.b = new byte[d()];
          localObject = this.b;
        }
        else if (n % j == 0)
        {
          znt localznt1 = new znt();
          int i2 = paramArrayList.size() - n;
          i3 = (i2 > j ? j : i2) * i;
          localObject = new byte[i3];
          localznt1.b((byte[])localObject);
          zf.a(this.a, localznt1);
          m = 0;
        }
        a((int[])paramArrayList.get(n), (byte[])localObject, m);
        m += i;
      }
    }
    else
    {
      this.a = new ArrayList();
      localObject = null;
      n = 0;
      int i1 = 0;
      while (i1 < paramArrayList.size())
      {
        if (i1 == 0)
        {
          a((short)8224);
          this.b = new byte[d()];
          localObject = this.b;
        }
        else if (n == j)
        {
          int[] arrayOfInt3 = (int[])paramArrayList.get(i1);
          for (i3 = 0; i3 < k / 2; i3++)
          {
            System.arraycopy(zc.a(arrayOfInt3[i3]), 0, localObject, m, 2);
            m += 2;
          }
          znt localznt2 = new znt();
          int i4 = i - k;
          n = -1;
          j = (8224 - i4) / i;
          k = (8224 - i4) % i;
          int i5 = paramArrayList.size() - i1 - 1;
          int i6 = i5 > j ? 8224 : i5 * i + i4;
          localObject = new byte[i6];
          localznt2.b((byte[])localObject);
          zf.a(this.a, localznt2);
          m = 0;
          while (i3 < arrayOfInt3.length)
          {
            System.arraycopy(zc.a(arrayOfInt3[i3]), 0, localObject, m, 2);
            m += 2;
            i3++;
          }
        }
        a((int[])paramArrayList.get(i1), (byte[])localObject, m);
        m += i;
        i1++;
        n++;
      }
    }
  }
  
  static void a(int[] paramArrayOfInt, byte[] paramArrayOfByte, int paramInt)
  {
    for (int i = 0; i < paramArrayOfInt.length; i++)
    {
      if (paramArrayOfInt[i] != 0) {
        System.arraycopy(zc.a(paramArrayOfInt[i]), 0, paramArrayOfByte, paramInt, 2);
      }
      paramInt += 2;
    }
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    super.a(paramzrg);
    if (this.a != null)
    {
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        znt localznt = (znt)localIterator.next();
        localznt.a(paramzrg);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbuh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */