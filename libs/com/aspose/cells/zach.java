package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zach
  extends CollectionBase
{
  public zacf a(int paramInt)
  {
    return (zacf)this.InnerList.get(paramInt);
  }
  
  boolean a(StringBuilder paramStringBuilder)
  {
    if (paramStringBuilder.length() != 0) {
      b(paramStringBuilder);
    } else if (getCount() == 0) {
      throw new CellsException(5, "Invalid formula.");
    }
    zacf localzacf1 = (zacf)this.InnerList.get(getCount() - 1);
    if (localzacf1.g() == 2) {
      throw new CellsException(5, "Invalid formula.");
    }
    this.InnerList.remove(getCount() - 1);
    zacf localzacf2 = new zacf();
    localzacf2.a(6);
    localzacf2.a("%");
    localzacf2.a(zaul.c);
    localzacf2.a(localzacf1);
    zf.a(this.InnerList, localzacf2);
    return true;
  }
  
  void a(StringBuilder paramStringBuilder, String paramString, boolean paramBoolean)
  {
    zacf localzacf1 = new zacf();
    localzacf1.a(2);
    localzacf1.a(paramString);
    localzacf1.b = 3;
    if (paramStringBuilder.length() != 0)
    {
      b(paramStringBuilder);
    }
    else if (getCount() == 0)
    {
      localzacf1.a(6);
      if (paramBoolean) {
        localzacf1.a(zaul.a);
      } else {
        localzacf1.a(zaul.b);
      }
    }
    else
    {
      zacf localzacf2 = (zacf)this.InnerList.get(getCount() - 1);
      switch (localzacf2.g())
      {
      case 2: 
        localzacf1.a(6);
        if (paramBoolean) {
          localzacf1.a(zaul.a);
        } else {
          localzacf1.a(zaul.b);
        }
        break;
      case 6: 
        if (localzacf2.b == 3)
        {
          localzacf1.a(6);
          if (paramBoolean) {
            localzacf1.a(zaul.a);
          } else {
            localzacf1.a(zaul.b);
          }
        }
        else if (paramBoolean)
        {
          localzacf1.a(zaul.f);
        }
        else
        {
          localzacf1.a(zaul.g);
        }
        break;
      default: 
        if (paramBoolean) {
          localzacf1.a(zaul.f);
        } else {
          localzacf1.a(zaul.g);
        }
        break;
      }
    }
    zf.a(this.InnerList, localzacf1);
  }
  
  boolean a(StringBuilder paramStringBuilder, String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    if (paramStringBuilder.length() != 0) {
      b(paramStringBuilder);
    } else if (getCount() == 0) {
      throw new CellsException(5, "Invalid formula.");
    }
    zacf localzacf1 = (zacf)this.InnerList.get(getCount() - 1);
    switch (localzacf1.g())
    {
    case 2: 
      throw new CellsException(5, "Invalid formula.");
    case 6: 
      if (localzacf1.b == 3) {
        throw new CellsException(5, "Invalid formula.");
      }
      break;
    }
    zacf localzacf2 = new zacf();
    localzacf2.a(paramString);
    localzacf2.a(paramArrayOfByte);
    localzacf2.a(2);
    localzacf2.b = paramInt;
    zf.a(this.InnerList, localzacf2);
    return true;
  }
  
  boolean a(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte)
  {
    if (paramString1.length() != 0) {
      a(paramString1);
    } else if (getCount() == 0) {
      throw new CellsException(5, "Invalid formula.");
    }
    zacf localzacf1 = (zacf)this.InnerList.get(getCount() - 1);
    switch (localzacf1.g())
    {
    case 2: 
      throw new CellsException(5, "Invalid formula.");
    case 6: 
      if (localzacf1.b == 3) {
        throw new CellsException(5, "Invalid formula.");
      }
      break;
    }
    zacf localzacf2 = new zacf();
    localzacf2.a(paramString2);
    localzacf2.a(paramArrayOfByte);
    localzacf2.a(2);
    localzacf2.b = paramInt;
    zf.a(this.InnerList, localzacf2);
    return true;
  }
  
  void a(zacf paramzacf)
  {
    if (getCount() != 0) {
      for (int i = getCount() - 1; i >= 0; i--)
      {
        zacf localzacf = (zacf)this.InnerList.get(i);
        if ((localzacf.g() != 6) || (localzacf.b != 3)) {
          break;
        }
        localzacf.a(paramzacf);
        paramzacf = localzacf;
        localzacf.b = 0;
        removeAt(i);
      }
    }
    zf.a(this.InnerList, paramzacf);
  }
  
  void a(String paramString)
  {
    Object localObject = new zacf();
    ((zacf)localObject).a(paramString);
    ((zacf)localObject).a(1);
    if (getCount() != 0)
    {
      int i = 1;
      for (int j = getCount() - 1; j >= 0; j--)
      {
        zacf localzacf = (zacf)this.InnerList.get(j);
        if ((localzacf.g() != 6) || (localzacf.b != 3)) {
          break;
        }
        if (i != 0)
        {
          if (("-".equals(localzacf.a())) && (zarb.b(((zacf)localObject).a())))
          {
            localzacf.a(1);
            localzacf.a("-" + ((zacf)localObject).a());
            localzacf.a(null);
          }
          else
          {
            localzacf.a((zacf)localObject);
          }
          i = 0;
        }
        else
        {
          localzacf.a((zacf)localObject);
        }
        localzacf.b = 0;
        localObject = localzacf;
        removeAt(j);
      }
    }
    zf.a(this.InnerList, localObject);
  }
  
  void b(StringBuilder paramStringBuilder)
  {
    Object localObject = new zacf();
    ((zacf)localObject).a(zs.a(paramStringBuilder));
    paramStringBuilder.delete(0, 0 + paramStringBuilder.length());
    ((zacf)localObject).a(1);
    if (getCount() != 0)
    {
      int i = 1;
      for (int j = getCount() - 1; j >= 0; j--)
      {
        zacf localzacf = (zacf)this.InnerList.get(j);
        if ((localzacf.g() != 6) || (localzacf.b != 3)) {
          break;
        }
        if (i != 0)
        {
          if (("-".equals(localzacf.a())) && (zarb.b(((zacf)localObject).a())))
          {
            localzacf.a(1);
            localzacf.a("-" + ((zacf)localObject).a());
            localzacf.a(null);
          }
          else
          {
            localzacf.a((zacf)localObject);
          }
          i = 0;
        }
        else
        {
          localzacf.a((zacf)localObject);
        }
        localzacf.b = 0;
        localObject = localzacf;
        removeAt(j);
      }
    }
    zf.a(this.InnerList, localObject);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zach.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */