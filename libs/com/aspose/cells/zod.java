package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.zw;

class zod
  extends zny
{
  private boolean d;
  private String e;
  private zajk f;
  
  zod(zaca paramzaca, zabi paramzabi, String paramString, boolean paramBoolean)
  {
    super(paramzaca, paramzabi);
    this.e = paramString;
    if ("".equals(paramString))
    {
      this.d = true;
      this.f = new zbsp("");
    }
    else
    {
      this.d = false;
      if ((paramBoolean) && ((this.b) || (this.c))) {
        this.f = a(paramString);
      } else {
        this.f = new zbsp(paramString);
      }
    }
  }
  
  static zajk a(String paramString)
  {
    char[] arrayOfChar1 = paramString.toUpperCase().toCharArray();
    char[] arrayOfChar2 = null;
    int i = 0;
    int j = 0;
    for (int k = 0; k < arrayOfChar1.length; k++) {
      switch (arrayOfChar1[k])
      {
      case '*': 
        if (j < 1)
        {
          arrayOfChar2 = new char[arrayOfChar1.length];
          j = k + 1;
          System.arraycopy(arrayOfChar1, 0, arrayOfChar2, 0, j);
        }
        else if (arrayOfChar1[(k - 1)] != '*')
        {
          arrayOfChar2[(j++)] = '*';
        }
        break;
      case '?': 
        if (j < 1)
        {
          arrayOfChar2 = new char[arrayOfChar1.length];
          j = k + 1;
          System.arraycopy(arrayOfChar1, 0, arrayOfChar2, 0, j);
        }
        else
        {
          arrayOfChar2[(j++)] = '?';
        }
        break;
      case '~': 
        k++;
        if (k == arrayOfChar1.length)
        {
          if (j > 0) {
            arrayOfChar2[(j++)] = '~';
          }
        }
        else if (arrayOfChar1[k] == '~')
        {
          if (j > 0) {
            arrayOfChar2[(j++)] = '~';
          } else {
            i = 1;
          }
        }
        else if (j > 0)
        {
          arrayOfChar2[(j++)] = '~';
          arrayOfChar2[(j++)] = arrayOfChar1[k];
        }
        else if ((i == 0) && ((arrayOfChar1[k] == '*') || (arrayOfChar1[k] == '?')))
        {
          i = 1;
        }
        break;
      default: 
        if (j > 0) {
          arrayOfChar2[(j++)] = arrayOfChar1[k];
        }
        break;
      }
    }
    if (j > 0)
    {
      if (j < arrayOfChar2.length)
      {
        arrayOfChar1 = new char[j];
        System.arraycopy(arrayOfChar2, 0, arrayOfChar1, 0, j);
        return new zbsq(arrayOfChar1);
      }
      return new zbsq(arrayOfChar2);
    }
    if (i != 0)
    {
      arrayOfChar2 = new char[arrayOfChar1.length];
      for (k = 0; k < arrayOfChar1.length; k++) {
        if (arrayOfChar1[k] == '~')
        {
          k++;
          if (k < arrayOfChar1.length)
          {
            int m = arrayOfChar1[k];
            if ((m == 42) || (m == 63) || (m == 126)) {
              arrayOfChar2[(j++)] = m;
            }
          }
        }
        else
        {
          arrayOfChar2[(j++)] = arrayOfChar1[k];
        }
      }
      return new zbsp(new String(arrayOfChar2, 0, j));
    }
    return new zbsp(paramString);
  }
  
  public int a()
  {
    return 2;
  }
  
  public zaie b()
  {
    if (this.d) {
      return zabp.a;
    }
    return new zabp(this.e);
  }
  
  public boolean a(zaie paramzaie)
  {
    switch (paramzaie.b())
    {
    case 2: 
      return b(paramzaie);
    case 1: 
      return b(((zaba)paramzaie).o() ? zabp.b : zabp.c);
    case 12: 
      if (this.b) {
        return this.d;
      }
      if (this.c) {
        return !this.d;
      }
      return false;
    }
    return this.c;
  }
  
  public boolean b(zaie paramzaie)
  {
    return this.a.a(-this.f.b(((zabp)paramzaie).o()));
  }
  
  public int c(zaie paramzaie)
  {
    return zw.a(((zabp)paramzaie).o(), this.e, true);
  }
  
  static int a(zaie paramzaie, String paramString, zaca paramzaca)
  {
    switch (paramzaie.b())
    {
    case 1: 
      if (a(paramzaca))
      {
        if (((zaba)paramzaie).o()) {
          return 1;
        }
        return 0;
      }
      return 1;
    case 3: 
      if (a(paramzaca)) {
        return ((zabb)paramzaie).s();
      }
      return -1;
    case 2: 
      return zw.a(((zabp)paramzaie).o(), paramString, true);
    case 12: 
      return ("".equals(paramString)) || (a(paramzaca)) ? 0 : -1;
    }
    if (paramzaca.p.L.n.a) {
      zl.a("Unsupported node type to compare with String: " + paramzaie.b());
    }
    return -1;
  }
  
  static boolean b(zaie paramzaie, String paramString, zaca paramzaca)
  {
    switch (paramzaie.b())
    {
    case 1: 
      if (a(paramzaca)) {
        return !((zaba)paramzaie).o();
      }
      return false;
    case 3: 
      if (a(paramzaca)) {
        return ((zabb)paramzaie).q();
      }
      return false;
    case 2: 
      return zy.a(paramString, ((zabp)paramzaie).o());
    case 12: 
      return ("".equals(paramString)) || (a(paramzaca));
    case 0: 
      return false;
    }
    if (paramzaca.p.L.n.a) {
      zl.a("Unsupported node type to compare with String: " + paramzaie.b());
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */