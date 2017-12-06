package com.aspose.cells;

class zaoc
  implements zahh
{
  private za a = new za(this);
  private char[] b = new char[16];
  private int c = 0;
  private int d = 0;
  private int e = 0;
  private int f = 0;
  private boolean g = false;
  private boolean h = true;
  
  public int b()
  {
    return this.e - (this.c << 1) - this.c;
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    if (this.h) {
      b(this.e + paramInt2);
    }
    int tmp27_26 = (this.f - 3);
    char[] tmp27_18 = this.b;
    tmp27_18[tmp27_26] = ((char)(tmp27_18[tmp27_26] + (char)paramInt2));
    this.a.a(paramInt1, paramInt2);
    this.e += paramInt2;
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    if (this.h) {
      b(this.e + paramInt2);
    }
    this.a.a(paramInt1, paramInt2);
    this.e += paramInt2;
  }
  
  public void a(String paramString)
  {
    this.a.a(paramString);
    if (this.g) {
      b(0, paramString.length());
    } else {
      a(0, paramString.length());
    }
  }
  
  public void a(char paramChar)
  {
    if (this.h) {
      b(this.e + 1);
    }
    this.b[(this.e++)] = paramChar;
    if (!this.g)
    {
      int tmp51_50 = (this.f - 4);
      char[] tmp51_42 = this.b;
      tmp51_42[tmp51_50] = ((char)(tmp51_42[tmp51_50] + '\001'));
    }
  }
  
  public void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.a.a(paramArrayOfChar);
    if (this.g) {
      b(paramInt1, paramInt2);
    } else {
      a(paramInt1, paramInt2);
    }
  }
  
  public void b(char paramChar)
  {
    this.b[(this.e - 1)] = paramChar;
  }
  
  public String toString()
  {
    return "LinkedBlockStringBuilder: Blocks[" + this.c + "], ContentLength[" + b() + "]";
  }
  
  public boolean a()
  {
    return this.h;
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public void a(int paramInt)
  {
    b(this.e + paramInt);
  }
  
  private void b(int paramInt)
  {
    if (paramInt > this.b.length)
    {
      char[] arrayOfChar = new char[paramInt + 256];
      System.arraycopy(this.b, 0, arrayOfChar, 0, this.e);
      this.b = arrayOfChar;
    }
  }
  
  private class za
  {
    private zaoc b;
    private String c;
    private StringBuilder d;
    private char[] e;
    private byte f;
    
    za(zaoc paramzaoc)
    {
      this.b = paramzaoc;
    }
    
    void a(String paramString)
    {
      this.c = paramString;
      this.f = 0;
    }
    
    void a(char[] paramArrayOfChar)
    {
      this.e = paramArrayOfChar;
      this.f = 2;
    }
    
    void a(int paramInt1, int paramInt2)
    {
      switch (this.f)
      {
      case 2: 
        System.arraycopy(this.e, paramInt1, zaoc.a(this.b), zaoc.b(this.b), paramInt2);
        break;
      case 1: 
        this.d.getChars(paramInt1, paramInt1 + paramInt2, zaoc.a(this.b), zaoc.b(this.b));
        break;
      default: 
        this.c.getChars(paramInt1, paramInt1 + paramInt2, zaoc.a(this.b), zaoc.b(this.b));
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaoc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */