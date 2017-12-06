package com.aspose.cells;

class zbrq
  implements zaji
{
  private boolean a;
  private boolean b;
  private int c = 0;
  
  public zbrq(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramBoolean1;
    this.b = paramBoolean2;
  }
  
  public boolean a(zaie paramzaie, boolean paramBoolean)
  {
    return (paramBoolean) && (paramzaie == zabg.a);
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean)
  {
    if (this.a)
    {
      if ((!paramBoolean) && (paramzaie == zabg.a))
      {
        this.c += 1;
        return null;
      }
      paramzaie = paramzaie.e(paramzaca);
      if ((paramzaie != zabg.a) && ((!this.b) || (paramzaie.b() != 0)))
      {
        this.c += 1;
        return null;
      }
      return zaba.b;
    }
    paramzaie = paramzaie.e(paramzaca);
    if (paramBoolean)
    {
      if (paramzaie.b() == 3)
      {
        this.c += 1;
        return null;
      }
    }
    else if (paramzaie.a(paramzaca, 7) != null)
    {
      this.c += 1;
      return null;
    }
    return zaba.b;
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean, int paramInt)
  {
    paramzaie = paramzaie.e(paramzaca);
    if (paramBoolean)
    {
      if ((paramzaie.b() == 3) || ((this.a) && (paramzaie != zabg.a) && ((!this.b) || (paramzaie.b() != 0))))
      {
        this.c += paramInt;
        return null;
      }
    }
    else if ((paramzaie.b() != 0) && ((this.a) || (paramzaie.a(paramzaca, 7) != null)))
    {
      this.c += paramInt;
      return null;
    }
    return zaba.b;
  }
  
  public zaie a()
  {
    return new zabb(this.c);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */