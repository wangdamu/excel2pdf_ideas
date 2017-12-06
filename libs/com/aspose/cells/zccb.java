package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zccb
  extends zche
{
  zccb(zbtv paramzbtv)
  {
    this.d = 189;
    this.c = new byte[6];
    short s = 0;
    if (paramzbtv.j()) {
      s = (short)(s | 0x4);
    } else {
      s = (short)(s | 0x2);
    }
    if (paramzbtv.i()) {
      s = (short)(s | 0x8);
    }
    if (b(paramzbtv)) {
      s = (short)(s | 0x1);
    }
    if (paramzbtv.u()) {
      s = (short)(s | 0x10);
    }
    if ((paramzbtv.n) || (a(paramzbtv))) {
      s = (short)(s | 0x20);
    }
    if ((paramzbtv.f()) && (!paramzbtv.j())) {
      s = (short)(s | 0x40);
    }
    if ((paramzbtv.g()) && (!paramzbtv.j())) {
      s = (short)(s | 0x80);
    }
    if (paramzbtv.p) {
      s = (short)(s | 0x200);
    }
    System.arraycopy(zc.a(s), 0, this.c, 0, 2);
    if (paramzbtv.c != null) {
      System.arraycopy(zc.a(paramzbtv.c.size()), 0, this.c, 2, 4);
    }
  }
  
  private boolean a(zbtv paramzbtv)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    if ((paramzbtv != null) && (paramzbtv.c != null))
    {
      if (0 == paramzbtv.c.size()) {
        return false;
      }
      ArrayList localArrayList = paramzbtv.c;
      zbos localzbos = null;
      for (int i1 = 0; i1 < localArrayList.size(); i1++)
      {
        localzbos = (zbos)localArrayList.get(i1);
        if ((localzbos.a instanceof DateTime)) {
          j = 1;
        } else if ((localzbos.a instanceof Double)) {
          i = 1;
        } else if ((localzbos.a instanceof Boolean)) {
          n = 1;
        } else if (zcij.a(localzbos.a)) {
          m = 1;
        } else if ((localzbos.a instanceof String)) {
          k = 1;
        }
        int i2 = (i != 0) && ((k != 0) || (n != 0) || (m != 0)) ? 1 : 0;
        int i3 = (j != 0) && ((i != 0) || (k != 0) || (n != 0) || (m != 0)) ? 1 : 0;
        if ((i2 != 0) || (i3 != 0)) {
          return true;
        }
      }
    }
    return false;
  }
  
  private boolean b(zbtv paramzbtv)
  {
    if ((paramzbtv != null) && (paramzbtv.c != null))
    {
      if (0 == paramzbtv.c.size()) {
        return true;
      }
      ArrayList localArrayList = paramzbtv.c;
      zbos localzbos = null;
      for (int i = 0; i < localArrayList.size(); i++)
      {
        localzbos = (zbos)localArrayList.get(i);
        if (((localzbos.a instanceof String)) || (localzbos.a == null) || ((localzbos.a instanceof Boolean))) {
          return true;
        }
        if (zcij.a(localzbos.a)) {
          return true;
        }
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zccb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */