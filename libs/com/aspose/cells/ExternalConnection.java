package com.aspose.cells;

import java.util.ArrayList;

public abstract class ExternalConnection
{
  zwc e;
  zwd f;
  ConnectionParameterCollection g;
  znj h;
  ArrayList i;
  int j;
  String k;
  int l;
  short m;
  int n;
  byte o;
  String p;
  String q;
  int r = 1;
  byte s;
  boolean t;
  String u;
  String v;
  int w;
  ExternalConnectionCollection x;
  
  znj b()
  {
    if (this.h == null) {
      this.h = new znj();
    }
    return this.h;
  }
  
  public int getId()
  {
    return this.l;
  }
  
  ExternalConnection(ExternalConnectionCollection parent)
  {
    this.x = parent;
    this.n = 0;
    this.r = 1;
    this.o = 0;
    this.t = false;
    this.j = 0;
  }
  
  public int getType()
  {
    return zwl.d(this.w);
  }
  
  public void setType(int value)
  {
    this.w = zwl.e(value);
  }
  
  public String getSourceFile()
  {
    return this.v;
  }
  
  public void setSourceFile(String value)
  {
    this.v = value;
  }
  
  public String getSSOId()
  {
    return this.u;
  }
  
  public void setSSOId(String value)
  {
    this.u = value;
  }
  
  public boolean getSavePassword()
  {
    return this.t;
  }
  
  public void setSavePassword(boolean value)
  {
    this.t = value;
  }
  
  public boolean getSaveData()
  {
    return (this.m & 0x40) != 0;
  }
  
  public void setSaveData(boolean value)
  {
    if (value) {
      this.m = ((short)(this.m | 0x40));
    } else {
      this.m = ((short)(this.m & 0xFFFFFFBF));
    }
  }
  
  public boolean getRefreshOnLoad()
  {
    return (this.m & 0x20) != 0;
  }
  
  public void setRefreshOnLoad(boolean value)
  {
    if (value) {
      this.m = ((short)(this.m | 0x20));
    } else {
      this.m = ((short)(this.m & 0xFFFFFFDF));
    }
  }
  
  byte c()
  {
    return this.s;
  }
  
  public int getReconnectionMethodType()
  {
    return this.r;
  }
  
  public void setReconnectionMethodType(int value)
  {
    this.r = value;
  }
  
  /**
   * @deprecated
   */
  public int getReconnectionMethod()
  {
    return this.r;
  }
  
  /**
   * @deprecated
   */
  public void setReconnectionMethod(int value)
  {
    this.r = value;
  }
  
  public boolean getOnlyUseConnectionFile()
  {
    return (this.m & 0x8) != 0;
  }
  
  public void setOnlyUseConnectionFile(boolean value)
  {
    if (value) {
      this.m = ((short)(this.m | 0x8));
    } else {
      this.m = ((short)(this.m & 0xFFFFFFF7));
    }
  }
  
  public String getOdcFile()
  {
    return this.q;
  }
  
  public void setOdcFile(String value)
  {
    this.q = value;
  }
  
  public boolean isNew()
  {
    return (this.m & 0x2) != 0;
  }
  
  public void setNew(boolean value)
  {
    if (value) {
      this.m = ((short)(this.m | 0x2));
    } else {
      this.m = ((short)(this.m & 0xFFFFFFFD));
    }
  }
  
  public String getName()
  {
    return this.p;
  }
  
  public void setName(String value)
  {
    this.p = value;
  }
  
  byte d()
  {
    return this.o;
  }
  
  public boolean getKeepAlive()
  {
    return (this.m & 0x1) != 0;
  }
  
  public void setKeepAlive(boolean value)
  {
    if (value) {
      this.m = ((short)(this.m | 0x1));
    } else {
      this.m = ((short)(this.m & 0xFFFFFFFE));
    }
  }
  
  public int getRefreshInternal()
  {
    return this.n;
  }
  
  public void setRefreshInternal(int value)
  {
    this.n = value;
  }
  
  public int getConnectionId()
  {
    return this.l;
  }
  
  public String getConnectionDescription()
  {
    return this.k;
  }
  
  public void setConnectionDescription(String value)
  {
    this.k = value;
  }
  
  public boolean isDeleted()
  {
    return (this.m & 0x4) != 0;
  }
  
  public void setDeleted(boolean value)
  {
    if (value) {
      this.m = ((short)(this.m | 0x4));
    } else {
      this.m = ((short)(this.m & 0xFFFFFFFB));
    }
  }
  
  public int getCredentialsMethodType()
  {
    return this.j;
  }
  
  public void setCredentialsMethodType(int value)
  {
    this.j = value;
  }
  
  /**
   * @deprecated
   */
  public int getCredentials()
  {
    return this.j;
  }
  
  /**
   * @deprecated
   */
  public void setCredentials(int value)
  {
    this.j = value;
  }
  
  public boolean getBackgroundRefresh()
  {
    return (this.m & 0x10) != 0;
  }
  
  public void setBackgroundRefresh(boolean value)
  {
    if (value) {
      this.m = ((short)(this.m | 0x10));
    } else {
      this.m = ((short)(this.m & 0xFFFFFFEF));
    }
  }
  
  public ConnectionParameterCollection getParameters()
  {
    if (null == this.g) {
      this.g = new ConnectionParameterCollection(this);
    }
    return this.g;
  }
  
  void a(ExternalConnection paramExternalConnection)
  {
    getParameters().a(this, paramExternalConnection.getParameters());
    this.i = paramExternalConnection.i;
    this.m = paramExternalConnection.m;
    this.j = paramExternalConnection.getCredentialsMethodType();
    this.k = paramExternalConnection.getConnectionDescription();
    this.l = paramExternalConnection.getConnectionId();
    this.n = paramExternalConnection.getRefreshInternal();
    this.o = paramExternalConnection.d();
    this.p = paramExternalConnection.getName();
    this.q = paramExternalConnection.getOdcFile();
    this.r = paramExternalConnection.getReconnectionMethodType();
    this.s = paramExternalConnection.c();
    this.t = paramExternalConnection.getSavePassword();
    this.u = paramExternalConnection.getSSOId();
    this.v = paramExternalConnection.getSourceFile();
    this.w = paramExternalConnection.w;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ExternalConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */