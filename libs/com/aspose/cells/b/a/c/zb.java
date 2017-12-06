package com.aspose.cells.b.a.c;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class zb
{
  public static final String[] a = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
  public static final String[] b = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
  public static final String[] c = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "" };
  public static final String[] d = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "" };
  private String j = "HH:mm:ss";
  private String k = "HH:mm";
  public String e = "MM/dd/yyyy";
  private String l = "dddd, dd MMMM yyyy";
  private String m;
  public String f = ":";
  public String g = "AM";
  public String h = "PM";
  public String i = "MMMM dd";
  private String n = "yyyy MMMM";
  private String o = "ddd, dd MMM yyyy HH':'mm':'ss 'GMT'";
  private String p = "yyyy'-'MM'-'dd'T'HH':'mm':'ss";
  private String q = "yyyy'-'MM'-'dd HH':'mm':'ss'Z'";
  private za r;
  private String[] s;
  
  public zb(za paramza)
  {
    this.r = paramza;
    Locale localLocale = paramza.h();
    DateFormat localDateFormat = DateFormat.getDateInstance(3, localLocale);
    SimpleDateFormat localSimpleDateFormat;
    if ((localDateFormat instanceof SimpleDateFormat))
    {
      localSimpleDateFormat = (SimpleDateFormat)localDateFormat;
      this.e = localSimpleDateFormat.toPattern();
      int i1 = this.e.indexOf('y');
      if (i1 > -1)
      {
        int i2 = 1;
        i1++;
        while ((i1 < this.e.length()) && (this.e.charAt(i1) == 'y'))
        {
          i2++;
          i1++;
        }
        if (i2 < 4)
        {
          StringBuilder localStringBuilder = new StringBuilder(this.e.length() + 4 - i2);
          localStringBuilder.append(this.e.substring(0, i1));
          while (i2 < 4)
          {
            localStringBuilder.append('y');
            i2++;
          }
          localStringBuilder.append(this.e.substring(i1));
          this.e = localStringBuilder.toString();
        }
      }
    }
    localDateFormat = DateFormat.getDateInstance(1, localLocale);
    if ((localDateFormat instanceof SimpleDateFormat))
    {
      localSimpleDateFormat = (SimpleDateFormat)localDateFormat;
      this.l = localSimpleDateFormat.toPattern();
    }
    localDateFormat = DateFormat.getTimeInstance(2, localLocale);
    if ((localDateFormat instanceof SimpleDateFormat))
    {
      localSimpleDateFormat = (SimpleDateFormat)localDateFormat;
      this.k = localSimpleDateFormat.toPattern();
    }
    localDateFormat = DateFormat.getTimeInstance(1, localLocale);
    if ((localDateFormat instanceof SimpleDateFormat))
    {
      localSimpleDateFormat = (SimpleDateFormat)localDateFormat;
      this.j = localSimpleDateFormat.toPattern();
    }
    localDateFormat = DateFormat.getDateTimeInstance(1, 1, localLocale);
    if ((localDateFormat instanceof SimpleDateFormat))
    {
      localSimpleDateFormat = (SimpleDateFormat)localDateFormat;
      this.m = localSimpleDateFormat.toPattern();
    }
    else
    {
      this.m = (this.l + " " + this.j);
    }
    if ("zh".equals(paramza.h().getLanguage()))
    {
      this.g = "上午";
      this.h = "下午";
    }
  }
  
  public static zb a()
  {
    return za.a().e();
  }
  
  public static zb b()
  {
    return za.b().e();
  }
  
  public String c()
  {
    return this.l;
  }
  
  public String[] d()
  {
    if (this.s != null) {
      return this.s;
    }
    ArrayList localArrayList = new ArrayList();
    try
    {
      a(localArrayList, a('d'));
      a(localArrayList, a('D'));
      a(localArrayList, a('g'));
      a(localArrayList, a('G'));
      a(localArrayList, a('f'));
      a(localArrayList, a('F'));
      a(localArrayList, a('m'));
      a(localArrayList, a('M'));
      a(localArrayList, a('r'));
      a(localArrayList, a('R'));
      a(localArrayList, a('s'));
      a(localArrayList, a('t'));
      a(localArrayList, a('T'));
      a(localArrayList, a('u'));
      a(localArrayList, a('U'));
      a(localArrayList, a('y'));
      a(localArrayList, a('Y'));
    }
    catch (Exception localException) {}
    this.s = new String[localArrayList.size()];
    localArrayList.toArray(this.s);
    return this.s;
  }
  
  private void a(List paramList, String[] paramArrayOfString)
  {
    if ((paramList == null) || (paramArrayOfString == null)) {
      return;
    }
    for (String str : paramArrayOfString) {
      paramList.add(str);
    }
  }
  
  private String[] a(char paramChar)
    throws Exception
  {
    switch (paramChar)
    {
    case 'D': 
      return new String[] { this.l };
    case 'd': 
      return new String[] { this.e };
    case 'T': 
      return new String[] { this.j };
    case 't': 
      return new String[] { this.k };
    case 'G': 
      return new String[] { this.e + " " + this.j };
    case 'g': 
      return new String[] { this.e + " " + this.k };
    case 'F': 
    case 'U': 
      return new String[] { this.l + " " + this.j };
    case 'f': 
      return new String[] { this.l + " " + this.k };
    case 'M': 
    case 'm': 
      return new String[] { this.i };
    case 'Y': 
    case 'y': 
      return new String[] { this.n };
    case 'R': 
    case 'r': 
      return new String[] { this.o };
    case 's': 
      return new String[] { this.p };
    case 'u': 
      return new String[] { this.q };
    }
    throw new Exception("Format specifier was invalid.");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/c/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */