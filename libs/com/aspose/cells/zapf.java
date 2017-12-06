package com.aspose.cells;

class zapf
  extends Exception
{
  private String a;
  private int b;
  private String[] c;
  
  public zapf() {}
  
  public zapf(int paramInt, String[] paramArrayOfString, String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    this.a = paramString;
    this.b = paramInt;
    this.c = paramArrayOfString;
  }
  
  public zapf(int paramInt, String paramString)
  {
    super(paramString);
    this.a = paramString;
    this.b = paramInt;
  }
  
  public zapf(int paramInt, String[] paramArrayOfString)
  {
    this.b = paramInt;
    this.c = paramArrayOfString;
  }
  
  public String getMessage()
  {
    return this.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zapf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */