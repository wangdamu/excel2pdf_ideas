package com.aspose.cells.b.a;

import com.aspose.cells.DateTime;
import com.aspose.cells.a.c.zp;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParsePosition;
import java.util.Date;

public final class ze
{
  public static float a(Object paramObject)
  {
    if (paramObject == null) {
      return 0.0F;
    }
    if (((paramObject instanceof Byte)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Short)) || ((paramObject instanceof Long))) {
      return ((Number)paramObject).floatValue();
    }
    if ((paramObject instanceof Float)) {
      return ((Float)paramObject).intValue();
    }
    if ((paramObject instanceof Double))
    {
      if ((((Double)paramObject).doubleValue() > 3.4028234663852886E38D) || (((Double)paramObject).doubleValue() < -3.4028234663852886E38D)) {
        throw new ClassCastException("Overflow in Double to float conversion. Double value: " + paramObject + ".");
      }
      return ((Double)paramObject).floatValue();
    }
    float f;
    if ((paramObject instanceof BigInteger))
    {
      f = ((BigInteger)paramObject).floatValue();
      if ((f == Float.POSITIVE_INFINITY) || (f == Float.NEGATIVE_INFINITY)) {
        throw new ClassCastException("Overflow in BigInteger to float conversion. BigInteger value: " + paramObject + ".");
      }
      return f;
    }
    if ((paramObject instanceof BigDecimal))
    {
      f = ((BigDecimal)paramObject).floatValue();
      if ((f == Float.POSITIVE_INFINITY) || (f == Float.NEGATIVE_INFINITY)) {
        throw new ClassCastException("Overflow in BigInteger to float conversion. BigDecimal value: " + paramObject + ".");
      }
      return f;
    }
    if ((paramObject instanceof String)) {
      try
      {
        return Float.parseFloat((String)paramObject);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new ClassCastException("Overflow in String to float conversion. String value: " + paramObject + ".");
      }
    }
    if ((paramObject instanceof Character)) {
      return ((Character)paramObject).charValue();
    }
    throw new ClassCastException("Can't convert to float value of type '" + paramObject.getClass().getName() + "'.");
  }
  
  public static long b(Object paramObject)
  {
    if (paramObject == null) {
      return 0L;
    }
    if ((paramObject instanceof Integer)) {
      return ((Integer)paramObject).longValue();
    }
    if (((paramObject instanceof Byte)) || ((paramObject instanceof Short))) {
      return ((Number)paramObject).longValue();
    }
    if ((paramObject instanceof Long)) {
      return ((Long)paramObject).intValue();
    }
    if ((paramObject instanceof Float))
    {
      if ((((Float)paramObject).floatValue() > 9.223372E18F) || (((Float)paramObject).floatValue() < -9.223372E18F)) {
        throw new ClassCastException("Overflow in Float to long conversion. Float value: " + paramObject + ".");
      }
      return ((Float)paramObject).longValue();
    }
    if ((paramObject instanceof Double))
    {
      if ((((Double)paramObject).doubleValue() > 9.223372036854776E18D) || (((Double)paramObject).doubleValue() < -9.223372036854776E18D)) {
        throw new ClassCastException("Overflow in Double to long conversion. Double value: " + paramObject + ".");
      }
      return ((Double)paramObject).longValue();
    }
    if ((paramObject instanceof BigDecimal)) {
      try
      {
        return ((BigDecimal)paramObject).longValue();
      }
      catch (ArithmeticException localArithmeticException)
      {
        throw new ClassCastException("Overflow in BigDecimal to long conversion. BigDecimal value: " + paramObject + ".");
      }
    }
    if ((paramObject instanceof BigInteger))
    {
      if ((((BigInteger)paramObject).compareTo(BigInteger.valueOf(Long.MAX_VALUE)) == 1) || (((BigInteger)paramObject).compareTo(BigInteger.valueOf(Long.MIN_VALUE)) == -1)) {
        throw new ClassCastException("Overflow in BigInteger to long conversion. BigInteger value: " + paramObject + ".");
      }
      return ((BigInteger)paramObject).longValue();
    }
    if ((paramObject instanceof String)) {
      try
      {
        return Long.parseLong((String)paramObject);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new ClassCastException("Overflow in String to long conversion. String value: " + paramObject + ".");
      }
    }
    if ((paramObject instanceof Boolean)) {
      return ((Boolean)paramObject).booleanValue() ? 1L : 0L;
    }
    if ((paramObject instanceof Character)) {
      return ((Character)paramObject).charValue();
    }
    if ((paramObject instanceof Enum)) {
      return ((Enum)paramObject).ordinal();
    }
    throw new ClassCastException("Can't convert to long value of type '" + paramObject.getClass().getName() + "'.");
  }
  
  public static long c(Object paramObject)
  {
    if (paramObject == null) {
      return 0L;
    }
    if ((paramObject instanceof Integer)) {
      return ((Integer)paramObject).longValue();
    }
    if (((paramObject instanceof Byte)) || ((paramObject instanceof Short))) {
      return ((Number)paramObject).longValue();
    }
    if ((paramObject instanceof Long)) {
      return ((Long)paramObject).longValue();
    }
    if ((paramObject instanceof Float))
    {
      if ((((Float)paramObject).floatValue() > 9.223372E18F) || (((Float)paramObject).floatValue() < -9.223372E18F)) {
        throw new ClassCastException("Overflow in Float to long conversion. Float value: " + paramObject + ".");
      }
      return ((Float)paramObject).longValue();
    }
    if ((paramObject instanceof Double))
    {
      if ((((Double)paramObject).doubleValue() > 9.223372036854776E18D) || (((Double)paramObject).doubleValue() < -9.223372036854776E18D)) {
        throw new ClassCastException("Overflow in Double to long conversion. Double value: " + paramObject + ".");
      }
      return ((Double)paramObject).longValue();
    }
    if ((paramObject instanceof BigDecimal)) {
      try
      {
        return ((BigDecimal)paramObject).longValue();
      }
      catch (ArithmeticException localArithmeticException)
      {
        throw new ClassCastException("Overflow in BigDecimal to long conversion. BigDecimal value: " + paramObject + ".");
      }
    }
    if ((paramObject instanceof BigInteger))
    {
      if ((((BigInteger)paramObject).compareTo(BigInteger.valueOf(Long.MAX_VALUE)) == 1) || (((BigInteger)paramObject).compareTo(BigInteger.valueOf(Long.MIN_VALUE)) == -1)) {
        throw new ClassCastException("Overflow in BigInteger to long conversion. BigInteger value: " + paramObject + ".");
      }
      return ((BigInteger)paramObject).longValue();
    }
    if ((paramObject instanceof String)) {
      try
      {
        return Long.parseLong((String)paramObject);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new ClassCastException("Overflow in String to long conversion. String value: " + paramObject + ".");
      }
    }
    if ((paramObject instanceof Boolean)) {
      return ((Boolean)paramObject).booleanValue() ? 1L : 0L;
    }
    if ((paramObject instanceof Character)) {
      return ((Character)paramObject).charValue();
    }
    if ((paramObject instanceof Enum)) {
      return ((Enum)paramObject).ordinal();
    }
    throw new ClassCastException("Can't convert to long value of type '" + paramObject.getClass().getName() + "'.");
  }
  
  public static short d(Object paramObject)
  {
    if (paramObject == null) {
      return 0;
    }
    if ((paramObject instanceof Integer))
    {
      if ((((Integer)paramObject).intValue() > 32767) || (((Integer)paramObject).intValue() < 32768)) {
        throw new ClassCastException("Overflow in int to short conversion. int value: " + paramObject + ".");
      }
      return ((Integer)paramObject).shortValue();
    }
    if (((paramObject instanceof Byte)) || ((paramObject instanceof Short))) {
      return ((Number)paramObject).shortValue();
    }
    if ((paramObject instanceof Long))
    {
      if ((((Long)paramObject).longValue() > 32767L) || (((Long)paramObject).longValue() < -32768L)) {
        throw new ClassCastException("Overflow in long to short conversion. long value: " + paramObject + ".");
      }
      return ((Long)paramObject).shortValue();
    }
    if ((paramObject instanceof Float))
    {
      if ((((Float)paramObject).floatValue() > 32767.0F) || (((Float)paramObject).floatValue() < -32768.0F)) {
        throw new ClassCastException("Overflow in Float to short conversion. Float value: " + paramObject + ".");
      }
      return ((Float)paramObject).shortValue();
    }
    if ((paramObject instanceof Double))
    {
      if ((((Double)paramObject).doubleValue() > 32767.0D) || (((Double)paramObject).doubleValue() < -32768.0D)) {
        throw new ClassCastException("Overflow in Double to short conversion. Double value: " + paramObject + ".");
      }
      return ((Double)paramObject).shortValue();
    }
    if ((paramObject instanceof BigInteger))
    {
      if ((((BigInteger)paramObject).compareTo(BigInteger.valueOf(32767L)) == 1) || (((BigInteger)paramObject).compareTo(BigInteger.valueOf(-32768L)) == -1)) {
        throw new ClassCastException("Overflow in BigInteger to short conversion. BigInteger value: " + paramObject + ".");
      }
      return ((BigInteger)paramObject).shortValue();
    }
    if ((paramObject instanceof String)) {
      try
      {
        return Short.parseShort((String)paramObject);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new ClassCastException("Overflow in String to int conversion. String value: " + paramObject + ".");
      }
    }
    if ((paramObject instanceof Boolean)) {
      return ((Boolean)paramObject).booleanValue() ? 1 : 0;
    }
    if ((paramObject instanceof Character)) {
      return (short)((Character)paramObject).charValue();
    }
    throw new ClassCastException("Can't convert to Short value of type '" + paramObject.getClass().getName() + "'.");
  }
  
  public static long a(String paramString, int paramInt)
  {
    return Long.parseLong(paramString, paramInt);
  }
  
  public static String a(long paramLong, int paramInt)
  {
    return Long.toString(paramLong, paramInt);
  }
  
  public static String a(byte paramByte, int paramInt)
  {
    long l = paramByte;
    if (l < 0L) {
      l += 256L;
    }
    return Long.toString(l, paramInt);
  }
  
  public static String e(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((paramObject instanceof Byte)) {
      return ((Byte)paramObject).toString();
    }
    if ((paramObject instanceof Boolean)) {
      return ((Boolean)paramObject).toString();
    }
    if ((paramObject instanceof Short)) {
      return ((Short)paramObject).toString();
    }
    if ((paramObject instanceof Integer)) {
      return ((Integer)paramObject).toString();
    }
    if ((paramObject instanceof Long)) {
      return ((Long)paramObject).toString();
    }
    if ((paramObject instanceof Float)) {
      return ((Float)paramObject).toString();
    }
    if ((paramObject instanceof Double)) {
      return ((Double)paramObject).toString();
    }
    return paramObject.toString();
  }
  
  public static byte a(int paramInt)
  {
    if ((paramInt > 127) || (paramInt < -128)) {
      throw new ClassCastException("Overflow in int to byte conversion. int value: " + Integer.toString(paramInt) + ".");
    }
    return (byte)(paramInt & 0xFF);
  }
  
  public static char a(String paramString)
  {
    if ((paramString == null) || (paramString.length() != 1)) {
      throw new ClassCastException("Overflow in String to Char conversion. String must be exactly one character long. String value: '" + paramString + "'.");
    }
    return paramString.charAt(0);
  }
  
  public static int b(String paramString, int paramInt)
  {
    return Integer.parseInt(paramString, paramInt);
  }
  
  public static int f(Object paramObject)
  {
    if (paramObject == null) {
      return 0;
    }
    if ((paramObject instanceof Integer)) {
      return ((Integer)paramObject).intValue();
    }
    if (((paramObject instanceof Byte)) || ((paramObject instanceof Short))) {
      return ((Number)paramObject).intValue();
    }
    if ((paramObject instanceof Long))
    {
      if ((((Long)paramObject).longValue() > 2147483647L) || (((Long)paramObject).longValue() < -2147483648L)) {
        throw new ClassCastException("Overflow in long to int conversion. long value: " + paramObject + ".");
      }
      return ((Long)paramObject).intValue();
    }
    if ((paramObject instanceof Float))
    {
      if ((((Float)paramObject).floatValue() > 2.14748365E9F) || (((Float)paramObject).floatValue() < -2.14748365E9F)) {
        throw new ClassCastException("Overflow in Float to int conversion. Float value: " + paramObject + ".");
      }
      return ((Float)paramObject).intValue();
    }
    if ((paramObject instanceof Double))
    {
      if ((((Double)paramObject).doubleValue() > 2.147483647E9D) || (((Double)paramObject).doubleValue() < -2.147483648E9D)) {
        throw new ClassCastException("Overflow in Double to int conversion. Double value: " + paramObject + ".");
      }
      return ((Double)paramObject).intValue();
    }
    if ((paramObject instanceof BigInteger))
    {
      if ((((BigInteger)paramObject).compareTo(BigInteger.valueOf(2147483647L)) == 1) || (((BigInteger)paramObject).compareTo(BigInteger.valueOf(-2147483648L)) == -1)) {
        throw new ClassCastException("Overflow in BigInteger to int conversion. BigInteger value: " + paramObject + ".");
      }
      return ((BigInteger)paramObject).intValue();
    }
    if ((paramObject instanceof String)) {
      try
      {
        String str = (String)paramObject;
        if (str.startsWith("+")) {
          str = str.substring(1);
        }
        return Integer.parseInt(str);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new ClassCastException("Overflow in String to int conversion. String value: " + paramObject + ".");
      }
    }
    if ((paramObject instanceof Boolean)) {
      return ((Boolean)paramObject).booleanValue() ? 1 : 0;
    }
    if ((paramObject instanceof Character)) {
      return ((Character)paramObject).charValue();
    }
    if ((paramObject instanceof Enum)) {
      return ((Enum)paramObject).ordinal();
    }
    throw new ClassCastException("Can't convert to Integer value of type '" + paramObject.getClass().getName() + "'.");
  }
  
  public static double g(Object paramObject)
  {
    if (paramObject == null) {
      return 0.0D;
    }
    if ((paramObject instanceof Double)) {
      return ((Double)paramObject).doubleValue();
    }
    double d;
    if ((paramObject instanceof BigDecimal))
    {
      d = ((BigDecimal)paramObject).doubleValue();
      if ((d == Double.POSITIVE_INFINITY) || (d == Double.NEGATIVE_INFINITY)) {
        throw new ClassCastException("Overflow in BigDecimal to double conversion. BigDecimal value: " + paramObject + ".");
      }
      return d;
    }
    if ((paramObject instanceof BigInteger))
    {
      d = ((BigInteger)paramObject).doubleValue();
      if ((d == Double.POSITIVE_INFINITY) || (d == Double.NEGATIVE_INFINITY)) {
        throw new ClassCastException("Overflow in BigInteger to double conversion. BigInteger value: " + paramObject + ".");
      }
      return d;
    }
    if ((paramObject instanceof Number)) {
      return ((Number)paramObject).doubleValue();
    }
    if ((paramObject instanceof String))
    {
      String str = c(((String)paramObject).trim());
      ParsePosition localParsePosition = new ParsePosition(0);
      Number localNumber = zp.a(str, localParsePosition);
      if (localParsePosition.getIndex() < str.length()) {
        throw new NumberFormatException("Input string was not in a correct format: " + str);
      }
      return localNumber.doubleValue();
    }
    if ((paramObject instanceof Boolean)) {
      return ((Boolean)paramObject).booleanValue() ? 1.0D : 0.0D;
    }
    if ((paramObject instanceof Enum)) {
      return ((Enum)paramObject).ordinal();
    }
    throw new ClassCastException("Can't convert to Double value of type '" + paramObject.getClass().getName() + "'.");
  }
  
  private static String c(String paramString)
  {
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
  
  public static DateTime h(Object paramObject)
    throws Exception
  {
    if (paramObject == null) {
      return DateTime.a;
    }
    if ((paramObject instanceof DateTime)) {
      return (DateTime)paramObject;
    }
    if ((paramObject instanceof Date)) {
      return new DateTime((Date)paramObject);
    }
    if ((paramObject instanceof Long)) {
      return new DateTime(((Long)paramObject).longValue());
    }
    if ((paramObject instanceof String)) {
      return DateTime.a((String)paramObject);
    }
    throw new ClassCastException("Can't convert to DateTime value of type '" + paramObject.getClass().getName() + "'.");
  }
  
  public static byte[] b(String paramString)
  {
    return zb.a(paramString);
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      throw new NullPointerException("inArray");
    }
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {
      throw new NullPointerException("inArray");
    }
    if ((paramInt1 < 0) || (paramInt1 > paramArrayOfByte.length)) {
      throw new IndexOutOfBoundsException("offset");
    }
    if ((paramInt2 < 0) || (paramInt2 > paramArrayOfByte.length - paramInt1)) {
      throw new IndexOutOfBoundsException("length");
    }
    int i = (int)((paramInt2 + 2L) * 4L / 3L);
    StringBuilder localStringBuilder = new StringBuilder(i);
    int j = 0;
    int k = 0;
    String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    int m = paramInt2;
    while (m > 0)
    {
      j = (j << 8) + (paramArrayOfByte[(paramInt1++)] & 0xFF);
      k += 8;
      m--;
      while (k >= 6)
      {
        k -= 6;
        localStringBuilder.append(str.charAt(j >> k));
        j &= (1 << k) - 1;
      }
    }
    paramInt2 %= 3;
    if (paramInt2 == 1)
    {
      localStringBuilder.append(str.charAt(j << 6 - k));
      localStringBuilder.append('=');
      localStringBuilder.append('=');
    }
    else if (paramInt2 == 2)
    {
      localStringBuilder.append(str.charAt(j << 6 - k));
      localStringBuilder.append('=');
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/ze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */