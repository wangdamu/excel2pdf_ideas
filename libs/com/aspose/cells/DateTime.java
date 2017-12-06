package com.aspose.cells;

import com.aspose.cells.a.b.a.zb;
import com.aspose.cells.a.b.a.zc;
import com.aspose.cells.a.b.a.zd;
import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.zl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class DateTime
  implements Comparable<Object>
{
  private static final int[] d = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };
  private static final int[] e = { 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366 };
  public static final DateTime a = new DateTime(0L, 0L);
  public static final DateTime b = new DateTime(3155378975999999999L, 0L);
  private long f;
  
  public String a(String paramString, com.aspose.cells.b.a.c.za paramza)
  {
    return zp.a(this, c(paramString), paramza);
  }
  
  public String a()
  {
    if (Locale.getDefault().equals(Locale.US)) {
      return b("HH:mm:ss");
    }
    DateFormat localDateFormat = DateFormat.getTimeInstance();
    localDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    return localDateFormat.format(j());
  }
  
  public static DateTime a(String paramString1, String paramString2, com.aspose.cells.b.a.c.za paramza)
    throws Exception
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat(c(paramString2), paramza.h());
    localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    Date localDate = localSimpleDateFormat.parse(paramString1);
    return new DateTime(localDate);
  }
  
  public static DateTime b(String paramString, com.aspose.cells.b.a.c.za paramza)
    throws Exception
  {
    if (paramString == null) {
      throw new IllegalArgumentException("String dateTime can not be null.");
    }
    DateTime localDateTime = null;
    zb localzb = null;
    com.aspose.cells.a.b.a.za localza = zc.a(paramString, paramza, new zd(), localDateTime, localzb);
    if (!localza.a()) {
      throw new Exception(paramString + " cannot be parsed.");
    }
    return localza.b();
  }
  
  public static DateTime a(String paramString)
    throws Exception
  {
    return b(paramString, com.aspose.cells.b.a.c.za.a());
  }
  
  public DateTime()
  {
    this.f = 0L;
  }
  
  public DateTime(long ticks)
  {
    if ((ticks < 0L) || (ticks > 3155378975999999999L)) {
      throw new IndexOutOfBoundsException("ticks");
    }
    this.f = ticks;
  }
  
  private static DateTime d(long paramLong)
  {
    DateTime localDateTime = new DateTime();
    localDateTime.f = paramLong;
    return localDateTime;
  }
  
  public DateTime(long ticks, long kind)
  {
    if ((ticks < 0L) || (ticks > 3155378975999999999L)) {
      throw new IndexOutOfBoundsException("ArgumentOutOfRange_DateTimeBadTicks");
    }
    if ((kind < 0L) || (kind > 2L)) {
      throw new IllegalArgumentException("Argument_InvalidDateTimeKind");
    }
    this.f = (ticks | kind << 62);
  }
  
  public DateTime(int year, int month, int day)
  {
    this.f = a(year, month, day);
  }
  
  public DateTime(int year, int month, int day, int hour, int minute, int second)
  {
    this.f = (a(year, month, day) + b(hour, minute, second));
  }
  
  public DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond)
  {
    long l = a(year, month, day) + b(hour, minute, second);
    if ((millisecond < 0) || (millisecond >= 1000)) {
      throw new IndexOutOfBoundsException("millisecond");
    }
    l += millisecond * 10000L;
    if ((l < 0L) || (l > 3155378975999999999L)) {
      throw new IllegalArgumentException("Arg_DateTimeRange");
    }
    this.f = l;
  }
  
  public DateTime(Date date)
  {
    this(b(e(date.getTime())), 1L);
  }
  
  public DateTime(Calendar cld)
  {
    this(b(a(cld)), 1L);
  }
  
  public Date toDate()
  {
    long l = i();
    return new Date(l - TimeZone.getDefault().getOffset(l));
  }
  
  public Calendar toCalendar()
  {
    Calendar localCalendar = Calendar.getInstance();
    long l = i();
    localCalendar.setTimeInMillis(l - TimeZone.getDefault().getOffset(l));
    return localCalendar;
  }
  
  private static long e(long paramLong)
  {
    return paramLong + TimeZone.getDefault().getOffset(paramLong);
  }
  
  private static long a(Calendar paramCalendar)
  {
    long l = paramCalendar.getTimeInMillis();
    return l + paramCalendar.getTimeZone().getOffset(l);
  }
  
  private long l()
  {
    return this.f & 0x3FFFFFFFFFFFFFFF;
  }
  
  private long m()
  {
    return this.f & 0xC000000000000000;
  }
  
  public DateTime a(zl paramzl)
  {
    return a(paramzl.a());
  }
  
  private DateTime a(double paramDouble, int paramInt)
  {
    long l = (paramDouble * paramInt + (paramDouble >= 0.0D ? 0.5D : -0.5D));
    if ((l <= -315537897600000L) || (l >= 315537897600000L)) {
      throw new IndexOutOfBoundsException("value");
    }
    return a(l * 10000L);
  }
  
  public DateTime addDays(double value)
  {
    return a(value, 86400000);
  }
  
  public DateTime addHours(double value)
  {
    return a(value, 3600000);
  }
  
  public DateTime addMilliseconds(double value)
  {
    return a(value, 1);
  }
  
  public DateTime addMinutes(double value)
  {
    return a(value, 60000);
  }
  
  public DateTime addMonths(int months)
  {
    if ((months < -120000) || (months > 120000)) {
      throw new IndexOutOfBoundsException("months");
    }
    int i = b(0);
    int j = b(2);
    int k = b(3);
    int m = j - 1 + months;
    if (m >= 0)
    {
      j = m % 12 + 1;
      i += m / 12;
    }
    else
    {
      j = 12 + (m + 1) % 12;
      i += (m - 11) / 12;
    }
    if ((i < 1) || (i > 9999)) {
      throw new IndexOutOfBoundsException("months");
    }
    int n = a(i, j);
    if (k > n) {
      k = n;
    }
    return d(a(i, j, k) + l() % 864000000000L | m());
  }
  
  public DateTime addSeconds(double value)
  {
    return a(value, 1000);
  }
  
  public DateTime a(long paramLong)
  {
    long l = l();
    if ((paramLong > 3155378975999999999L - l) || (paramLong < 0L - l)) {
      throw new IndexOutOfBoundsException("value");
    }
    return d(l + paramLong | m());
  }
  
  public DateTime addYears(int value)
  {
    if ((value < 55536) || (value > 10000)) {
      throw new IndexOutOfBoundsException("years");
    }
    return addMonths(value * 12);
  }
  
  public int compareTo(Object value)
  {
    if (value == null) {
      return 1;
    }
    if (!(value instanceof DateTime)) {
      throw new IllegalArgumentException("Arg_MustBeDateTime");
    }
    long l1 = ((DateTime)value).l();
    long l2 = l();
    if (l2 > l1) {
      return 1;
    }
    if (l2 < l1) {
      return -1;
    }
    return 0;
  }
  
  public int compareTo(DateTime value)
  {
    long l1 = value.l();
    long l2 = l();
    if (l2 > l1) {
      return 1;
    }
    if (l2 < l1) {
      return -1;
    }
    return 0;
  }
  
  private static long a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 1) && (paramInt1 <= 9999) && (paramInt2 >= 1) && (paramInt2 <= 12))
    {
      int[] arrayOfInt = a(paramInt1) ? e : d;
      if ((paramInt3 >= 1) && (paramInt3 <= arrayOfInt[paramInt2] - arrayOfInt[(paramInt2 - 1)]))
      {
        int i = paramInt1 - 1;
        int j = i * 365 + i / 4 - i / 100 + i / 400 + arrayOfInt[(paramInt2 - 1)] + paramInt3 - 1;
        return j * 864000000000L;
      }
    }
    throw new IndexOutOfBoundsException("ArgumentOutOfRange_BadYearMonthDay");
  }
  
  private static long b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt1 < 24) && (paramInt2 >= 0) && (paramInt2 < 60) && (paramInt3 >= 0) && (paramInt3 < 60)) {
      return zl.a(paramInt1, paramInt2, paramInt3);
    }
    throw new IndexOutOfBoundsException("ArgumentOutOfRange_BadHourMinuteSecond");
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < 1) || (paramInt2 > 12)) {
      throw new IndexOutOfBoundsException("month");
    }
    int[] arrayOfInt = a(paramInt1) ? e : d;
    return arrayOfInt[paramInt2] - arrayOfInt[(paramInt2 - 1)];
  }
  
  static long a(double paramDouble)
  {
    if ((paramDouble >= 2958466.0D) || (paramDouble <= -657435.0D)) {
      throw new IllegalArgumentException("Arg_OleAutDateInvalid");
    }
    long l = (paramDouble * 8.64E7D + (paramDouble >= 0.0D ? 0.5D : -0.5D));
    if (l < 0L) {
      l -= l % 86400000L * 2L;
    }
    l += 59926435200000L;
    if ((l < 0L) || (l >= 315537897600000L)) {
      throw new IllegalArgumentException("Arg_OleAutDateScale");
    }
    return l * 10000L;
  }
  
  public int hashCode()
  {
    long l = l();
    return (int)l ^ (int)(l >> 32);
  }
  
  public boolean equals(Object value)
  {
    return ((value instanceof DateTime)) && (a(this, (DateTime)value));
  }
  
  public static boolean a(DateTime paramDateTime1, DateTime paramDateTime2)
  {
    if (paramDateTime1 == paramDateTime2) {
      return true;
    }
    return (paramDateTime1 != null) && (paramDateTime2 != null) && (paramDateTime1.l() == paramDateTime2.l());
  }
  
  public static DateTime b(double paramDouble)
  {
    return new DateTime(a(paramDouble), 0L);
  }
  
  public DateTime b()
  {
    long l = l();
    return d(l - l % 864000000000L | m());
  }
  
  private int b(int paramInt)
  {
    long l = l();
    int i = (int)(l / 864000000000L);
    int j = i / 146097;
    i -= j * 146097;
    int k = i / 36524;
    if (k == 4) {
      k = 3;
    }
    i -= k * 36524;
    int m = i / 1461;
    i -= m * 1461;
    int n = i / 365;
    if (n == 4) {
      n = 3;
    }
    if (paramInt == 0) {
      return j * 400 + k * 100 + m * 4 + n + 1;
    }
    i -= n * 365;
    if (paramInt == 1) {
      return i + 1;
    }
    int i1 = (n == 3) && ((m != 24) || (k == 3)) ? 1 : 0;
    int[] arrayOfInt = i1 != 0 ? e : d;
    for (int i2 = i >> 6; i >= arrayOfInt[i2]; i2++) {}
    if (paramInt == 2) {
      return i2;
    }
    return i - arrayOfInt[(i2 - 1)] + 1;
  }
  
  public int getDay()
  {
    return b(3);
  }
  
  public int getDayOfWeek()
  {
    return (int)((l() / 864000000000L + 1L) % 7L);
  }
  
  public int getDayOfYear()
  {
    return b(1);
  }
  
  public int getHour()
  {
    return (int)(l() / 36000000000L % 24L);
  }
  
  public long c()
  {
    long l = m();
    if (l == 0L) {
      return 0L;
    }
    if (l == 4611686018427387904L) {
      return 1L;
    }
    return 2L;
  }
  
  public int getMillisecond()
  {
    return (int)(l() / 10000L % 1000L);
  }
  
  public int getMinute()
  {
    return (int)(l() / 600000000L % 60L);
  }
  
  public int getMonth()
  {
    return b(2);
  }
  
  public static DateTime getNow()
  {
    return d().toLocalTime();
  }
  
  public static DateTime d()
  {
    long l1 = System.currentTimeMillis();
    long l2 = b(l1);
    return d(l2 | 0x4000000000000000);
  }
  
  public int getSecond()
  {
    return (int)(l() / 10000000L % 60L);
  }
  
  public long e()
  {
    return l();
  }
  
  public zl f()
  {
    return new zl(l() % 864000000000L);
  }
  
  public static DateTime g()
  {
    return getNow().b();
  }
  
  public int getYear()
  {
    return b(0);
  }
  
  public static boolean a(int paramInt)
  {
    if ((paramInt < 1) || (paramInt > 9999)) {
      throw new IndexOutOfBoundsException("year");
    }
    return (paramInt % 4 == 0) && ((paramInt % 100 != 0) || (paramInt % 400 == 0));
  }
  
  public zl a(DateTime paramDateTime)
  {
    return new zl(l() - paramDateTime.l());
  }
  
  private static double f(long paramLong)
  {
    if (paramLong == 0L) {
      return 0.0D;
    }
    if (paramLong < 864000000000L) {
      paramLong += 599264352000000000L;
    }
    if (paramLong < 31241376000000000L) {
      throw new IllegalStateException("Arg_OleAutDateInvalid");
    }
    long l1 = (paramLong - 599264352000000000L) / 10000L;
    if (l1 < 0L)
    {
      long l2 = l1 % 86400000L;
      if (l2 != 0L) {
        l1 -= (86400000L + l2) * 2L;
      }
    }
    return l1 / 8.64E7D;
  }
  
  public double h()
  {
    return f(l());
  }
  
  public DateTime toLocalTime()
  {
    if (c() == 2L) {
      return this;
    }
    long l1 = i();
    long l2 = TimeZone.getDefault().getOffset(l1);
    long l3 = b(l1 + l2);
    if (l3 > 3155378975999999999L) {
      return new DateTime(3155378975999999999L, 2L);
    }
    if (l3 < 0L) {
      return new DateTime(0L, 2L);
    }
    return new DateTime(l3, 2L);
  }
  
  public long i()
  {
    return l() / 10000L - 62135596800000L;
  }
  
  public Date j()
  {
    long l;
    if (a.equals(this)) {
      l = -62135769599766L;
    } else {
      l = i();
    }
    return new Date(l);
  }
  
  public static long b(long paramLong)
  {
    long l = 62135596800000L + paramLong;
    if (l < 0L) {
      l = 0L;
    }
    return l * 10000L;
  }
  
  public String toString()
  {
    return zp.a(this, "yyyy-MM-dd'T'HH:mm:ss");
  }
  
  public String k()
  {
    if (Locale.getDefault().equals(Locale.US)) {
      return b("MM/dd/yyyy");
    }
    DateFormat localDateFormat = DateFormat.getDateInstance();
    localDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    return localDateFormat.format(j());
  }
  
  public String b(String paramString)
  {
    paramString = c(paramString);
    return zp.a(this, paramString);
  }
  
  private static String c(String paramString)
  {
    if (paramString == null) {
      paramString = "G";
    }
    if (paramString.length() == 1)
    {
      int i = paramString.charAt(0);
      if (i == 100) {
        paramString = "MM/dd/yy";
      } else if (i == 68) {
        paramString = "EEEE, MMMM dd, yyyy";
      } else if (i == 102) {
        paramString = "EEEE, MMMM dd, yyyy HH:mm";
      } else if (i == 70) {
        paramString = "EEEE, MMMM dd, yyyy HH:mm:ss";
      } else if (i == 103) {
        paramString = "MM/dd/yy HH:mm";
      } else if (i == 71) {
        paramString = "MM/dd/yy HH:mm:ss";
      } else if ((i == 109) || (i == 77)) {
        paramString = "MMMM dd";
      } else if ((i == 114) || (i == 82)) {
        paramString = "EEE, dd MMM yyyy HH:mm:ss z";
      } else if (i == 115) {
        paramString = "yyyy-MM-dd'T'HH:mm:ss";
      } else if (i == 116) {
        paramString = "h:mm a";
      } else if (i == 84) {
        paramString = "HH:mm:ss";
      } else if (i == 117) {
        paramString = "yyyy-MM-dd HH:mm:ss'Z'";
      } else if (i == 85) {
        paramString = "EEEE, dd MMMM yyyy HH:mm:ss";
      } else if ((i == 121) || (i == 89)) {
        paramString = "yyyy MMMM";
      }
    }
    else
    {
      paramString = paramString.replace("tt", "a");
      paramString = paramString.replace("dddd", "EEEE");
      paramString = paramString.replace("ddd", "EEE");
      paramString = paramString.replace("Y", "y");
      paramString = paramString.replace("f", "S");
      paramString = paramString.replace("\\T", "'T'");
      paramString = paramString.replace("\\Z", "'Z'");
    }
    return paramString;
  }
  
  public DateTime toUniversalTime()
  {
    if (c() == 1L) {
      return this;
    }
    long l1 = i();
    long l2 = TimeZone.getDefault().getOffset(l1);
    long l3 = b(l1 - l2);
    if (l3 > 3155378975999999999L) {
      return new DateTime(3155378975999999999L, 1L);
    }
    if (l3 < 0L) {
      return new DateTime(0L, 1L);
    }
    return new DateTime(l3, 1L);
  }
  
  private void g(long paramLong)
  {
    this.f = (paramLong | this.f);
  }
  
  public void c(long paramLong)
  {
    if (paramLong == 0L) {
      g(0L);
    } else if (paramLong == 1L) {
      g(4611686018427387904L);
    } else {
      g(Long.MIN_VALUE);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DateTime.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */