package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.c.a.za;

class zbk
  extends zcd
{
  zbj a;
  private static final za c = new za(new String[] { "#DIV/0!", "#N/A", "#NAME?", "#NULL!", "#NUM!", "#REF!", "#VALUE!" });
  
  zbk()
  {
    c(158);
    b(24);
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    super.a(paramzrg);
    if (this.a != null) {
      this.a.a(paramzrg);
    }
  }
  
  void a(FilterColumn paramFilterColumn)
    throws Exception
  {
    this.a = null;
    switch (paramFilterColumn.getFilterType())
    {
    case 1: 
    case 5: 
      a(new zxm(paramFilterColumn));
      return;
    case 3: 
      MultipleFilterCollection localMultipleFilterCollection = (MultipleFilterCollection)paramFilterColumn.getFilter();
      if (localMultipleFilterCollection.getCount() < 1)
      {
        a(new zxm(paramFilterColumn));
        return;
      }
      switch (localMultipleFilterCollection.getCount())
      {
      case 0: 
        a(new zxm(paramFilterColumn));
        return;
      case 1: 
        if ((!localMultipleFilterCollection.getMatchBlank()) && ((localMultipleFilterCollection.get(0) instanceof String)))
        {
          a(new zxm(paramFilterColumn));
          return;
        }
        break;
      case 2: 
        if ((!localMultipleFilterCollection.getMatchBlank()) && ((localMultipleFilterCollection.get(0) instanceof String)) && ((localMultipleFilterCollection.get(1) instanceof String)))
        {
          a(new zxm(paramFilterColumn));
          return;
        }
        break;
      }
      this.a = new zbj();
      this.a.a(paramFilterColumn);
      break;
    case 0: 
      break;
    case 2: 
      break;
    }
    this.b = new byte[d()];
    this.b[0] = ((byte)paramFilterColumn.getFieldIndex());
    this.b[2] = 1;
    this.b[5] = 2;
    this.b[12] = 40;
    this.b[13] = 64;
  }
  
  private void a(zxm paramzxm)
    throws Exception
  {
    int i = -1;
    int j = -1;
    String str1 = null;
    String str2 = null;
    if (!paramzxm.d())
    {
      if ((paramzxm.c != 6) && (paramzxm.f != null) && ((paramzxm.f instanceof String)))
      {
        str1 = (String)paramzxm.f;
        if ((str1.length() > 0) && (str1.charAt(0) == '#')) {}
        switch (c.a(str1))
        {
        case 0: 
          i = 7;
          break;
        case 1: 
          i = 42;
          break;
        case 2: 
          i = 29;
          break;
        case 3: 
          i = 0;
          break;
        case 4: 
          i = 36;
          break;
        case 5: 
          i = 23;
          break;
        case 6: 
          i = 15;
          break;
        default: 
          b(d() + (short)(2 * str1.length() + 1));
          break;
          b(d() + (short)(2 * str1.length() + 1));
        }
      }
      if ((paramzxm.d != 6) && (paramzxm.e != null) && ((paramzxm.e instanceof String)))
      {
        str2 = (String)paramzxm.e;
        if ((str2.length() > 0) && (str2.charAt(0) == '#')) {}
        switch (c.a(str1))
        {
        case 0: 
          i = 7;
          break;
        case 1: 
          i = 42;
          break;
        case 2: 
          i = 29;
          break;
        case 3: 
          i = 0;
          break;
        case 4: 
          i = 36;
          break;
        case 5: 
          i = 23;
          break;
        case 6: 
          i = 15;
          break;
        default: 
          b(d() + (short)(2 * str2.length() + 1));
          break;
          b(d() + (short)(2 * str2.length() + 1));
        }
      }
    }
    this.b = new byte[d()];
    this.b[0] = ((byte)paramzxm.a);
    System.arraycopy(zc.a(paramzxm.b), 0, this.b, 2, 2);
    if ((paramzxm.d()) && (paramzxm.f == null)) {
      return;
    }
    if (paramzxm.f == null)
    {
      this.b[2] = 4;
      switch (paramzxm.c)
      {
      case 2: 
        this.b[4] = 12;
        this.b[5] = 2;
        break;
      case 4: 
        this.b[4] = 14;
        this.b[5] = 5;
        break;
      default: 
        this.b[5] = 2;
      }
      return;
    }
    if (paramzxm.c != 6) {
      a(4, paramzxm.c, paramzxm.f, i);
    }
    if (paramzxm.d != 6) {
      a(14, paramzxm.d, paramzxm.e, j);
    }
    int k = 24;
    if ((i == -1) && (str1 != null))
    {
      this.b[24] = 1;
      System.arraycopy(Encoding.getUnicode().a(str1), 0, this.b, 25, str1.length() * 2);
      k += 1 + str1.length() * 2;
    }
    if ((i == -1) && (str2 != null))
    {
      this.b[k] = 1;
      System.arraycopy(Encoding.getUnicode().a(str2), 0, this.b, k + 1, str2.length() * 2);
      k += 1 + str2.length() * 2;
    }
  }
  
  private void a(int paramInt1, int paramInt2, Object paramObject, int paramInt3)
  {
    switch (paramInt2)
    {
    case 2: 
      this.b[(paramInt1 + 1)] = 2;
      break;
    case 4: 
      this.b[(paramInt1 + 1)] = 5;
      break;
    case 3: 
      this.b[(paramInt1 + 1)] = 4;
      break;
    case 5: 
      this.b[(paramInt1 + 1)] = 6;
      break;
    case 1: 
      this.b[(paramInt1 + 1)] = 1;
      break;
    case 0: 
      this.b[(paramInt1 + 1)] = 3;
    }
    if (paramInt3 != -1)
    {
      this.b[paramInt1] = 8;
      this.b[(paramInt1 + 2)] = ((byte)paramInt3);
      this.b[(paramInt1 + 3)] = 1;
    }
    else if (paramObject == null)
    {
      switch (paramInt2)
      {
      case 2: 
        this.b[paramInt1] = 12;
        break;
      case 4: 
        this.b[paramInt1] = 14;
        break;
      default: 
        this.b[paramInt1] = 6;
        this.b[(paramInt1 + 6)] = 0;
        break;
      }
    }
    else
    {
      switch (zaoj.a(paramObject.getClass()))
      {
      case 18: 
        this.b[paramInt1] = 6;
        this.b[(paramInt1 + 6)] = ((byte)((String)paramObject).length());
        break;
      case 14: 
        this.b[paramInt1] = 4;
        System.arraycopy(zc.a(((Double)paramObject).doubleValue()), 0, this.b, paramInt1 + 2, 8);
        break;
      case 9: 
        this.b[paramInt1] = 4;
        System.arraycopy(zc.a(((Integer)paramObject).intValue()), 0, this.b, paramInt1 + 2, 8);
        break;
      case 3: 
        this.b[paramInt1] = 8;
        this.b[(paramInt1 + 2)] = ((byte)(((Boolean)paramObject).booleanValue() ? 1 : 0));
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */