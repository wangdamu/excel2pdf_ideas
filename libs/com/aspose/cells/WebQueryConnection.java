package com.aspose.cells;

public class WebQueryConnection
  extends ExternalConnection
{
  String a;
  int b;
  String c;
  String d;
  short y = 0;
  zbvt z;
  
  WebQueryConnection(ExternalConnectionCollection parent)
  {
    super(parent);
    setHtmlFormat(1);
  }
  
  zbvt a()
  {
    if (null == this.z) {
      this.z = new zbvt(this);
    }
    return this.z;
  }
  
  public boolean isXml()
  {
    return (this.y & 0x1) != 0;
  }
  
  public void setXml(boolean value)
  {
    if (value) {
      this.y = ((short)(this.y | 0x1));
    } else {
      this.y = ((short)(this.y & 0xFFFFFFFE));
    }
  }
  
  public boolean isXl97()
  {
    return (this.y & 0x20) != 0;
  }
  
  public void setXl97(boolean value)
  {
    if (value) {
      this.y = ((short)(this.y | 0x20));
    } else {
      this.y = ((short)(this.y & 0xFFFFFFDF));
    }
  }
  
  public boolean isXl2000()
  {
    return (this.y & 0x80) != 0;
  }
  
  public void setXl2000(boolean value)
  {
    if (value) {
      this.y = ((short)(this.y | 0x80));
    } else {
      this.y = ((short)(this.y & 0xFF7F));
    }
  }
  
  public String getUrl()
  {
    return this.d;
  }
  
  public void setUrl(String value)
  {
    this.d = value;
  }
  
  public boolean isTextDates()
  {
    return (this.y & 0x40) != 0;
  }
  
  public void setTextDates(boolean value)
  {
    if (value) {
      this.y = ((short)(this.y | 0x40));
    } else {
      this.y = ((short)(this.y & 0xFFFFFFBF));
    }
  }
  
  public boolean isSourceData()
  {
    return (this.y & 0x2) != 0;
  }
  
  public void setSourceData(boolean value)
  {
    if (value) {
      this.y = ((short)(this.y | 0x2));
    } else {
      this.y = ((short)(this.y & 0xFFFFFFFD));
    }
  }
  
  public String getPost()
  {
    return this.c;
  }
  
  public void setPost(String value)
  {
    this.c = value;
  }
  
  public boolean isParsePre()
  {
    return (this.y & 0x4) != 0;
  }
  
  public void setParsePre(boolean value)
  {
    if (value) {
      this.y = ((short)(this.y | 0x4));
    } else {
      this.y = ((short)(this.y & 0xFFFFFFFB));
    }
  }
  
  public boolean isHtmlTables()
  {
    return (this.y & 0x100) != 0;
  }
  
  public void setHtmlTables(boolean value)
  {
    if (value) {
      this.y = ((short)(this.y | 0x100));
    } else {
      this.y = ((short)(this.y & 0xFEFF));
    }
  }
  
  public int getHtmlFormat()
  {
    return this.b;
  }
  
  public void setHtmlFormat(int value)
  {
    this.b = value;
  }
  
  public boolean isFirstRow()
  {
    return (this.y & 0x10) != 0;
  }
  
  public void setFirstRow(boolean value)
  {
    if (value) {
      this.y = ((short)(this.y | 0x10));
    } else {
      this.y = ((short)(this.y & 0xFFFFFFEF));
    }
  }
  
  public String getEditWebPage()
  {
    return this.a;
  }
  
  public void setEditWebPage(String value)
  {
    this.a = value;
  }
  
  /**
   * @deprecated
   */
  public String getEditPage()
  {
    return this.a;
  }
  
  /**
   * @deprecated
   */
  public void setEditPage(String value)
  {
    this.a = value;
  }
  
  public boolean isConsecutive()
  {
    return (this.y & 0x8) != 0;
  }
  
  public void setConsecutive(boolean value)
  {
    if (value) {
      this.y = ((short)(this.y | 0x8));
    } else {
      this.y = ((short)(this.y & 0xFFFFFFF7));
    }
  }
  
  void a(ExternalConnection paramExternalConnection)
  {
    super.a(paramExternalConnection);
    WebQueryConnection localWebQueryConnection = (WebQueryConnection)paramExternalConnection;
    this.a = localWebQueryConnection.getEditWebPage();
    this.b = localWebQueryConnection.getHtmlFormat();
    this.c = localWebQueryConnection.getPost();
    this.d = localWebQueryConnection.getUrl();
    this.y = localWebQueryConnection.y;
    if (localWebQueryConnection.z != null) {
      a().a(localWebQueryConnection.z);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/WebQueryConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */