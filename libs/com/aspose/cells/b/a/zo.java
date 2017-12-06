package com.aspose.cells.b.a;

import com.aspose.cells.b.a.c.za;
import com.aspose.cells.b.a.c.zc;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Locale;

public class zo
{
  private static final double[] a = { 1.0D, 10.0D, 100.0D, 1000.0D, 10000.0D, 100000.0D, 1000000.0D, 1.0E7D, 1.0E8D, 1.0E9D, 1.0E10D, 1.0E11D, 1.0E12D, 1.0E13D, 1.0E14D, 1.0E15D, 1.0E16D, 1.0E17D, 1.0E18D, 1.0E19D };
  
  public static int a(double paramDouble)
  {
    if (paramDouble < 0.0D) {
      paramDouble = -paramDouble;
    }
    int i = Arrays.binarySearch(a, paramDouble);
    if (i > -1) {
      return i + 1;
    }
    return -i - 1;
  }
  
  public static double a(String paramString)
  {
    return a(paramString, Locale.getDefault()).doubleValue();
  }
  
  public static double a(String paramString, za paramza)
  {
    if (paramza.c()) {
      return Double.parseDouble(paramString);
    }
    Double localDouble = a(paramString, paramza.h());
    if (localDouble == null) {
      throw new NumberFormatException();
    }
    return localDouble.doubleValue();
  }
  
  public static String b(double paramDouble)
  {
    if (paramDouble == paramDouble) {
      return Long.toString(paramDouble);
    }
    MathContext localMathContext = new MathContext(15);
    BigDecimal localBigDecimal1 = new BigDecimal(paramDouble, localMathContext);
    BigDecimal localBigDecimal2 = localBigDecimal1.stripTrailingZeros();
    String str;
    if (localBigDecimal1.toString().contains("E"))
    {
      str = localBigDecimal2.toString();
    }
    else
    {
      str = localBigDecimal2.toPlainString();
      if ((str.startsWith("0.0000")) || (str.startsWith("-0.0000"))) {
        str = Double.toString(paramDouble);
      }
    }
    if (str.indexOf('.') > -1)
    {
      char c = za.a().d().c().charAt(0);
      if (c != '.') {
        str = str.replace('.', c);
      }
    }
    return str;
  }
  
  public static int a(double paramDouble1, double paramDouble2)
  {
    if ((Double.isNaN(paramDouble1)) && (Double.isNaN(paramDouble2))) {
      return 0;
    }
    if (Double.isNaN(paramDouble1)) {
      return -1;
    }
    if (Double.isNaN(paramDouble2)) {
      return 1;
    }
    if (paramDouble1 == paramDouble2) {
      return 0;
    }
    if (paramDouble1 < paramDouble2) {
      return -1;
    }
    return 1;
  }
  
  private static Double a(String paramString, Locale paramLocale)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return null;
    }
    paramString = c(paramString);
    NumberFormat localNumberFormat = NumberFormat.getInstance(paramLocale);
    int i = b(paramString);
    if (i < 0) {
      i = 0;
    }
    ParsePosition localParsePosition = new ParsePosition(i);
    Number localNumber = localNumberFormat.parse(paramString, localParsePosition);
    if (localNumber == null) {
      throw new IllegalStateException("Parse double exception: illegal string format");
    }
    double d = localNumber.doubleValue();
    if (Double.isNaN(d)) {
      return null;
    }
    i = localParsePosition.getIndex();
    if ((i == paramString.length() - 1) && (paramString.charAt(i) == '%')) {
      return Double.valueOf(d / 100.0D);
    }
    if (i < paramString.length()) {
      throw new IllegalStateException("Parse double exception: illegal string format");
    }
    return Double.valueOf(d);
  }
  
  private static int b(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return -1;
    }
    if (a(paramString.charAt(0))) {
      return 1;
    }
    return -1;
  }
  
  private static boolean a(char paramChar)
  {
    switch (paramChar)
    {
    case '$': 
    case '€': 
    case '￡': 
    case '￥': 
      return true;
    }
    return false;
  }
  
  private static String c(String paramString)
  {
    paramString = paramString.trim();
    if (paramString.length() < 1) {
      return paramString;
    }
    if (paramString.charAt(0) == '+') {
      paramString = paramString.substring(1);
    }
    paramString = paramString.replace('e', 'E');
    int i = paramString.indexOf('E');
    if (i > 0)
    {
      i++;
      if ((paramString.length() > i) && (paramString.charAt(i) == '+')) {
        paramString = paramString.substring(0, i) + paramString.substring(i + 1);
      }
    }
    return paramString;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/zo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */