package LocalMonitoringStation;


/**
* LocalMonitoringStation/LogsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./idl/lms.idl
* Friday, 29 April 2016 00:01:59 o'clock BST
*/

public final class LogsHolder implements org.omg.CORBA.portable.Streamable
{
  public LocalMonitoringStation.Log value[] = null;

  public LogsHolder ()
  {
  }

  public LogsHolder (LocalMonitoringStation.Log[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LocalMonitoringStation.LogsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LocalMonitoringStation.LogsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LocalMonitoringStation.LogsHelper.type ();
  }

}
