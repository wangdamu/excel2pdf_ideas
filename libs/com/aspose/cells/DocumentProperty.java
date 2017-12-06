package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zs;

public class DocumentProperty
{
  private DocumentPropertyCollection a;
  private int b;
  private int c;
  private String d;
  private Object e;
  private boolean f;
  
  DocumentProperty(DocumentPropertyCollection properties, int group, int id, String name, Object value, boolean isGeneratedName)
  {
    this.a = properties;
    this.b = group;
    this.c = id;
    this.d = name;
    this.e = value;
    this.f = isGeneratedName;
  }
  
  public String getName()
  {
    return this.d;
  }
  
  public Object getValue()
  {
    return this.e;
  }
  
  public void setValue(Object value)
  {
    if (value == null) {
      throw new IllegalArgumentException("value");
    }
    this.e = value;
  }
  
  public boolean isLinkedToContent()
  {
    return getSource() != null;
  }
  
  public String getSource()
  {
    for (int i = 0; i < this.a.getCount(); i++)
    {
      DocumentProperty localDocumentProperty = this.a.get(i);
      if ((localDocumentProperty.c()) && (localDocumentProperty.b() == a())) {
        return (String)localDocumentProperty.getValue();
      }
    }
    return null;
  }
  
  public int getType()
  {
    if ((this.e instanceof String)) {
      return 4;
    }
    if ((this.e instanceof Boolean)) {
      return 0;
    }
    if ((this.e instanceof DateTime)) {
      return 1;
    }
    if (((this.e instanceof Integer)) || ((this.e instanceof Long))) {
      return 3;
    }
    if ((this.e instanceof Double)) {
      return 2;
    }
    if ((this.e instanceof byte[])) {
      return 5;
    }
    return 4;
  }
  
  public boolean isGeneratedName()
  {
    return this.f;
  }
  
  int a()
  {
    return this.c;
  }
  
  int b()
  {
    return this.c & 0xFEFFFFFF;
  }
  
  boolean c()
  {
    return (this.c & 0x1000000) != 0;
  }
  
  int d()
  {
    return this.b;
  }
  
  public String toString()
  {
    switch (getType())
    {
    case 4: 
      return (String)this.e;
    case 3: 
      return zs.a(this.e);
    case 2: 
      return zp.b(((Double)this.e).doubleValue());
    case 0: 
      return ((Boolean)this.e).booleanValue() ? "Y" : "N";
    case 1: 
      return ((DateTime)this.e).k();
    case 5: 
      return zs.a(this.e);
    }
    return zs.a(this.e);
  }
  
  public int toInt()
  {
    if ((getValue() instanceof Long)) {
      return ze.f(getValue());
    }
    return ((Integer)getValue()).intValue();
  }
  
  long e()
  {
    if ((getValue() instanceof Long)) {
      return ((Long)getValue()).longValue();
    }
    return ((Integer)getValue()).intValue();
  }
  
  public double toDouble()
  {
    return ((Double)getValue()).doubleValue();
  }
  
  public DateTime toDateTime()
  {
    if ((getValue() instanceof DateTime)) {
      return (DateTime)getValue();
    }
    return DateTime.getNow();
  }
  
  public boolean toBool()
  {
    return ((Boolean)getValue()).booleanValue();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DocumentProperty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */