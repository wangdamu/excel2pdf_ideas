package com.aspose.cells;

public class ConnectionParameter
{
  Object a;
  String b;
  int c;
  boolean d;
  int e;
  ExternalConnection f;
  
  ConnectionParameter(ExternalConnection conn)
  {
    this.f = conn;
    this.d = false;
    this.c = 1;
    this.e = 0;
  }
  
  public int getSqlType()
  {
    return this.e;
  }
  
  public void setSqlType(int value)
  {
    this.e = value;
  }
  
  public boolean getRefreshOnChange()
  {
    return this.d;
  }
  
  public void setRefreshOnChange(boolean value)
  {
    this.d = value;
  }
  
  public String getPrompt()
  {
    if ((this.c == 1) && ((this.a instanceof String))) {
      return (String)this.a;
    }
    return null;
  }
  
  public void setPrompt(String value)
  {
    this.a = value;
  }
  
  public int getType()
  {
    return this.c;
  }
  
  public void setType(int value)
  {
    this.c = value;
  }
  
  public String getName()
  {
    return this.b;
  }
  
  public void setName(String value)
  {
    this.b = value;
  }
  
  public String getCellReference()
  {
    if ((this.c == 0) && (this.a != null))
    {
      byte[] arrayOfByte = (byte[])this.a;
      WorksheetCollection localWorksheetCollection = this.f.x.b.getWorksheets();
      String str = localWorksheetCollection.d().a(-1, -1, arrayOfByte, 0, 0, true, false);
      if (str != null) {
        return str.substring(1);
      }
    }
    return null;
  }
  
  public void setCellReference(String value)
  {
    this.c = 0;
    WorksheetCollection localWorksheetCollection = this.f.x.b.getWorksheets();
    this.a = localWorksheetCollection.y().a(-1, value, 0, 0, 0, 32, false, true, true);
  }
  
  public Object getValue()
  {
    return this.a;
  }
  
  public void setValue(Object value)
  {
    this.a = value;
  }
  
  void a(ConnectionParameter paramConnectionParameter)
  {
    this.a = paramConnectionParameter.a;
    this.b = paramConnectionParameter.getName();
    this.c = paramConnectionParameter.getType();
    this.d = paramConnectionParameter.getRefreshOnChange();
    this.e = paramConnectionParameter.getSqlType();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ConnectionParameter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */