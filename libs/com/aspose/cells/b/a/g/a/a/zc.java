package com.aspose.cells.b.a.g.a.a;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zc
{
  private static final Pattern a = Pattern.compile("\\(\\?<(\\w+)>");
  private Pattern b;
  private String c;
  private List<String> d;
  
  public static zc a(String paramString, int paramInt)
  {
    return new zc(paramString, paramInt);
  }
  
  private zc(String paramString, int paramInt)
  {
    this.c = paramString;
    this.b = b(paramString, paramInt);
    this.d = a(paramString);
  }
  
  public zb a(CharSequence paramCharSequence)
  {
    return new zb(this, paramCharSequence);
  }
  
  Pattern a()
  {
    return this.b;
  }
  
  public String[] a(CharSequence paramCharSequence, int paramInt)
  {
    return this.b.split(paramCharSequence, paramInt);
  }
  
  public String toString()
  {
    return this.c;
  }
  
  static List<String> a(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    Matcher localMatcher = a.matcher(paramString);
    while (localMatcher.find()) {
      localArrayList.add(localMatcher.group(1));
    }
    return localArrayList;
  }
  
  static Pattern b(String paramString, int paramInt)
  {
    return Pattern.compile(a.matcher(paramString).replaceAll("("), paramInt);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/g/a/a/zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */