package com.aspose.cells;

class zbvu
  extends ExternalConnection
{
  char a = '.';
  char b = ',';
  char c;
  int d = 1252;
  String y;
  boolean z;
  int A = 3158017;
  int B = 1;
  znm C;
  
  zbvu(ExternalConnectionCollection paramExternalConnectionCollection)
  {
    super(paramExternalConnectionCollection);
  }
  
  int a()
  {
    switch (this.A & 0x3)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    }
    return 1;
  }
  
  void a(int paramInt)
  {
    this.A &= 0xFFFFFFFC;
    switch (paramInt)
    {
    case 1: 
      this.A |= 0x1;
      break;
    case 2: 
      this.A |= 0x2;
      break;
    }
  }
  
  boolean e()
  {
    return (this.A & 0x1000) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.A |= 0x1000;
    } else {
      this.A &= 0xEFFF;
    }
  }
  
  boolean f()
  {
    return (this.A & 0x2000) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.A |= 0x2000;
    } else {
      this.A &= 0xDFFF;
    }
  }
  
  boolean g()
  {
    return (this.A & 0x4000) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.A |= 0x4000;
    } else {
      this.A &= 0xBFFF;
    }
  }
  
  boolean h()
  {
    return (this.A & 0x8000) != 0;
  }
  
  void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.A |= 0x8000;
    } else {
      this.A &= 0xFFFF7FFF;
    }
  }
  
  boolean i()
  {
    return (this.A & 0x10000) != 0;
  }
  
  void e(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.A |= 0x10000;
    } else {
      this.A &= 0xFFFEFFFF;
    }
  }
  
  boolean j()
  {
    return (this.A & 0x20000) != 0;
  }
  
  void f(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.A |= 0x20000;
    } else {
      this.A &= 0xFFFDFFFF;
    }
  }
  
  int k()
  {
    switch (this.A & 0xC0000)
    {
    case 0: 
      return 0;
    case 262144: 
      return 1;
    }
    return 2;
  }
  
  void b(int paramInt)
  {
    this.A &= 0xFFFF3FFF;
    switch (paramInt)
    {
    case 0: 
      break;
    case 1: 
      this.A |= 0x40000;
      break;
    case 2: 
      this.A |= 0x80000;
      break;
    }
  }
  
  boolean l()
  {
    return (this.A & 0x200000) != 0;
  }
  
  void g(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.A |= 0x200000;
    } else {
      this.A &= 0xFFDFFFFF;
    }
  }
  
  boolean m()
  {
    return (this.A & 0x400000) != 0;
  }
  
  void h(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.A |= 0x400000;
    } else {
      this.A &= 0xFFBFFFFF;
    }
  }
  
  char n()
  {
    return this.c;
  }
  
  void a(char paramChar)
  {
    h(true);
    this.c = paramChar;
  }
  
  znm o()
  {
    if (this.C == null) {
      this.C = new znm();
    }
    return this.C;
  }
  
  static int c(int paramInt)
  {
    switch (paramInt)
    {
    case 850: 
      return 2;
    case 1256: 
      return 7;
    case 775: 
      return 8;
    case 28594: 
      return 9;
    case 1257: 
      return 10;
    case 852: 
      return 11;
    case 28592: 
      return 12;
    case 10029: 
      return 13;
    case 1250: 
      return 14;
    case 936: 
      return 16;
    case 950: 
      return 19;
    case 10082: 
      return 23;
    case 866: 
      return 866;
    case 28595: 
      return 25;
    case 20866: 
      return 26;
    case 21866: 
      return 27;
    case 10007: 
      return 28;
    case 1251: 
      return 29;
    case 28603: 
      return 30;
    case 863: 
      return 32;
    case 737: 
      return 34;
    case 28597: 
      return 35;
    case 10006: 
      return 36;
    case 1253: 
      return 37;
    case 869: 
      return 38;
    case 1255: 
      return 43;
    case 861: 
      return 57;
    case 10079: 
      return 58;
    case 932: 
      return 72;
    case 949: 
      return 73;
    case 1361: 
      return 74;
    case 28605: 
      return 78;
    case 865: 
      return 79;
    case 855: 
      return 81;
    case 437: 
      return 82;
    case 860: 
      return 84;
    case 10010: 
      return 85;
    case 20261: 
      return 87;
    case 874: 
      return 91;
    case 857: 
      return 92;
    case 28599: 
      return 93;
    case 10081: 
      return 94;
    case 1254: 
      return 95;
    case 10017: 
      return 96;
    case 65000: 
      return 97;
    case 65001: 
      return 98;
    case 20127: 
      return 99;
    case 1258: 
      return 100;
    case 28591: 
      return 104;
    }
    return 1;
  }
  
  static int d(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return 850;
    case 7: 
      return 1256;
    case 8: 
      return 775;
    case 9: 
      return 28594;
    case 10: 
      return 1257;
    case 11: 
      return 852;
    case 12: 
      return 28592;
    case 13: 
      return 10029;
    case 14: 
      return 1250;
    case 16: 
      return 936;
    case 19: 
      return 950;
    case 23: 
      return 10082;
    case 24: 
      return 866;
    case 25: 
      return 28595;
    case 26: 
      return 20866;
    case 27: 
      return 21866;
    case 28: 
      return 10007;
    case 29: 
      return 1251;
    case 30: 
      return 28603;
    case 32: 
      return 863;
    case 34: 
      return 737;
    case 35: 
      return 28597;
    case 36: 
      return 10006;
    case 37: 
      return 1253;
    case 38: 
      return 869;
    case 43: 
      return 1255;
    case 57: 
      return 861;
    case 58: 
      return 10079;
    case 72: 
      return 932;
    case 73: 
      return 949;
    case 74: 
      return 1361;
    case 78: 
      return 28605;
    case 79: 
      return 865;
    case 81: 
      return 855;
    case 82: 
      return 437;
    case 84: 
      return 860;
    case 85: 
      return 10010;
    case 87: 
      return 20261;
    case 91: 
      return 874;
    case 92: 
      return 857;
    case 93: 
      return 28599;
    case 94: 
      return 10081;
    case 95: 
      return 1254;
    case 96: 
      return 10017;
    case 97: 
      return 65000;
    case 98: 
      return 65001;
    case 99: 
      return 20127;
    case 100: 
      return 1258;
    case 28591: 
      return 104;
    }
    return 1252;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */