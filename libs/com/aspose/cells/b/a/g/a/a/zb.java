package com.aspose.cells.b.a.g.a.a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zb
  implements za
{
  private Matcher a;
  private zc b;
  
  zb() {}
  
  zb(zc paramzc, CharSequence paramCharSequence)
  {
    this.b = paramzc;
    this.a = paramzc.a().matcher(paramCharSequence);
  }
  
  public boolean a()
  {
    return this.a.find();
  }
  
  public boolean a(int paramInt)
  {
    return this.a.find(paramInt);
  }
  
  public String group()
  {
    return this.a.group();
  }
  
  public String group(int group)
  {
    return this.a.group(group);
  }
  
  public int groupCount()
  {
    return this.a.groupCount();
  }
  
  public int start()
  {
    return this.a.start();
  }
  
  public int start(int group)
  {
    return this.a.start(group);
  }
  
  public int end()
  {
    return this.a.end();
  }
  
  public int end(int group)
  {
    return this.a.end(group);
  }
  
  public String a(String paramString)
  {
    return this.a.replaceAll(paramString);
  }
  
  public boolean equals(Object obj)
  {
    return this.a.equals(obj);
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public String toString()
  {
    return this.a.toString();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/g/a/a/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */