package com.aspose.cells;

class zbdx
{
  int a;
  byte b;
  byte c;
  int d;
  short e;
  
  zbdx()
  {
    this.d = 15;
  }
  
  zbdx(zbdx paramzbdx)
  {
    a(paramzbdx);
  }
  
  void a(int paramInt, Cells paramCells)
  {
    this.a = paramInt;
    this.b = 0;
    this.c = 0;
    this.d = 15;
    this.e = ((short)paramCells.a());
    c(paramCells.isDefaultRowHeightMatched());
  }
  
  boolean a(Cells paramCells)
  {
    if (this.d > 15) {
      return false;
    }
    if (c() != paramCells.isDefaultRowHeightMatched()) {
      return false;
    }
    return this.e == paramCells.a();
  }
  
  void a(zbdx paramzbdx)
  {
    this.a = paramzbdx.a;
    this.b = paramzbdx.b;
    this.c = paramzbdx.c;
    this.d = paramzbdx.d;
    this.e = paramzbdx.e;
  }
  
  void a(zbdx paramzbdx, int paramInt)
  {
    switch (paramInt)
    {
    case 15: 
      a(paramzbdx);
      return;
    case 13: 
      this.b = paramzbdx.b;
      this.c = paramzbdx.c;
      this.d = paramzbdx.d;
      this.e = paramzbdx.e;
      return;
    case 8: 
      this.d = paramzbdx.d;
      return;
    case 1: 
      this.b = paramzbdx.b;
      this.c = paramzbdx.c;
      return;
    case 2: 
      this.a = paramzbdx.a;
      return;
    case 4: 
      this.e = paramzbdx.e;
      return;
    }
    if ((paramInt & 0x2) != 0) {
      this.a = paramzbdx.a;
    }
    if ((paramInt & 0x1) != 0)
    {
      this.b = paramzbdx.b;
      this.c = paramzbdx.c;
    }
    if ((paramInt & 0x8) != 0) {
      this.d = paramzbdx.d;
    }
    if ((paramInt & 0x4) != 0) {
      this.e = paramzbdx.e;
    }
  }
  
  boolean a()
  {
    return (this.b & 0xFF & 0x10) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.b = ((byte)(this.b | 0x10));
    } else {
      this.b = ((byte)(this.b & 0xEF));
    }
  }
  
  boolean b()
  {
    return (this.b & 0xFF & 0x20) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.b = ((byte)(this.b | 0x20));
    } else {
      this.b = ((byte)(this.b & 0xDF));
    }
  }
  
  boolean c()
  {
    return (this.b & 0xFF & 0x40) == 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.b = ((byte)(this.b & 0xBF));
    } else {
      this.b = ((byte)(this.b | 0x40));
    }
  }
  
  boolean d()
  {
    return (this.b & 0xFF & 0x80) != 0;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.b = ((byte)(this.b | 0x80));
    } else {
      this.b = ((byte)(this.b & 0x7F));
    }
  }
  
  byte e()
  {
    return (byte)(this.b & 0xFF & 0xF);
  }
  
  void a(byte paramByte)
  {
    this.b = ((byte)(this.b & 0xF0));
    this.b = ((byte)(this.b | paramByte));
  }
  
  boolean f()
  {
    return (this.c & 0xFF & 0x10) != 0;
  }
  
  boolean g()
  {
    return (this.c & 0xFF & 0x20) != 0;
  }
  
  static boolean b(byte paramByte)
  {
    return (paramByte & 0xFF & 0x10) != 0;
  }
  
  static byte a(byte paramByte, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramByte = (byte)(paramByte | 0x10);
    } else {
      paramByte = (byte)(paramByte & 0xEF);
    }
    return paramByte;
  }
  
  static boolean c(byte paramByte)
  {
    return (paramByte & 0xFF & 0x20) != 0;
  }
  
  static byte b(byte paramByte, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramByte = (byte)(paramByte | 0x20);
    } else {
      paramByte = (byte)(paramByte & 0xDF);
    }
    return paramByte;
  }
  
  static boolean d(byte paramByte)
  {
    return (paramByte & 0xFF & 0x40) == 0;
  }
  
  static byte c(byte paramByte, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramByte = (byte)(paramByte & 0xBF);
    } else {
      paramByte = (byte)(paramByte | 0x40);
    }
    return paramByte;
  }
  
  static boolean e(byte paramByte)
  {
    return (paramByte & 0xFF & 0x80) != 0;
  }
  
  static byte d(byte paramByte, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramByte = (byte)(paramByte | 0x80);
    } else {
      paramByte = (byte)(paramByte & 0x7F);
    }
    return paramByte;
  }
  
  static int f(byte paramByte)
  {
    return paramByte & 0xFF & 0xF;
  }
  
  static byte a(byte paramByte, int paramInt)
  {
    paramByte = (byte)(paramByte & 0xF0);
    paramByte = (byte)(paramByte | (byte)paramInt);
    return paramByte;
  }
  
  static byte g(byte paramByte)
  {
    return (byte)(paramByte & 0xFF & 0xCF);
  }
  
  static byte e(byte paramByte, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramByte = (byte)(paramByte | 0x10);
    } else {
      paramByte = (byte)(paramByte & 0xEF);
    }
    return paramByte;
  }
  
  static boolean h(byte paramByte)
  {
    return (paramByte & 0xFF & 0x20) != 0;
  }
  
  static byte f(byte paramByte, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramByte = (byte)(paramByte | 0x20);
    } else {
      paramByte = (byte)(paramByte & 0xDF);
    }
    return paramByte;
  }
  
  static boolean a(int paramInt)
  {
    return (paramInt == 5) || (paramInt == 6);
  }
  
  static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
    case 5: 
    case 6: 
    case 8: 
    case 10: 
    case 12: 
    case 13: 
      return true;
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */