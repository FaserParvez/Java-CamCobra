package LocalMonitoringStation;

/**
* LocalMonitoringStation/LMSHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./idl/lms.idl
* Friday, 29 April 2016 00:01:59 o'clock BST
*/

public final class LMSHolder implements org.omg.CORBA.portable.Streamable
{
  public LocalMonitoringStation.LMS value = null;

  public LMSHolder ()
  {
  }

  public LMSHolder (LocalMonitoringStation.LMS initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LocalMonitoringStation.LMSHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LocalMonitoringStation.LMSHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LocalMonitoringStation.LMSHelper.type ();
  }

}
