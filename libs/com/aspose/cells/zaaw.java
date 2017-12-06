package com.aspose.cells;

import com.aspose.cells.a.c.zc;

class zaaw
  extends zaav
{
  private zaie[] a;
  private zaie b;
  private int c;
  private int d;
  private boolean e;
  private int f;
  private int g;
  
  public zaaw(zaie[] paramArrayOfzaie, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, zaie paramzaie)
  {
    this.a = paramArrayOfzaie;
    this.e = paramBoolean;
    this.g = paramInt1;
    this.c = paramInt2;
    this.f = paramInt3;
    this.d = paramInt4;
    this.b = paramzaie;
  }
  
  int o()
  {
    return this.e ? this.c : this.d;
  }
  
  int p()
  {
    return this.e ? this.d : this.c;
  }
  
  zaie[] a(int paramInt)
  {
    if (this.e)
    {
      arrayOfzaie = new zaie[this.d];
      zc.a(arrayOfzaie, 0, arrayOfzaie.length, this.b);
      paramInt += this.g;
      if ((paramInt >= 0) && (paramInt < this.a.length)) {
        arrayOfzaie[this.f] = this.a[paramInt];
      }
      return arrayOfzaie;
    }
    if (paramInt == this.f)
    {
      if ((this.g == 0) && (this.c == this.a.length)) {
        return this.a;
      }
      arrayOfzaie = new zaie[this.c];
      if ((this.g >= 0) && (this.g + this.c <= this.a.length))
      {
        System.arraycopy(this.a, this.g, arrayOfzaie, 0, this.c);
        return arrayOfzaie;
      }
      zc.a(arrayOfzaie, 0, arrayOfzaie.length, this.b);
      System.arraycopy(this.a, Math.max(0, this.g), arrayOfzaie, Math.max(0, -this.g), Math.min(this.g + this.c, this.a.length));
      return arrayOfzaie;
    }
    zaie[] arrayOfzaie = new zaie[this.c];
    zc.a(arrayOfzaie, 0, arrayOfzaie.length, this.b);
    return arrayOfzaie;
  }
  
  public Object c()
  {
    return this.a;
  }
  
  public Object b(zaca paramzaca)
  {
    Object[][] arrayOfObject;
    if (this.e) {
      arrayOfObject = new Object[this.c][];
    } else {
      arrayOfObject = new Object[this.d][];
    }
    for (int i = 0; i < arrayOfObject.length; i++)
    {
      zaie[] arrayOfzaie = a(i);
      Object[] arrayOfObject1 = new Object[arrayOfzaie.length];
      arrayOfObject[i] = arrayOfObject1;
      for (int j = 0; j < arrayOfzaie.length; j++) {
        arrayOfObject1[j] = arrayOfzaie[j].b(paramzaca);
      }
    }
    return arrayOfObject;
  }
  
  public int b(zaca paramzaca, int paramInt)
  {
    if ((paramInt != 96) && ((this.c > 1) || (this.d > 1))) {
      return 1;
    }
    return 0;
  }
  
  public zaie e(zaca paramzaca)
  {
    if ((this.g < 0) || (this.f != 0)) {
      return this.b;
    }
    return this.a[this.g];
  }
  
  public zaiw a(zaca paramzaca, boolean paramBoolean)
  {
    if ((this.c == 1) || (this.d == 1)) {
      return new zayq(this.a, this.e, this.g, this.c, 6, this.b, 0, false);
    }
    return new zayt(this.a, this.e, this.g, this.c, this.f, this.d, 6, this.b, 0, 0, false, false);
  }
  
  public boolean f(zaca paramzaca)
  {
    return (this.d > 1) || (this.c > 1);
  }
  
  public boolean g(zaca paramzaca)
  {
    if (this.e) {
      return this.c == 1;
    }
    return this.d == 1;
  }
  
  public boolean h(zaca paramzaca)
  {
    if (this.e) {
      return this.d == 1;
    }
    return this.c == 1;
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca, boolean paramBoolean)
  {
    int i;
    if (this.e)
    {
      if (paramArrayOfInt[1] == this.f)
      {
        i = paramArrayOfInt[0] + this.g;
        if ((i >= 0) && (i < this.a.length))
        {
          paramArrayOfInt[0] = this.c;
          paramArrayOfInt[1] = this.d;
          return this.a[i];
        }
      }
      paramArrayOfInt[0] = this.c;
      paramArrayOfInt[1] = this.d;
      return this.b;
    }
    if (paramArrayOfInt[0] == this.f)
    {
      i = paramArrayOfInt[1] + this.g;
      if ((i >= 0) && (i < this.a.length))
      {
        paramArrayOfInt[0] = this.d;
        paramArrayOfInt[1] = this.c;
        return this.a[i];
      }
    }
    paramArrayOfInt[0] = this.d;
    paramArrayOfInt[1] = this.c;
    return this.b;
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca)
  {
    if (this.e)
    {
      if (this.c == 1)
      {
        paramArrayOfInt[0] = 1;
        return this;
      }
      int i = paramArrayOfInt[0] + this.g;
      paramArrayOfInt[0] = this.c;
      if ((i >= 0) && (i < this.a.length))
      {
        zaie[] arrayOfzaie = new zaie[this.d];
        zc.a(arrayOfzaie, 0, arrayOfzaie.length, this.b);
        arrayOfzaie[this.f] = this.a[i];
        return new zaaw(arrayOfzaie, false, 0, this.d, 0, 1, this.b);
      }
    }
    else
    {
      if (this.d == 1)
      {
        paramArrayOfInt[0] = 1;
        return this;
      }
      if (paramArrayOfInt[0] == this.f)
      {
        paramArrayOfInt[0] = this.d;
        return new zaaw(this.a, false, this.g, this.c, 0, 1, this.b);
      }
      paramArrayOfInt[0] = this.d;
    }
    return new zaay(this.b, 1, this.d);
  }
  
  public zaie b(int[] paramArrayOfInt, zaca paramzaca)
  {
    if (this.e)
    {
      if (this.d == 1)
      {
        paramArrayOfInt[0] = 1;
        return this;
      }
      if (paramArrayOfInt[0] == this.f)
      {
        paramArrayOfInt[0] = this.d;
        return new zaaw(this.a, true, this.g, this.c, 0, 1, this.b);
      }
      paramArrayOfInt[0] = this.d;
    }
    else
    {
      if (this.c == 1)
      {
        paramArrayOfInt[0] = 1;
        return this;
      }
      int i = paramArrayOfInt[0] + this.g;
      paramArrayOfInt[0] = this.c;
      if ((i >= 0) && (i < this.a.length))
      {
        zaie[] arrayOfzaie = new zaie[this.d];
        zc.a(arrayOfzaie, 0, arrayOfzaie.length, this.b);
        arrayOfzaie[this.f] = this.a[i];
        return new zaaw(arrayOfzaie, true, 0, this.d, 0, 1, this.b);
      }
    }
    return new zaay(this.b, 1, this.d);
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    char c1;
    char c2;
    String str;
    int i;
    int j;
    int k;
    if (this.e)
    {
      if (this.c < 1)
      {
        paramzahh.a("{}");
        return;
      }
      c1 = c(paramzaah);
      c2 = b(paramzaah);
      str = this.b.a(paramzaah) + c1;
      paramzahh.a('{');
      for (i = 0; i < this.c; i++)
      {
        for (j = 0; j < this.d; j++) {
          if (j == this.f)
          {
            k = i + this.g;
            if ((k >= 0) && (k < this.a.length))
            {
              this.a[k].a(paramzahh, paramzaah);
              paramzahh.a(c1);
            }
            else
            {
              paramzahh.a(str);
            }
          }
          else
          {
            paramzahh.a(str);
          }
        }
        paramzahh.b(c2);
      }
      paramzahh.b('}');
    }
    else
    {
      if (this.d < 1)
      {
        paramzahh.a("{}");
        return;
      }
      c1 = c(paramzaah);
      c2 = b(paramzaah);
      str = this.b.a(paramzaah) + c1;
      paramzahh.a('{');
      for (i = 0; i < this.d; i++)
      {
        if (i == this.f)
        {
          if (this.g < 0) {
            for (j = 0; j < -this.g; j++) {
              paramzahh.a(str);
            }
          }
          j = this.g + this.c - this.a.length;
          if (j > 0)
          {
            for (k = Math.max(this.g, 0); k < this.a.length; k++)
            {
              this.a[(k - this.g)].a(paramzahh, paramzaah);
              paramzahh.a(c1);
            }
            while (j > 0)
            {
              paramzahh.a(str);
              j--;
            }
          }
          for (k = Math.max(this.g, 0); k < j; k++)
          {
            this.a[(k - this.g)].a(paramzahh, paramzaah);
            paramzahh.a(c1);
          }
        }
        else
        {
          for (j = 0; j < this.c; j++) {
            paramzahh.a(str);
          }
        }
        paramzahh.b(c2);
      }
      paramzahh.b('}');
    }
  }
  
  public boolean a(zaie paramzaie)
  {
    if ((paramzaie.b() != 6) || (!(paramzaie instanceof zaaw))) {
      return false;
    }
    zaaw localzaaw = (zaaw)paramzaie;
    if ((this.e != localzaaw.e) || (this.c != localzaaw.c) || (this.f != localzaaw.f) || (this.d != localzaaw.d)) {
      return false;
    }
    if (!this.b.a(localzaaw.b)) {
      return false;
    }
    if (this.g < 0)
    {
      if (this.g != localzaaw.g) {
        return false;
      }
    }
    else if (localzaaw.g < 0) {
      return false;
    }
    int i = this.g + this.c;
    if (i > this.a.length)
    {
      if (i - this.a.length != localzaaw.g + localzaaw.c - localzaaw.a.length) {
        return false;
      }
      i = this.a.length;
    }
    else if (localzaaw.g + localzaaw.c > localzaaw.a.length)
    {
      return false;
    }
    int j = localzaaw.g - this.g;
    for (int k = Math.max(0, this.g); k < i; k++) {
      if (!this.a[k].a(localzaaw.a[(k + j)])) {
        return false;
      }
    }
    return true;
  }
  
  public zaie b(zaie paramzaie)
  {
    if (a(paramzaie)) {
      return this;
    }
    int i = Math.min(this.g + this.c, this.a.length);
    for (int j = Math.max(0, this.g); j < i; j++)
    {
      zaie localzaie = this.a[j].b(paramzaie);
      if (localzaie != null) {
        return localzaie;
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */