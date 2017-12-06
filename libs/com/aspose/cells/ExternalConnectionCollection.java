package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

public class ExternalConnectionCollection
  extends CollectionBase
{
  String a;
  Workbook b;
  
  ExternalConnectionCollection(Workbook wb)
  {
    this.b = wb;
    this.a = zaty.a;
  }
  
  public ExternalConnection get(int index)
  {
    return (ExternalConnection)this.InnerList.get(index);
  }
  
  public void set(int index, ExternalConnection value)
  {
    this.InnerList.set(index, value);
  }
  
  int a(ExternalConnection paramExternalConnection)
  {
    zf.a(this.InnerList, paramExternalConnection);
    return getCount() - 1;
  }
  
  boolean a(int paramInt, String paramString)
  {
    ExternalConnection localExternalConnection = getExternalConnectionById(paramInt);
    if ((localExternalConnection != null) && (localExternalConnection.getType() == 4))
    {
      WebQueryConnection localWebQueryConnection = (WebQueryConnection)localExternalConnection;
      if (localWebQueryConnection.isXml())
      {
        localWebQueryConnection.setUrl(paramString);
        return true;
      }
    }
    return false;
  }
  
  int a(String paramString)
  {
    WebQueryConnection localWebQueryConnection = new WebQueryConnection(this);
    localWebQueryConnection.setType(4);
    localWebQueryConnection.l = (getCount() + 1);
    localWebQueryConnection.setUrl(paramString);
    localWebQueryConnection.setXml(true);
    localWebQueryConnection.p = ("Connection" + localWebQueryConnection.l);
    zf.a(this.InnerList, localWebQueryConnection);
    return getCount() - 1;
  }
  
  public ExternalConnection get(String connectionName)
  {
    for (int i = 0; i < getCount(); i++)
    {
      ExternalConnection localExternalConnection = (ExternalConnection)this.InnerList.get(i);
      if (zw.b(localExternalConnection.getName(), connectionName)) {
        return localExternalConnection;
      }
    }
    return null;
  }
  
  public ExternalConnection getExternalConnectionById(int connId)
  {
    ExternalConnection localExternalConnection = null;
    for (int i = 0; i < getCount(); i++)
    {
      localExternalConnection = (ExternalConnection)this.InnerList.get(i);
      if (localExternalConnection.getConnectionId() == connId) {
        return localExternalConnection;
      }
    }
    return null;
  }
  
  void a(ExternalConnectionCollection paramExternalConnectionCollection)
  {
    this.a = paramExternalConnectionCollection.a;
    for (int i = 0; i < paramExternalConnectionCollection.getCount(); i++)
    {
      Object localObject = null;
      if ((paramExternalConnectionCollection.get(i) instanceof DBConnection))
      {
        localObject = new DBConnection(this);
        ((ExternalConnection)localObject).a(paramExternalConnectionCollection.get(i));
      }
      else if ((paramExternalConnectionCollection.get(i) instanceof zbvu))
      {
        localObject = new zbvu(this);
        ((ExternalConnection)localObject).a(paramExternalConnectionCollection.get(i));
      }
      else if ((paramExternalConnectionCollection.get(i) instanceof WebQueryConnection))
      {
        localObject = new WebQueryConnection(this);
        ((ExternalConnection)localObject).a(paramExternalConnectionCollection.get(i));
      }
      if (null != localObject) {
        a((ExternalConnection)localObject);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ExternalConnectionCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */