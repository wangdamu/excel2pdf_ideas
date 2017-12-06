package com.aspose.cells.a.c;

import com.aspose.cells.DateTime;
import com.aspose.cells.b.a.c.za;
import com.aspose.cells.zaux;
import com.aspose.cells.zzx;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import java.util.TimeZone;

public class zp
{
  private static final String[] b = { "0.E00", "0.#E00", "0.##E00", "0.###E00", "0.####E00", "0.#####E00", "0.######E00", "0.#######E00", "0.########E00", "0.#########E00", "0.##########E00" };
  private static final String[] c = { "0.#", "0.##", "0.###", "0.####", "0.#####", "0.######", "0.#######", "0.########", "0.#########", "0.##########" };
  public static final DecimalFormatSymbols a = new DecimalFormatSymbols(Locale.US);
  private static final zc d = new zc(NumberFormat.getNumberInstance());
  private static final Hashtable<Integer, Hashtable<String, zb>> e = new Hashtable(8);
  private static final Hashtable<String, zb> f = new Hashtable(64);
  private static final Hashtable<Integer, Hashtable<String, za>> g = new Hashtable(8);
  private static final Hashtable<String, za> h = new Hashtable(64);
  private static final TimeZone i = TimeZone.getTimeZone("GMT");
  private static final Hashtable<Integer, zzx> j = new Hashtable(8);
  
  private static String e(int paramInt)
  {
    char[] arrayOfChar = new char[paramInt + 2];
    arrayOfChar[0] = '0';
    arrayOfChar[1] = '.';
    for (int k = paramInt + 1; k > 1; k++) {
      arrayOfChar[k] = '#';
    }
    return new String(arrayOfChar);
  }
  
  public static Number a(String paramString, ParsePosition paramParsePosition)
  {
    return d.a(paramString, paramParsePosition);
  }
  
  public static String a(DateTime paramDateTime)
  {
    StringBuilder localStringBuilder = new StringBuilder(20);
    zaux.a(paramDateTime, localStringBuilder);
    return localStringBuilder.toString();
  }
  
  public static void a(DateTime paramDateTime, StringBuilder paramStringBuilder)
  {
    if (paramDateTime == null) {
      return;
    }
    zaux.b(paramDateTime, paramStringBuilder);
  }
  
  public static double a(String paramString)
  {
    return Double.parseDouble(paramString.trim());
  }
  
  public static int b(String paramString)
  {
    return Integer.parseInt(paramString.trim());
  }
  
  public static int c(String paramString)
  {
    return Integer.parseInt(paramString.trim(), 16);
  }
  
  public static String a(byte paramByte)
  {
    return Integer.toString(paramByte & 0xFF);
  }
  
  public static String a(long paramLong)
  {
    return Long.toString(paramLong);
  }
  
  public static String a(int paramInt)
  {
    return Integer.toString(paramInt);
  }
  
  public static String b(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "00";
    case 1: 
      return "01";
    case 2: 
      return "02";
    case 3: 
      return "03";
    case 4: 
      return "04";
    case 5: 
      return "05";
    case 6: 
      return "06";
    case 7: 
      return "07";
    case 8: 
      return "08";
    case 9: 
      return "09";
    case 10: 
      return "0A";
    case 11: 
      return "0B";
    case 12: 
      return "0C";
    case 13: 
      return "0D";
    case 14: 
      return "0E";
    case 15: 
      return "0F";
    }
    return Integer.toHexString(paramInt).toUpperCase();
  }
  
  public static String c(int paramInt)
  {
    String str = Integer.toHexString(paramInt).toUpperCase();
    switch (str.length())
    {
    case 1: 
      return "000" + str;
    case 2: 
      return "00" + str;
    case 3: 
      return "0" + str;
    }
    return str;
  }
  
  public static String d(int paramInt)
  {
    String str = Integer.toHexString(paramInt).toUpperCase();
    switch (str.length())
    {
    case 1: 
      return "0000000" + str;
    case 2: 
      return "000000" + str;
    case 3: 
      return "00000" + str;
    case 4: 
      return "0000" + str;
    case 5: 
      return "000" + str;
    case 6: 
      return "00" + str;
    case 7: 
      return "0" + str;
    }
    return str;
  }
  
  public static String a(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramInt2 > 10 ? paramInt2 : 10);
    zaux.a(paramInt1, paramInt2, localStringBuilder);
    return localStringBuilder.toString();
  }
  
  public static void a(int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    zaux.a(paramInt1, paramInt2, paramStringBuilder);
  }
  
  public static String a(double paramDouble, int paramInt)
  {
    if (paramInt <= c.length) {
      return a(f, c[(paramInt - 1)]).a(paramDouble);
    }
    return new DecimalFormat(e(paramInt), a).format(paramDouble);
  }
  
  public static void a(double paramDouble, int paramInt, StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(a(paramDouble, paramInt));
  }
  
  public static String a(double paramDouble, String paramString, za paramza)
  {
    return a(a(paramza), paramString).a(paramDouble);
  }
  
  public static String a(DateTime paramDateTime, String paramString)
  {
    if (paramDateTime == null) {
      return "";
    }
    return a(za.a(), paramString).a(paramDateTime.j());
  }
  
  public static String a(DateTime paramDateTime, String paramString, za paramza)
  {
    if (paramDateTime == null) {
      return "";
    }
    return a(paramza, paramString).a(paramDateTime.j());
  }
  
  public static String a(double paramDouble, String paramString)
  {
    return b(paramDouble, paramString, za.a());
  }
  
  public static String b(double paramDouble, String paramString, za paramza)
  {
    int k = paramString.indexOf('E');
    if ((k > -1) && (k < paramString.length() - 2) && (paramString.charAt(k + 1) == '+') && (paramString.indexOf('E', k + 2) < 0))
    {
      String str = a(paramDouble, paramString.substring(0, k + 1) + paramString.substring(k + 2), paramza);
      k = str.indexOf('E');
      return str.substring(0, k + 1) + "+" + str.substring(k + 1);
    }
    return a(b(paramza), paramString, paramDouble);
  }
  
  private static Hashtable<String, zb> a(za paramza)
  {
    Integer localInteger = Integer.valueOf(paramza.g());
    Hashtable localHashtable = (Hashtable)e.get(localInteger);
    if (localHashtable == null)
    {
      localHashtable = new Hashtable(32);
      e.put(localInteger, localHashtable);
      if ((zl.a()) && (e.size() > 20)) {
        zl.a("Check the program for formatting numeric values, current cached locales are " + e.size());
      }
      localHashtable.put("0.####", new zb(new DecimalFormat("0.####", new DecimalFormatSymbols(paramza.h()))));
    }
    return localHashtable;
  }
  
  private static zb a(Hashtable<String, zb> paramHashtable, String paramString)
  {
    zb localzb = (zb)paramHashtable.get(paramString);
    if (localzb == null)
    {
      localzb = new zb(new DecimalFormat(paramString, zb.a((zb)paramHashtable.get("0.####")).getDecimalFormatSymbols()));
      paramHashtable.put(paramString, localzb);
      if ((zl.a()) && (paramHashtable.size() > 64)) {
        zl.a("Check the program for formatting numeric values, current cached formattings are " + paramHashtable.size());
      }
    }
    return localzb;
  }
  
  private static za a(za paramza, String paramString)
  {
    Integer localInteger = Integer.valueOf(paramza.g());
    Hashtable localHashtable = (Hashtable)g.get(localInteger);
    if (localHashtable == null)
    {
      localHashtable = new Hashtable(32);
      g.put(localInteger, localHashtable);
      if ((zl.a()) && (g.size() > 20)) {
        zl.a("Check the program for formatting datetime values, current cached locales are " + g.size());
      }
      localObject = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", paramza.h());
      ((SimpleDateFormat)localObject).setTimeZone(i);
      localHashtable.put("yyyy-MM-dd'T'HH:mm:ss", new za((SimpleDateFormat)localObject));
    }
    Object localObject = (za)localHashtable.get(paramString);
    if (localObject == null)
    {
      localObject = new za(new SimpleDateFormat(paramString, paramza.h()));
      za.a((za)localObject).setTimeZone(i);
      localHashtable.put(paramString, localObject);
      if ((zl.a()) && (localHashtable.size() > 64)) {
        zl.a("Check the program for formatting datetime values, current cached formattings are " + localHashtable.size());
      }
    }
    return (za)localObject;
  }
  
  private static zzx b(za paramza)
  {
    Integer localInteger = Integer.valueOf(paramza.g());
    zzx localzzx = (zzx)j.get(localInteger);
    if (localzzx == null)
    {
      localzzx = new zzx(paramza);
      j.put(localInteger, localzzx);
      if ((zl.a()) && (j.size() > 20)) {
        zl.a("Check the program for formatting values, current cached locales are " + j.size());
      }
    }
    return localzzx;
  }
  
  /* Error */
  private static String a(zzx paramzzx, String paramString, double paramDouble)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_1
    //   3: invokevirtual 121	com/aspose/cells/zzx:a	(Ljava/lang/String;Z)Lcom/aspose/cells/zahf;
    //   6: astore 4
    //   8: aload 4
    //   10: dup
    //   11: astore 5
    //   13: monitorenter
    //   14: aload 4
    //   16: aload_0
    //   17: invokevirtual 122	com/aspose/cells/zzx:j	()Lcom/aspose/cells/zzu;
    //   20: bipush 14
    //   22: dload_2
    //   23: invokestatic 126	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   26: invokeinterface 162 4 0
    //   31: invokevirtual 123	com/aspose/cells/zzz:h	()Ljava/lang/String;
    //   34: aload 5
    //   36: monitorexit
    //   37: areturn
    //   38: astore 6
    //   40: aload 5
    //   42: monitorexit
    //   43: aload 6
    //   45: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	paramzzx	zzx
    //   0	46	1	paramString	String
    //   0	46	2	paramDouble	double
    //   6	9	4	localzahf	com.aspose.cells.zahf
    //   11	30	5	Ljava/lang/Object;	Object
    //   38	6	6	localObject1	Object
    // Exception table:
    //   from	to	target	type
    //   14	37	38	finally
    //   38	43	38	finally
  }
  
  public static String a(double paramDouble)
  {
    String str = Double.toString(paramDouble);
    if (str.length() < 17)
    {
      if (str.endsWith(".0")) {
        return str.substring(0, str.length() - 2);
      }
      return str;
    }
    return Double.toString(Math.round(paramDouble * 1.0E14D) / 1.0E14D);
  }
  
  public static String b(double paramDouble)
  {
    if (paramDouble == paramDouble) {
      return Long.toString(paramDouble);
    }
    return Double.toString(paramDouble);
  }
  
  public static String b(double paramDouble, int paramInt)
  {
    return Double.toString(paramDouble);
  }
  
  public static String c(double paramDouble)
  {
    return a(paramDouble, 9);
  }
  
  public static String a(float paramFloat)
  {
    return a(paramFloat, 8);
  }
  
  public static String b(float paramFloat)
  {
    return a(paramFloat, 9);
  }
  
  static
  {
    f.put("0.####", new zb(new DecimalFormat("0.####", a)));
    e.put(new Integer(1033), f);
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    localSimpleDateFormat.setTimeZone(i);
    h.put("yyyy-MM-dd'T'HH:mm:ss", new za(localSimpleDateFormat));
    g.put(Integer.valueOf(1033), h);
  }
  
  private static class za
  {
    private final SimpleDateFormat a;
    private final SimpleDateFormat b;
    private boolean c = false;
    
    za(SimpleDateFormat paramSimpleDateFormat)
    {
      this.a = paramSimpleDateFormat;
      this.b = ((SimpleDateFormat)paramSimpleDateFormat.clone());
    }
    
    public String a(Date paramDate)
    {
      if (this.c) {
        return ((SimpleDateFormat)this.b.clone()).format(paramDate);
      }
      synchronized (this.a)
      {
        if (this.c) {
          return ((SimpleDateFormat)this.b.clone()).format(paramDate);
        }
        this.c = true;
      }
      ??? = this.a.format(paramDate);
      this.c = false;
      return (String)???;
    }
  }
  
  private static class zc
  {
    private final NumberFormat a;
    private final NumberFormat b;
    private boolean c = false;
    
    zc(NumberFormat paramNumberFormat)
    {
      this.a = paramNumberFormat;
      this.b = ((NumberFormat)paramNumberFormat.clone());
    }
    
    public Number a(String paramString, ParsePosition paramParsePosition)
    {
      if (this.c) {
        return ((NumberFormat)this.b.clone()).parse(paramString, paramParsePosition);
      }
      synchronized (this.a)
      {
        if (this.c) {
          return ((NumberFormat)this.b.clone()).parse(paramString, paramParsePosition);
        }
        this.c = true;
      }
      ??? = this.a.parse(paramString, paramParsePosition);
      this.c = false;
      return (Number)???;
    }
  }
  
  private static class zb
  {
    private final DecimalFormat a;
    private final DecimalFormat b;
    private boolean c = false;
    
    zb(DecimalFormat paramDecimalFormat)
    {
      this.a = paramDecimalFormat;
      this.b = ((DecimalFormat)paramDecimalFormat.clone());
    }
    
    public String a(double paramDouble)
    {
      if (this.c) {
        return ((DecimalFormat)this.b.clone()).format(paramDouble);
      }
      synchronized (this.a)
      {
        if (this.c) {
          return ((DecimalFormat)this.b.clone()).format(paramDouble);
        }
        this.c = true;
      }
      ??? = this.a.format(paramDouble);
      this.c = false;
      return (String)???;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */