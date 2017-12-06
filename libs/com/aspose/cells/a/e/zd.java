package com.aspose.cells.a.e;

public final class zd
{
  private final String a;
  private final int b;
  
  public zd(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    this.a = paramString;
    this.b = paramString.toUpperCase().hashCode();
  }
  
  public boolean equals(Object obj)
  {
    Object localObject;
    if ((obj instanceof String))
    {
      localObject = (String)obj;
      return this.a.equalsIgnoreCase((String)localObject);
    }
    if ((obj instanceof zd))
    {
      localObject = (zd)obj;
      return this.a.equalsIgnoreCase(((zd)localObject).a);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.b;
  }
  
  public String toString()
  {
    return this.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/e/zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */