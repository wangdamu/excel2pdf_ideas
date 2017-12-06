package com.aspose.cells;

public class VbaProjectReference
{
  int a;
  String b;
  String c;
  String d;
  String e;
  byte[] f;
  int g;
  
  VbaProjectReference() {}
  
  VbaProjectReference(int type, String name, String libid, String p1, String p2)
  {
    this.a = type;
    this.b = name;
    this.c = libid;
    this.d = p1;
    this.e = p2;
  }
  
  void a(VbaProjectReference paramVbaProjectReference)
  {
    this.a = paramVbaProjectReference.a;
    this.b = paramVbaProjectReference.b;
    this.c = paramVbaProjectReference.c;
    this.d = paramVbaProjectReference.d;
    this.e = paramVbaProjectReference.e;
    this.f = paramVbaProjectReference.f;
    this.g = paramVbaProjectReference.g;
  }
  
  public int getType()
  {
    return this.a;
  }
  
  public String getName()
  {
    return this.b;
  }
  
  public void setName(String value)
  {
    this.b = value;
  }
  
  public String getLibid()
  {
    return this.c;
  }
  
  public void setLibid(String value)
  {
    this.c = value;
  }
  
  public String getTwiddledlibid()
  {
    return this.d;
  }
  
  public void setTwiddledlibid(String value)
  {
    this.d = value;
  }
  
  public String getExtendedLibid()
  {
    return this.e;
  }
  
  public void setExtendedLibid(String value)
  {
    this.e = value;
  }
  
  public String getRelativeLibid()
  {
    return this.d;
  }
  
  public void setRelativeLibid(String value)
  {
    this.d = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/VbaProjectReference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */