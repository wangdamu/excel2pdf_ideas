package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zaaz
  extends zaau
{
  protected zabu a;
  protected byte[] b;
  protected int c;
  protected int d;
  
  public zaaz(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.b = paramArrayOfByte;
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.a == null) {
      this.a = new zabu();
    }
  }
  
  public zabu l()
  {
    return this.a;
  }
  
  public void a(zabu paramzabu)
  {
    this.a = paramzabu;
  }
  
  public int b()
  {
    return 11;
  }
  
  public Object c()
  {
    return null;
  }
  
  public Object b(zaca paramzaca)
  {
    return e(paramzaca).c();
  }
  
  public byte a()
  {
    return this.b[this.c];
  }
  
  public boolean i()
  {
    return false;
  }
  
  public boolean c(zaca paramzaca, boolean paramBoolean)
  {
    return true;
  }
  
  public zaie e(zaca paramzaca)
  {
    if (this.a != null)
    {
      if (this.a.a != null) {
        return this.a.a;
      }
    }
    else {
      this.a = new zabu();
    }
    if ((this.b[this.c] == 24) && (this.b[(this.c + 1)] == 7))
    {
      int i = zc.e(this.b, this.c + 2) & 0xFFFF;
      if (i < paramzaca.d)
      {
        this.a.a = zabt.a(paramzaca.g, paramzaca.d, this.b[(this.c + 4)] & 0xFF & 0xFF, false, paramzaca);
        return this.a.a;
      }
    }
    this.a.a = zabg.a;
    return zabg.a;
  }
  
  public void a(zahh paramzahh, zaah paramzaah)
  {
    if (this.b[this.c] == 24)
    {
      switch (this.b[(this.c + 1)])
      {
      case 29: 
        if (paramzaah != null)
        {
          int i;
          if (paramzaah.a == 8)
          {
            i = zc.a(this.b, this.c + 2);
            ((zaxa)paramzaah.b).a(paramzahh, i, false);
            return;
          }
          if (paramzaah.a == 7)
          {
            i = zc.a(this.b, this.c + 2);
            ((zawp)paramzaah.b).a(paramzahh, i);
            return;
          }
        }
        break;
      case 7: 
        if (paramzaah != null)
        {
          Cell localCell = paramzaah.c.getCells().checkCell(zc.e(this.b, this.c + 2) & 0xFFFF, this.b[(this.c + 4)] & 0xFF & 0xFF);
          if (localCell != null)
          {
            Object localObject = localCell.getValue();
            if ((localObject instanceof String))
            {
              paramzahh.a((String)localObject);
              return;
            }
          }
        }
        break;
      }
      paramzahh.a("#REF!");
    }
  }
  
  public boolean a(zaie paramzaie)
  {
    if (paramzaie.b() != 11) {
      return false;
    }
    zaaz localzaaz = (zaaz)paramzaie;
    if (this.d != localzaaz.d) {
      return false;
    }
    if ((this.b == localzaaz.b) && (this.c == localzaaz.c)) {
      return true;
    }
    for (int i = 0; i < this.d; i++) {
      if (this.b[(this.c + i)] != localzaaz.b[(localzaaz.c + i)]) {
        return false;
      }
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */