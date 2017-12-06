package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

class zawq
  extends CollectionBase
{
  WorksheetCollection a;
  int b;
  
  zawq(WorksheetCollection paramWorksheetCollection)
  {
    this.a = paramWorksheetCollection;
    this.b = 0;
  }
  
  void a()
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zawp localzawp = (zawp)localIterator.next();
      localzawp.f.b();
    }
  }
  
  zawp a(long paramLong)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      zawp localzawp = (zawp)this.InnerList.get(i);
      if (localzawp.c == (paramLong & 0xFFFFFFFF)) {
        return localzawp;
      }
    }
    return null;
  }
  
  int a(String paramString, Worksheet paramWorksheet, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      int i = a((byte)1, new String[] { paramString });
      if (i != -1) {
        return i;
      }
    }
    this.b += 1;
    zaws localzaws = new zaws(this, (byte)1, new String[] { paramString }, null, false, this.b, paramWorksheet);
    return a(localzaws);
  }
  
  int a(zawp paramzawp)
  {
    zf.a(this.InnerList, paramzawp);
    return getCount() - 1;
  }
  
  int a(byte paramByte, String[] paramArrayOfString, boolean paramBoolean, PivotPageFields paramPivotPageFields)
  {
    int i = a((byte)1, paramArrayOfString);
    if (i != -1) {
      return i;
    }
    this.b += 1;
    zaws localzaws = new zaws(this, paramByte, paramArrayOfString, paramPivotPageFields, paramBoolean, this.b, null);
    return a(localzaws);
  }
  
  public zawp a(int paramInt)
  {
    return (zawp)this.InnerList.get(paramInt);
  }
  
  public int a(byte paramByte, String[] paramArrayOfString)
  {
    int i = -1;
    int j = 0;
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zawp localzawp = (zawp)localIterator.next();
      i++;
      j = 1;
      String[] arrayOfString = localzawp.e();
      if (arrayOfString != null)
      {
        if ((localzawp.a() == paramByte) || (arrayOfString.length == paramArrayOfString.length)) {
          for (int k = 0; k < paramArrayOfString.length; k++) {
            if (!paramArrayOfString[k].equals(arrayOfString[k]))
            {
              j = 0;
              break;
            }
          }
        }
        if (j != 0) {
          return i;
        }
      }
    }
    return -1;
  }
  
  zawp a(zawp paramzawp, Worksheet paramWorksheet, CopyOptions paramCopyOptions)
  {
    if (paramzawp.e.a == this.a) {
      return paramzawp;
    }
    int i = a(paramzawp.a(), paramzawp.e());
    if (i != -1) {
      return a(i);
    }
    this.b += 1;
    zaws localzaws = new zaws(this);
    localzaws.b = this.b;
    localzaws.a(paramzawp, paramCopyOptions);
    a(localzaws);
    return localzaws;
  }
  
  void a(int paramInt1, int paramInt2, Worksheet paramWorksheet)
  {
    for (int i = 0; i < getCount(); i++)
    {
      zawp localzawp = a(i);
      localzawp.b(paramInt1, paramInt2, paramWorksheet);
    }
  }
  
  void b(zawp paramzawp)
  {
    zf.a(this.InnerList, paramzawp);
  }
  
  zawp b(int paramInt)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      zawp localzawp = (zawp)this.InnerList.get(i);
      if (localzawp.b == paramInt) {
        return localzawp;
      }
    }
    return null;
  }
  
  void c(zawp paramzawp)
  {
    this.InnerList.remove(paramzawp);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */