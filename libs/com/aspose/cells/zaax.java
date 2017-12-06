package com.aspose.cells;

class zaax
  extends zaav
{
  private zaie[][] a;
  
  public zaax(zaie[][] paramArrayOfzaie)
  {
    this.a = paramArrayOfzaie;
  }
  
  int o()
  {
    return this.a.length;
  }
  
  int p()
  {
    return this.a[0].length;
  }
  
  zaie[] a(int paramInt)
  {
    return this.a[paramInt];
  }
  
  public Object c()
  {
    return this.a;
  }
  
  public Object b(zaca paramzaca)
  {
    Object[][] arrayOfObject = new Object[this.a.length][];
    for (int i = 0; i < this.a.length; i++)
    {
      zaie[] arrayOfzaie = this.a[i];
      if (arrayOfzaie != null)
      {
        Object[] arrayOfObject1 = new Object[arrayOfzaie.length];
        arrayOfObject[i] = arrayOfObject1;
        for (int j = 0; j < arrayOfzaie.length; j++) {
          if (arrayOfzaie[j] != null) {
            arrayOfObject1[j] = arrayOfzaie[j].b(paramzaca);
          }
        }
      }
    }
    return arrayOfObject;
  }
  
  public int b(zaca paramzaca, int paramInt)
  {
    if ((paramInt != 96) && ((this.a.length > 1) || (this.a[0].length > 1))) {
      return 1;
    }
    return 0;
  }
  
  public zaie e(zaca paramzaca)
  {
    return this.a[0][0];
  }
  
  public zaiw a(zaca paramzaca, boolean paramBoolean)
  {
    if (this.a.length == 1)
    {
      zaie[] arrayOfzaie = this.a[0];
      if (arrayOfzaie.length == 1) {
        return new zbak(arrayOfzaie[0], 6);
      }
      return new zayq(arrayOfzaie);
    }
    return new zays(this.a);
  }
  
  public boolean f(zaca paramzaca)
  {
    return (this.a.length == 1) && (this.a[0].length == 1);
  }
  
  public boolean g(zaca paramzaca)
  {
    return this.a.length == 1;
  }
  
  public boolean h(zaca paramzaca)
  {
    return this.a[0].length == 1;
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca, boolean paramBoolean)
  {
    zaie[] arrayOfzaie = null;
    if (this.a.length == 1)
    {
      paramArrayOfInt[0] = 1;
      arrayOfzaie = this.a[0];
    }
    else
    {
      i = paramArrayOfInt[0];
      paramArrayOfInt[0] = this.a.length;
      if (i >= this.a.length)
      {
        paramArrayOfInt[1] = this.a[0].length;
        return zabc.g;
      }
      arrayOfzaie = this.a[i];
    }
    if (arrayOfzaie.length == 1)
    {
      paramArrayOfInt[1] = 1;
      return arrayOfzaie[0];
    }
    int i = paramArrayOfInt[1];
    paramArrayOfInt[1] = arrayOfzaie.length;
    if (i >= arrayOfzaie.length) {
      return zabc.g;
    }
    return arrayOfzaie[i];
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca)
  {
    if (this.a.length == 1)
    {
      paramArrayOfInt[0] = 1;
      return this;
    }
    int i = paramArrayOfInt[0];
    paramArrayOfInt[0] = this.a.length;
    if (i >= this.a.length) {
      return zabc.g;
    }
    return new zaaw(this.a[i], false, 0, this.a[i].length, 0, 1, zabg.a);
  }
  
  public zaie b(int[] paramArrayOfInt, zaca paramzaca)
  {
    if (this.a[0].length == 1)
    {
      paramArrayOfInt[0] = 1;
      return this;
    }
    int i = paramArrayOfInt[0];
    paramArrayOfInt[0] = this.a[0].length;
    if (i >= paramArrayOfInt[0]) {
      return zabc.g;
    }
    zaie[] arrayOfzaie = new zaie[this.a.length];
    for (int j = 0; j < this.a.length; j++) {
      if (this.a[j] != null) {
        arrayOfzaie[j] = this.a[j][i];
      }
    }
    return new zaaw(arrayOfzaie, true, 0, arrayOfzaie.length, 0, 1, zabg.a);
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    if ((this.a == null) || (this.a.length < 1))
    {
      paramzahh.a("{}");
      return;
    }
    paramzahh.a('{');
    char c1 = c(paramzaah);
    char c2 = b(paramzaah);
    for (zaie[] arrayOfzaie1 : this.a)
    {
      if (arrayOfzaie1 != null) {
        for (zaie localzaie : arrayOfzaie1)
        {
          if (localzaie != null) {
            localzaie.a(paramzahh, paramzaah);
          }
          paramzahh.a(c1);
        }
      }
      paramzahh.b(c2);
    }
    paramzahh.b('}');
  }
  
  public boolean a(zaie paramzaie)
  {
    if ((paramzaie.b() != 6) || (!(paramzaie instanceof zaax))) {
      return false;
    }
    zaax localzaax = (zaax)paramzaie;
    if ((this.a == null) || (this.a.length < 1))
    {
      if ((localzaax.a != null) && (localzaax.a.length > 0)) {
        return false;
      }
    }
    else
    {
      if ((localzaax.a == null) || (localzaax.a.length < 1)) {
        return false;
      }
      if (this.a.length != localzaax.a.length) {
        return false;
      }
      for (int i = 0; i < this.a.length; i++) {
        if (!zabt.a(this.a[i], localzaax.a[i])) {
          return false;
        }
      }
    }
    return true;
  }
  
  public zaie b(zaie paramzaie)
  {
    if (a(paramzaie)) {
      return this;
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++) {
        if ((this.a[i] != null) && (this.a[i].length > 0)) {
          for (int j = 0; j < this.a[i].length; j++) {
            if (this.a[i][j] != null)
            {
              zaie localzaie = this.a[i][j].b(paramzaie);
              if (localzaie != null) {
                return localzaie;
              }
            }
          }
        }
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */