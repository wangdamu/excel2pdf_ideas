package com.aspose.cells;

import com.aspose.cells.a.c.zi;
import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.zs;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

class zgs
{
  short a;
  int b;
  int c;
  Object d;
  boolean e;
  
  zgs()
  {
    this.b = -1;
    this.c = 0;
    this.e = false;
  }
  
  zgs(int paramInt)
  {
    this.b = -1;
    this.c = 0;
    this.e = false;
    this.a = ((short)paramInt);
  }
  
  zgs(zgs paramzgs)
  {
    this.a = paramzgs.a;
    this.b = paramzgs.b;
    this.c = paramzgs.c;
    this.d = paramzgs.d;
    this.e = paramzgs.e;
  }
  
  void a(zgs paramzgs)
  {
    this.a = paramzgs.a;
    this.b = paramzgs.b;
    this.c = paramzgs.c;
    this.d = paramzgs.d;
    this.e = paramzgs.e;
  }
  
  void a(zgs paramzgs, int paramInt)
  {
    if (paramInt == 7)
    {
      a(paramzgs);
      return;
    }
    if ((paramInt & 0x1) != 0) {
      this.a = paramzgs.a;
    }
    if ((paramInt & 0x2) != 0) {
      this.b = paramzgs.b;
    }
    if ((paramInt & 0x4) != 0)
    {
      this.c = paramzgs.c;
      this.d = paramzgs.d;
      this.e = paramzgs.e;
    }
  }
  
  void a(int paramInt)
  {
    this.a = ((short)paramInt);
    this.b = -1;
    this.c = 0;
    this.d = null;
    this.e = false;
  }
  
  boolean a()
  {
    if (this.d == null) {
      return true;
    }
    if (this.c == 4) {
      return "".equals(((zbbj)this.d).c);
    }
    return false;
  }
  
  boolean b()
  {
    if (this.c == 0) {
      return true;
    }
    if (this.c == 5)
    {
      zaai localzaai = (zaai)this.d;
      if (localzaai.c == 0) {
        return true;
      }
    }
    return false;
  }
  
  boolean c()
  {
    switch (this.c)
    {
    case 0: 
      return true;
    case 4: 
      return "".equals(((zbbj)this.d).c);
    case 5: 
      zaai localzaai = (zaai)this.d;
      switch (localzaai.c)
      {
      case 0: 
        return true;
      case 4: 
        return "".equals((String)localzaai.d);
      }
      return false;
    }
    return false;
  }
  
  boolean d()
  {
    if (this.c == 4)
    {
      zbbj localzbbj = (zbbj)this.d;
      return localzbbj.f();
    }
    return false;
  }
  
  zgs e()
  {
    Object localObject;
    switch (this.c)
    {
    case 4: 
      localObject = new zgs(this);
      ((zgs)localObject).d = ((zbbj)this.d).c;
      return (zgs)localObject;
    case 5: 
      localObject = (zaai)this.d;
      zgs localzgs = new zgs(this);
      if (((zaai)localObject).c == 6)
      {
        b(localzgs, ((Integer)((zaai)localObject).d).intValue());
        return localzgs;
      }
      localzgs.c = ((zaai)localObject).c;
      localzgs.d = ((zaai)localObject).d;
      return localzgs;
    case 6: 
      localObject = new zgs(this);
      b((zgs)localObject, ((Integer)this.d).intValue());
      return (zgs)localObject;
    }
    return this;
  }
  
  boolean f()
  {
    switch (this.c)
    {
    case 1: 
    case 6: 
      return true;
    case 5: 
      int i = ((zaai)this.d).c;
      return (i == 1) || (i == 6);
    }
    return false;
  }
  
  private void b(zgs paramzgs, int paramInt)
  {
    if ((paramInt & 0x3) == 2)
    {
      paramzgs.c = 6;
      paramzgs.d = Integer.valueOf(paramInt >> 2);
    }
    else
    {
      paramzgs.c = 1;
      paramzgs.d = Double.valueOf(zayi.a(paramInt));
    }
  }
  
  String a(boolean paramBoolean, WorkbookSettings paramWorkbookSettings)
  {
    return a(this.c, this.d, paramBoolean, paramWorkbookSettings);
  }
  
  static String a(int paramInt, Object paramObject, boolean paramBoolean, WorkbookSettings paramWorkbookSettings)
  {
    switch (paramInt)
    {
    case 4: 
      if (paramBoolean) {
        return ((zbbj)paramObject).c;
      }
      return (String)paramObject;
    case 5: 
      zaai localzaai = (zaai)paramObject;
      return a(localzaai.c, localzaai.d, false, paramWorkbookSettings);
    case 3: 
      return a(paramObject);
    case 0: 
      return "";
    case 6: 
      return zayi.b(((Integer)paramObject).intValue());
    case 1: 
      return zp.b(((Double)paramObject).doubleValue(), paramWorkbookSettings.getSignificantDigits());
    }
    return zs.a(paramObject);
  }
  
  String g()
  {
    return a(this.c == 5 ? ((zaai)this.d).d : this.d);
  }
  
  static String a(Object paramObject)
  {
    String str = ztr.b(((Byte)paramObject).byteValue());
    if (str == null) {
      return "#VALUE!";
    }
    return str;
  }
  
  int h()
  {
    if (this.d == null) {
      return 3;
    }
    int i = this.c;
    if (i == 5) {
      i = ((zaai)this.d).c;
    }
    switch (i)
    {
    case 2: 
      return 0;
    case 1: 
      return 4;
    case 4: 
      return 5;
    case 0: 
      return 3;
    case 3: 
      return 2;
    }
    return 6;
  }
  
  boolean b(zgs paramzgs)
  {
    if (this.c == 0) {
      return (paramzgs.c == 0) || ((paramzgs.c == 5) && (((zaai)paramzgs.d).c == 0));
    }
    if (paramzgs.c == 0) {
      return (this.c == 5) && (((zaai)this.d).c == 0);
    }
    zaai localzaai;
    int i;
    Object localObject1;
    if (this.c == 5)
    {
      localzaai = (zaai)this.d;
      i = localzaai.c;
      localObject1 = localzaai.d;
    }
    else if (this.c == 4)
    {
      i = 4;
      localObject1 = ((zbbj)this.d).c;
    }
    else
    {
      i = this.c;
      localObject1 = this.d;
    }
    int j;
    Object localObject2;
    if (paramzgs.c == 5)
    {
      localzaai = (zaai)paramzgs.d;
      j = localzaai.c;
      localObject2 = localzaai.d;
    }
    else if (paramzgs.c == 4)
    {
      j = 4;
      localObject2 = ((zbbj)paramzgs.d).c;
    }
    else
    {
      j = paramzgs.c;
      localObject2 = paramzgs.d;
    }
    if (i == 6)
    {
      if (j == 6) {
        return localObject1.equals(localObject2);
      }
      if (j == 1) {
        return zayi.a(((Integer)localObject1).intValue()) == ((Double)localObject2).doubleValue();
      }
      return false;
    }
    if (i == 1)
    {
      if (j == 6) {
        return zayi.a(((Integer)localObject2).intValue()) == ((Double)localObject1).doubleValue();
      }
      if (j == 1) {
        return localObject1.equals(localObject2);
      }
      return false;
    }
    return (i == j) && (localObject1.equals(localObject2));
  }
  
  boolean a(Object paramObject, boolean paramBoolean)
  {
    if (paramObject == null)
    {
      this.c = 0;
      this.d = null;
      return true;
    }
    return a(zaoj.a(paramObject.getClass()), paramObject, paramBoolean);
  }
  
  boolean a(int paramInt, Object paramObject, boolean paramBoolean)
  {
    switch (paramInt)
    {
    case 14: 
      double d1 = zi.b(paramObject);
      if ((Double.isNaN(d1)) || (Double.isInfinite(d1)))
      {
        zuf localzuf = zuf.c;
        this.c = 3;
        this.d = zi.a(ztr.b(localzuf));
      }
      else if (paramBoolean)
      {
        zayi.a(((Double)paramObject).doubleValue(), this);
      }
      else
      {
        this.c = 1;
        this.d = Double.valueOf(d1);
      }
      return true;
    case 9: 
      if (paramBoolean)
      {
        zayi.a(zi.c(paramObject), this);
      }
      else
      {
        this.c = 1;
        this.d = Double.valueOf(zi.c(paramObject));
      }
      return true;
    case 8: 
      if (paramBoolean)
      {
        zayi.a(((Integer)paramObject).intValue(), this);
      }
      else
      {
        this.c = 1;
        this.d = Double.valueOf(((Integer)paramObject).intValue());
      }
      return true;
    case 6: 
      if (paramBoolean)
      {
        zayi.a(((Byte)paramObject).byteValue(), this);
      }
      else
      {
        this.c = 1;
        this.d = Double.valueOf(((Byte)paramObject).byteValue());
      }
      return true;
    case 7: 
      if (paramBoolean)
      {
        zayi.a(((Short)paramObject).shortValue(), this);
      }
      else
      {
        this.c = 1;
        this.d = Double.valueOf(((Short)paramObject).shortValue());
      }
      return true;
    case 10: 
      if (paramBoolean)
      {
        zayi.a(((Long)paramObject).longValue() & 0xFFFFFFFF, this);
      }
      else
      {
        this.c = 1;
        this.d = Double.valueOf(((Long)paramObject).longValue());
      }
      return true;
    case 12: 
      if (paramBoolean)
      {
        zayi.a(((Long)paramObject).longValue(), this);
      }
      else
      {
        this.c = 1;
        this.d = Double.valueOf(((Long)paramObject).longValue());
      }
      return true;
    case 11: 
      if (paramBoolean)
      {
        zayi.a(((Long)paramObject).longValue(), this);
      }
      else
      {
        this.c = 1;
        this.d = Double.valueOf(((Long)paramObject).longValue());
      }
      return true;
    case 5: 
      if (paramBoolean)
      {
        zayi.a(((Byte)paramObject).byteValue(), this);
      }
      else
      {
        this.c = 1;
        this.d = Double.valueOf(((Byte)paramObject).byteValue());
      }
      return true;
    case 13: 
      if (paramBoolean)
      {
        zayi.a(((Float)paramObject).floatValue(), this);
      }
      else
      {
        this.c = 1;
        this.d = Double.valueOf(((Float)paramObject).floatValue());
      }
      return true;
    case 16: 
      this.c = 1;
      this.d = ((DateTime)paramObject);
      return false;
    case 18: 
      byte b1 = ztr.b((String)paramObject);
      if (b1 != -1)
      {
        this.c = 3;
        this.d = zi.a(b1);
        return true;
      }
      this.c = 4;
      this.d = paramObject;
      return false;
    case 3: 
      this.c = 2;
      this.d = (zi.d(paramObject) ? znq.d : znq.e);
      return true;
    case 4: 
      this.c = 4;
      this.d = Character.toString(((Character)paramObject).charValue());
      return false;
    case 0: 
    case 2: 
      this.c = 0;
      this.d = null;
      return true;
    }
    if ((paramObject instanceof Calendar))
    {
      this.c = 1;
      this.d = new DateTime((Calendar)paramObject);
      return false;
    }
    if ((paramObject instanceof Date))
    {
      this.c = 1;
      this.d = new DateTime((Date)paramObject);
      return false;
    }
    if ((paramObject instanceof Number))
    {
      double d2 = ((Number)paramObject).doubleValue();
      if (paramBoolean)
      {
        zayi.a(d2, this);
      }
      else
      {
        this.c = 1;
        this.d = Double.valueOf(d2);
      }
      return true;
    }
    if ((paramObject instanceof BigDecimal))
    {
      if (paramBoolean)
      {
        zayi.a(zs.a(paramObject), this);
      }
      else
      {
        this.c = 1;
        this.d = Double.valueOf(((BigDecimal)paramObject).doubleValue());
      }
      return true;
    }
    return a(18, zs.a(paramObject), paramBoolean);
  }
  
  boolean a(DateTime paramDateTime, boolean paramBoolean)
  {
    double d1 = zbxa.a(paramDateTime, paramBoolean);
    if (d1 < 0.0D) {
      return false;
    }
    zayi.a(d1, this);
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */