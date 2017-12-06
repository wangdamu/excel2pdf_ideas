package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zapt
{
  ArrayList a;
  private int c;
  private boolean d;
  byte[] b;
  private boolean e;
  private boolean f = true;
  private boolean g = true;
  private boolean h = false;
  
  zapt(int paramInt)
  {
    this.c = paramInt;
    this.d = true;
    this.e = true;
  }
  
  void a(WorksheetCollection paramWorksheetCollection, Worksheet paramWorksheet, String paramString)
  {
    if ((this.a != null) && (this.a.size() > 0)) {
      for (i = 0; i < this.a.size(); i++)
      {
        byte[] arrayOfByte = (byte[])this.a.get(i);
        if (arrayOfByte[0] == 4) {
          return;
        }
      }
    }
    int i = paramString.lastIndexOf("!");
    int j = 0;
    int k = 0;
    int m = -1;
    int n = paramWorksheetCollection.v();
    if (i == -1)
    {
      j = paramWorksheetCollection.r().f(paramWorksheetCollection.v(), 65534, 65534);
      m = -1;
    }
    else
    {
      localObject = paramString.substring(0, 0 + i);
      paramString = paramString.substring(i + 1);
      int[] arrayOfInt = zaap.a(paramWorksheetCollection, (String)localObject, true);
      if (arrayOfInt == null) {
        return;
      }
      j = arrayOfInt[0];
      n = arrayOfInt[1];
      m = arrayOfInt[2];
    }
    if (n == paramWorksheetCollection.v())
    {
      k = paramWorksheetCollection.getNames().a(m, paramString);
      localObject = paramWorksheetCollection.getNames().get(k);
      ((Name)localObject).b(1);
      ((Name)localObject).b(true);
    }
    else
    {
      localObject = paramWorksheetCollection.w().a(n);
      k = ((zbti)localObject).a(paramWorksheetCollection, paramString);
    }
    Object localObject = { 4, 0, 14, 0, 7, 0, 0, 0, 0, 0, 57, 0, 0, 0, 0, 0, 0, 0 };
    int i1 = 11;
    System.arraycopy(zc.a(j), 0, localObject, i1, 2);
    System.arraycopy(zc.a(k + 1), 0, localObject, i1 + 2, 2);
    this.b = ((byte[])localObject);
  }
  
  void a(byte[] paramArrayOfByte, HashMap paramHashMap, WorksheetCollection paramWorksheetCollection)
  {
    int i = zc.e(paramArrayOfByte, 4) & 0xFFFF;
    int j = 10;
    int k = 0;
    if ((paramArrayOfByte[j] == 25) && (paramArrayOfByte[(j + 1)] == 64)) {
      j += 4;
    }
    int m;
    switch (paramArrayOfByte[j] & 0xFF & 0x1F)
    {
    case 3: 
      j++;
      k = (zc.e(paramArrayOfByte, j) & 0xFFFF) - 1;
      if (paramHashMap.get(Integer.valueOf(k)) != null)
      {
        m = ((Integer)paramHashMap.get(Integer.valueOf(k))).intValue() + 1;
        System.arraycopy(zc.a(m), 0, paramArrayOfByte, j, 2);
      }
      break;
    case 25: 
      j++;
      m = zc.e(paramArrayOfByte, j) & 0xFFFF;
      j += 2;
      int n = paramWorksheetCollection.r().c(m);
      k = (zc.e(paramArrayOfByte, j) & 0xFFFF) - 1;
      if ((n == paramWorksheetCollection.v()) && (paramHashMap.get(Integer.valueOf(k)) != null))
      {
        int i1 = ((Integer)paramHashMap.get(Integer.valueOf(k))).intValue() + 1;
        System.arraycopy(zc.a(i1), 0, paramArrayOfByte, j, 2);
      }
      break;
    }
  }
  
  void a(HashMap paramHashMap, WorksheetCollection paramWorksheetCollection)
  {
    if (this.a != null)
    {
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        byte[] arrayOfByte = (byte[])localIterator.next();
        switch (arrayOfByte[0])
        {
        case 4: 
          a(arrayOfByte, paramHashMap, paramWorksheetCollection);
          break;
        case 9: 
          int i = zc.e(arrayOfByte, 4) & 0xFFFF;
          if (i != 0)
          {
            i = zc.e(arrayOfByte, 6) & 0xFFFF;
            zaaq.b(arrayOfByte, 12, 12 + i, paramHashMap, paramWorksheetCollection);
          }
        }
      }
    }
    if (this.b != null) {
      a(this.b, paramHashMap, paramWorksheetCollection);
    }
  }
  
  boolean a(byte[] paramArrayOfByte, WorksheetCollection paramWorksheetCollection, int paramInt)
  {
    int i = zc.e(paramArrayOfByte, 4) & 0xFFFF;
    int j = 10;
    int k = 0;
    if ((paramArrayOfByte[j] == 25) && (paramArrayOfByte[(j + 1)] == 64)) {
      j += 4;
    }
    switch (paramArrayOfByte[j] & 0xFF & 0x1F)
    {
    case 3: 
      j++;
      k = (zc.e(paramArrayOfByte, j) & 0xFFFF) - 1;
      return paramInt == k;
    case 25: 
      j++;
      int m = zc.e(paramArrayOfByte, j) & 0xFFFF;
      j += 2;
      int n = paramWorksheetCollection.r().c(m);
      k = (zc.e(paramArrayOfByte, j) & 0xFFFF) - 1;
      if (n == paramWorksheetCollection.v()) {
        return k == paramInt;
      }
      return false;
    }
    return false;
  }
  
  boolean a(WorksheetCollection paramWorksheetCollection, int paramInt)
  {
    if ((this.a != null) && (this.a.size() > 0)) {
      for (int i = 0; i < this.a.size(); i++)
      {
        byte[] arrayOfByte = (byte[])this.a.get(i);
        if ((arrayOfByte[0] == 4) && (a(arrayOfByte, paramWorksheetCollection, paramInt))) {
          return true;
        }
      }
    }
    return (this.b != null) && (a(this.b, paramWorksheetCollection, paramInt));
  }
  
  String a(WorksheetCollection paramWorksheetCollection)
  {
    if ((this.a != null) && (this.a.size() > 0)) {
      for (int i = 0; i < this.a.size(); i++)
      {
        byte[] arrayOfByte = (byte[])this.a.get(i);
        if (arrayOfByte[0] == 4)
        {
          int j = zc.e(arrayOfByte, 4) & 0xFFFF;
          int k = 10;
          int m = 0;
          if ((arrayOfByte[k] == 25) && (arrayOfByte[(k + 1)] == 64)) {
            k += 4;
          }
          switch (arrayOfByte[k] & 0xFF & 0x1F)
          {
          case 3: 
            k++;
            m = (zc.e(arrayOfByte, k) & 0xFFFF) - 1;
            if (m >= paramWorksheetCollection.getNames().getCount()) {
              return null;
            }
            Name localName = paramWorksheetCollection.getNames().get(m);
            return "[0]!" + localName.getText();
          case 25: 
            k++;
            int n = zc.e(arrayOfByte, k) & 0xFFFF;
            k += 2;
            int i1 = paramWorksheetCollection.r().c(n);
            m = (zc.e(arrayOfByte, k) & 0xFFFF) - 1;
            if (i1 == paramWorksheetCollection.v())
            {
              if (m >= paramWorksheetCollection.getNames().getCount()) {
                return null;
              }
              localObject = paramWorksheetCollection.getNames().get(m);
              return "[0]!" + ((Name)localObject).getText();
            }
            Object localObject = (zwh)paramWorksheetCollection.w().a(i1).b().get(m);
            if (i1 < paramWorksheetCollection.v()) {
              i1++;
            }
            return "[" + i1 + "]!" + ((zwh)localObject).e();
          }
        }
      }
    }
    return null;
  }
  
  void a(zapt paramzapt)
  {
    this.d = paramzapt.d;
    this.e = paramzapt.e;
    this.f = paramzapt.f;
    this.g = paramzapt.g;
    if (paramzapt.a != null)
    {
      this.a = new ArrayList();
      Iterator localIterator = paramzapt.a.iterator();
      while (localIterator.hasNext())
      {
        byte[] arrayOfByte1 = (byte[])localIterator.next();
        byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
        zf.a(this.a, arrayOfByte2);
      }
    }
  }
  
  boolean a()
  {
    return this.d;
  }
  
  void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  boolean b()
  {
    return this.e;
  }
  
  void b(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  boolean c()
  {
    return this.f;
  }
  
  void c(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  boolean d()
  {
    return this.g;
  }
  
  void d(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  boolean e()
  {
    return this.h;
  }
  
  void e(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  int f()
  {
    return this.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zapt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */