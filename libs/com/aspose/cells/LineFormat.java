package com.aspose.cells;

public class LineFormat
  extends FillFormat
{
  private int f;
  zor d;
  private int g = 9525;
  int e;
  
  LineFormat(ShapeFormat parent)
  {
    super(parent);
  }
  
  boolean g()
  {
    return getFillType() != 1;
  }
  
  Color a()
  {
    return Color.getBlack();
  }
  
  public int getCompoundType()
  {
    switch (this.f & 0xF)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 4: 
      return 4;
    }
    return 0;
  }
  
  public void setCompoundType(int value)
  {
    int i = 0;
    switch (value)
    {
    case 0: 
      i = 0;
      break;
    case 1: 
      i = 1;
      break;
    case 2: 
      i = 2;
      break;
    case 3: 
      i = 3;
      break;
    case 4: 
      i = 4;
      break;
    }
    this.f &= 0xFFFFFFF0;
    this.f |= i;
    d(1);
  }
  
  public int getDashStyle()
  {
    switch (this.f & 0xF0)
    {
    case 0: 
      return 6;
    case 16: 
      return 0;
    case 32: 
      return 1;
    case 48: 
      return 2;
    case 64: 
      return 3;
    case 80: 
      return 4;
    case 96: 
      return 5;
    case 112: 
      return 7;
    }
    return 6;
  }
  
  public void setDashStyle(int value)
  {
    int i = 0;
    switch (value)
    {
    case 6: 
      i = 0;
      break;
    case 0: 
      i = 16;
      break;
    case 1: 
      i = 32;
      break;
    case 2: 
      i = 48;
      break;
    case 3: 
      i = 64;
      break;
    case 4: 
      i = 80;
      break;
    case 5: 
      i = 96;
      break;
    case 7: 
      i = 112;
      break;
    }
    this.f &= 0xFF0F;
    this.f |= i;
    d(2);
  }
  
  public int getCapType()
  {
    switch (this.f & 0xF00)
    {
    case 0: 
      return 2;
    case 256: 
      return 3;
    case 512: 
      return 1;
    case 768: 
      return 0;
    }
    return 2;
  }
  
  public void setCapType(int value)
  {
    int i = 0;
    switch (value)
    {
    case 2: 
      i = 0;
      break;
    case 3: 
      i = 256;
      break;
    case 1: 
      i = 512;
      break;
    case 0: 
      i = 768;
      break;
    }
    this.f &= 0xF0FF;
    this.f |= i;
    d(3);
  }
  
  public int getJoinType()
  {
    switch (this.f & 0xF000)
    {
    case 0: 
      return 0;
    case 4096: 
      return 3;
    case 8192: 
      return 1;
    case 16384: 
      return 2;
    }
    return 2;
  }
  
  public void setJoinType(int value)
  {
    int i = 0;
    switch (value)
    {
    case 0: 
      i = 0;
      break;
    case 3: 
      i = 4096;
      break;
    case 1: 
      i = 8192;
      break;
    case 2: 
      i = 16384;
      break;
    }
    this.f &= 0xFFFF0FFF;
    this.f |= i;
    d(4);
  }
  
  public int getBeginArrowheadStyle()
  {
    switch (this.f >> 16 & 0xF)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 3;
    case 3: 
      return 5;
    case 4: 
      return 4;
    case 5: 
      return 2;
    }
    return 0;
  }
  
  public void setBeginArrowheadStyle(int value)
  {
    int i = 0;
    switch (value)
    {
    case 0: 
      i = 0;
      break;
    case 1: 
      i = 1;
      break;
    case 3: 
      i = 2;
      break;
    case 5: 
      i = 3;
      break;
    case 4: 
      i = 4;
      break;
    case 2: 
      i = 5;
      break;
    }
    this.f &= 0xFFF0FFFF;
    this.f |= i << 16;
    d(5);
  }
  
  public int getBeginArrowheadWidth()
  {
    switch (this.f >> 20 & 0x3)
    {
    case 0: 
      return 1;
    case 1: 
      return 0;
    case 2: 
      return 2;
    }
    return 1;
  }
  
  public void setBeginArrowheadWidth(int value)
  {
    int i = 0;
    switch (value)
    {
    case 1: 
      i = 0;
      break;
    case 0: 
      i = 1;
      break;
    case 2: 
      i = 2;
      break;
    }
    this.f &= 0xFFCFFFFF;
    this.f |= i << 20;
    d(6);
  }
  
  public int getBeginArrowheadLength()
  {
    switch (this.f >> 22 & 0x3)
    {
    case 0: 
      return 1;
    case 1: 
      return 0;
    case 2: 
      return 2;
    }
    return 1;
  }
  
  public void setBeginArrowheadLength(int value)
  {
    int i = 0;
    switch (value)
    {
    case 1: 
      i = 0;
      break;
    case 0: 
      i = 1;
      break;
    case 2: 
      i = 2;
      break;
    }
    this.f &= 0xFF3FFFFF;
    this.f |= i << 22;
    d(6);
  }
  
  public int getEndArrowheadStyle()
  {
    switch (this.f >> 24 & 0xF)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 3;
    case 3: 
      return 5;
    case 4: 
      return 4;
    case 5: 
      return 2;
    }
    return 0;
  }
  
  public void setEndArrowheadStyle(int value)
  {
    int i = 0;
    switch (value)
    {
    case 0: 
      i = 0;
      break;
    case 1: 
      i = 1;
      break;
    case 3: 
      i = 2;
      break;
    case 5: 
      i = 3;
      break;
    case 4: 
      i = 4;
      break;
    case 2: 
      i = 5;
      break;
    }
    this.f &= 0xF0FFFFFF;
    this.f |= i << 24;
    d(8);
  }
  
  public int getEndArrowheadWidth()
  {
    switch (this.f >> 28 & 0x3)
    {
    case 0: 
      return 1;
    case 1: 
      return 0;
    case 2: 
      return 2;
    }
    return 1;
  }
  
  public void setEndArrowheadWidth(int value)
  {
    int i = 0;
    switch (value)
    {
    case 1: 
      i = 0;
      break;
    case 0: 
      i = 1;
      break;
    case 2: 
      i = 2;
      break;
    }
    this.f &= 0xCFFFFFFF;
    this.f |= i << 28;
    d(9);
  }
  
  public int getEndArrowheadLength()
  {
    switch (this.f >> 30 & 0x3)
    {
    case 0: 
      return 1;
    case 1: 
      return 0;
    case 2: 
      return 2;
    }
    return 1;
  }
  
  public void setEndArrowheadLength(int value)
  {
    int i = 0;
    switch (value)
    {
    case 1: 
      i = 0;
      break;
    case 0: 
      i = 1;
      break;
    case 2: 
      i = 2;
      break;
    }
    this.f &= 0x3FFFFFFF;
    this.f |= i << 30;
    d(9);
  }
  
  int h()
  {
    switch (this.f >> 32 & 0x3)
    {
    case 1: 
      return 1;
    }
    return 0;
  }
  
  void b(int paramInt)
  {
    int i = 0;
    switch (paramInt)
    {
    case 1: 
      i = 1;
      break;
    }
    this.f &= 0xFFFFFFFC;
    this.f |= i << 32;
    d(11);
  }
  
  public double getWeight()
  {
    return zbxp.c(j());
  }
  
  public void setWeight(double value)
  {
    c(zbxp.f(value));
  }
  
  zor i()
  {
    if (this.d == null) {
      this.d = new zor();
    }
    return this.d;
  }
  
  void a(LineFormat paramLineFormat, CopyOptions paramCopyOptions)
  {
    this.g = paramLineFormat.g;
    this.f = paramLineFormat.f;
    if ((paramCopyOptions == null) || (!paramCopyOptions.b)) {
      this.e = paramLineFormat.e;
    }
    super.a(paramLineFormat, paramCopyOptions);
  }
  
  int j()
  {
    return this.g;
  }
  
  void c(int paramInt)
  {
    this.g = paramInt;
    d(0);
  }
  
  void d(int paramInt)
  {
    this.e |= 1 << paramInt;
  }
  
  boolean e(int paramInt)
  {
    return (this.e >> paramInt & 0x1) != 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/LineFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */