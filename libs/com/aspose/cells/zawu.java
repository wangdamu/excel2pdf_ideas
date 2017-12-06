package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.HashMap;

class zawu
{
  ArrayList a;
  boolean[] b;
  boolean[] c;
  zawp d;
  
  zawu(zawp paramzawp)
  {
    this.d = paramzawp;
  }
  
  zawu(zawp paramzawp, int paramInt1, int paramInt2)
  {
    this.d = paramzawp;
    this.a = new ArrayList(paramInt1);
    this.b = new boolean[paramInt2];
    for (int i = 0; i < paramInt1; i++) {
      zf.a(this.a, new Object[paramInt2]);
    }
  }
  
  void a(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    this.a = new ArrayList(i);
    this.b = new boolean[paramInt2];
    this.c = new boolean[paramInt2];
    for (int j = 0; j < this.d.i.size(); j++)
    {
      zbtv localzbtv = (zbtv)this.d.i.get(j);
      if ((!localzbtv.m()) && (j < this.b.length))
      {
        this.b[j] = localzbtv.c();
        this.c[j] = localzbtv.d();
      }
    }
  }
  
  void a(zbtv paramzbtv)
  {
    int[] arrayOfInt = new int[this.d.d()];
    int i = paramzbtv.w();
    if ((this.b == null) || (this.b[i] != 0)) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    HashMap localHashMap = new HashMap();
    int j = -1;
    int k = 0;
    int m = 0;
    int n = 0;
    for (int i1 = 0; i1 < this.a.size(); i1++)
    {
      Object localObject1 = ((Object[])(Object[])this.a.get(i1))[i];
      Object localObject2;
      if (localObject1 == null)
      {
        if (j == -1)
        {
          j = k++;
          localObject2 = new zbos();
          ((zbos)localObject2).a = null;
          zf.a(localArrayList, localObject2);
        }
        if (i1 < arrayOfInt.length) {
          arrayOfInt[i1] = j;
        }
      }
      else
      {
        localObject2 = new boolean[] { m };
        boolean[] arrayOfBoolean = { n };
        localObject1 = this.d.a(localObject1, paramzbtv, (boolean[])localObject2, arrayOfBoolean);
        m = localObject2[0];
        n = arrayOfBoolean[0];
        Object localObject3;
        if (localObject1 == null)
        {
          if (j == -1)
          {
            j = k++;
            localObject3 = new zbos();
            ((zbos)localObject3).a = null;
            zf.a(localArrayList, localObject3);
          }
          if (i1 < arrayOfInt.length) {
            arrayOfInt[i1] = j;
          }
        }
        else
        {
          localObject3 = null;
          if (m != 0) {
            localObject3 = localHashMap.get(((String)localObject1).toUpperCase());
          } else if (n != 0) {
            localObject3 = localHashMap.get(zs.a(localObject1).toUpperCase());
          } else {
            localObject3 = localHashMap.get(localObject1);
          }
          if (localObject3 == null)
          {
            if (i1 < arrayOfInt.length) {
              arrayOfInt[i1] = k;
            }
            if (m != 0) {
              localHashMap.put(((String)localObject1).toUpperCase(), Integer.valueOf(k++));
            } else if (n != 0) {
              localHashMap.put(zs.a(localObject1).toUpperCase(), Integer.valueOf(k++));
            } else {
              localHashMap.put(localObject1, Integer.valueOf(k++));
            }
            zbos localzbos = new zbos();
            localzbos.a = localObject1;
            zf.a(localArrayList, localzbos);
          }
          else if (i1 < arrayOfInt.length)
          {
            arrayOfInt[i1] = ((Integer)localObject3).intValue();
          }
        }
      }
    }
    if (localArrayList.size() < 32767)
    {
      paramzbtv.c = localArrayList;
      paramzbtv.a(true);
    }
    else
    {
      paramzbtv.i(true);
      paramzbtv.c = null;
      return;
    }
    if (arrayOfInt.length > 0)
    {
      this.b[i] = true;
      for (i1 = 0; i1 < this.a.size(); i1++) {
        if (i1 < arrayOfInt.length) {
          ((Object[])this.a.get(i1))[i] = Integer.valueOf(arrayOfInt[i1]);
        }
      }
    }
  }
  
  int a()
  {
    int i = 0;
    for (int j = 0; j < this.b.length; j++) {
      if (this.b[j] != 0) {
        i++;
      }
    }
    return i;
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    int i = a();
    int j = i >= 256 ? 1 : 0;
    if (j == 0) {
      for (int k = 0; k < this.d.i.size(); k++)
      {
        localObject = (zbtv)this.d.i.get(k);
        if ((((zbtv)localObject).c != null) && (((zbtv)localObject).c.size() >= 256) && (((zbtv)localObject).j == null))
        {
          j = 1;
          break;
        }
      }
    }
    byte[] arrayOfByte = null;
    if (j != 0)
    {
      arrayOfByte = new byte[4 + i * 2];
      System.arraycopy(zc.a(i * 2), 0, arrayOfByte, 2, 2);
    }
    else
    {
      arrayOfByte = new byte[4 + i];
      arrayOfByte[2] = ((byte)i);
    }
    arrayOfByte[0] = -56;
    Object localObject = null;
    int m = 0;
    int n = 0;
    for (int i1 = 0; i1 < this.a.size(); i1++)
    {
      Object[] arrayOfObject = (Object[])this.a.get(i1);
      n = 0;
      m = 0;
      Class localClass;
      for (int i2 = 0; i2 < arrayOfObject.length; i2++) {
        if (this.b[i2] != 0)
        {
          if (arrayOfObject[i2] != null)
          {
            if (j != 0) {
              System.arraycopy(zc.a(((Integer)arrayOfObject[i2]).intValue()), 0, arrayOfByte, 4 + m * 2, 2);
            } else {
              arrayOfByte[(4 + m)] = ((byte)ze.f(arrayOfObject[i2]));
            }
            m++;
          }
        }
        else if (arrayOfObject[i2] == null)
        {
          n += 4;
        }
        else
        {
          localClass = arrayOfObject[i2].getClass();
          switch (zaoj.a(localClass))
          {
          case 18: 
            n += 6 + zct.a((String)arrayOfObject[i2]);
            break;
          case 3: 
            n += 6;
            break;
          case 9: 
          case 14: 
          case 16: 
            n += 12;
          }
        }
      }
      paramzrg.a(arrayOfByte);
      if ((localObject == null) || (localObject.length < n)) {
        localObject = new byte[n];
      }
      m = 0;
      for (i2 = 0; i2 < arrayOfObject.length; i2++) {
        if (this.b[i2] == 0) {
          if (arrayOfObject[i2] == null)
          {
            m += zbtv.a((byte[])localObject, m);
          }
          else
          {
            localClass = arrayOfObject[i2].getClass();
            switch (zaoj.a(localClass))
            {
            case 18: 
              m += zbtv.a((byte[])localObject, m, (String)arrayOfObject[i2]);
              break;
            case 3: 
              m += zbtv.a((byte[])localObject, m, ((Boolean)arrayOfObject[i2]).booleanValue());
              break;
            case 16: 
              m += zbtv.a((byte[])localObject, m, (DateTime)arrayOfObject[i2]);
              break;
            case 14: 
              m += zbtv.a((byte[])localObject, m, ((Double)arrayOfObject[i2]).doubleValue());
              break;
            case 9: 
              m += zbtv.a((byte[])localObject, m, ((Integer)arrayOfObject[i2]).intValue());
            }
          }
        }
      }
      paramzrg.a((byte[])localObject, n);
    }
  }
  
  void a(zawu paramzawu)
  {
    if (paramzawu.a != null)
    {
      int i = paramzawu.a.size();
      this.a = new ArrayList(i);
      for (int j = 0; j < i; j++) {
        if ((paramzawu.a.get(j) instanceof Object[])) {
          zf.a(this.a, (Object[])paramzawu.a.get(j));
        } else {
          zf.a(this.a, paramzawu.a.get(j));
        }
      }
    }
    if (null != paramzawu.b)
    {
      this.b = new boolean[paramzawu.b.length];
      System.arraycopy(paramzawu.b, 0, this.b, 0, this.b.length);
    }
    if (null != paramzawu.c)
    {
      this.c = new boolean[paramzawu.c.length];
      System.arraycopy(paramzawu.c, 0, this.c, 0, this.c.length);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */