package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

public class ConnectionParameterCollection
  extends CollectionBase
{
  ExternalConnection a;
  
  ConnectionParameterCollection(ExternalConnection conn)
  {
    this.a = conn;
  }
  
  public ConnectionParameter get(int index)
  {
    if ((index < 0) || (index >= this.InnerList.size())) {
      return null;
    }
    return (ConnectionParameter)this.InnerList.get(index);
  }
  
  public void set(int index, ConnectionParameter value)
  {
    this.InnerList.set(index, value);
  }
  
  int a(ConnectionParameter paramConnectionParameter)
  {
    zf.a(this.InnerList, paramConnectionParameter);
    return getCount() - 1;
  }
  
  public ConnectionParameter get(String connParamName)
  {
    for (int i = 0; i < getCount(); i++)
    {
      ConnectionParameter localConnectionParameter = (ConnectionParameter)this.InnerList.get(i);
      if (zw.b(localConnectionParameter.getName(), connParamName)) {
        return localConnectionParameter;
      }
    }
    return null;
  }
  
  void a(ExternalConnection paramExternalConnection, ConnectionParameterCollection paramConnectionParameterCollection)
  {
    ConnectionParameter localConnectionParameter = null;
    for (int i = 0; i < paramConnectionParameterCollection.getCount(); i++)
    {
      localConnectionParameter = new ConnectionParameter(paramExternalConnection);
      localConnectionParameter.a(paramConnectionParameterCollection.get(i));
      a(localConnectionParameter);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ConnectionParameterCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */