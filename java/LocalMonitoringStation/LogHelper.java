package LocalMonitoringStation;


/**
* LocalMonitoringStation/LogHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./idl/lms.idl
* Friday, 29 April 2016 00:01:59 o'clock BST
*/

abstract public class LogHelper
{
  private static String  _id = "IDL:LocalMonitoringStation/Log:1.0";

  public static void insert (org.omg.CORBA.Any a, LocalMonitoringStation.Log that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static LocalMonitoringStation.Log extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "sensor",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_longlong);
          _members0[1] = new org.omg.CORBA.StructMember (
            "timestamp",
            _tcOf_members0,
            null);
          _tcOf_members0 = SensorCamera.WarningHelper.type ();
          _members0[2] = new org.omg.CORBA.StructMember (
            "level",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (LocalMonitoringStation.LogHelper.id (), "Log", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static LocalMonitoringStation.Log read (org.omg.CORBA.portable.InputStream istream)
  {
    LocalMonitoringStation.Log value = new LocalMonitoringStation.Log ();
    value.sensor = istream.read_string ();
    value.timestamp = istream.read_longlong ();
    value.level = SensorCamera.WarningHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, LocalMonitoringStation.Log value)
  {
    ostream.write_string (value.sensor);
    ostream.write_longlong (value.timestamp);
    SensorCamera.WarningHelper.write (ostream, value.level);
  }

}
