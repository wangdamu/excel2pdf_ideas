package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbtr
  extends zcd
{
  private Style a = null;
  private long c = 0L;
  private int d = 32774;
  
  zbtr(Style paramStyle)
  {
    c(244);
    this.a = paramStyle;
    if (paramStyle != null) {
      a();
    }
  }
  
  private void a()
  {
    int i = 6;
    if (this.a.isModified(24))
    {
      String str = this.a.s();
      if ((str != null) && (str.length() > 0))
      {
        this.d |= 0x1;
        i += 4 + zct.a(str);
      }
      else
      {
        i += 2;
      }
      this.c |= 0x2000000;
    }
    if (this.a.isModified(11))
    {
      this.c |= 0x4000000;
      i += 118;
    }
    if (this.a.isModified(38))
    {
      this.c |= 0x8000000;
      i += 8;
    }
    if (this.a.isModified(1))
    {
      this.c |= 0x10000000;
      i += 8;
    }
    if (this.a.isModified(32))
    {
      this.c |= 0x20000000;
      i += 4;
    }
    if (this.a.isModified(36))
    {
      this.c |= 0x40000000;
      i += 2;
    }
    a((short)i);
    this.b = new byte[d()];
    b();
  }
  
  private void b()
  {
    int i = 6;
    if (this.a.isModified(24))
    {
      String str = this.a.s();
      if ((str != null) && (str.length() > 0))
      {
        i += 2;
        int[] arrayOfInt = { i };
        int n = zct.a(this.b, arrayOfInt, str);
        i = arrayOfInt[0];
        System.arraycopy(zc.a((short)(n + 2)), 0, this.b, 6, 2);
      }
      else
      {
        this.b[(i++)] = 0;
        this.b[(i++)] = ((byte)this.a.getNumber());
      }
    }
    int k;
    if (this.a.isModified(11))
    {
      for (int j = 0; j < 64; j++) {
        this.b[(i + j)] = 0;
      }
      if (this.a.isModified(13))
      {
        j = zct.b(this.b, i + 1, this.a.getFont().getName());
        this.b[i] = ((byte)this.a.getFont().getName().length());
      }
      if (this.a.isModified(12)) {
        System.arraycopy(zc.a(this.a.getFont().getSize() * 20), 0, this.b, i + 64, 4);
      } else {
        System.arraycopy(zc.a(-1), 0, this.b, i + 64, 4);
      }
      if (this.a.isModified(18))
      {
        if (this.a.getFont().isItalic())
        {
          int tmp291_290 = (i + 68);
          byte[] tmp291_284 = this.b;
          tmp291_284[tmp291_290] = ((byte)(tmp291_284[tmp291_290] | 0x2));
        }
      }
      else
      {
        int tmp308_307 = (i + 88);
        byte[] tmp308_301 = this.b;
        tmp308_301[tmp308_307] = ((byte)(tmp308_301[tmp308_307] | 0x2));
      }
      if (this.a.isModified(17)) {
        System.arraycopy(zc.a(this.a.getFont().g()), 0, this.b, i + 72, 2);
      } else {
        System.arraycopy(zc.a(1), 0, this.b, i + 100, 4);
      }
      if (this.a.isModified(20))
      {
        if (this.a.getFont().isStrikeout())
        {
          int tmp405_404 = (i + 68);
          byte[] tmp405_398 = this.b;
          tmp405_398[tmp405_404] = ((byte)(tmp405_398[tmp405_404] | 0x80));
        }
      }
      else
      {
        int tmp424_423 = (i + 88);
        byte[] tmp424_417 = this.b;
        tmp424_417[tmp424_423] = ((byte)(tmp424_417[tmp424_423] | 0x80));
      }
      if (this.a.isModified(23))
      {
        j = 1;
        if (this.a.getFont().isSubscript()) {
          j = 2;
        }
        System.arraycopy(zc.a(j), 0, this.b, i + 74, 2);
      }
      else
      {
        System.arraycopy(zc.a(1), 0, this.b, i + 92, 4);
      }
      if (this.a.isModified(19))
      {
        k = 0;
        switch (this.a.getFont().getUnderline())
        {
        case 1: 
          k = 1;
          break;
        case 2: 
          k = 2;
          break;
        case 3: 
          k = 33;
          break;
        case 4: 
          k = 34;
        }
        this.b[(i + 76)] = k;
      }
      else
      {
        System.arraycopy(zc.a(1), 0, this.b, i + 96, 4);
      }
      k = -1;
      if (this.a.isModified(16)) {
        k = this.a.a(this.a.getFont().b(), 32767);
      }
      System.arraycopy(zc.a(k), 0, this.b, i + 80, 4);
      System.arraycopy(zc.a((short)1), 0, this.b, i + 116, 2);
      i += 118;
    }
    if (this.a.isModified(38))
    {
      if (this.a.isModified(25))
      {
        int tmp702_701 = i;
        byte[] tmp702_698 = this.b;
        tmp702_698[tmp702_701] = ((byte)(tmp702_698[tmp702_701] | (byte)ztr.b(this.a.getHorizontalAlignment(), false)));
      }
      else
      {
        this.c |= 1L;
      }
      if (this.a.isModified(26))
      {
        int tmp749_748 = i;
        byte[] tmp749_745 = this.b;
        tmp749_745[tmp749_748] = ((byte)(tmp749_745[tmp749_748] | (byte)(ztr.b(this.a.getVerticalAlignment(), true) << 4)));
      }
      else
      {
        this.c |= 0x2;
      }
      if (this.a.isModified(29))
      {
        if (this.a.isTextWrapped())
        {
          int tmp810_809 = i;
          byte[] tmp810_806 = this.b;
          tmp810_806[tmp810_809] = ((byte)(tmp810_806[tmp810_809] | 0x8));
        }
      }
      else {
        this.c |= 0x4;
      }
      if (this.a.isModified(28)) {
        this.b[(i + 1)] = ((byte)this.a.getRotationAngle());
      } else {
        this.c |= 0x8;
      }
      this.c |= 0x10;
      if (this.a.isModified(27))
      {
        if (this.a.getIndentLevel() <= 15)
        {
          int tmp918_917 = (i + 2);
          byte[] tmp918_912 = this.b;
          tmp918_912[tmp918_917] = ((byte)(tmp918_912[tmp918_917] | (byte)this.a.getIndentLevel()));
          this.b[(i + 4)] = -1;
        }
        else
        {
          this.b[(i + 4)] = ((byte)this.a.getIndentLevel());
        }
      }
      else {
        this.c |= 0x20;
      }
      if (this.a.isModified(30))
      {
        if (this.a.getShrinkToFit())
        {
          int tmp1003_1002 = (i + 2);
          byte[] tmp1003_997 = this.b;
          tmp1003_997[tmp1003_1002] = ((byte)(tmp1003_997[tmp1003_1002] | 0x10));
        }
      }
      else {
        this.c |= 0x40;
      }
      this.c |= 0x80;
      if (this.a.isModified(31))
      {
        k = 0;
        switch (this.a.getTextDirection())
        {
        case 1: 
          k = 1;
          break;
        case 2: 
          k = 2;
        }
        int tmp1098_1097 = (i + 2);
        byte[] tmp1098_1092 = this.b;
        tmp1098_1092[tmp1098_1097] = ((byte)(tmp1098_1092[tmp1098_1097] | (byte)((k & 0xFF) << 6)));
      }
      else
      {
        this.c |= 0x80000000;
      }
      i += 8;
    }
    int m;
    if (this.a.isModified(1))
    {
      if (this.a.getBorders().a) {
        this.d |= 0x4;
      }
      k = 0;
      m = 0;
      long l = 0L;
      int i2 = 64;
      if (this.a.isModified(2))
      {
        k |= this.a.getBorders().getByBorderType(1).getLineStyle();
        i2 = this.a.a(this.a.getBorders().getByBorderType(1).a, 64);
        m |= i2;
      }
      else
      {
        this.c |= 0x400;
      }
      if (this.a.isModified(3))
      {
        k |= this.a.getBorders().getByBorderType(2).getLineStyle() << 4;
        i2 = this.a.a(this.a.getBorders().getByBorderType(2).a, 64);
        m |= i2 << 7;
      }
      else
      {
        this.c |= 0x800;
      }
      if (this.a.isModified(4))
      {
        k |= this.a.getBorders().getByBorderType(4).getLineStyle() << 8;
        i2 = this.a.a(this.a.getBorders().getByBorderType(4).a, 64);
        l |= i2;
      }
      else
      {
        this.c |= 0x1000;
      }
      if (this.a.isModified(5))
      {
        k |= this.a.getBorders().getByBorderType(8).getLineStyle() << 12;
        i2 = this.a.a(this.a.getBorders().getByBorderType(8).a, 64);
        l |= i2 << 7;
      }
      else
      {
        this.c |= 0x2000;
      }
      if (this.a.isModified(9))
      {
        m |= 0x4000;
        l |= this.a.getBorders().getByBorderType(16).getLineStyle() << 21;
        i2 = this.a.a(this.a.getBorders().getByBorderType(16).a, 64);
        l |= i2 << 14;
      }
      else
      {
        this.c |= 0x4000;
      }
      if (this.a.isModified(10))
      {
        m |= 0x8000;
        l |= this.a.getBorders().getByBorderType(32).getLineStyle() << 21;
        i2 = this.a.a(this.a.getBorders().getByBorderType(32).a, 64);
        l |= i2 << 14;
      }
      else
      {
        this.c |= 0x8000;
      }
      System.arraycopy(zc.a(k), 0, this.b, i, 2);
      System.arraycopy(zc.a(m), 0, this.b, i + 2, 2);
      System.arraycopy(zc.a(l), 0, this.b, i + 4, 4);
      i += 8;
    }
    if (this.a.isModified(32))
    {
      k = 0;
      m = 0;
      if (this.a.isModified(33)) {
        k |= this.a.getPattern() << 10;
      } else {
        this.c |= 0x10000;
      }
      System.arraycopy(zc.a((short)k), 0, this.b, i, 2);
      int i1 = 64;
      if (this.a.isModified(34))
      {
        i1 = this.a.a(this.a.b, 64);
        m |= i1;
      }
      else
      {
        this.c |= 0x20000;
      }
      if (this.a.isModified(35))
      {
        i1 = this.a.a(this.a.a, 65);
        m |= i1 << 7;
      }
      else
      {
        this.c |= 0x40000;
      }
      System.arraycopy(zc.a((short)m), 0, this.b, i + 2, 2);
      i += 4;
    }
    if (this.a.o())
    {
      if (this.a.isModified(36))
      {
        if (this.a.isLocked())
        {
          int tmp1961_1960 = i;
          byte[] tmp1961_1957 = this.b;
          tmp1961_1957[tmp1961_1960] = ((byte)(tmp1961_1957[tmp1961_1960] | 0x1));
        }
      }
      else {
        this.c |= 0x100;
      }
      if (this.a.isModified(37))
      {
        if (this.a.isFormulaHidden())
        {
          int tmp2009_2008 = i;
          byte[] tmp2009_2005 = this.b;
          tmp2009_2005[tmp2009_2008] = ((byte)(tmp2009_2005[tmp2009_2008] | 0x2));
        }
      }
      else {
        this.c |= 0x200;
      }
      i += 2;
    }
    System.arraycopy(zc.a(this.c), 0, this.b, 0, 4);
    System.arraycopy(zc.a(this.d), 0, this.b, 4, 2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbtr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */