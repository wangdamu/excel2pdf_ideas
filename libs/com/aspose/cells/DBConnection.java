package com.aspose.cells;

public class DBConnection
  extends ExternalConnection
{
  String a;
  String b;
  int c = 2;
  String d;
  
  DBConnection(ExternalConnectionCollection parent)
  {
    super(parent);
  }
  
  public String getConnectionInfo()
  {
    return this.d;
  }
  
  public void setConnectionInfo(String value)
  {
    this.d = value;
  }
  
  public int getCommandType()
  {
    return this.c;
  }
  
  public void setCommandType(int value)
  {
    this.c = value;
  }
  
  public String getCommand()
  {
    return this.a;
  }
  
  public void setCommand(String value)
  {
    this.a = value;
  }
  
  String a()
  {
    return this.b;
  }
  
  void a(String paramString)
  {
    this.b = paramString;
  }
  
  void a(ExternalConnection paramExternalConnection)
  {
    super.a(paramExternalConnection);
    DBConnection localDBConnection = (DBConnection)paramExternalConnection;
    this.a = localDBConnection.getCommand();
    this.b = localDBConnection.a();
    this.c = localDBConnection.getCommandType();
    this.d = localDBConnection.getConnectionInfo();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DBConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */