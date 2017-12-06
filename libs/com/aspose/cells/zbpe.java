package com.aspose.cells;

class zbpe
  implements zahh
{
  private char[] a;
  private int b = 0;
  private boolean c = true;
  
  zbpe()
  {
    this.a = new char[64];
  }
  
  zbpe(int paramInt)
  {
    this.a = new char[paramInt];
  }
  
  public void a(String paramString)
  {
    if (this.c) {
      b(this.b + paramString.length());
    }
    paramString.getChars(0, 0 + paramString.length(), this.a, this.b);
    this.b += paramString.length();
  }
  
  public void a(char paramChar)
  {
    if (this.c) {
      b(this.b + 1);
    }
    this.a[(this.b++)] = paramChar;
  }
  
  public void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.c) {
      b(this.b + paramInt2);
    }
    System.arraycopy(paramArrayOfChar, paramInt1, this.a, this.b, paramInt2);
    this.b += paramInt2;
  }
  
  public void b(char paramChar)
  {
    this.a[(this.b - 1)] = paramChar;
  }
  
  public void b()
  {
    this.b = 0;
  }
  
  public boolean a()
  {
    return this.c;
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public void a(int paramInt)
  {
    b(this.b + paramInt);
  }
  
  public String c()
  {
    return new String(this.a, 0, this.b);
  }
  
  public String toString()
  {
    return new String(this.a, 0, this.b);
  }
  
  private void b(int paramInt)
  {
    if (paramInt > this.a.length)
    {
      char[] arrayOfChar = new char[paramInt + 256];
      System.arraycopy(this.a, 0, arrayOfChar, 0, this.b);
      this.a = arrayOfChar;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbpe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */