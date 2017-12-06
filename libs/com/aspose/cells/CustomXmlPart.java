package com.aspose.cells;

public class CustomXmlPart
{
  byte[] a;
  byte[] b;
  
  CustomXmlPart() {}
  
  CustomXmlPart(byte[] data, byte[] shemaData)
  {
    this.a = data;
    this.b = shemaData;
  }
  
  public byte[] getData()
  {
    return this.a;
  }
  
  public void setData(byte[] value)
  {
    this.a = value;
  }
  
  public byte[] getSchemaData()
  {
    return this.b;
  }
  
  public void setSchemaData(byte[] value)
  {
    this.b = value;
  }
  
  void a(CustomXmlPart paramCustomXmlPart)
  {
    if (paramCustomXmlPart.a != null)
    {
      this.a = new byte[paramCustomXmlPart.a.length];
      System.arraycopy(paramCustomXmlPart.a, 0, this.a, 0, this.a.length);
    }
    if (paramCustomXmlPart.b != null)
    {
      this.b = new byte[paramCustomXmlPart.b.length];
      System.arraycopy(paramCustomXmlPart.b, 0, this.b, 0, this.b.length);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CustomXmlPart.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */