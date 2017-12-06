package com.aspose.cells;

import com.aspose.cells.b.a.zs;

class zbrp
  implements zaji
{
  private boolean a;
  private String b;
  private StringBuilder c;
  private String d;
  
  zbrp(boolean paramBoolean, String paramString)
  {
    this.a = paramBoolean;
    this.b = paramString;
    this.c = new StringBuilder();
  }
  
  public zaie a()
  {
    if (this.d == null) {
      if (this.c.length() > this.b.length()) {
        this.d = this.c.substring(0, 0 + (this.c.length() - this.b.length()));
      } else {
        this.d = zs.a(this.c);
      }
    }
    return new zabp(this.d);
  }
  
  public boolean a(zaie paramzaie, boolean paramBoolean)
  {
    return (this.a) && (paramBoolean) && (paramzaie.b() == 12);
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean)
  {
    if (paramzaie != null)
    {
      paramzaie = paramzaie.e(paramzaca);
      if (paramzaie != null)
      {
        if (paramzaie.b() == 0) {
          return paramzaie;
        }
        zabp localzabp = paramzaie.i(paramzaca);
        if (localzabp != null)
        {
          this.c.append(localzabp.o());
          this.c.append(this.b);
          return null;
        }
      }
    }
    if ((this.a) && (paramBoolean)) {
      return zaba.b;
    }
    this.c.append(this.b);
    return null;
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean, int paramInt)
  {
    if (paramzaie != null)
    {
      paramzaie = paramzaie.e(paramzaca);
      if (paramzaie != null)
      {
        zabp localzabp = paramzaie.i(paramzaca);
        if (localzabp != null)
        {
          for (int j = 0; j < paramInt; j++)
          {
            this.c.append(localzabp.o());
            this.c.append(this.b);
          }
          return null;
        }
      }
    }
    if ((this.a) && (paramBoolean)) {
      return zaba.b;
    }
    for (int i = 0; i < paramInt; i++) {
      this.c.append(this.b);
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */