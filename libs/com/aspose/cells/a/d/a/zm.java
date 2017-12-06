package com.aspose.cells.a.d.a;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class zm
  extends Properties
{
  private static final long serialVersionUID = 3297483251864528952L;
  protected Properties a = new Properties();
  
  public Enumeration propertyNames()
  {
    ArrayList localArrayList = new ArrayList();
    Enumeration localEnumeration = super.propertyNames();
    while (localEnumeration.hasMoreElements()) {
      localArrayList.add(localEnumeration.nextElement());
    }
    if (this.a != null)
    {
      localEnumeration = this.a.propertyNames();
      while (localEnumeration.hasMoreElements()) {
        localArrayList.add(localEnumeration.nextElement());
      }
    }
    return Collections.enumeration(localArrayList);
  }
  
  public void a(Properties paramProperties)
  {
    Enumeration localEnumeration = paramProperties.propertyNames();
    while (localEnumeration.hasMoreElements())
    {
      String str = (String)localEnumeration.nextElement();
      setProperty(str, paramProperties.getProperty(str));
    }
  }
  
  public Object setProperty(String key, String value)
  {
    if (value == null) {
      return super.setProperty(key, "null");
    }
    return super.setProperty(key, value);
  }
  
  public Object a(String paramString, Color paramColor)
  {
    return a(this, paramString, paramColor);
  }
  
  public static Object a(Properties paramProperties, String paramString, Color paramColor)
  {
    if (paramColor == null) {
      return paramProperties.setProperty(paramString, "null");
    }
    return paramProperties.setProperty(paramString, paramColor.getRed() + ", " + paramColor.getGreen() + ", " + paramColor.getBlue() + ", " + paramColor.getAlpha());
  }
  
  public Object a(String paramString, boolean paramBoolean)
  {
    return a(this, paramString, paramBoolean);
  }
  
  public static Object a(Properties paramProperties, String paramString, boolean paramBoolean)
  {
    return paramProperties.setProperty(paramString, Boolean.toString(paramBoolean));
  }
  
  public String getProperty(String key)
  {
    String str = super.getProperty(key);
    return str != null ? str : this.a.getProperty(key);
  }
  
  public String getProperty(String key, String def)
  {
    String str = getProperty(key);
    return str != null ? str : def;
  }
  
  public Color a(String paramString)
  {
    return b(paramString, null);
  }
  
  public Color b(String paramString, Color paramColor)
  {
    String str = getProperty(paramString);
    if (str == null) {
      return paramColor;
    }
    if (str.equals("null")) {
      return null;
    }
    String[] arrayOfString = str.split(", ");
    return new Color(Integer.parseInt(arrayOfString[0]), Integer.parseInt(arrayOfString[1]), Integer.parseInt(arrayOfString[2]), Integer.parseInt(arrayOfString[3]));
  }
  
  public boolean b(String paramString)
  {
    return b(paramString, false);
  }
  
  public boolean b(String paramString, boolean paramBoolean)
  {
    return new Boolean(getProperty(paramString, Boolean.toString(paramBoolean))).booleanValue();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/a/zm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */