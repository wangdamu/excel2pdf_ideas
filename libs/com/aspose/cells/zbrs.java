package com.aspose.cells;

import java.util.ArrayList;

class zbrs
  implements zaji
{
  private ArrayList a = new ArrayList();
  
  public zaie a()
  {
    if ((this.a == null) || (this.a.size() == 0)) {
      return zabg.a;
    }
    zabb[] arrayOfzabb = new zabb[this.a.size()];
    for (int i = 0; i < arrayOfzabb.length; i++) {
      arrayOfzabb[i] = new zabb(((Integer)this.a.get(i)).intValue());
    }
    zaaw localzaaw = new zaaw(arrayOfzabb, false, 0, arrayOfzabb.length, 0, 1, zabg.a);
    return localzaaw;
  }
  
  public boolean a(zaie paramzaie, boolean paramBoolean)
  {
    return false;
  }
  
  public zaie a(int paramInt)
  {
    this.a.add(Integer.valueOf(paramInt));
    return null;
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean)
  {
    return null;
  }
  
  public zaie a(zaie paramzaie, zaca paramzaca, boolean paramBoolean, int paramInt)
  {
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */