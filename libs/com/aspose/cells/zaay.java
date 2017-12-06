package com.aspose.cells;

import com.aspose.cells.a.c.zc;

class zaay
  extends zaav
{
  private zaie a;
  private int b;
  private int c;
  
  zaay(zaie paramzaie, int paramInt1, int paramInt2)
  {
    this.a = paramzaie;
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  int o()
  {
    return this.b;
  }
  
  int p()
  {
    return this.c;
  }
  
  zaie[] a(int paramInt)
  {
    zaie[] arrayOfzaie = new zaie[this.c];
    zc.a(arrayOfzaie, 0, this.c, this.a);
    return arrayOfzaie;
  }
  
  public Object c()
  {
    return this.a;
  }
  
  public Object b(zaca paramzaca)
  {
    Object[][] arrayOfObject = new Object[this.b][];
    Object localObject = this.a.b(paramzaca);
    for (int i = 0; i < this.b; i++)
    {
      arrayOfObject[i] = new Object[this.c];
      zc.a(arrayOfObject[i], 0, this.c, localObject);
    }
    return arrayOfObject;
  }
  
  public int b(zaca paramzaca, int paramInt)
  {
    return 0;
  }
  
  public zaie e(zaca paramzaca)
  {
    return this.a;
  }
  
  public zaiw a(zaca paramzaca, boolean paramBoolean)
  {
    return new zazj(this.a, this.b, this.c);
  }
  
  public boolean f(zaca paramzaca)
  {
    return (this.b == 1) && (this.c == 1);
  }
  
  public boolean g(zaca paramzaca)
  {
    return this.b == 1;
  }
  
  public boolean h(zaca paramzaca)
  {
    return this.c == 1;
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca, boolean paramBoolean)
  {
    paramArrayOfInt[0] = this.b;
    paramArrayOfInt[1] = this.c;
    return this.a;
  }
  
  public zaie a(int[] paramArrayOfInt, zaca paramzaca)
  {
    paramArrayOfInt[0] = this.b;
    if (this.b == 1) {
      return this;
    }
    return new zaay(this.a, 1, this.c);
  }
  
  public zaie b(int[] paramArrayOfInt, zaca paramzaca)
  {
    paramArrayOfInt[0] = this.c;
    if (this.c == 1)
    {
      paramArrayOfInt[0] = 1;
      return this;
    }
    return new zaay(this.a, this.b, 1);
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    if (this.b < 1)
    {
      paramzahh.a("{}");
      return;
    }
    char c1 = c(paramzaah);
    char c2 = b(paramzaah);
    paramzahh.a('{');
    String str = this.a.a(paramzaah) + c1;
    for (int i = 0; i < this.b; i++)
    {
      for (int j = 0; j < this.c; j++) {
        paramzahh.a(str);
      }
      paramzahh.b(c2);
    }
    paramzahh.b('}');
  }
  
  public boolean a(zaie paramzaie)
  {
    if ((paramzaie.b() != 6) || (!(paramzaie instanceof zaay))) {
      return false;
    }
    zaay localzaay = (zaay)paramzaie;
    return (this.b == localzaay.b) && (this.c == localzaay.c) && (this.a.a(localzaay.a));
  }
  
  public zaie b(zaie paramzaie)
  {
    if (this.a.a(paramzaie)) {
      return this.a;
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */